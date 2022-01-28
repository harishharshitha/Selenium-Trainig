package PopUps;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Change_The_Date_and_Month 
{
	public static void main(String[] args) throws InterruptedException
	{
		LocalDate ld=LocalDate.now();
		String month=ld.getMonth().name();
		month=month.substring(0, 1).toUpperCase()+month.substring(1,month.length()).toLowerCase();
		int date=ld.getDayOfMonth();
		int year=ld.getYear();
		System.out.println(month);
		System.out.println(date);
		System.out.println(year);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@id='"+date+"']")).click();
		driver.findElement(By.xpath("//div[text()='"+month+"' "+year+"']"));	
	}

}
