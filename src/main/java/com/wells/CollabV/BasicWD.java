package com.wells.CollabV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicWD {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void setup(){
		driver.manage().window().maximize();
	}
	
	@Test
	public void navigation(){	
		driver.get("http://www.google.com");
	}
	
	@Test
	public void searchName(){
		WebElement eleSearchBox = driver.findElement(By.name("q"));
		eleSearchBox.sendKeys("Dileep Andavarapu");
		eleSearchBox.submit();
		System.out.println("Name Searched Successfully.");
	}
	
	@AfterClass
	public void tearDown(){
		driver.close();
	}
}
