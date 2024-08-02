package Organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.Login_Base;
import com.crm.FileUtility.ExcelUtility;
import com.crm.Pom.CreateOrganizationPage;
import com.crm.Pom.OrganizationAssignPage;
import com.crm.Pom.PlusSymbolPage;
@Listeners(com.crm.Listeners.ListenersImplementation.class)
public class createOrg extends Login_Base{
	
@Test
	public void ass() throws EncryptedDocumentException, IOException
	{
	PlusSymbolPage p=new PlusSymbolPage(driver);
	p.getCreate();
	CreateOrganizationPage c=new CreateOrganizationPage(driver);
	String orgname = ExcelUtility.getDataFromExcel("OrgName", 0, 1);
	c.getOrgName(orgname);
	OrganizationAssignPage o=new OrganizationAssignPage(driver);
	o.getIndustry();
	o.getRadiobtn();
	o.getAssign();
	c.getSaveBtn();
	}
}
