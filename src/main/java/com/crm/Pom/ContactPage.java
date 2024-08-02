package com.crm.Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.JavaUtility.Localdate;

public class ContactPage {
	
	private @FindBy(xpath="//a[text()='Contacts']")
	WebElement contact;
	
	private @FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	private @FindBy(xpath="//input[@name='support_start_date']")
	WebElement startdate;
	
	private @FindBy(xpath="//input[@name='support_end_date']")
	WebElement enddate;
	
	private @FindBy(xpath="//input[@name='button']")
	WebElement savebutton;
	
	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSavebutton() {
		savebutton.click();
		return savebutton;
	}

	public WebElement getContact() {
		contact.click();
		return contact;
	}
	
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLastname(String last) throws EncryptedDocumentException, IOException {
		lastname.sendKeys(last);
		return lastname;
	}

	
	public WebElement getStartdate() {
		startdate.sendKeys(Localdate.startDate());
		return startdate;
	}

	public WebElement getEnddate() {
		enddate.sendKeys(Localdate.endDate());
		return enddate;
	}
	
	

}
