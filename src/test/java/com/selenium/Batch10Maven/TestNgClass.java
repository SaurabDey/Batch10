package com.selenium.Batch10Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class TestNgClass {
	WebDriver driver;
	
  @Test
  public void f() 
  {
	 LoginClass ref= new LoginClass(driver);
	 ref.loginfunction();
  }
  @Parameters("givenBrowser")
  @BeforeTest
  public void beforeTest(String gBro) throws InterruptedException {
	  System.out.println("Hello world before Test");
	  
	  System.out.println("This is setup part");
		
	  String browser=gBro;
	  
	  if (browser.equalsIgnoreCase("Chrome")) 
	  {
			System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			driver= new ChromeDriver();// initialisation 
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
			driver= new FirefoxDriver();// initialisation 
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe");
			driver= new InternetExplorerDriver();// initialisation 
		}
		else
		{
			System.out.println("The given browser doesnot exist");
		}
		
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);//5Seconds
		
		
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Hello world After Test");
	  driver.quit();
  }

}
