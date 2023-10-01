package ui.amazon;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webdrivers.TLDriver;

public class AmazonBaseTest extends BaseTest {
    public WebDriver driver;
     @BeforeClass
    public void beforeClass(){
         //Driver.setDriver(new WebDriverFactory().createDriver(envProps.getBrowser()));
         String browser = envProps.getBrowser();
         driver = TLDriver.getDriver(envProps.getBrowser());
     }

     @AfterClass
    public void remove(){
         TLDriver.remove();
     }

}
