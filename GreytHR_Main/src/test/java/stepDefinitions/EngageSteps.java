package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import java.time.Duration;

public class EngageSteps {

	WebDriver driver;

    @Given("User is on the GreytHR login page for navigation engage menu")
    public void user_is_on_login_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://openfuture.greythr.com/uas/portal/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("User enters valid username and password for navigation engage menu")
    public void user_enters_credentials() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
    	username.sendKeys("AAG907");
    	WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    	password.sendKeys("SagarDGhume!@123");
        Thread.sleep(2000);
    }

    @And("User clicks the login button for navigation engage menu")
    public void user_clicks_login_button() throws InterruptedException {
    	WebElement loginButton = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", loginButton);
    	Thread.sleep(10000);
    }


    @And("Engage option should be visible for navigation engage menu")
    public void home_option_should_be_visible() throws InterruptedException {
    	Thread.sleep(3000);
    	WebElement shadowhost = driver.findElement(By.xpath("(//*[@class='ng-star-inserted hydrated'])[2]"));
    	SearchContext shadowRoot = shadowhost.getShadowRoot();
    	Thread.sleep(2000);
    	
    	WebElement engage = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
    	engage.isDisplayed();
        driver.quit();
    }
}
