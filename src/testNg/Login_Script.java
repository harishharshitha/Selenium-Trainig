package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Script 
{
	@Test
	public void Login()
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get("https://demo.actitime.com/login.do");
	driver.get("http://localhost:8080/");
	
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	
	driver.findElement(By.xpath("//a[text()='Products']")).click();
	
	driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
}
}