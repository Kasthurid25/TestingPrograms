package com.shopclues.Shopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Mobile {
	WebDriver driver = new FirefoxDriver();
	public void login()
	{
		driver.get("https://www.facebook.com/login/web/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9884041375");
		driver.findElement(By.id("pass")).sendKeys("teddy2014"); 
		driver.findElement(By.id("loginbutton")).click();  

	}
	
	

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Multimedia\\Desktop\\WORK SPACE\\Javascript\\exefile\\geckodriver.exe"); 
			Mobile m=new Mobile();
			m.login();


	}

}
