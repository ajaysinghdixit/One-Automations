package webdrivers;

import org.openqa.selenium.WebDriver;

public class Driver {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return driver.get();
    }

    public static void setDriver(WebDriver dr){
        driver.set(dr);
    }

    public static void remove(){
        driver.get().close();
        driver.remove();
    }
}
