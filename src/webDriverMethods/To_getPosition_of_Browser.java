package webDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_getPosition_of_Browser
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	//driver.manage().window().maximize();
	driver.get("https://skillrary.com");
	
	Point point=driver.manage().window().getPosition();
	System.out.println(point.getX());
	System.out.println(point.getY());
	
	

}
}
