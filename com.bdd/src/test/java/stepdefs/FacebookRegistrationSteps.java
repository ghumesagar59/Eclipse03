package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegistrationSteps {

    WebDriver driver;

    @Given("user is on Facebook registration page")
    public void user_is_on_facebook_registration_page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
        Thread.sleep(1000);
    }

    @When("user enters first name {string}")
    public void user_enters_first_name(String firstName) throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys(firstName);
        Thread.sleep(1000);

    }

    @When("user enters surname {string}")
    public void user_enters_surname(String surname) throws InterruptedException {
        driver.findElement(By.name("lastname")).sendKeys(surname);
        Thread.sleep(1000);
    }
    
    @When("user selects birth date {string}, {string}, {string}")
    public void user_selects_birth_date(String day, String month, String year) throws InterruptedException {
        new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("day"))).selectByVisibleText(day);
        Thread.sleep(500);
        new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("month"))).selectByVisibleText(month);
        Thread.sleep(500);
        new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("year"))).selectByVisibleText(year);
        Thread.sleep(1000);
    }

    @When("user selects gender {string}")
    public void user_selects_gender(String gender) throws InterruptedException {
        if (gender.equalsIgnoreCase("Male")) {
            driver.findElement(By.xpath("//input[@value='2']")).click(); 
        } else if (gender.equalsIgnoreCase("Female")) {
            driver.findElement(By.xpath("//input[@value='1']")).click(); 
        } else {
            driver.findElement(By.xpath("//input[@value='-1']")).click(); 
        }
        Thread.sleep(1000);
    }

    @When("user enters email {string}")
    public void user_enters_email(String email) throws InterruptedException {
        driver.findElement(By.name("reg_email__")).sendKeys(email);
        Thread.sleep(1000);
    }

  
    @When("user enters password {string}")
    public void user_enters_password(String password) throws InterruptedException {
        driver.findElement(By.name("reg_passwd__")).sendKeys(password);
        Thread.sleep(1000);
    }

    @Then("user clicks on Sign Up button")
    public void user_clicks_on_sign_up_button() {
        driver.findElement(By.name("websubmit")).click();
        driver.close();
    }
}
