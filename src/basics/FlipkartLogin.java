package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	
//	Set<String> wh = driver.getWindowHandles();
//	System.out.println(wh);
//	
//	String expectedtitle="Login";
//	
//	for(String windowid:wh)
//	{
//		driver.switchTo().window(windowid);
//		String actualTitle=driver.getTitle();
//		if(actualTitle.equals(expectedtitle))
//		{
//			System.out.println("login page is successfully displayed");
//		}
//	}
//	
	
	
	}

}
