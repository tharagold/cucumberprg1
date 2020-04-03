package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffPlanSteps {
	

	
	@Given("User click on Add tariff plan button")
	public void user_click_on_Add_tariff_plan_button() throws Throwable {
		try {
			handleFrame();
			}catch(Exception e) {
			}
		 Hook.driver.findElement(By.xpath("(//a[text()='Add Tariff Plan'])")).click();
	   
	}
	

	@When("User Enters all the field")
	public void user_Enters_all_the_field() throws Throwable {
		try {
			handleFrame();
		}catch(Exception e) {
		}
		 Hook.driver.findElement(By.id("rental1")).sendKeys("110");
		 Hook.driver.findElement(By.id("local_minutes")).sendKeys("120");
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys("130");
		 Hook.driver.findElement(By.name("sms_pack")).sendKeys("140");
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys("11");
		 Hook.driver.findElement(By.name("inter_charges")).sendKeys("12");
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys("13");
	  
	}
	@When("User Enters all the field with two dim list")
	public void user_Enters_all_the_field_with_two_dim_list(DataTable TariffPlan) {
		List<List<String>> data=TariffPlan.asLists(String.class);
		
		 Hook.driver.findElement(By.id("rental1")).sendKeys(data.get(3).get(0));
		 Hook.driver.findElement(By.id("local_minutes")).sendKeys(data.get(3).get(1));
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys(data.get(3).get(2));
		 Hook.driver.findElement(By.name("sms_pack")).sendKeys(data.get(3).get(3));
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys(data.get(2).get(4));
		 Hook.driver.findElement(By.name("inter_charges")).sendKeys(data.get(3).get(5));
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys(data.get(3).get(0));
	  }
		
	@When("User Enters all the field with two dim map")
	public void user_Enters_all_the_field_with_two_dim_map(DataTable TariffPlan) {
		List<Map<String, String>> data=TariffPlan.asMaps(String.class,String.class);
		 Hook.driver.findElement(By.id("rental1")).sendKeys(data.get(3).get("MR"));
		 Hook.driver.findElement(By.id("local_minutes")).sendKeys(data.get(3).get("FLM"));
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys(data.get(3).get("FIM"));
		 Hook.driver.findElement(By.name("sms_pack")).sendKeys(data.get(3).get("FSP"));
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys(data.get(2).get("LPMC"));
		 Hook.driver.findElement(By.name("inter_charges")).sendKeys(data.get(3).get("IPMC"));
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys(data.get(3).get("SPC"));
		
	}
	
	@When("User Enters all the field  {string},{string},{string},{string},{string},{string},{string}")
	public void user_Enters_all_the_field(String string, String string2, String FIM, String string4, String string5, String string6, String SPC) {
		 Hook.driver.findElement(By.id("rental1")).sendKeys(string);
		 Hook.driver.findElement(By.id("local_minutes")).sendKeys(string2);
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys(FIM);
		 Hook.driver.findElement(By.name("sms_pack")).sendKeys(string4);
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys(string5);
		 Hook.driver.findElement(By.name("inter_charges")).sendKeys(string6);
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys(SPC);
		
		
	}
	
	@When("User click on  tariff plan submit button")
	public void user_click_on_tariff_plan_submit_button() {
		 Hook.driver.findElement(By.xpath("(//input[@value='submit'])")).click();
	}
	

	@Then("User should be displayed the congratulation you add tariff plan")
	public void user_should_be_displayed_the_congratulation_you_add_tariff_plan() throws Throwable {
		try {
			handleFrame();
		}catch(Exception e) {
		}
		Assert.assertEquals( Hook.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText(), "Congratulation you add Tariff Plan");

	}
	public void handleFrame() throws Throwable {
		 Thread.sleep(3000);
		 Hook.driver.switchTo().frame( Hook.driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']")));
		 Hook.driver.findElement(By.id("closeBtn")).click();
		 Hook.driver.switchTo().parentFrame();
	}
}

