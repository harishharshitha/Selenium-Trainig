package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_SetSize_of_Browser {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		
		Thread.sleep(3000);
		
		Dimension dimension = new Dimension(1500,900);
		driver.manage().window().setSize(dimension);
	

}

}