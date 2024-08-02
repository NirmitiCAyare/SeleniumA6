package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.JavaUtility.JavaUtility;

public class CreateOrganizationPage {
	
	private @FindBy (xpath="//input[@name='accountname']")
	WebElement orgName;
	
	private @FindBy(xpath="//input[@name='button']")
	WebElement saveBtn;
	
	public CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrgName(String org) {
		orgName.sendKeys(org+JavaUtility.getRandomNumber());
		return orgName;
	}

	public WebElement getSaveBtn() {
		saveBtn.click();
		return saveBtn;
	}
	
	

}
