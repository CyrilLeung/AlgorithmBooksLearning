package com.cyril.booklearning.utility;

public class TimePlaceHolder {
	public static void freeze(){
		try {
			Thread.sleep(timeGap);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private final static int timeGap = 1;
}
