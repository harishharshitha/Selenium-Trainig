package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Get_HeightandWidth_of_Browser 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://skillrary.com");
		
		Dimension dimension = driver.manage().window().getSize();
		int Height=dimension.getHeight();
		int width=dimension.getWidth();
		System.out.println("Height:" +Height+ "and Width:" +width);
	}

}
