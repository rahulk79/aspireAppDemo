package aspirePageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class aspireLoginPage {
	
	private static WebElement element = null ;
	
	public static WebElement Username (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@placeholder='Email']")) ;
	    return element ;
	 }
	
	public static WebElement Password (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@placeholder='Password']"));
		return element;
	}
	
	public static WebElement Login (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='btn btn-primary btn-block']"));
		return element;
	}
	
	public static WebElement Userconfirmation (WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='oe_topbar_name']"));
		return element;
	}
	
	
	
}
