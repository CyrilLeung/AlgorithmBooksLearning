package com.cyril.booklearning.dsaaj.practice.chpt2;

import com.cyril.booklearning.utility.TimePlaceHolder;
import com.cyril.booklearning.utility.TimeTestable;
import com.cyril.booklearning.utility.TimeTester;

public class Seven {
	private static void test4(int n){
		int sum = 0;
		for(int i = 0; i < n; ++i)
			for(int j = 0; j < i; ++j){
				TimePlaceHolder.freeze();
				sum++;
			}
	}
	
	
	public static void main(String[] args){
		TimeTester.test(new TimeTestable() {
			@Override
			public void test(int scale) {
				// TODO Auto-generated method stub
				test4(scale);
			}
		});
	}
}
