package stepdefs;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegistrationSteps {

    WebDriver driver;

    @Given("user is on Facebook registration page")
    public void user_is_on_facebook_registration_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
    }

    @When("user enters first name {string}")
    public void user_enters_first_name(String firstName) {
        driver.findElement(By.name("firstname")).sendKeys(firstName);
    }

    @When("user enters surname {string}")
    public void user_enters_surname(String surname) {
        driver.findElement(By.name("lastname")).sendKeys(surname);
    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        driver.findElement(By.name("reg_email__")).sendKeys(email);
    }

    @When("user re-enters email {string}")
    public void user_reenters_email(String email) {
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        driver.findElement(By.name("reg_passwd__")).sendKeys(password);
    }

    @When("user selects birth date {string}, {string}, {string}")
    public void user_selects_birth_date(String day, String month, String year) {
        driver.findElement(By.id("day")).sendKeys(day);
        driver.findElement(By.id("month")).sendKeys(month);
        driver.findElement(By.id("year")).sendKeys(year);
    }

    @When("user selects gender {string}")
    public void user_selects_gender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            driver.findElement(By.xpath("//input[@value='2']")).click(); // Male
        } else if (gender.equalsIgnoreCase("Female")) {
            driver.findElement(By.xpath("//input[@value='1']")).click(); // Female
        } else {
            driver.findElement(By.xpath("//input[@value='-1']")).click(); // Custom
        }
    }

    @Then("user clicks on Sign Up button")
    public void user_clicks_on_sign_up_button() {
        driver.findElement(By.name("websubmit")).click();
        driver.quit();
    }
}
