package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class SalarySteps {
    WebDriver driver;

    @Given("User is on the GreytHR login page for navigation Salary menu")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://openfuture.greythr.com/uas/portal/auth/login");
    }

    @When("User enters valid login credentials for navigation Salary menu")
    public void user_enters_credentials() {
        driver.findElement(By.id("username")).sendKeys("AAG907");
        driver.findElement(By.id("password")).sendKeys("SagarDGhume!@123");
    }

    @And("User logs into the portal for navigation Salary menu")
    public void user_logs_in() throws InterruptedException {
    	WebElement loginButton = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", loginButton);
    	Thread.sleep(5000);
    }

    @Then("User verify the Salary menu")
    public void click_Salary_menu() throws InterruptedException {
    	WebElement shadowhost = driver.findElement(By.xpath("(//*[@class='ng-star-inserted hydrated'])[2]"));
    	SearchContext shadowRoot = shadowhost.getShadowRoot();
    	Thread.sleep(5000);
    	
    	WebElement Salary = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
    	WebElement Payslips = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
        WebElement YTD_Reports = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"));
        WebElement IT_Statement = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)"));
        WebElement IT_Declaration = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > ul:nth-child(2) > li:nth-child(4) > a:nth-child(1)"));
        WebElement Loans = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > ul:nth-child(2) > li:nth-child(5) > a:nth-child(1)"));
        WebElement Reimbursement = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > ul:nth-child(2) > li:nth-child(6) > a:nth-child(1)"));
        WebElement Proof = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > ul:nth-child(2) > li:nth-child(7) > a:nth-child(1)"));
        WebElement Salary_revision = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(5) > ul:nth-child(2) > li:nth-child(8) > a:nth-child(1)"));
        Salary.isDisplayed();
        Payslips.isDisplayed();
        YTD_Reports.isDisplayed(); 
        IT_Statement.isDisplayed();
        IT_Declaration.isDisplayed();
        Loans.isDisplayed();
        Reimbursement.isDisplayed();
        Proof.isDisplayed();
        Salary_revision.isDisplayed();
        
        
    	
    }

    @And("User closed the browser for navigation Salary menu")
    public void User_closed() {
    	
        driver.close();
    }

    
}
