package Assignment_1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Close_3rd_Window_Naukri 
{
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Set<String> wh=driver.getWindowHandles();
	String expectedTitle="ICICI";
	
	for(String windowid:wh)
		
	{
		driver.switchTo().window(windowid);
		String actualtitle=driver.getTitle();
		
		if(expectedTitle.equals(actualtitle))
		{
			driver.close();
		}
	}

}
}
