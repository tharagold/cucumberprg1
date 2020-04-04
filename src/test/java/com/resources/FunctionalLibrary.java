package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	
	public void launch(String url) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Mavenn\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(url);

	}
	public void insertText(WebElement element,String value) {

		element.sendKeys(value);
	}
	public void button(WebElement element) {
		element.click();

	}

}
