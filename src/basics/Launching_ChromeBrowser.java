package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_ChromeBrowser 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		/*Thread.sleep(2000);
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\geckodriver.exe" );
		FirefoxDriver driver1=new FirefoxDriver();*/
	}

}
