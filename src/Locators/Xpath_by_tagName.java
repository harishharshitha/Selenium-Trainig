package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_tagName 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome. driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='X']")).click();
		
		driver.findElement(By.xpath("//p[text()='Job of SRE in IT']")).click();
}
}