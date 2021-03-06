package Actions;

 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class MouseHover1  {
 
 public static WebDriver driver;
 
 @SuppressWarnings("deprecation")
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","c:\\Chrome driver\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.spicejet.com/");
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


//Main Menu

new Actions(driver).moveToElement(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='highlight-addons']")))).build().perform();
new Actions(driver).moveToElement(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'SpiceClub Members')]")))).build().perform();
new WebDriverWait(driver, 7).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='hide-mobile']//ul//li//a[contains(text(),'Member Login')]"))).click();
Thread.sleep(10000);
driver.quit();
 }
 }