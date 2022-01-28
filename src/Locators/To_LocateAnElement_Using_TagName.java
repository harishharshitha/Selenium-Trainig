package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_LocateAnElement_Using_TagName 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome. driver","./drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		//driver.findElement(By.name("username")).sendKeys("admin");
		
		//driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(3000);
		driver.findElement(By.tagName("a")).click();
		
	}

}
