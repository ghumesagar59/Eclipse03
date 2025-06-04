package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class OtherStep {
    WebDriver driver;

    @Given("User is on the GreytHR login page for navigation Other menu")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://openfuture.greythr.com/uas/portal/auth/login");
    }

    @When("User enters valid login credentials for navigation Other menu")
    public void user_enters_credentials() {
        driver.findElement(By.id("username")).sendKeys("AAG907");
        driver.findElement(By.id("password")).sendKeys("SagarDGhume!@123");
    }

    @And("User logs into the portal for navigation Other menu")
    public void user_logs_in() throws InterruptedException {
    	WebElement loginButton = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", loginButton);
    	Thread.sleep(5000);
    }

    @Then("User verify the Other menu")
    public void click_Other_menu() throws InterruptedException {
    	WebElement shadowhost = driver.findElement(By.xpath("(//*[@class='ng-star-inserted hydrated'])[2]"));
    	SearchContext shadowRoot = shadowhost.getShadowRoot();
    	Thread.sleep(5000);
    	
    	WebElement Document_Center = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(8) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
    	WebElement People = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(9) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
        WebElement Helpdesk = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(10) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
        WebElement Request_Hub = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(11) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
        WebElement Workflow_Delegates = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(12) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
        
        Document_Center.isDisplayed();
        People.isDisplayed();
        Helpdesk.isDisplayed(); 
        Request_Hub.isDisplayed();
        Workflow_Delegates.isDisplayed();
        
    }

    @And("User closed the browser for navigation Other menu")
    public void User_closed() {
    	
        driver.close();
    }

    
}
