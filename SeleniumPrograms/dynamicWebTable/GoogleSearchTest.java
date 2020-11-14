package dynamicWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Chrome driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("Total No.of Suggestion =>"+list.size());
		
		for(int i = 0;i<list.size();i++) {
			String suggestion = list.get(i).getText();
			System.out.println(suggestion);
			
			if(suggestion.contains("testing concepts")) {
				list.get(i).click();
				break;
			}
		}
		
	
	}
}
