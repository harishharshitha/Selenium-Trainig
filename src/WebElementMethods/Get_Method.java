package WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome. driver","./drivers/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	String expectedTitle="Please identify yourself";
	
	WebElement actualtitle = driver.findElement(By.id("headerContainer"));
		String title=actualtitle.getText();
		//System.out.println(title);
	
	if(expectedTitle.equals(title))
	{
		System.out.println("Title Matched");
	}
	else
	{            
		System.out.println("Title not  Matched");
	}
}
}
