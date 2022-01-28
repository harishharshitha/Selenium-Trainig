package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled_Method
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.name("email"));
	WebElement password = driver.findElement(By.name("pass"));
	WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
	
	System.out.println(loginButton.isEnabled ());
	
	username.sendKeys("Harshitha");
	password.sendKeys("pokemon");
	loginButton.click();
	
	System.out.println(username.isDisplayed());
	
	
	
	}
}
