package com.selenium.Batch10Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNGDetail {

	@Test(dependsOnMethods={"xyz"})
	public void bdc()
	{
		System.out.println("test");
	}


	@Test(priority=1)//If you have multiple @Test, all the @Test should have priority or else testNg will not be able to decide priority
	public void xyz()
	{
		System.out.println("test main");
	}


	@Test(enabled=false)
	public void abc()
	{
		System.out.println("test 2");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}


	@BeforeMethod
	public void beforeMethodxyz() {
		System.out.println("beforeMethodxyz");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
