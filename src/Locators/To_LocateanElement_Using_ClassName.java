package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_LocateanElement_Using_ClassName 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome. driver","./drivers/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.skillrary.com/");
	
	driver.findElement(By.className("dropdown-toggle")).click();
	
}
}
