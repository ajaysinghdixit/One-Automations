package webdrivers;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class ChromeDriverFactory extends WebDriverFactory<ChromeOptions>{
    WebDriver driver;

    @Override
    public WebDriver createDriver(ChromeOptions options){
        this.driver = new ChromeDriver(options);
        return driver;
    }

    @Override
    public ChromeOptions setOptions(){
        ChromeOptions options = new ChromeOptions();
        setDefaultOptions(options);
        options.setPageLoadTimeout(Duration.ofSeconds(20));
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches", List.of("disable-popup-blocking"));
        return options;
    }

    public  WebDriver createDriverWithCapabilities(MutableCapabilities capabilities) {
        ChromeOptions op = new ChromeOptions();
        op.merge(capabilities);
        return new ChromeDriver(op);
    }

}
