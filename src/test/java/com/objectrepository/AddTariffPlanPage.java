package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddTariffPlanPage extends FunctionalLibrary{
	
	public AddTariffPlanPage() {
		PageFactory.initElements(driver, this);		
	}
	
	 @FindBy(xpath = "//a[text()='Add Tariff Plan']")
	    private WebElement doneBtn;
	
	@FindBy(id="rental1")
	private WebElement MR;
	
	@FindBy(id="local_minutes")
	private WebElement FLM;
	
	@FindBy(id="inter_minutes")
	private WebElement FIM;
	
	@FindBy(id="sms_pack")
	private WebElement FSP;
	
	@FindBy(id="minutes_charges")
	private WebElement LPMC;
	
	@FindBy(id="inter_charges")
	private WebElement IPMC;
	
	@FindBy(id="sms_charges")
	private WebElement SPC;
	
	 @FindBy(xpath = "//input[@value='submit']")
	    private WebElement submitBtn;

	public WebElement getDoneBtn() {
		return doneBtn;
	}

	public WebElement getMR() {
		return MR;
	}

	public WebElement getFLM() {
		return FLM;
	}

	public WebElement getFIM() {
		return FIM;
	}

	public WebElement getFSP() {
		return FSP;
	}

	public WebElement getLPMC() {
		return LPMC;
	}

	public WebElement getIPMC() {
		return IPMC;
	}

	public WebElement getSPC() {
		return SPC;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	 
	 
	

}
