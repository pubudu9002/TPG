package com.main.code;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TimeMeasureTool {

	public static void main(String[] args) {
		
		List<String> methodList = new ArrayList<String>();
		
		try
		{
			// Using reflection api to access methods
			@SuppressWarnings("rawtypes")
			Class aClass = Class.forName("com.main.code.SampleMethods");
			Object classObject = aClass.newInstance();
			Method[] methods =  aClass.getDeclaredMethods();

			for( int i = 0 ; i < methods.length ; i++ )
			{
				// Start Timer
				long startTime = System.nanoTime();
				// Access any private methods
				methods[i].setAccessible(true);
				// Invoke the method
				methods[i].invoke(classObject);
				// End Timer
				long endTime = System.nanoTime();
				methodList.add(methods[i].getName() + ": Took "+(endTime - startTime) + " ns" );
				
			}
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		
		methodList.forEach(System.out::println);
	}
}
