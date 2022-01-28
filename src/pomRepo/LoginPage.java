package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//CONSTRUCTOR
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//DATA MEMBERS
	@FindBy(name="user_name") private WebElement usernameTextFeild;
	
	@FindBy(name="user_password") private WebElement passwordTextFeild;
	
	@FindBy(id="submitButton") private WebElement loginButton;
	
	
//GETTER Methods
	public WebElement getUsernameTextFeild() 
	{
		return usernameTextFeild;
	}

	public WebElement getPasswordTextFeild() 
	{
		return passwordTextFeild;
	}

	public WebElement getLoginButton() 
	{
		return loginButton;
	}
	
	
	//ACTION METHODS/BUSSINESS LOGICS/PAGE ACTION
	public void loginToApp(String username,String password)
	{
		usernameTextFeild.sendKeys(username);
		passwordTextFeild.sendKeys(password);
		loginButton.click();
	}

}
