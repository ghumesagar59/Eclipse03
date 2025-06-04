package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class MyworklifeSteps {
    WebDriver driver;

    @Given("User is on the GreytHR login page for navigation My Worklife menu")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://openfuture.greythr.com/uas/portal/auth/login");
    }

    @When("User enters valid login credentials for navigation My Worklife menu")
    public void user_enters_credentials() {
        driver.findElement(By.id("username")).sendKeys("AAG907");
        driver.findElement(By.id("password")).sendKeys("SagarDGhume!@123");
    }

    @And("User logs into the portal for navigation My Worklife menu")
    public void user_logs_in() throws InterruptedException {
    	
    	WebElement loginButton = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", loginButton);
    }

    @Then("User verify the My Worklife menu")
    public void click_my_worklife_menu() throws InterruptedException {
    	Thread.sleep(3000);
    	WebElement shadowhost = driver.findElement(By.xpath("(//*[@class='ng-star-inserted hydrated'])[2]"));
    	SearchContext shadowRoot = shadowhost.getShadowRoot();
    	Thread.sleep(5000);
    	
    	WebElement My_Worklife = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(3) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
    	My_Worklife.isDisplayed(); 
    	WebElement Kudos = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
    	Kudos.isDisplayed(); 
        WebElement Feedback = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(3) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"));
        Feedback.isDisplayed(); 
        
        
    	
    }

    @And("User closed the browser for navigation My Worklife menu")
    public void User_closed() {
    	
        driver.close();
    }

    
}
