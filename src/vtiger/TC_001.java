package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import data_driven.ExcelLib;

public class TC_001 {
	@Test
	public void product() throws InterruptedException {
	
		String testUrl=ExcelLib.readStringData("Sheet4", 0, 0);
		String username=ExcelLib.readStringData("Sheet4", 0, 1);
		String password=ExcelLib.readStringData("Sheet4", 0, 2);
		String expectedLoginPageTitle=ExcelLib.readStringData("Sheet4", 1, 0);
		String expectedHomePageTitle=ExcelLib.readStringData("Sheet4", 1, 1);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(testUrl);
		String ActualLoginPageTitle = driver.getTitle();
		if(ActualLoginPageTitle.equals(expectedLoginPageTitle)) {
			Reporter.log("Login page is displayed successfully");
		}else {
			Reporter.log("Login page is not displayed successfully");
		}

			LoginPage loginPage =new LoginPage(driver);
			loginPage.LoginToApp(username, password);
			
		String ActualHomePageTitle = driver.getTitle();
		if(ActualHomePageTitle.equals(expectedHomePageTitle)) {
			Reporter.log("Home page is displayed successfully");
		}else {
			Reporter.log("Home page is not displayed successfully");
		}
		
		HomePageApp homePage = new HomePageApp(driver);
		homePage.getProductModuleLink().click();
		
		CreateProduct product= new CreateProduct(driver);
		product.getCreateProductModule().click();
		
		ProductName pro=new ProductName(driver);
		pro.productName();
		pro.getSaveModule().click();
		
		Logout_TC_001 tc=new Logout_TC_001(driver);
		tc.getLogoutLink().click();

	
	}
}
