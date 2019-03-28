package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeleteDocs 
{
public WebDriver driver;
	By checkall=By.cssSelector("div[class='gCBox cmdsAllgCBox']");
	By deletedoc=By.xpath("//div[@class='gButton resourceOpt deleteResources']");
	By delYes=By.xpath("//div[@class='smallGreenButton closeVMessagePopup null']");
	By delNo=By.xpath("//div[@class='smallRedButton closeVMessagePopup']");
	By closepopoup=By.xpath("//a[@class='closecmdsPopup closePopup closePopupImg']");
	
	public DeleteDocs(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement checkall()
	{
		return driver.findElement(checkall);
	}
	
	public WebElement deletedoc()
	{
		return driver.findElement(deletedoc);
	}
	
	public WebElement delYes()
	{
		return driver.findElement(delYes);
	}
	
	public WebElement delNo()
	{
		return driver.findElement(delNo);
	}
	public WebElement closepopoup()
	{
		return driver.findElement(closepopoup);
	}

}
