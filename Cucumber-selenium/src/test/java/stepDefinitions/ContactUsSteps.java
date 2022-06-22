package stepDefinitions;

import com.factory.SingletonDriver;
import com.pages.ContactUsPage;
import com.util.ExcelReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class ContactUsSteps {

    private WebDriver driver = SingletonDriver.driverInit();
    private ContactUsPage contactUsPage = new ContactUsPage(SingletonDriver.driverInit());

    @Given("user navigates to contact us page")
    public void user_navigates_to_contact_us_page() {
        driver.get("http://automationpractice.com/index.php?controller=contact");
    }

    @When("user fills the form from given sheetname {string} and rownumber {int}")
    public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException {

        ExcelReader reader = new ExcelReader();
        System.out.println("sheetName: "+sheetName);
        System.out.println("rowNumber: "+rowNumber);

        List<Map<String,String>> testData =
                reader.getData("File//Book.xlsx",
                        sheetName);

        String heading = testData.get(rowNumber).get("subjectheading");
        System.out.println("heading: "+heading);
        String email = testData.get(rowNumber).get("email");
        System.out.println("email: "+email);
        String orderRef = testData.get(rowNumber).get("orderref");
        System.out.println("order ref: "+orderRef);
        String message = testData.get(rowNumber).get("message");
        System.out.println("message: "+message);

        contactUsPage.fillContactUsForm(heading, email, orderRef, message);
    }

    @And("user clicks on send button")
    public void user_clicks_on_send_button() {
        contactUsPage.clickSend();
    }

    @And("it shows a successful message {string}")
    public void it_shows_a_successful_message(String expSuccessMessage) {
        String actualSuccMessg = contactUsPage.getSuccessMessg();
        Assert.assertEquals(actualSuccMessg, expSuccessMessage);
    }

    @Then("the browser is closed")
    public void the_browser_is_closed() {
        SingletonDriver.quit();
    }

}
