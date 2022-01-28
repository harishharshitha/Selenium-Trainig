package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="container_tasks") private WebElement taskModuleLink;
	
	@FindBy(id="container_reports") private WebElement reportsModuleLink;
	
	@FindBy(id="container_users") private WebElement userModuleLink;
	
	public WebElement gettaskModuleLink() 
	{
		return taskModuleLink;
	}

	public WebElement getreportsModuleLink() 
	{
		return reportsModuleLink;
	}

	public WebElement getuserModuleLink() 
	{
		return userModuleLink;
	}

	
	

}
