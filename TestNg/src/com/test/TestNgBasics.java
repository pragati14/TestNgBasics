package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

//pre-condition annotations
@BeforeSuite  //1
public void setUp()
{
	System.out.println("@BeforeSuite : setup system properly for firefox");
}

@BeforeTest //2
public void launchBrowser()
{
	System.out.println("@BeforeTest : Launch firefox browser");
}

@BeforeClass//3
public void login()
{
	System.out.println("@BeforeClass : login to app");
}

@BeforeMethod//4
public void enterURL()
{
	System.out.println("@BeforeMethod : enter URL");
}



//test case
@Test//5
public void firefoxTitleText()
{
	System.out.println("@Test 1 : firefox title text");
}

@Test
public void searchText()
{
	System.out.println("@Test 2 : search the text");
}

//post-condition annotations
@AfterMethod  //6
public void logout()
{
	System.out.println("@AfterMethod : logout from app");
}


@AfterClass   //7
public void closeBrowser()
{
	System.out.println("@AfterClass : close browser");
}


@AfterTest   //8
public void deleteAllCookies()
{
	System.out.println("@AfterTest : deleteAllCookies");
}



//@AfterSuite //9
//public void generateTestReport()
//{
//	System.out.println("generateTestReport");
//}
}
