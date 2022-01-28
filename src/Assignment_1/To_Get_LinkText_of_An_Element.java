package Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Get_LinkText_of_An_Element 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(3000);
		String Link = driver.findElement(By.linkText("Natural")).getText();
		System.out.println("Link Text Of an Element is:" + Link);

}
}
