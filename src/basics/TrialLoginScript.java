package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import data_driven.ExcelLib;
import pomRepo.LoginPage;

public class TrialLoginScript 
{
	@Test
	public void createContact() {
	
		String testUrl=ExcelLib.readStringData("Sheet4", 0, 0);
		String username=ExcelLib.readStringData("Sheet4", 0, 1);
		String password=ExcelLib.readStringData("Sheet4", 0, 2);
		String expectedLoginPageTitle=ExcelLib.readStringData("Sheet4", 1, 0);
		String expectedHomePageTitle=ExcelLib.readStringData("Sheet4", 1, 1);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(testUrl);
		String ActualLoginPageTitle = driver.getTitle();
		if(ActualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login page is displayed successfully");
		}else {
			System.out.println("Login page is not displayed successfully");
		}

			LoginPage loginPage =new LoginPage(driver);
			loginPage.loginToApp(username, password);
			
		String ActualHomePageTitle = driver.getTitle();
		if(ActualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Home page is displayed successfully");
		}else {
			System.out.println("Home page is not displayed successfully");
		}
		
	//	HomePage homePage = new HomePage(driver);
		//homePage.homePageApp();
	
		

	}

}


