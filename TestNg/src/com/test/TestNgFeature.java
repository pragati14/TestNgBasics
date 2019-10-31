package com.test;

import org.testng.annotations.Test;

public class TestNgFeature {
	
@Test
public void loginTest()
{
	System.out.println("login test");
	int i=9/0;
}

@Test(dependsOnMethods = "loginTest")
public void HomepageTest()
{
	System.out.println("Homepage test");
}

@Test
public void SearchPageTest()
{
	System.out.println("Search page test");
}


}
