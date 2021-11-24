package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.HomePage;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class HomepageSteps {
    HomePage homePage = new HomePage();
    @Given("^Is User on the Home page$")
    public void isUserOnHomePage(){
        Assert.assertTrue(homePage.isUserOnHomePage());
    }
}
