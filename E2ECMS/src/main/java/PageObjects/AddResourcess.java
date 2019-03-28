package PageObjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddResourcess
{
	
 public AddResourcess(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

public WebDriver driver;
 
By Selectfolder=By.xpath("//span[contains(text(),'sabjan1')]");
By clkaddcontent=By.xpath("//*[@id='mainSection']/div[2]/div[2]/div[1]/div[1]");
By Sel_Doc=By.xpath("//div[@data-value='DOCUMENT']");
By Title =By.xpath("//div[@id='addResourcePopupDiv']/table/tbody/tr[1]/td[2]/div/input");
By Upload=By.xpath("//*[@id='addResourcePopupDiv']/table/tbody/tr[2]/td[2]/div/div/div[2]/input");
By Desc=By.xpath("//textarea[@class='textareaDiv addResourcePopupDesc']");
By Programdropdown=By.xpath("/html[1]/body[1]/div[17]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/div[1]/div[1]/div[2]/div[1]");
By Functionalradio=By.xpath("//div[@class='ATSelectOptList']//div[1]//input[1]");
By ProgramDone=By.xpath("//*[@id='ATWrapper']/div[2]/div[2]/div[2]/a[1]");
By Checkboxsize=By.xpath("//input[@type='checkbox']");
By Topics=By.xpath("//div[@class='ATTHolder ATHolder']/div[1]/span");
By chkboxiterator=By.xpath("//input[@type='checkbox']");
By Topics_Done=By.xpath("//div[@class='ATSelectOptionsDiv openToggler']//a[@class='liner margRight5 confirmClass doCStream confirmAT'][contains(text(),'Done')]");
By Add=By.xpath("//div[@class='right bigGreenButton']");
By Logoutsel=By.xpath("/html[1]/body[1]/div[9]/div[2]/div[1]");
By Logout=By.xpath("//a[@id='cmdsLogout']");
 


public WebElement Selectfolder()
 {
	 return driver.findElement(Selectfolder);
	 
 }
 
 public WebElement clkaddcontent()
 {
	 return driver.findElement(clkaddcontent);
	 
 }
 public WebElement Sel_Doc()
 {
	 return driver.findElement(Sel_Doc);
	 
 }
 public WebElement Title()
 {
	 return driver.findElement(Title);
	 
 }
 public WebElement Upload()
 {
	 return driver.findElement(Upload);
	 
 }
 public WebElement Desc()
 {
	 return driver.findElement(Desc);
	 
 }
 
 public WebElement Programdropdown()
 {
	 return driver.findElement(Programdropdown);
	 
 }
 public WebElement Functionalradio()
 {
	 return driver.findElement(Functionalradio);
	 
 }
 public WebElement ProgramDone()
 {
	 return driver.findElement(ProgramDone);
	 
 }
 
 public List<WebElement> Checkboxsize()
 {
	 return driver.findElements(Checkboxsize);
	 
 }
 public WebElement Topics()
 {
	 return driver.findElement(Topics);
	 
 }

 public WebElement Topics_Done()
 {
	 return driver.findElement(Topics_Done);
	 
 }
 
 public WebElement Add()
 {
	 return driver.findElement(Add);
	 
 }
 public WebElement Logoutsel()
 {
	 return driver.findElement(Logoutsel);
	 
 }
 public WebElement Logout()
 {
	 return driver.findElement(Logout);
	 
 }
 
}
