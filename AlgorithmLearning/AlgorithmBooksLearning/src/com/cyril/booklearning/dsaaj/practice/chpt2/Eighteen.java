package com.cyril.booklearning.dsaaj.practice.chpt2;

public class Eighteen {
	public double solveFunctionInBnrySch(Function func, double low, double high) throws Exception{
		//The base case.
		double theLessOne = Math.abs(func.f(low)) < Math.abs(func.f(high)) ? Math.abs(func.f(low)) :Math.abs(func.f(high));
		if(theLessOne < deviation)
			return Math.abs(func.f(low)) < Math.abs(func.f(high)) ? low : high;
		else{
			double theMidVal = (low + high)/2;
			
			if(func.f(theMidVal) * func.f(low) <= 0)
				return solveFunctionInBnrySch(func, low, theMidVal);
			else if(func.f(theMidVal) * func.f(high) <= 0)
				return solveFunctionInBnrySch(func, theMidVal, high);
			else{
				throw new Exception();
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		Eighteen eighteen = new Eighteen();
		double res = eighteen.solveFunctionInBnrySch(new Function(){
			@Override
			public double f(double x) {
				// TODO Auto-generated method stub
				return x - 3.1415926;
			}
			
		}, -10, 10);
		
		System.out.println(res);
	}
	
	private static final double deviation = 0.00000001D;
}

interface Function{
	public double f(double x);
}