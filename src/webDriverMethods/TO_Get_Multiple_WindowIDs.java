package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class TO_Get_Multiple_WindowIDs 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.naukri.com");
	
	Set<String> windowhandle = driver.getWindowHandles();
	for(String windowid:windowhandle)
	{
		System.out.println(windowhandle);
		driver.quit();
	}
	
	
}
}
