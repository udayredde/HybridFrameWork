package AutomationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(css= "#home-page-tabs")
    WebElement homePageTabs;
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public  boolean isUserOnHomePage(){
        return homePageTabs.isDisplayed();
    }
}
