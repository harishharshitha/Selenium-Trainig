package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Different_Window
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.naukri.com");
	
	Set<String> wh = driver.getWindowHandles();
	String expextedWindowTitle="Tech Mahindra";
	
	for(String windowId:wh)
	{
		driver.switchTo().window(windowId);
		String actualwindowTittle=driver.getTitle();
		if(expextedWindowTitle.equals(actualwindowTittle))
		{
			driver.manage().window().maximize();
			break;
		}
		}
			
}
}
