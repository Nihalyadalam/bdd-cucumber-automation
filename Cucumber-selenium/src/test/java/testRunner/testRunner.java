package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//nihal//IdeaProjects//Cucumber-selenium//Features//ContactUs.feature",
        glue = "stepDefinitions",
        plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber.json" },
        monochrome = true
)
public class testRunner {

}
