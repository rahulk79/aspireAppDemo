package aspirePageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class aspireHomePage {
	
	private static WebElement element = null ;
	
	public static WebElement Inventroylink (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='result_app_1']"));
	    return element ;
	 }
	
	public static WebElement Applicationlink (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@title='Applications']"));
		return element;
	}
	
}
