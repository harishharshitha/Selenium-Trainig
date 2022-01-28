package Assignment_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Close_Only_parentWindow {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	
driver.close();
}
}
