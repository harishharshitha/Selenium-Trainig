package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMakeBrowserFullScreenMode 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://twitter.com");
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
		
		
		
	}

}
