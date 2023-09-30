package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public RemoteWebDriver driver;

    public WebDriver createDriver(String browser) {
        switch (browser) {
            case "chrome" -> {
                driver = (RemoteWebDriver) new ChromeDriverFactory().setDriver();
            }
            case "edge" -> {
                driver = (RemoteWebDriver) new EdgeDriverFactory().setDriver();
            }
            case "firefox" -> {
                driver = (RemoteWebDriver) new FireFoxDriverFactory().setDriver();
            }
        }
        return this.driver;
    }

    public void setDefaultOptions(){
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

}
