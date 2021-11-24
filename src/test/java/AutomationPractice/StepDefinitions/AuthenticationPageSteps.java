package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.AuthenticationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AuthenticationPageSteps {
    AuthenticationPage authenticationPage = new AuthenticationPage();
    @Then("^User should be on Authentication page$")
    public void isCreateAccountFormDisplayed(){
        Assert.assertTrue(authenticationPage.isCreateAccountFormDisplayed());
    }
    @When("^User Provides Email id as (.*)$")
    public void userEmail(String email){
        authenticationPage.enterEmail(email);
    }
    @And("^User Submit Create Account$")
    public void submitCreateAccount(){
        authenticationPage.goToCreateFormPage();
    }

}
