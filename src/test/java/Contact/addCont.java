package Contact;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.Login_Base;
import com.crm.FileUtility.ExcelUtility;
import com.crm.Pom.ContactPage;
import com.crm.Pom.PlusSymbolPage;

@Listeners(com.crm.Listeners.ListenersImplementation.class)

public class addCont extends Login_Base {
	@Test
	public void cont() throws EncryptedDocumentException, IOException
	{
		
		ContactPage c=new ContactPage(driver);
		c.getContact();
		PlusSymbolPage p=new PlusSymbolPage(driver);
		p.getCreate();
		String lastname = ExcelUtility.getDataFromExcel("Contact", 0, 1);
		c.getLastname(lastname);
		c.getStartdate();
		c.getEnddate();
		c.getSavebutton();
	}

}
