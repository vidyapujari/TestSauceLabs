package automation.TestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSauceProject {

	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws Exception
	{ 

	WebDriverManager.chromedriver().setup();
	String binaryPath = WebDriverManager.chromedriver().getBinaryPath();
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	String currentURL = driver.getCurrentUrl();

	}

	// Logiging into site
	
	@Test(priority=1,enabled=true)
	public void enterUserName() throws Exception {
    
	Thread.sleep(2000);	
	WebElement userName=driver.findElement(By.xpath("//*[@id='user-name']"));
	userName.isDisplayed();
	System.out.println("User name text field displayed");
	userName.sendKeys("standard_user");
	System.out.println("Entered user name ");
	
	}
	
	@Test(priority=2,enabled=true)
	public void enterPassword() throws Exception {

	Thread.sleep(2000);	
	WebElement userPassword=driver.findElement(By.xpath("//*[@id='password']"));
	userPassword.isDisplayed();
	System.out.println("Password text field displayed");
	userPassword.sendKeys("secret_sauce");
	System.out.println("Entered Password ");
	
	}
	
	@Test(priority=3,enabled=true)
	public void clickLoginButton() throws Exception {
    
	Thread.sleep(2000);	
	WebElement loginButton=driver.findElement(By.xpath("//*[@id='login-button']"));
	loginButton.isDisplayed();
	System.out.println("Login button displayed");
	loginButton.click();
	System.out.println("Clicked on Login ");
	
	}
	
	// Clicking on dropdown by using SELECT 
	
	@Test(priority=4,enabled=true)
	public void clickOnFilterDropDown() throws Exception {
    
	Thread.sleep(2000);		
	WebElement dropdownMenu=driver.findElement(By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select"));
	dropdownMenu.isDisplayed();
	System.out.println("Dropdown menu displayed");
	dropdownMenu.click();
	
	}
	
	@Test(priority=5,enabled=true)
	public void selectLowToHighPriceFilter() throws Exception {
	WebElement dropdownMenu=driver.findElement(By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select"));
	Thread.sleep(2000);
	Select clickDropDown=new Select(dropdownMenu);
	clickDropDown.selectByIndex(2);
	System.out.println("Selected Low to High Price filter ");
	
	}
	
	@Test(priority=6,enabled=true)
	public void addingItemToCart() throws Exception {
    
	Thread.sleep(3000);		
	WebElement clickAddToCart=driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-onesie']"));
	clickAddToCart.isDisplayed();
	System.out.println("Add to cart displayed");
	clickAddToCart.click();
	System.out.println("Clicked on Add to cart ");
	Thread.sleep(10000);
	
	}
	
	@Test(priority=7,enabled=true)
	public void viewingCart() throws Exception {
    
	Thread.sleep(3000);		
	WebElement viewCart=driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a"));
	viewCart.isDisplayed();
	System.out.println("Cart icon displayed");
	viewCart.click();
	System.out.println("Clicked on View Cart");
	Thread.sleep(3000);
	
	}
	

	@AfterTest
	public void closeapp() throws InterruptedException{

	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	Thread.sleep(5000);
	driver.close();
	}


	}


