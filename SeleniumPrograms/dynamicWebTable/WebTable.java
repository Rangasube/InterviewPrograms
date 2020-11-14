package dynamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	
	public static void main(String[] args) throws Exception {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		//driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saisharan387@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mani@1996");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Method 2:
		//driver.findElement(By.xpath("//td[contains(text(),'saisharan Rangasube')]//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();
		//driver.findElement(By.xpath("//td[contains(text(),'Test Test')]//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();
		
		//Method 1:
		//table//tr[1]//td[2]
		//table//tr[2]//td[2]
		//table//tr[3]//td[2]
		//table//tr[4]//td[2]
		
		String Before_xpath = "//table//tr[";
		String After_xpath = "]//td[2]";

		
		for(int i = 1;i<=4;i++) {
			String Name = driver.findElement(By.xpath(Before_xpath+i+After_xpath)).getText();
			System.out.println(Name);
		
		if(Name.equals("Hari Kiran")) {
		driver.findElement(By.xpath("//table//tr["+i+"]//td[1]")).click();
		}else if(Name.equals("saisharan Rangasube")) {
			driver.findElement(By.xpath("//table//tr["+i+"]//td[1]")).click();
	    }else if(Name.equals("kiran telkar")) {
	    	driver.findElement(By.xpath("//table//tr["+i+"]//td[1]")).click();
	    }else if(Name.equals("Test Test")) {
	    	driver.findElement(By.xpath("//table//tr["+i+"]//td[1]")).click();
	    }
	}
	}
}
