package Assignment_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class To_Get_Current_Window_Of_FcaeBook 
{
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String window = driver.getWindowHandle();
		System.out.println(window);
		driver.quit();
}
}