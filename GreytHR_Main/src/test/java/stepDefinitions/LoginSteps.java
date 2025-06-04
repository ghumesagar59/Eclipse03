package stepDefinitions;

import io.cucumber.java.en.*;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import utils.DriverFactory;
import static org.junit.Assert.*;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();

    @Given("I am on the Greythr login page for navigate login page")
    public void user_is_on_login_page() throws InterruptedException {
        driver.get("https://openfuture.greythr.com/uas/portal/auth/login");
        Thread.sleep(2000);
    }

    @When("I entered valid username and password for navigate login page")
    public void user_enters_valid_credentials() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("AAG907");
        driver.findElement(By.id("password")).sendKeys("SagarDGhume!@123");
        Thread.sleep(5000);
    }

    @When("I entered invalid username and password for navigate login page")
    public void user_enters_invalid_credentials() throws InterruptedException {
        driver.findElement(By.id("username")).sendKeys("AAG9077701");
        driver.findElement(By.id("password")).sendKeys("Pass@1234");
        Thread.sleep(5000);
    }

    @When("I clicked on the login button for navigate login page")
    public void user_clicks_login() throws InterruptedException {
    	
    	WebElement loginButton = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", loginButton);
    }

    @Then("I should be redirected to the dashboard for navigate login page")
    public void redirected_to_dashboard() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.urlContains("/home"));
        assertTrue(driver.getCurrentUrl().contains("/home"));
    }

    @Then("An error message should be displayed for navigate login page")
    public void error_message_displayed() {
        WebElement error = new WebDriverWait(driver, Duration.ofSeconds(20))
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flex flex-col p-5 rounded-gt-md-4 w-185 h-50 bg-std-info']")));
        assertTrue(error.isDisplayed());
        System.out.println("error is : "+ error.getText());
        driver.close();
    }
}
