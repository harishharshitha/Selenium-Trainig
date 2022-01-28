package Assignment_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Get_tittle_url_page_source_ofFlipKart 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		String tittle = driver.getTitle();
		System.out.print(tittle);
		
		String url = driver.getCurrentUrl();
		System.out.print(url);
		
		String pagesource = driver.getPageSource();
		System.out.print(pagesource);
		
		
		
		}

}
