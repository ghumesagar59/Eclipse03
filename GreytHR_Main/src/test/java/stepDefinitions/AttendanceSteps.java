package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class AttendanceSteps {
    WebDriver driver;

    @Given("User is on the GreytHR login page for navigation Attendance menu")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://openfuture.greythr.com/uas/portal/auth/login");
    }

    @When("User enters valid login credentials for navigation Attendance menu")
    public void user_enters_credentials() {
        driver.findElement(By.id("username")).sendKeys("AAG907");
        driver.findElement(By.id("password")).sendKeys("SagarDGhume!@123");
    }

    @And("User logs into the portal for navigation Attendance menu")
    public void user_logs_in() throws InterruptedException {
    	WebElement loginButton = driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", loginButton);
    	
    }

    @Then("User verify the Attendance menu")
    public void verify_attendance_menu() throws InterruptedException {
    	Thread.sleep(3000);
    	WebElement shadowhost = driver.findElement(By.xpath("(//*[@class='ng-star-inserted hydrated'])[2]"));
    	SearchContext shadowRoot = shadowhost.getShadowRoot();
    	Thread.sleep(5000);
    	
    	WebElement attendance = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(7) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
    	attendance.isDisplayed(); 
    	WebElement attendanceinfo = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(7) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
        attendanceinfo.isDisplayed(); 
        WebElement rgprm = shadowRoot.findElement(By.cssSelector("nav:nth-child(1) > ul:nth-child(1) > span:nth-child(7) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)"));
        rgprm.isDisplayed();
        
    }

    @And("User closed the browser for navigation Attendance menu")
    public void User_closed() {
    	
        driver.close();
    }

    
}
