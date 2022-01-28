package Assignment_1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Print_Title_of_all_Windows_in_Naukri 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	
	Set<String> allwindowId=driver.getWindowHandles();
	driver.getCurrentUrl();
	
	
	
	
	
}
}
