package com.test;

import org.testng.annotations.Test;

public class invocationCountTest {

	@Test(invocationCount = 5)
	public void sum()
	{
		int a=10,b=19;
		System.out.println(a+b);
	}
	
}
