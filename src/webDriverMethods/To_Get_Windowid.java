package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Get_Windowid 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.navigate().to("https://www.zomato.com");
	
	String windowhandle = driver.getWindowHandle();
	System.out.println(windowhandle);
	driver.quit();
	

}
}
