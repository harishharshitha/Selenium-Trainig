package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_attribute_Method {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		WebElement usernameTF = driver.findElement(By.name("username"));
		usernameTF.clear();
		usernameTF.sendKeys("Harshitha");
		String actualdata = usernameTF.getAttribute("value");
		System.out.println(actualdata);
		
		if(actualdata.equals("Harshitha"))
		{
			System.out.println("username entered properly");
		}
		else
		{
			System.out.println("username not entered properly");
		}
		
		
		
	}

}
