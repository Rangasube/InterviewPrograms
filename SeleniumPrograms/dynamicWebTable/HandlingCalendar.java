package dynamicWebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCalendar {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C://Chrome driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://react-day-picker.js.org/examples/elements-year-navigation/");//URL
		
		String date="2-May-2020";
		String dateArr[]=date.split("-");
		String day = dateArr[0];
		//System.out.println(day);
		String month = dateArr[1];
		String year = dateArr[2];
		
		//selectin dropdown
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='month']")));
		select1.selectByVisibleText(month);
		
		Select select2 = new Select(driver.findElement(By.xpath("//select[@name='year']")));
		select2.selectByVisibleText(year);
		
		//div[@class='DayPicker-Body']//div[1]//div[3]
		//div[@class='DayPicker-Body']//div[1]//div[4]
		//div[@class='DayPicker-Body']//div[1]//div[5]
		
		String beforeXpath = "//div[@class='DayPicker-Body']//div[";
		String afterXpath = "]//div[";
		
		final int totalWeekDays = 7;
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-1 3-2 3-3 3-4 3-5 3-6 3-7
		boolean flag = false;
		for(int rowNum=1; rowNum<=6; rowNum++) {
			for(int colNum=1; colNum<=totalWeekDays; colNum++) {
				String dayVal = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				System.out.println(dayVal);
				if(dayVal.equals(day)) {
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					System.out.println("Clicked");
					flag = true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		
		
		
		

	}

}
