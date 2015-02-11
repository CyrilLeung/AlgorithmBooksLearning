package com.cyril.booklearning.utility;

public class TimeCounter {
	long beginTime = 0;
	long endTime = 0;
	
	public void start(){
		beginTime = System.currentTimeMillis();
	}
	
	
	private void reset(){
		beginTime = endTime = 0;
	}
	
	public long stop(){
		endTime = System.currentTimeMillis();
		
		long gapTime =  endTime - beginTime;
		reset();
		
		return gapTime;
	}

	public static void main(String[] args){
		TimeCounter tc = new TimeCounter();
		tc.start();
		
		int sum = 0;
		for(int i = 0; i < 100000; ++i){
			sum += i;
			//System.out.println(i);
		}
		
		System.out.println(tc.stop());
	}
}
