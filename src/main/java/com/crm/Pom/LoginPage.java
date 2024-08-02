package com.crm.Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	
	private @FindBy(xpath="//input[@name='user_name']")
	WebElement username;
	
	private @FindBy(xpath="//input[@name='user_password']")
	WebElement password;
	
	private @FindBy(xpath="//input[@id='submitButton']")
	WebElement loginbtn;
	
	private @FindBy(xpath="//a[text()='Sign Out']")
	WebElement logout;
	
	private @FindBy(xpath="(//a[text()='Organizations'])[1]")
	WebElement org;
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername(String user) {
		username.sendKeys(user);
		return username;
	}

	public WebElement getPassword(String pass) {
		password.sendKeys(pass);
		return password;
	}

	public WebElement getLoginbtn() {
		loginbtn.click();
		return loginbtn;
	}

	public WebElement getLogout() {
		logout.click();
		return logout;
	}

	public WebElement getOrg() {
		org.click();
		return org;
	}

}
