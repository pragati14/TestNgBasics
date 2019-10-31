package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirefoxTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://www.google.com");
	}
	
	
	@Test(priority = 1,groups = "title")
	public void firefoxTitleText()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority = 3,groups = "logo")
	public void logoTest()
	{
		driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	
	@Test(priority = 2,groups = "test")
	public void test1()
	{
		System.out.println(" test 1");
	}
	
	@Test(priority = 4,groups = "test")
	public void test2()
	{
		System.out.println(" test 2");
	}
	
	@Test(priority = 5,groups = "test")
	public void test3()
	{
		System.out.println(" test 3");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
