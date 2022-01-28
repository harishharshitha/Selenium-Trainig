package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loans_101 
{
	@Test(priority=-10)
	public void lenskart()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.lenskart.com/");
	}
	
	@Test(priority=1)
	public void lenovo()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.lenovo.com/");
	}
	
	@Test(invocationCount=2)
	public void flipkart()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	}
	
	@Test(invocationCount=-1) //because of negative value it will not run
	public void udai()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://uidai.gov.in/");
	}
	
	@Test(invocationCount=2,threadPoolSize=4,enabled=false)
	public void amazon()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");

}
}
