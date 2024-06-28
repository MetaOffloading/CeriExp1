package com.sam.webtasks.client;

import com.sam.webtasks.basictools.Counterbalance;
import com.sam.webtasks.iotask2.IOtask2BlockContext;
import com.sam.webtasks.timeBasedOffloading.TimeBlock;
import com.sam.webtasks.client.SequenceHandler;

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
					+ "one of the keys on your keyboard at a particular time.<br><br>For example you might get "
					+ "the instruction \"Hit the T key at 0:20\". When you see a message "
					+ "like this, first you should immediately press the spacebar to continue "
					+ "with the letter task. You should keep going with the letter task like before. Then, "
					+ "when the clock gets to the specified time (such as 0:20) you should press the "
					+ "instructed button (in this case, T). Keep going with the letter task after this.<br><br>"
					+ "The most important thing is to continue the letter task as quickly and as accurately "
					+ "as possible. It is more important that you pay attention to the letters than the clock. "
					+ "But you should also try to do the timer task at the same time, if you can.<br><br>"
					+ "If you press the special key within 2 seconds of the instructed time (for example "
					+ "0:18 to 0:22) this will be counted as correct.";
			break;	
		case 30:
			i = "Each time you are asked to press "
					+ "a special key, you can only do this <b>once</b>. For example, if you are told to press the F key at "
					+ "0:20 and you already press it at 0:15, it will not count if you press it again. So you should only "
					+ "press the special key when it is time to do so.<br><br> In this experiment, sometimes you will be "
					+ "asked to press the special key after 10 seconds and sometimes you will be asked to press it "
					+ "after 30 seconds.<br><br>When you remember to press the special key, you will "
					+ "earn an extra bonus payment that will be sent to you after the experiment via Prolific.<br><br>"
					+ "<br><br>Please click below to practise again";
			break;
		case 40:
			i = "From now on, you can decide whether to take the timer task when it is presented. "
					+ "As before, you will earn extra points and money if you remember to press the special key. "
					+ "For example, you may be told <br><br> \"You can earn 10 points at 0:20 <br><br> For Instructions "
					+ "press Enter <br><br> (Cost: 2 points) <br><br> Or Space to continue\" <br><br>"
					+ "To take the timer task, you should press Enter to reveal the instructed time and special key. "
					+ "This will come with a small cost of 2 points but you will then earn 10 points if you remember the special key. "
					+ "<br><br>You will receive £1 for every 100 points you score, which means that you can earn an additional "
					+ "bonus payment of over £4.50, on top of the base payment from Prolific."
					+ "<br><br>Alternatively, you can opt out of the timer task. This will avoid the small cost but you will not "
					+ "score any bonus points when you do this. To opt out of the timer task, just press the spacebar to continue with the "
					+ "letter task. <br><br> "
					+ "It is completely up to you whether you choose to take the timer task. If you like, you can take the timer task some "
					+ "times but not others. When you get this choice, just pick whichever option you prefer."
					+ "<br><br>Please click below to practise again";
			break;
		case 41:
			i = "Sometimes in this experiment you can earn 10 points when you remember to press the special key. At other times you can "
					+ "earn 20 points. You will always be told the number of bonus points "
					+ "before deciding whether to do the timer task. Please pay attention to the instructions before you begin each block."
					+ "<br><br>If you choose to do the timer task, don't forget to do the letter task as well. "
					+ "You need to score at least 70% accuracy in the letter task, otherwise you will not receive any bonus "
					+ "payments from the timer task.<br><br>The experiment will now begin. Please click below to proceed";
			break;
		case 50:
			int reward;
			if ((Counterbalance.getFactorLevel("whichRewardFirst")+SequenceHandler.block_id) % 2 == 0) {
				reward = SequenceHandler.HR;
			}
			else {
				reward = SequenceHandler.LR;
			}
			
			
			i = "In this block, you can earn " 
					+ reward 
					+ " points for successfully completing the optional timer task.";
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
