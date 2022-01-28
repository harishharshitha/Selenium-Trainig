package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_TC_001 
{
	Logout_TC_001(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//img[@src='themes/softed/images/layerPopupBg.gif']") private WebElement LogoutLink;
	public WebElement getLogoutLink() 
	{
		return LogoutLink;
	}

}
