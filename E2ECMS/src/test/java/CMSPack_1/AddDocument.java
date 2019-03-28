package CMSPack_1;

import java.util.concurrent.TimeUnit;

import PageObjects.LoginwithEmail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonResources.Base;
import PageObjects.AddResourcess;
public class AddDocument extends Base	
{
public WebDriver driver;

@DataProvider(name="Docinputs")
public Object[][] Docinputs()
{
	return new Object[][] {{"Sabjan Doc1", "C:\\Users\\sabjansab\\Downloads\\Test_Plan_Template_02.doc", "Test Desc1"},
			{"Sabjan Doc2", "C:\\Users\\sabjansab\\Downloads\\Test_Plan_Template_03.doc", "Test Desc2"},
			{"Sabjan Doc3", "C:\\Users\\sabjansab\\Downloads\\Test_Plan_Template_04.doc", "Test Desc3"}};

} 
private static Logger log=LogManager.getLogger(Base.class.getName());
@BeforeTest
public void initialize()
{
	log.info("Intialize the browser");
	driver=initializebrowser();
	log.info("Browser intialization completed");
	
}


@Test(dataProvider = "Docinputs")
public void AddDocuments(String Title1,String UploadF,String Des) throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	log.debug("Start adding the document");
	LoginwithEmail le=new LoginwithEmail(driver);
	AddResourcess ar=new AddResourcess(driver);
driver.get("https://cmds.nhancelms.com/login");
	le.clickLoginwithemail().click();
	le.EnterUsername().sendKeys("sabjansab.c@gasofttech.in");
	le.EnterPassword().sendKeys("testing@ga");
	le.Submit().click();
	Thread.sleep(3000);
	ar.Selectfolder().click();
	Thread.sleep(3000);
	ar.clkaddcontent().click();
	ar.Sel_Doc().click();
	Thread.sleep(3000);
	ar.Title().sendKeys(Title1);
	ar.Upload().sendKeys(UploadF);
	ar.Desc().sendKeys(Des);
	Thread.sleep(3000);
	ar.Programdropdown().click();
	Thread.sleep(3000);
	ar.Functionalradio().click();
	
	ar.ProgramDone().click();
	int count=ar.Checkboxsize().size();
	
	for(int i=0;i<count;i++)
	{
		Thread.sleep(3000);
		ar.Topics().click();
		ar.Checkboxsize().get(i).click();
		ar.Topics_Done().click();
	}
	
	ar.Add().click();
	Thread.sleep(3000);
	ar.Logoutsel().click();
	ar.Logout().click();
	
	
	
}
@AfterTest
public void close()
{
	
	driver.close();
}
}
