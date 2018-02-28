package com.wiki.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikTextChange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*open chrome browser*/
		//find the chrome driver
		
		System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\hilary.l\\Documents\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		/*Open the wikipedia website*/
		driver.get("https://www.wikipedia.org/");
		
		/*get the text*/
		WebElement japanElement = driver.findElement(By.xpath("//a[@id='js-link-box-ja']/child::strong"));
		WebElement ItElement = driver.findElement(By.cssSelector("div[lang='it'] strong"));
		
		
		String japOldText = japanElement.getText();
		String itOldText = ItElement.getText();
		
		/*change text and change it back*/
		js.executeScript("document.getElementById('js-link-box-it').children[0].innerHTML = 'New Italiano text';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('js-link-box-it').children[0].innerHTML = '" + itOldText + "';");
		Thread.sleep(3000);
		

		js.executeScript("document.getElementById('js-link-box-ja').children[0].innerHTML = 'New Japan Text';");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('js-link-box-ja').children[0].innerHTML = '" + japOldText + "';");
		
	}

}
