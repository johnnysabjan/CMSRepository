package CMSPack_1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonResources.Base;
import PageObjects.LoginwithEmail;

public class CMSLogin extends Base
{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize()
	{
		driver=initializebrowser();
		
	}
	
	@Test
	public void AALogintoCMS()
	{
		driver.get("https://cmds.nhancelms.com/login");
		LoginwithEmail le=new LoginwithEmail(driver);
		le.clickLoginwithemail().click();
		le.EnterUsername().sendKeys("sabjansab.c@gasofttech.in");
		le.EnterPassword().sendKeys("testing@ga");
		le.Submit().click();
	}
	
	
}
