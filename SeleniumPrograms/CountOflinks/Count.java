package CountOflinks;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C://Chrome driver//chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();
	
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("https://www.ebay.com");
	
	
	
	List <WebElement> linklist = driver.findElements(By.tagName("a"));
	
	System.out.println(linklist.size());
	
	for(int i=0; i<linklist.size();i++) {
		String linktext = linklist.get(i).getText();
		System.out.println(linktext);
	}
	

			
	
}
}
