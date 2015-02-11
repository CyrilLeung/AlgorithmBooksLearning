package com.cyril.booklearning.dsaaj.practice.chpt2;

public class Seventeen {
	public int minPosSum(int[] arr){
		int minSum = 2147483647, curSum = 2147483647;
		
		for(int i = 0; i < arr.length; ++i){
			curSum += arr[i];
			
			if(curSum < minSum)
				minSum = curSum;
			else if(arr[i] < 0)
				curSum = 2147483647;
		}
		return minSum;
	}
	
	public int maxPosMultply(int[] arr){
		int maxSum = 0, curSum = 0;
		
		for(int i = 0; i < arr.length; ++i){
			curSum *= arr[i];
			
			if(curSum < maxSum)
				maxSum = curSum;
			else if(arr[i] < 0)
				curSum = 0;
		}
		return maxSum;
	}
}
