package AutomationPractice.StepDefinitions;

import AutomationPractice.Pages.BasePage;
import AutomationPractice.Utils.BrowserFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks extends BasePage {
    @Before
    public void setUP(){
        BrowserFactory.getDriver();
    }
    @After
    public void cleanUp(){
        BrowserFactory.stopBrowser();
    }
}
