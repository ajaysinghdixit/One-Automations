package webdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeDriverFactory{
    WebDriver driver;

    public WebDriver setDriver(){
        this.driver = new ChromeDriver();
        return driver;
    }

    public WebDriver setDriver(ChromeOptions options){
        this.driver = new ChromeDriver(options);
        return driver;
    }

}
