package com.cyril.booklearning.utility;

public class TimeTester {
	public static void test(TimeTestable beTested){
		TimeCounter tc = new TimeCounter();
		
		for(int n = 1; n < 100; ++n){
			tc.start();
			beTested.test(n);
			System.out.println("Scale N is " + n + ", time wasted is " + tc.stop());
		}
	}
}
