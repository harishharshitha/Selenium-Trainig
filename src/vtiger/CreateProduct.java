package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProduct 
{
	CreateProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//img[@title='Create Product...']") private WebElement CreateProductModule;
	
	
	public WebElement getCreateProductModule() 
	{
		
		return CreateProductModule;
	
	}
	
	
	
}
