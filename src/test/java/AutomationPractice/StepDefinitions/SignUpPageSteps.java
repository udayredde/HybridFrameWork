package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.SignUpPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SignUpPageSteps {
    SignUpPage signUpPage = new SignUpPage();
    @Then("^User should be on Account Creation Page$")
    public void userOnAccountCreationPage(){
        Assert.assertTrue(signUpPage.isSignUpFormDisplayed());
    }
}
