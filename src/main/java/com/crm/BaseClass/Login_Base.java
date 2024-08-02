package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.crm.FileUtility.ExcelUtility;
import com.crm.FileUtility.PropertyUtility;
import com.crm.Pom.ContactPage;
import com.crm.Pom.CreateOrganizationPage;
import com.crm.Pom.LoginPage;
import com.crm.Pom.OrganizationAssignPage;
import com.crm.Pom.PlusSymbolPage;

public class Login_Base {
	
	public WebDriver driver;
	
	LoginPage l;
	PlusSymbolPage p;
	CreateOrganizationPage c;
	OrganizationAssignPage o;
	ContactPage co;
	@BeforeClass
	public void precondition() throws IOException
	{
		String browser=PropertyUtility.propertyLogic("browser");
		String url=PropertyUtility.propertyLogic("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		l=new LoginPage(this.driver);
		p=new PlusSymbolPage(this.driver);
		c=new CreateOrganizationPage(this.driver);
		o=new OrganizationAssignPage(this.driver);
		co=new ContactPage(this.driver);
	}
	@BeforeMethod
	public void loginFunction() throws EncryptedDocumentException, IOException
	{
		String username = ExcelUtility.getDataFromExcel("LoginCredential", 0, 1);
		String password = ExcelUtility.getDataFromExcel("LoginCredential", 1, 1);
		l.getUsername(username);
		l.getPassword(password);
		l.getLoginbtn();
		l.getOrg();
		p.getCreate();
		String orgname = ExcelUtility.getDataFromExcel("OrgName", 0, 1);
		c.getOrgName(orgname);
		o.getIndustry();
		o.getRadiobtn();
		o.getAssign();
		co.getContact();
		p.getCreate();
		String lastname = ExcelUtility.getDataFromExcel("Contact", 0, 1);
		co.getLastname(lastname);
		c.getSaveBtn();
		
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		l.getLogout();
		
	}
	
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}

}
