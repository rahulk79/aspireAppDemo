package aspireApp.aspireApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import aspirePageLibrary.aspireLoginPage;
import aspirePageLibrary.aspireHomePage;
import aspirePageLibrary.aspireProductPage;

public class testAspireProduct {
	public static WebDriver driver ;
	public static Properties prop ;
	public static WebDriverWait webwait ;
	public static String prodName ;
	
	@BeforeTest
	public void setpage() throws IOException {
		
		prop = new Properties(); 
		String projectPath = System.getProperty("user.dir");
		InputStream reader = new FileInputStream(projectPath+"/src/test/java/config.properties"); 
		prop.load(reader);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
  
	@Test (priority=1)
	public void testlogin() {
		
		// Test application login 
		
		driver.get(prop.getProperty("url"));
		aspireLoginPage.Username(driver).sendKeys(prop.getProperty("username"));
		aspireLoginPage.Password(driver).sendKeys(prop.getProperty("password"));
		aspireLoginPage.Login(driver).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Assert that login is successful
		Assert.assertEquals(aspireLoginPage.Userconfirmation(driver).getText() , "user");
		}
	
	@Test (priority=2)
	public void testProductionCreation() throws InterruptedException {
		
		aspireHomePage.Inventroylink(driver).click(); // click on Inventroy link
		aspireProductPage.ProductLink(driver).click(); //click on product link
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		aspireProductPage.ProductLinkDropdown(driver).click(); // click on product link under dropdown
		aspireProductPage.ProductCreate(driver).click(); //click on create button
	    
		// Creating unique Product name for every execution
		Random rand = new Random();
	     int random = rand.nextInt(1000);
	     prodName = "demo_prod" + String.valueOf(random) ; 
	     
	    aspireProductPage.ProductName(driver).sendKeys(prodName);  //entering product name
	    Select producttype = new Select(aspireProductPage.ProductType(driver)); // producttype
	    producttype.selectByVisibleText("Consumable");
		aspireProductPage.SalePrice(driver).clear() ;
		aspireProductPage.SalePrice(driver).sendKeys("20"); //Sale price
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)) ;
		aspireProductPage.ProductCost(driver).clear() ;
		aspireProductPage.ProductCost(driver).sendKeys("20"); //Cost
		aspireProductPage.InventoryTab(driver).click(); //Inventory tab
		webwait = new WebDriverWait(driver,Duration.ofSeconds(40));
	    webwait.until(ExpectedConditions.elementToBeClickable(aspireProductPage.InventoryTabWeight(driver)));
	    aspireProductPage.InventoryTabWeight(driver).clear();
	    aspireProductPage.InventoryTabWeight(driver).sendKeys("10"); //Inventory tab ->weight
		aspireProductPage.InventoryTabVolumn(driver).clear();
		aspireProductPage.InventoryTabVolumn(driver).sendKeys("10"); //Inventory tab ->volume
		aspireProductPage.ManufactringLeadTime(driver).clear();
		aspireProductPage.ManufactringLeadTime(driver).sendKeys("2"); //Inventory tab -> manufacturing lead time
		aspireProductPage.CustomerLeadTime(driver).clear();
		aspireProductPage.CustomerLeadTime(driver).sendKeys("2"); //Inventory tab -> customer lead time
		driver.manage().window().maximize();
		aspireProductPage.PackageAddLine(driver).click();   //package -> Add a line 
		aspireProductPage.PackageName(driver).sendKeys("package"); //create product page ->packaging 
		aspireProductPage.ContainedQunantity(driver).clear();
		aspireProductPage.ContainedQunantity(driver).sendKeys("100"); //create product page ->contained quantity
		aspireProductPage.PackageSaveClose(driver).click();  // save and close
	    aspireProductPage.ProductSave(driver).click(); // product save button
		
		// To assert product created successfully 
	    aspireHomePage.Applicationlink(driver).click(); // applicationlink
	    aspireProductPage.ProductLink(driver).click(); //click on product link
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		aspireProductPage.ProductLinkDropdown(driver).click(); // click on product link under dropdown
	    aspireProductPage.ProductSearch(driver).sendKeys(prodName);  // Product search
	    aspireProductPage.ProductSearch(driver).sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		aspireProductPage.ProductListView(driver).click(); // product list view
		Assert.assertEquals(driver.findElement(By.xpath("//tbody[@class='ui-sortable']/tr[1]/td[3]")).getText() ,prodName );
		
	}

  @AfterTest
  public void teardown() {
	 driver.quit();
  }	
  
}
