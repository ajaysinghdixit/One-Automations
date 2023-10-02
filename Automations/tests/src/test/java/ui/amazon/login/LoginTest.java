package ui.amazon.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.amazon.LoginPage;
import ui.amazon.AmazonBaseTest;

public class LoginTest extends AmazonBaseTest {


    @BeforeClass
    public void login() {
        LoginPage login = new LoginPage(driver);
        driver.get("https://www.amazon.in");
        login.search("Iphone 15");

        //this below code will create a drive with custom capabilities
//        MutableCapabilities capabilities = new MutableCapabilities();
//        capabilities.setCapability("browserName", "Chrome");
//        HashMap<String, Object> browserstackOptions = new HashMap<>();
//        browserstackOptions.put("os", "Linux");
//        browserstackOptions.put("osVersion", "10");
//        browserstackOptions.put("browserVersion", "114.0");
//        browserstackOptions.put("local", "false");
//        browserstackOptions.put("seleniumVersion", "4.12.1");
//        capabilities.setCapability("bstack:options", browserstackOptions);
//
//        WebDriver d = new ChromeDriverFactory().createDriverWithCapabilities(capabilities);
//        d.get("https://www.flipkart.com");

    }

    @Test
    public void testOne() throws InterruptedException {
        Thread.sleep(10000);
    }
    
}
