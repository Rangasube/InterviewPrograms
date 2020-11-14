package General;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrtScr {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("F:\\Image.png");
		FileUtils.copyFile(srcFile, destFile);
		
		System.out.println("Screenshot Captured...");
	}

}
