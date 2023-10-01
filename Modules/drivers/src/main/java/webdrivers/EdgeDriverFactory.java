package webdrivers;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class EdgeDriverFactory extends WebDriverFactory<EdgeOptions>{
    WebDriver driver;

    @Override
    public WebDriver createDriver(EdgeOptions options){
        this.driver = new EdgeDriver(options);
        return driver;
    }

    @Override
    public EdgeOptions setOptions(){
        EdgeOptions options = new EdgeOptions();
        setDefaultOptions(options);
        options.setPageLoadTimeout(Duration.ofSeconds(20));
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches", List.of("disable-popup-blocking"));
        return options;
    }
}
