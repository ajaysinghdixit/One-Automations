package ui.amazon;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import webdrivers.Driver;
import webdrivers.WebDriverFactory;

public class AmazonBaseTest extends BaseTest {
    public WebDriver driver;
     @BeforeClass
    public void beforeClass(){
         Driver.setDriver(new WebDriverFactory().createDriver("edge"));
         driver = Driver.getDriver();
     }

     @AfterClass
    public void remove(){
         Driver.remove();
     }

}
