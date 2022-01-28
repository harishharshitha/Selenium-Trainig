package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.zomato.com");
		Thread.sleep(3000);
		driver.get("https://twitter.com");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		URL url=new URL("https://twitter.com");
		driver.navigate().to("https://twitter.com");
		
	}


}
