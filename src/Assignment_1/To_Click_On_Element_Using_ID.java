package Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Click_On_Element_Using_ID 
{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome. driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("keepLoggedInLabel")).click();
	
}
}

