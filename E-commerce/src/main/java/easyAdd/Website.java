package easyAdd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website {
	public static WebDriver driver;
	public static void Websitemethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\kanishka\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://shop.ttkprestige.com/");
		WebElement Search = driver.findElement(By.id("search"));
		Search.click();
		Search.sendKeys("Oven");
		Search.sendKeys(Keys.ENTER);
		driver.manage().window().maximize();
		JavascriptExecutor SD = (JavascriptExecutor) driver;
		SD.executeScript("window.scrollBy(0,750)", "");
		
	}

}
