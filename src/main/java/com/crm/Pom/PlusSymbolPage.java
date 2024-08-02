package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlusSymbolPage {
	
	private @FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	WebElement create;
	
	public PlusSymbolPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreate() {
		create.click();
		return create;
	}
}
