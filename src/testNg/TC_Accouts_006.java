package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Accouts_006 
{
	@Test(groups={"Some Testing","Regression Testing"},timeOut=10000)
	public void modifyAccount()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().	pageLoadTimeout(1, TimeUnit.SECONDS);//to check the webpage is opening in given time
		driver.get("https://in.bookmyshow.com/");
		driver.quit();
		}
	}


