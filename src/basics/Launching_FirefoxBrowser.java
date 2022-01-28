package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_FirefoxBrowser {
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
	}

}
