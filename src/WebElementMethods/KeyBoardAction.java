package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardAction 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(3000);
		
		WebElement usernametextfeild = driver.findElement(By.id("username"));
		usernametextfeild.clear();
		
		usernametextfeild.sendKeys("ha","rs","hi","tha",Keys.CONTROL+"a");
		Thread.sleep(3000);
		
		usernametextfeild.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(3000);
		
		usernametextfeild.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(3000);
		
		 WebElement passowrdtextfeild = driver.findElement(By.id("password"));
		 passowrdtextfeild.sendKeys("HarishHarshita");
		Thread.sleep(3000);
		
		passowrdtextfeild.sendKeys("HarishHarshita",Keys.CONTROL+"a");
		Thread.sleep(3000);
		
		passowrdtextfeild.sendKeys("HarishHarshita",Keys.CONTROL+"c");
		Thread.sleep(3000);
		
		passowrdtextfeild.sendKeys("HarishHarshita",Keys.CONTROL+"v");
		Thread.sleep(3000);
		
		
	}


}
