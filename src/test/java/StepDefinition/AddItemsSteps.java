package StepDefinition;

import com.sun.tools.internal.xjc.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class AddItemsSteps {
    WebDriver driver;
    private WebDriverWait wait;

    @Given("I go to the login page")
    public void i_go_to_the_login_page$() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vidya\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        String currentURL = driver.getCurrentUrl();
    }
    @When("I login as a valid user")
    public void i_login_as_a_valid_user()
       { driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
         driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        }
    @When("Clicking on dropdown by using SELECT")
    public void Clicking_on_dropdown_by_using_SELECT()
        {
            driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
            driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    @When("I add items? to the cart")
    public void i_add_items_to_the_cart()
    {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @When("Click_Cart")
    public void Click_Cart()
    {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Then("View_Cart")
    public void View_Cart()
    {
        boolean status= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]")).isDisplayed();
        Assert.assertEquals(true,status);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Then("Click_Continue")
    public void Click_Continue()
    {
        driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @When("Clicking on dropdown by using SELECT2")
    public void Clicking_on_dropdown_by_using_SELECT2()
    {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @When("I add items? to the cart2")
    public void i_add_items_to_the_cart2()
    {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @When("Click_Cart2")
    public void Click_Cart2()
    {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Then("View_Cart2")
    public void View_Cart2()
    {
        boolean status= driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]")).isDisplayed();
        Assert.assertEquals(true,status);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    @Then("Close browser")
    public void close_browser() {
        driver.quit();
    }
}
