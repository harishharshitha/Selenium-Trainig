package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Locate_Using_CSSSELECTOR 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome. driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Harshitha");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Harshitha@123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='button']")).click();
	Thread.sleep(2000);
	}
}
