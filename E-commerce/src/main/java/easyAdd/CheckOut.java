package easyAdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut extends Website {
	public static void CheckOutmethod() {
		// TODO Auto-generated method stub
		WebElement Oven = driver.findElement(By.xpath("(//strong[@class='product name product-item-name'])[5]"));
		Oven.click();
		
		
		
	}

}
