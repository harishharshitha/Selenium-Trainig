package webDriverMethods;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_setPosition_of_Browser 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://skillrary.com");
	
	driver.manage().window().setPosition(new Point(100,50));
	

}
}

