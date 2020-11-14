package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {
	public WebDriver driver;
	String URL = "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";

	public void openURL() {
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","C:\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public void actions_1() {
		driver.findElement(By.xpath("//div[@id='box1']")).click();
		WebElement dragme = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement dropme = driver.findElement(By.xpath("//div[@id='box101']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, dropme).perform();
	}

	public void actions_2() {
		driver.findElement(By.xpath("//div[@id='box2']")).click();
		WebElement dragme = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement dropme = driver.findElement(By.xpath("//div[@id='box102']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, dropme).perform();
	}
	public void actions_3() {
		driver.findElement(By.xpath("//div[@id='box3']")).click();
		WebElement dragme = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement dropme = driver.findElement(By.xpath("//div[@id='box103']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, dropme).perform();
	}
	public void actions_4() {
		driver.findElement(By.xpath("//div[@id='box4']")).click();
		WebElement dragme = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement dropme = driver.findElement(By.xpath("//div[@id='box104']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, dropme).perform();
	}
	public void actions_5() {
		driver.findElement(By.xpath("//div[@id='box5']")).click();
		WebElement dragme = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement dropme = driver.findElement(By.xpath("//div[@id='box105']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, dropme).perform();
	}
	public void actions_6() {
		driver.findElement(By.xpath("//div[@id='box6']")).click();
		WebElement dragme = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement dropme = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, dropme).perform();
	}
	public void actions_7() {
		driver.findElement(By.xpath("//div[@id='box7']")).click();
		WebElement dragme = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement dropme = driver.findElement(By.xpath("//div[@id='box107']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, dropme).perform();
		driver.close();
	}

	public static void main(String[] args) {
		DragnDrop test = new DragnDrop();
		test.openURL();
		test.actions_1();
		test.actions_2();
		test.actions_3();
		test.actions_4();
		test.actions_5();
		test.actions_6();
		test.actions_7();
		
	}
}
