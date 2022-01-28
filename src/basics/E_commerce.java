package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_commerce 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//Thread.sleep(3000);
	
	//Adding 1nd Product
	String parentwindowID=driver.getWindowHandle();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
	driver.findElement(By.xpath("//span[.='Apple iPhone 11 (64GB) - Purple']")).click();
	Set<String> allwindowids = driver.getWindowHandles();
	allwindowids.remove(parentwindowID);
	String expectedtitle="Apple iPhone 11 (64GB) - Purple";
	
	for(String windowid:allwindowids)
	{
		driver.switchTo().window(windowid);
		String actualpagetitle=driver.getTitle();
		if(actualpagetitle.equals(expectedtitle))
		{
			System.out.println("driver switched the control to the correct page");
		}
	}
	driver.findElement(By.id("add-to-cart-button")).click();
	
	//Adding 2nd Product
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus",Keys.ENTER);
	driver.findElement(By.xpath("//span[.='OnePlus Nord 2 5G (Blue Haze, 8GB RAM, 128GB Storage)']")).click();
	Set<String> allwindowids1 = driver.getWindowHandles();
	allwindowids.remove(parentwindowID);
	String expectedTitle="OnePlus Nord 2 5G (Blue Haze, 8GB RAM, 128GB Storage)";
	
	for(String windowid:allwindowids1)
	{
		driver.switchTo().window(windowid);
		String actualpagetitle=driver.getTitle();
		if(actualpagetitle.equals(expectedTitle))
		{
			System.out.println("driver switched the control to the correct page");
		}
	}
	driver.findElement(By.id("add-to-cart-button")).click();
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//driver.findElement(By.xpath("//input[value='Delete']")).click();
}
}
