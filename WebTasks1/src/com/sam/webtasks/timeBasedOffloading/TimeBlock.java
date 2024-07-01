package com.sam.webtasks.timeBasedOffloading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.sam.webtasks.basictools.PHP;
import com.sam.webtasks.basictools.Points;
import com.sam.webtasks.basictools.TimeStamp;

public class TimeBlock {
	
	
	//display settings
	public static boolean clockVisible;
	public static boolean timerButtonVisible;
	public static boolean reminderButtonVisible;
	public static boolean showPoints;
	
	//task type
	public static boolean optionalPM;
	
	//points settings
	public static int PMreward;
	public static int PMinstructionCost;
	
	//timing settings
	public static int currentTime;
	public static int clockStartTime;
	public static int nextInstruction;
	public static int nextTarget;
	public static int lastTarget;
	public static int blockDuration;
	public static int tickTime;
	public static int RSI;
	public static double nBackTargetProb;
	public static int targetInstructionInterval;
	public static boolean defaultPMintervals;
	public static ArrayList<Integer> PMinterval_list = new ArrayList<Integer>();
	public static boolean shufflePMintervals;
	public static int blockNumber;
	public static int trialNumber;
	
	public static int[] numberKeys = {KeyCodes.KEY_A,
									  KeyCodes.KEY_B,
									  KeyCodes.KEY_C,
									  KeyCodes.KEY_D,
									  KeyCodes.KEY_E,
									  KeyCodes.KEY_F,
									  KeyCodes.KEY_G,
									  KeyCodes.KEY_H,
									  KeyCodes.KEY_I,
									  KeyCodes.KEY_J,
									  KeyCodes.KEY_K,
									  KeyCodes.KEY_L,
									  //KeyCodes.KEY_M,
									  KeyCodes.KEY_N,
									  KeyCodes.KEY_O,
									  KeyCodes.KEY_P,
									  KeyCodes.KEY_Q,
									  KeyCodes.KEY_R,
									  KeyCodes.KEY_S,
									  KeyCodes.KEY_T,
									  KeyCodes.KEY_U,
									  KeyCodes.KEY_V,
									  KeyCodes.KEY_W,
									  //KeyCodes.KEY_X,
									  KeyCodes.KEY_Y};

	public static int PMkey=65;
	public static int PMchar;
	public static int spaceBarKey = KeyCodes.KEY_SPACE;
	public static int nonMatchKey = KeyCodes.KEY_Z;
	public static int matchKey = KeyCodes.KEY_X;
	public static int revealClockKey = KeyCodes.KEY_M;
	public static int instructionKey = KeyCodes.KEY_ENTER;
	public static int nBackMatchCorr ; //number of correct 'match' responses
	public static int nBackNonMatchCorr; //number of correct 'nonmatch' responses
	public static int nBackTargetsPresented;
	public static int PMhits;
	public static int timerButtonOperated;
	public static int reminderButtonOperated;
	public static int timerClicks; //how many times does the offload button need to be clicked?
	public static int reminderClicks;
	public static int nReminders;
	public static int nTimers;
	public static boolean spacebarPressed = false;
	
	//has an instruction just been presented?
	public static boolean instructionOn;
	public static Date instructionTimeStamp;
	
	
	//multiple possible PM keys?
	public static boolean multiPM = false;
	
	//should offloading be allowed in this block?
	public static boolean allowOffloading=true;
	
	//should clock always be on, or should it be revealable?
	public static boolean clockAlwaysOn=true;
	
	//how long should the clock be revealed for in ms?
	public static int clockReveal_msec = 1500;
	
	//timestamp of beginning of block
	public static Date blockStart;
	
	//how many seconds before / after target time is ok?
	public static final int PMwindow = 2;
	
	/*-----------reset all block settings-----------*/
	
	public static void Init() {
		optionalPM=false;
		clockVisible=true;
		showPoints=false;
		PMreward=10;
		PMinstructionCost=2;
		timerButtonVisible=true;
		reminderButtonVisible=true;
		currentTime=0;
		clockStartTime=0;
		targetInstructionInterval=10;
		nextInstruction=targetInstructionInterval;		
		blockDuration=365;
		multiPM=false;
		tickTime=1000;
		RSI=300;
		nBackTargetProb=0.2;
		PMinterval_list.clear();
		defaultPMintervals = true;
		shufflePMintervals = true;
		blockNumber = -1;
		trialNumber = 0;
		nBackMatchCorr = 0;
		nBackNonMatchCorr = 0;
		nBackTargetsPresented = 0;
		PMhits=0;
		timerButtonOperated=0;
		reminderButtonOperated=0;
		nReminders=0;
		nTimers=0;
		timerClicks=3;
		reminderClicks=1;
		spacebarPressed=false;
		instructionOn=false;
		
		if (TimeDisplay.isInitialised == false) {
			TimeDisplay.Init();
		}
		
		TimeDisplay.clockDisplay.setHTML("0:00");
		TimeDisplay.stimulusDisplay.setHTML("Press spacebar to start");
		TimeDisplay.reminderButton.setHTML("Create reminder");
		TimeDisplay.timerButton.setHTML("Set timer (" + timerClicks + ")");
		
		TimeDisplay.focusPanel.setFocus(true);
		TimeDisplay.timerButton.setEnabled(false);
		TimeDisplay.reminderButton.setEnabled(false);
		TimeDisplay.awaitingPMresponse=false;
		TimeDisplay.timeForInstruction=false;
	}
	
	/*-----------run a block-----------*/
	
	public static void Run() {
		if (defaultPMintervals) {
			for (int i = 0; i < 3; i++) {
				PMinterval_list.add(10);
				PMinterval_list.add(30);
			}
			
			blockDuration = 185;
		}
		
		if (shufflePMintervals) {
			for (int i = 0; i < PMinterval_list.size(); i++) {
				Collections.swap(PMinterval_list, i, Random.nextInt(PMinterval_list.size()));
			}
		}
		
		if (targetInstructionInterval<0) { //negative interval means don't present instructions
			targetInstructionInterval = Integer.MAX_VALUE;
			nextInstruction = targetInstructionInterval;
		}

		nextTarget=nextInstruction+TimeDisplay.generateDelay();
		lastTarget=nextTarget;

		TimeDisplay.clockDisplay.setVisible(clockVisible);
		TimeDisplay.SetClockVisible(clockAlwaysOn);
		TimeDisplay.timerButton.setVisible(timerButtonVisible);
		TimeDisplay.reminderButton.setVisible(reminderButtonVisible);
		RootPanel.get().add(TimeDisplay.focusPanel);
		TimeDisplay.waitForSpacebar = true;
		
		if (reminderButtonVisible) {
			int buttonWidth = TimeDisplay.reminderButton.getOffsetWidth();
			TimeDisplay.timerButton.setWidth(buttonWidth + "px");
		}
		
		if (showPoints) {
			Points.pointsDisplay.setVisible(true);
		} else {
			Points.pointsDisplay.setVisible(false);
		}

		//set timestamp for beginning of block
		blockStart = new Date();
		TimeResponse.stimOn = new Date();
		
		PHP.logData("TB_blockstart", blockNumber + "," + TimeStamp.Now(), false);
	}
}
