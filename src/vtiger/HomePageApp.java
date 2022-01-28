package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageApp {
	HomePageApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//a[text()='Products']") private WebElement ProductModuleLink;

		public WebElement getProductModuleLink() 
		{
			return ProductModuleLink;
		}
		
		
}
