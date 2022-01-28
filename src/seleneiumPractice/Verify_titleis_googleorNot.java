package seleneiumPractice;      	
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_titleis_googleorNot 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expectedTittle="Google";
		
		String actualTittle=driver.getTitle();
		
		if(expectedTittle.equals(actualTittle))
		{
			System.out.print("success");
		}
		else
		{
			driver.close();
		}
		
	}

}
