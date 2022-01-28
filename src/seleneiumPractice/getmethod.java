package seleneiumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	
	d.manage().window().maximize();
	
	d.get("https://www.zomato.com");
	String url = d.getCurrentUrl();
	System.out.println(url);
	
	String title=d.getTitle();
	System.out.println(title);
	
	String ps = d.getPageSource();
	System.out.println(ps);
	
	d.close();
	
	d.quit();
	}

}
