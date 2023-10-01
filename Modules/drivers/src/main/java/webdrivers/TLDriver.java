package webdrivers;

import org.openqa.selenium.WebDriver;

public class TLDriver {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private TLDriver(){}

    public static WebDriver getDriver(String browser){
        if(driver.get() == null){
            setDriver(browser);
        }
        return driver.get();
    }

    public static void setDriver(String browser){
        driver.set(initDriver(browser));
    }

    public static void remove(){
        driver.get().close();
        driver.remove();
    }

    public static WebDriver initDriver(String browser) {
        return WebFactory.get(browser).createDriver();
    }
}
