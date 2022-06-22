package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {

    public WebDriver driver;
    public final String text = "123@gmx.de";

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver(); //Launch chrome driver
    }

    @When("I open orange HRM homepage")
    public void i_open_orange_HRM_homepage() {
        driver.get("https://www.orangehrm.com/");
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() throws InterruptedException {
        Thread.sleep(1000);
        boolean status = driver.findElement(By.xpath("/html/body/nav/div/div[1]/a/img")).isDisplayed();
        Assert.assertEquals(true,status);
    }

    @Then("enter the email id on the text box")
    public void enter_the_email_id_on_the_text_box() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement emailText = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/form/input"));
        Thread.sleep(1000);
        emailText.sendKeys(text);

        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div/form/a/input"));
        submitBtn.click();
    }

    @And("close browser")
    public void close_browser() {
        driver.quit();
    }
}
