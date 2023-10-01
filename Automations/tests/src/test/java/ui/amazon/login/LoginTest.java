package ui.amazon.login;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.amazon.AmazonBaseTest;
import webdrivers.ChromeDriverFactory;
import webdrivers.TLDriver;
import webdrivers.WebDriverFactory;

import java.util.HashMap;

public class LoginTest extends AmazonBaseTest {

    @BeforeClass
    public void login(){
        driver.get("https://www.amazon.com");

//        MutableCapabilities capabilities = new MutableCapabilities();
//        capabilities.setCapability("browserName", "Chrome");
//        HashMap<String, Object> browserstackOptions = new HashMap<>();
//        browserstackOptions.put("os", "Linux");
//        browserstackOptions.put("osVersion", "10");
//        browserstackOptions.put("browserVersion", "114.0");
//        browserstackOptions.put("local", "false");
//        browserstackOptions.put("seleniumVersion", "4.12.1");
//        capabilities.setCapability("bstack:options", browserstackOptions);

        //WebDriver d = new ChromeDriverFactory().createDriverWithCapabilities(capabilities);
        //d.get("https://www.flipkart.com");

    }

    @Test
    public void testOne() throws InterruptedException {
        //Thread.sleep(10000);
    }

}
