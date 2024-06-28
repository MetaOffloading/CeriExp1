package com.sam.webtasks.basictools;

import com.google.gwt.user.client.ui.HTML;
import com.sam.webtasks.client.Params;

public class Points {
	public static int points = 0;
	public static String moneyString = "";
	
	public static final HTML pointsDisplay = new HTML();
	
	public final static void Init() {
		pointsDisplay.setStyleName("livePointsDisplay");
		setPoints(points);
	}

	public final static void setPoints (int nPoints) {
		points = nPoints;
		moneyString = getMoneyString(points);
		pointsDisplay.setHTML("You have scored " + Points.points + " points (" + moneyString + " bonus)");
	}
	
	public final static void addPoints(int pointsToAdd) {
		setPoints(points + pointsToAdd);
	}
	
	public final static void subtractPoints(int pointsToSubtract) {
		setPoints(points - pointsToSubtract);
	}
	
	public final static String getMoneyString(int nPoints) {
		//don't show a negative bonus
		if (nPoints < 0) {
			nPoints = 0;
		}
		
		int nPence = (int) Math.ceil( (float) (100*nPoints) / Params.pointsPerPound);
		int nPounds = nPence / 100;
		int nRemainderPence = nPence % 100;
		
		String money = "£" + nPounds + ".";
		
		if (nRemainderPence < 10) {
			money = money + "0" + nRemainderPence;
		} else {
			money = money + nRemainderPence;
		}
		
		return (money);
	}
}
