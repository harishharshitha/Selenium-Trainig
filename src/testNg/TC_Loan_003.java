package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Loan_003 
{
	@Test(priority=1)
	public void createLoan()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		int i=1/0;
		driver.get("https://in.bookmyshow.com/");
	}
	
	@Test(priority=2,dependsOnMethods="createLoan")//dependsOnMethod will execute only when create loan is
	//successfull if it is failed maodify loand will not execute
	public void modifyLoan()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.amazon.com/");
	}
	@Test(priority=3)
	public void repayLoan()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.zomato.com/");
		//driver.quit();
	}
	
	@Test(priority=4,dependsOnMethods= {"createLoan","repayLoan"})//if anyone of the method is failed then deleteLoans will not execute	3
	public void DeleteLoan()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.vtu.com/");
	}

}
