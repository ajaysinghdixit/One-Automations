package locators.amazon;

import lib.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    public WebDriver driver;
    public Element search;
    public Login(final WebDriver driver){
        this.driver = driver;
        search = new Element(this.driver, By.id("twotabsearchtextbox"));
    }

    public Element status(String value){
        return new Element(this.driver,By.id(value));
    }

}
