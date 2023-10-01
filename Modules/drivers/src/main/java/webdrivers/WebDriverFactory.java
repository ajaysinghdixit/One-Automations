package webdrivers;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class WebDriverFactory<T extends MutableCapabilities> {

    public abstract T setOptions();

    public abstract WebDriver createDriver(T options);

    public void setDefaultOptions(T options) {
        //set default capabilities
    }

    public  void addCapabilities(T capabilities){
        this.setOptions().merge(capabilities);
    }

    public WebDriver createDriver() {
        return this.createDriver(this.setOptions());
    }

    public  WebDriver createDriverWithCapabilities(MutableCapabilities capabilities) {
        T op = setOptions();
        op.merge(capabilities);
        return createDriver(op);
    }

}
