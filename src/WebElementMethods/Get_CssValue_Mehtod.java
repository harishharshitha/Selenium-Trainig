package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CssValue_Mehtod 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(2000);
	
	String propertyValue = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("background-image");
	System.out.println(propertyValue);
	

}

}