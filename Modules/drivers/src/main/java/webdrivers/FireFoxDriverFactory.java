package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FireFoxDriverFactory extends WebDriverFactory<FirefoxOptions>{
    WebDriver driver;

    @Override
    public WebDriver createDriver(FirefoxOptions options){
        this.driver = new FirefoxDriver(options);
        return driver;
    }

    @Override
    public FirefoxOptions setOptions(){
        FirefoxOptions options = new FirefoxOptions();
        setDefaultOptions(options);
        options.setPageLoadTimeout(Duration.ofSeconds(20));
        options.addArguments("start-maximized");
        //options.setExperimentalOption("excludeSwitches", List.of("disable-popup-blocking"));
        return options;
    }
}
