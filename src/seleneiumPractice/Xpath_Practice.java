package seleneiumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome. driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.skillrary.com/");
	
	driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
	}
}
