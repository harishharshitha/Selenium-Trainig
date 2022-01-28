package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import data_driven.ExcelLib;
import pomRepo.HomePage;
import pomRepo.LoginPage;

public class Login 
{
	public static void main(String[] args) 
	{	  
		//TestData
		String testurl=ExcelLib.readStringData("Sheet3", 0, 0);
		@SuppressWarnings("unused")
		String username=ExcelLib.readStringData("Sheet3", 0, 1);
		@SuppressWarnings("unused")
		String password=ExcelLib.readStringData("Sheet3", 0, 2);
		String expectedLoginPagetitle=ExcelLib.readStringData("Sheet3", 1, 0);
		String expectedHomePagetitle=ExcelLib.readStringData("Sheet3", 1, 1);
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://demo.actitime.com/login.do");
		driver.get(testurl);
		String actualLoginPagetitle=driver.getTitle();
		if(actualLoginPagetitle.equals(expectedLoginPagetitle))
		{
			System.out.println("Login Page is displayed Successfully");
		}
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getUsernameTextFeild().sendKeys("admin");
		loginPage.getPasswordTextFeild().sendKeys("manager");
		loginPage.getLoginButton().click();
		String actualHomePagetitle=driver.getTitle();
		if(actualHomePagetitle.equals(expectedHomePagetitle))
		{
			System.out.println("Login Successfully");
		}
		
		HomePage homepage=new HomePage(driver);
		homepage.getuserModuleLink().click();
		homepage.getreportsModuleLink().click();
		
		
		
	}

}
