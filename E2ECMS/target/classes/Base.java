package CommonResources;
	import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Base
	{
		
		 public static WebDriver driver;
		String browser="chrome";
	

	 public WebDriver initializebrowser()
	 {
		
		 if(browser=="chrome")
		 {
			 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sabjansab\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 }
		 else 
		 {
			 System.out.println("Firefox");
		 }
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 return driver;
		
	 }
	 
		public void getsuccessscreenshot(String result) throws IOException
		{
			File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(Src, new File("D://java//Screenshot//"+result+"Screenshot.png"));
		}
			  
	 
	 
	 }
		



