package com.cyril.booklearning.utility;

public class TwentyThree {
	private static double noRecPower(double X, int N){
		double res = 1;
		double tot = X;
		while(N > 0){
			if(N - ((N>>1)<<1) > 0){
				res *= tot;
			}
			tot *= tot;
			N >>= 1;
		}
		
		return res;
	}
	
	public static void main(String[] args){
		System.out.println(noRecPower(2, 10));
	}
}
