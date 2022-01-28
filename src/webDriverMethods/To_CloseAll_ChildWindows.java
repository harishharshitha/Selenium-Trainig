package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_CloseAll_ChildWindows 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		
		String parentWindowId=driver.getWindowHandle();
	Set<String> allwindowid = driver.getWindowHandles();
	allwindowid.remove(parentWindowId);
	
	
	for(String WindowId:allwindowid)
	{
		driver.switchTo().window(WindowId);
		driver.close();
	}
	}

}
