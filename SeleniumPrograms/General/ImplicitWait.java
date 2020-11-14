package General;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {
public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
	FirefoxDriver driver  = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.get("https://www.gmail.com");

	
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("saisharan387@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("donotaskagain");
	driver.findElement(By.xpath("//div[@id='passwordNext']//span[@class='CwaK9']")).click();
	System.out.println("Signed in...");
	
	
}
}
