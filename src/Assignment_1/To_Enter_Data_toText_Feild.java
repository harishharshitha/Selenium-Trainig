package Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Enter_Data_toText_Feild
{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome. driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mobiles");

}
}
