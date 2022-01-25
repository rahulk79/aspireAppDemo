package aspirePageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class aspireProductPage {
  
	private static WebElement element = null ;	 
	
	public static WebElement ProductLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@data-menu-xmlid='stock.menu_stock_inventory_control']"));
		return element;
	}

	public static WebElement ProductLinkDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@data-menu-xmlid='stock.menu_product_variant_config_stock']"));
		return element;
	}
	
	public static WebElement ProductCreate(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='btn btn-primary o-kanban-button-new']"));
		return element;
	}
	
	public static WebElement ProductName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@placeholder='Product Name']"));
		return element;
	}
	
	public static WebElement ProductType(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_740']"));
		return element;
	}
	
	public static WebElement SalePrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_744']"));
		return element;
	}
	
	public static WebElement ProductCost(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_745']"));
		return element;
	}
	
	public static WebElement InventoryTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='Inventory' and @data-toggle='tab']"));
		return element;
	}
	
	public static WebElement InventoryTabWeight(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_755']"));
		return element;
	}
	
	public static WebElement InventoryTabVolumn(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_756']"));
		return element;
	}
	
	public static WebElement ManufactringLeadTime(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_757']"));
		return element;
	}
	
	public static WebElement CustomerLeadTime(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_758']"));
		return element;
	}
	
	public static WebElement PackageAddLine(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"o_field_input_792\"]/div[2]/div/table/tbody/tr[1]/td/a"));
		return element;
	}
	
	public static WebElement PackageName(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_799']"));
		return element;
	}
	
	public static WebElement ContainedQunantity(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='o_field_input_800']"));
		return element;
	}
	
	public static WebElement PackageSaveClose(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='modal_803']/div/div/footer/button[1]"));
		return element;
	}
	
	public static WebElement ProductSave(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='btn btn-primary o_form_button_save']"));
		return element;
	}
	
	public static WebElement ProductSearch(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='o_searchview_input']"));
		return element;
	}
	
	public static WebElement ProductListView(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@title='View list']"));
		return element;
	}
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}




