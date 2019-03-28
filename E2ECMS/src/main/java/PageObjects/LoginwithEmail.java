package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginwithEmail 
{
	public WebDriver driver;
	
	By LoginwithEmail=By.xpath("//span[contains(text(),'Using Email ID')]");
	By Username=By.xpath("//input[@type='email']");
	By Password=By.xpath("//input[@id='userPasswordEMAIL_LOGIN']");
	By Submit=By.xpath("(//input[@id='clickToLogin'])[2]");
	
	public LoginwithEmail(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}
	public WebElement clickLoginwithemail()
	{
		return driver.findElement(LoginwithEmail);
	}
	
	public WebElement EnterUsername()
	{
		return driver.findElement(Username);
	}
	public WebElement EnterPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement Submit()
	{
		return driver.findElement(Submit);
	}
	
	

}
