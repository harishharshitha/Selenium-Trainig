package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Absoulute_Xpath 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/absolutexpath.html");

}
}
