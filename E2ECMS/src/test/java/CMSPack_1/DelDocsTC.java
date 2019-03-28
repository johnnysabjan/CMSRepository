package CMSPack_1;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonResources.Base;
import PageObjects.AddResourcess;
import PageObjects.DeleteDocs;
import PageObjects.LoginwithEmail;

public class DelDocsTC extends Base
{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize()
	{
		//log.info("Intialize the browser");
		driver=initializebrowser();
		//log.info("Browser intialization completed");
		
	}
	
	private static Logger log=LogManager.getLogger(Base.class.getName());
	
	@Test
	public void Blogintodelete() throws InterruptedException
	{
		
		LoginwithEmail le=new LoginwithEmail(driver);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		log.info("Enter URL");
		driver.get("https://cmds.nhancelms.com/login");
		le.clickLoginwithemail().click();
		Thread.sleep(3000);
		le.EnterUsername().sendKeys("sabjansab.c@gasofttech.in");
		le.EnterPassword().sendKeys("testing@ga");
		le.Submit().click();
		
		log.info("Logged in successfully");
	}
	
	@Test
	public void DelallDoc() throws InterruptedException
	{
		
		AddResourcess ar=new AddResourcess(driver);
		DeleteDocs del=new DeleteDocs(driver);
		Thread.sleep(3000);
		ar.Selectfolder().click();
		Thread.sleep(3000);
		del.checkall().click();
		Thread.sleep(3000);
		del.deletedoc().click();
		Thread.sleep(3000);
		del.delNo().click();
		Thread.sleep(3000);
		del.deletedoc().click();
		Thread.sleep(3000);
		del.delYes().click();
		del.closepopoup().click();
	}

}
