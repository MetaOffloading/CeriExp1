package com.sam.webtasks.client;

import com.sam.webtasks.basictools.Counterbalance;
import com.sam.webtasks.iotask2.IOtask2BlockContext;

public class Instructions {

	public static String Get(int index) {
		String i="";
		 
		switch(index) {
		case 10:
			i="In this task you will see a sequence of letters, one by one.<br><br>If the letter "
					+ "matches the one you saw two letters ago, please press the <b>X</b> key. "
					+ "Otherwise, press the <b>Z</b> key.<br><br>For example, if you saw the sequence "
					+ "O A S A P, you would press Z Z Z X Z.<br><br>Please respond as quickly "
					+ "and as accurately as possible.";
			break;
		case 20:
			i = "At the same time as doing this test, you will also do a 'timer task'. A digital clock "
					+ "will be displayed above the letters. You will be asked to press "
					+ "the <b>spacebar</b> at a particular time.<br><br>For example you might get "
					+ "the instruction \"Hit the spacebar at 0:20\". When you see a message "
					+ "like this, first you should immediately press the spacebar to continue "
					+ "with the letter task. You should keep going with the letter task like before. Then, "
					+ "when the clock gets to the specified time (such as 0:20) you should press the "
					+ "spacebar again. Keep going with the letter task after this.<br><br>"
					+ "The most important thing is to continue the letter task as quickly and as accurately "
					+ "as possible. It is more important that you pay attention to the letters than the clock. "
					+ "But you should also try to do the timer task at the same time, if you can.<br><br>"
					+ "If you press the spacebar within 2 seconds of the instructed time (for example "
					+ "0:18 to 0:22) this will be counted as correct.";
			break;	
		case 30:
			i = "Each time you are asked to press "
					+ "the spacebar, you can only do this <b>once</b>. For example, if you are told to press the spacebar at "
					+ "0:20 and you already press it at 0:15, it will not count if you press it again. So you should only "
					+ "press the spacebar when it is time to do so.<br><br> In this experiment, sometimes you will be "
					+ "asked to press the spacebar in 10 seconds time and sometimes you will be asked to press the spacebar "
					+ "in 30 seconds time.<br><br>Please click below to practise again";
			break;
		case 35:
			i= "For half of this experiment, the task will be the same as the one you just practised. You will be given "
					+ "instructions to press the spacebar when the clock shows a particular time. It will always be the spacebar that "
					+ "you need to press when the time comes.<br><br>"
					+ " In the other half of the experiment, you will be asked to press another button on your keyboard "
					+ "when the clock shows a particular time. In this half of the experiment, it will always be a different randomly selected button "
					+ "each time. For example you might be asked to press the 'A' key when the clock shows a particular time. "
					+ "The computer will tell you which key to press.<br><br>Click below to practise this.";
			break;
		case 36:
			i = "You have now practised all the different memory tasks. In one half of the experiment you will "
					+ "always be asked to remember to press the spacebar. In the other half, it will be a random "
					+ "letter each time. Within each of the halves, sometimes you will need to remember the "
					+ "instrution for 10 seconds and sometimes for 30 seconds.<br><br>"
					+ "We would now like you to estimate how confident you are that you will be able to remember "
					+ "these instructions.";
			break;
		case 40:
			i = "To help you perform the task, you will have the option to set a reminder, if you want.<br><br>"
					+ "Click below for instructions how to do this.";
			break;
		case 50:
			i = "There will be a button on the screen saying 'Set timer'. You need to press this button <b>three times</b> "
					+ "to activate a timer. Once you have activated it, this will make the clock flash red when it is "
					+ "time to press whichever button you have been asked to press. This means that you don't have to remember "
					+ "to check the clock yourself, but you still need to remember which button to press when the time comes.<br><br>"
					+ "Note that you will only be able to press this button after you have been given the instruction about "
					+ "which button to press and when.<br><br>"
					+ "Click below to try this.";
			break;
		case 60:
			i = "There is another type of reminder you can set as well, click below for more instructions.";
			break;
		case 70:
			i = "There will be a button on the screen saying 'Create reminder'. You can click this button, then "
					+ "type in any reminder that you would like to create. This will then be visible on the screen "
					+ "where the button was. You can type in anything, it is completely up to you.<br><br>Note that you will "
					+ "only be able to press this button after you have been given the instruction about which button to press and when.<br><br>"
					+ "Once you have created this reminder, it will always be visible on the screen, but you will "
					+ "have to remember to look at it at the instructed time.<br><br>"
					+ "Click below to try this.";
			break;
		case 80:
			i = "Now the experiment will start for real. Please complete the 2-back task as quickly "
					+ "and accurately as possible, while remembering the intentions as best as you can."
					+ "<br><br>Click below to start.";
			break;
		case 90:
			i = "In this part of the experiment, the instruction will <b>always</b> be "
					+ "to press the spacebar at a particular time, not one of the other keys. Sometimes you will be told "
					+ "to press the spacebar soon (in 10 seconds) and sometimes you will have to wait longer (30 seconds). "
					+ "The instructions on the screen will always tell you exactly what to do.<br><br>"
					+ "You are free to set as many reminders as you like. You can set either type of reminder, or both together. It is "
					+ "completely up to you. Click below to continue.";
			break;
		case 100:
			i = "In this part of the experiment, the instruction will <b>never</b> be to press the spacebar at a particular "
					+ "time, it will always be one of the other keys. This will be random each time. Sometimes you will be told "
					+ "to press this key soon (in 10 seconds) and sometimes you will have to wait longer (30 seconds). "
					+ "The instructions on the screen will always tell you exactly what to do.<br><br>"
					+ "You are free to set as many reminders as you like. You can set either type of reminder, or both. It is "
					+ "completely up to you. Click below to continue.";
			break;
		case 101:
			i = "Please tell us how confident you are that you will remember the instruction when you have "
					+ "to press the <b>spacebar</b> in <b>10 seconds</b> time. "
					+ "0% would mean that you will never remember to press it, and 100% would mean that you remember to press it "
					+ "at the correct moment every single time.";
			break;
		case 102:
			i = "Now, please tell us how confident you are that you will remember the instruction when you have "
					+ "to press the <b>spacebar</b> in <b>30 seconds</b> time. "
					+ "0% would mean that you will never remember to press it, and 100% would mean that you remember to press it "
					+ "at the correct moment every single time.";
			break;
		case 103:
			i = "Now, please tell us how confident you are that you will remember the instruction when you have "
					+ "to press a <b>random key</b> in <b>10 seconds</b> time. "
					+ "0% would mean that you will never remember to press it, and 100% would mean that you remember to press it "
					+ "at the correct moment every single time.";
			break;
		case 104:
			i = "Now, please tell us how confident you are that you will remember the instruction when you have "
					+ "to press a <b>random key</b> in <b>30 seconds</b> time. "
					+ "0% would mean that you will never remember to press it, and 100% would mean that you remember to press it "
					+ "at the correct moment every single time.";
			break;
		case 110:
			i = "Thank you, you are now half way through the experiment.<br><br>When you are ready, click below to continue.";
			break;	
		case 120:
			i = "You have now completed the experiment. Thank you for taking part.<br><br>"
					+ "Please click on the link below to receive your payment:"
					+ "<b><a href=\"https://app.prolific.co/submissions/complete?cc=C1I2CPC5\">"
					+ "CLICK HERE</a></b>";
			break;
		}

		return(i);	
	}
	
	public static String InfoText() {
		return ("We would like to invite you to participate in this research project. "
                + "You should only participate if you want to; choosing not to take part "
                + "will not disadvantage you in any way. Before you decide whether you "
                + "want to take part, please read the following information carefully and "
                + "discuss it with others if you wish. Ask us if there is anything that "
                + "is not clear or you would like more information.<br><br>"
                + "We are recruiting volunteers to "
                + "take part in an experiment aiming to improve our understanding of human "
                + "attention and memory. You will see various stimuli on the screen like letters of the alphabet "
                + "and you will be asked to respond to them by pressing keys. Sometimes you will be asked how "
                + "confident you are in your ability to perform the task. "
                + "The experiment "
                + "will last approximately 1 hour and you will receive a payment of £7.50 via the "
                + "Prolific Academic payment system. There are no anticipated risks or "
                + "benefits associated with participation in this study.<br><br>"
                + "It is up to you to decide whether or not to take part. If you choose "
                + "not to participate, you won't incur any penalties or lose any "
                + "benefits to which you might have been entitled. However, if you do "
                + "decide to take part, you can print out this information sheet and "
                + "you will be asked to fill out a consent form on the next page. "
                + "Even after agreeing to take "
                + "part, you can still withdraw at any time and without giving a reason. If you withdraw before the "
                + "end of the experiment, we will not retain your data and it will not be analysed."
                + "<br><br>All data will be collected and stored in accordance with the General Data Protection "
                + "Regulations 2018. Personal information is stored separately from test results, and researchers "
                + "on this project have no access to this data. Your personal information such as name and email "
                + "address is held by Prolific Academic but the researchers on this project have no acccess "
                + "to this. Data from this experiment may be made available to the research community, for example by "
                + "posting them on websites such as the Open Science Framework (<a href=\"http://osf.io\">http://osf.io</a>). "
                + "It will not be possible to identify you from these data.<br><br>"
                + "We aim to publish the results of this project in scientific journals and book chapters. Copies of the "
                + "results can either be obtained directly from the scientific journals' websites or from us.<br><br>"
                + "Should you wish to raise a complaint, please contact the Principal Investigator of this project, "
                + "Professor Sam Gilbert (<a href=\"mailto:sam.gilbert@ucl.ac.uk\">sam.gilbert@ucl.ac.uk</a>). However, "
                + "if you feel your complaint has not been handled to your satisfaction, please be aware that you can "
                + "also contact the Chair of the UCL Research Ethics Committee (<a href=\"mailto:ethics@ucl.ac.uk\">ethics@ucl.ac.uk</a>).");
    }

}
