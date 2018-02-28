package com.indeed.tests;
//import java.util.*;

import org.openqa.selenium.By;
//import selenium classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class indeedJobSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*Create FF driver to drive the browser (open FF browser)*/
		//Had to download Gecko Driver and set it to my path
		WebDriver driver = new FirefoxDriver();
		
		/*Navigate to Indeed Homepage*/
		String baseUrl = "https://www.indeed.com/";
		driver.navigate().to(baseUrl);
		
		/*Enter "Selenium" in the "What" field*/
		//Slow down the process
		Thread.sleep(2000);
		//Find the element of the "What" field (id = "what") & type (sendKeys) "Selenium" into the element
		driver.findElement(By.id("what")).sendKeys("Selenium");
		
		/*Enter "London" in the "Location" field*/
		//clear field first
		driver.findElement(By.id("where")).clear();
		Thread.sleep(2000);
		//type "London" into the text field
		driver.findElement(By.id("where")).sendKeys("London");
		Thread.sleep(2000);
		
		/*Click "Find Job" button*/
		driver.findElement(By.id("fj")).click();
		Thread.sleep(2000);
		/*close the popup that appears in the search page*/
		driver.findElement(By.id("prime-popover-close-button")).click();
		
		/*User should be navigated to the Job Search Results page*/
		//Get page title of the Job Search Result page
		System.out.println(driver.getTitle());
		//Get Job count message in the Job Search Result page	
		System.out.println(driver.findElement(By.id("searchCount")).getText());
		Thread.sleep(2000);
		
		/*close browser*/
		driver.close();
		
	}

}
