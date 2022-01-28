package Assignment_1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Close_All_Child_Windows 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String parenwindowId=driver.getWindowHandle();
		Set<String> allwindowId=driver.getWindowHandles();
		 allwindowId.remove(parenwindowId);
		 
		 for(String windowid:allwindowId)
		 {
		driver.switchTo().window(windowid);
		driver.close();
	}
	
	}
}
