package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrom.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com");
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		
		
	}

}
