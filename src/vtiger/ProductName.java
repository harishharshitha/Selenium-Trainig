package vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductName
{
	ProductName(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//input[@name='productname']") private WebElement ProductModuleLink;
@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement SaveModule;


public WebElement getProductModuleLink()
{
	return ProductModuleLink;
}

public void productName()
{
	ProductModuleLink.sendKeys("Pendrive");
}

public WebElement getSaveModule() {
	return SaveModule;
}


}
