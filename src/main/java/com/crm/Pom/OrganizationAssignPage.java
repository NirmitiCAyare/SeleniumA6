package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrganizationAssignPage {
	
	private @FindBy(xpath="(//input[@name='assigntype'])[2]")
	WebElement radiobtn;
	
	private @FindBy(xpath="//select[@name='assigned_group_id']")
	WebElement assign;
	
	private @FindBy(xpath="//select[@name='industry']")
	WebElement industry;
	
	private @FindBy(xpath="//input[@name='button']")
	WebElement saveBtn;

	public WebElement assigned()
	{
		radiobtn.click();
		return radiobtn;
	}
	public WebElement getIndustry() {
		Select s=new Select(industry);
		s.selectByValue("Construction");
		return industry;
	}

	public WebElement getRadiobtn() {
		radiobtn.click();
		return radiobtn;
	}
	public WebElement getAssign() {
		//Select s=new Select(assign);
	//s.selectByValue("Team Selling");
		return assign;
	}
	public WebElement getSaveBtn() {
		saveBtn.click();
		return saveBtn;
	}

	public OrganizationAssignPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	

}
