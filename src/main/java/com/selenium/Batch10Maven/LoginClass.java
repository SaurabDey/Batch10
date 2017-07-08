package com.selenium.Batch10Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginClass 
{
WebDriver driver;

	
	public LoginClass(WebDriver driver2) {
	 driver=driver2;
}


	public void loginfunction()
	{
		 System.out.println("Hello world Test");
		  
		  WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
			username.sendKeys("Saurab");;
			
			WebDriverWait wait= new WebDriverWait(driver, 20);//Explicit wait
	WebElement xyz =        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
					//WebElement  true/false    class
			xyz.sendKeys("Gauri");
			
//			WebElement username1=driver.findElement(By.xpath("//input[@id='pass']"));
//			username1.sendKeys("Gauri");;
			
			WebElement username2=driver.findElement(By.xpath("//input[@type='submit']"));
			username2.click();
	}
	
}
