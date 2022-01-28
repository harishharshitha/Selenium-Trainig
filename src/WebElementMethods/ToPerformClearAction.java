package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClearAction 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).clear();
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("HarishHarshita");
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("HarishHarshita");
		Thread.sleep(3000);
		
		driver.findElement(By.className("forgotPasswordLink")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Back']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Sign in4']")).click();
		Thread.sleep(3000);
	}

}














