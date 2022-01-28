package seleneiumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Search_an_ApplicationOnGoogle 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	driver.findElement(By.name("q")).click();
	driver.findElement(By.name("q")).sendKeys("https://www.skillrary.com/");
	}

}
