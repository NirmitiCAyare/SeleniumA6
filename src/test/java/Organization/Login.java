package Organization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.Login_Base;
@Listeners(com.crm.Listeners.ListenersImplementation.class)
public class Login extends Login_Base {
	
	
	@Test
	public void login()
	{
		
		
		//driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
	}

}
