package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class EdgeDriverFactory {
    WebDriver driver;

    public WebDriver setDriver(){
        this.driver = new EdgeDriver();
        return driver;
    }

    public WebDriver setDriver(EdgeOptions options){
        this.driver = new EdgeDriver(options);
        return driver;
    }

}
