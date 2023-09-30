package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class FireFoxDriverFactory {
    WebDriver driver;

    public WebDriver setDriver(){
        this.driver = new FirefoxDriver();
        return driver;
    }

    public WebDriver setDriver(FirefoxOptions options){
        this.driver = new FirefoxDriver(options);
        return driver;
    }

}
