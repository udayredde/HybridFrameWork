package AutomationPractice.Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;


public class BrowserFactory {
    public static WebDriver driver;

    public static void startBrowser() {

        if(AutomationConstants.REMOTE_BROWSER==true){
            ChromeOptions browserOptions = new ChromeOptions();
            browserOptions.setPlatformName("macOS 12.00");
            browserOptions.setBrowserVersion("latest");
            Map<String, Object> sauceOptions = new HashMap<>();
            browserOptions.setCapability("sauce:options", sauceOptions);
            try {
                driver = new RemoteWebDriver(new URL(AutomationConstants.SELENIUM_GRID_URL),browserOptions);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        else if(AutomationConstants.BROWSER_TYPE == "chrome")  {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(AutomationConstants.BROWSER_TYPE == "fireFox")  {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get(AutomationConstants.baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public static void stopBrowser() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            startBrowser();
        }
        return driver;
    }
}
