package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	static WebDriver driver;
	
	@Before
		public void beforeScenario() {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Mavenn\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://demo.guru99.com/telecom/index.html");
	     driver.manage().window().maximize();
	}
	
	@After
	public void afterScenario() {	
    driver.quit();
	}
	
}