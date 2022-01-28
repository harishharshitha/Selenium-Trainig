package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitandClose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
