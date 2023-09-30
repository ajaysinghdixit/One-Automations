package ui.amazon.login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ui.amazon.AmazonBaseTest;

public class LoginTest extends AmazonBaseTest {

    @BeforeClass
    public void login(){
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testOne() throws InterruptedException {
        Thread.sleep(10000);
    }

}
