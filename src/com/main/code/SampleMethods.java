package com.main.code;

public class SampleMethods {

	public String getText() 
	{
		return "This is a sample Text";
	}
	
	static int getCalculation() 
	{
		return (500 * 500);
	}
	
	private int getLoopValue()
	{
		int count = 0;
		for ( int i = 0; i < 100000; i++ )
			count++;
		
		return count;
	}
}
