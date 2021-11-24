package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.CommonPage;
import io.cucumber.java.en.When;

public class CommonPageSteps {
    CommonPage commonPage = new CommonPage();
    @When("^User select signIn$")
    public void goToAuthenticationPage(){
        commonPage.goToAuthenticationPage();
    }
}
