package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Rect_Mehtod
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	
	Rectangle rectangle = driver.findElement(By.id("email")).getRect();
	int email_height=rectangle.getHeight();
	int email_width=rectangle.getWidth();
	int email_x_axis=rectangle.getX();
	int email_y_axis=rectangle.getY();
	
	System.out.println("EmailHeight:" +email_height);
	System.out.println("EmailWidth:" +email_width);
	System.out.println("Email_x:" +email_x_axis);
	System.out.println("Email_y:" +email_y_axis);
	
	Rectangle rect = driver.findElement(By.id("pass")).getRect();
	int pwd_height=rectangle.getHeight();
	int pwd_width=rectangle.getWidth();
	int pwd_x_axis=rectangle.getX();
	int pwd_y_axis=rectangle.getY();
	
	System.out.println("passheight:" +pwd_height);
	System.out.println("passwidth:" +pwd_width);
	System.out.println("passx:" +pwd_x_axis);
	System.out.println("pass_y:" +  pwd_y_axis);

}
}
