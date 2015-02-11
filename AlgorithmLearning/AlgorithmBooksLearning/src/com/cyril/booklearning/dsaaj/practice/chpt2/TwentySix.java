package com.cyril.booklearning.dsaaj.practice.chpt2;

public class TwentySix {
	//Assume that the elements are all positive.
	public static int getMainElem(int[] arr, int len){
		//The base case, including the len == 0 & len == 1.
		if(len == 0)
			return -1;
		else if(len == 1)
			return arr[0];
		else if(len % 2 != 0){
			int cnt = 0;
			for(int i = 0; i < len - 1; ++i){
				if(arr[len-1] == arr[i])
					++cnt;
			}
			if(cnt >= len / 2)
				return arr[len-1];
			else return getMainElem(arr, len-1);
		}
		else{
			int resLen = 0;
			for(int i = 0; i < len; i+=2){
				if(arr[i] == arr[i+1])
					arr[resLen++] = arr[i];
			}
			return getMainElem(arr, resLen);
		}
	} 
	
	//Can't judge whether the main is exist or not.
	public static int getMainElemSimple(int[] arr){
		int cnt = 1;
		int num = arr[0];
		for(int i = 1; i < arr.length; ++i){
			if(num == arr[i])
				cnt++;
			else
				cnt--;
			if(cnt < 0){
				num = arr[i];
				cnt = 1;
			}
		}
		return num;
	}
	
	public static void main(String[] args){
		System.out.println(getMainElem(new int[]{1, 2, 2, 1, 1, 2, 2, 2, 3}, 9));
		System.out.println(getMainElemSimple(new int[]{1, 2, 2, 1, 1, 2, 2, 2, 3}));
	}
}
