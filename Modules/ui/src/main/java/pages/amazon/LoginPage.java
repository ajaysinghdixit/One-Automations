package pages.amazon;

import locators.amazon.Login;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    public Login login;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.login = new Login(this.driver);
    }

    public void search(String keys) {
        this.login.search.clearAndSendKeys(keys);
    }


}
