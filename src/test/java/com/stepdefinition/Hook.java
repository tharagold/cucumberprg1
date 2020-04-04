package com.stepdefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibrary {
	
	FunctionalLibrary f=new FunctionalLibrary();
	
	@Before
		public void beforeScenario() {
		
f.launch("http://demo.guru99.com/telecom/index.html");		
	     driver.manage().window().maximize();
	}
	
	@After
	public void afterScenario() {	
		
    driver.quit();
	}
	
}