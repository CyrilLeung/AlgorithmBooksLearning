package com.cyril.booklearning.dsaaj.practice.chpt2;

public class Sixteen {
	public int gcd(int a, int b){
		//The base case.
		if(a % b == 0 || b % a == 0)
			return a < b ? a : b;
		else{
			if(a % 2 == 0 && b % 2 == 0)
				return gcd(a/2, b/2);
			else if(a % 2 == 0 && b % 2 != 0)
				return gcd(a/2, b);
			else if(a % 2 != 0 && b % 2 == 0)
				return gcd(a, b/2);
			else
				return gcd((a+b)/2, (a-b)/2);
		}
	}
	
	public static void main(String[] args){
		Sixteen sixteen = new Sixteen();
		System.out.println(sixteen.gcd(105, 77));
	}
}
