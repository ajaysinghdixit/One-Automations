package lib;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
@Setter
public class Element {
    public WebElement element;
    public WebDriver driver;
    public By by;

    public Element(WebElement element) {
        this.element = element;
    }

    public Element(WebDriver driver, By by){
        this.driver = driver;
        this.by = by;
    }

    public void getElement(){
        this.element = driver.findElement(this.by);
    }

    public Element click() {
        this.getElement();
        this.element.click();
        return this;
    }

    public Element clearAndSendKeys(String text) {
        this.getElement();
        this.element.clear();
        this.element.sendKeys(text);
        return this;
    }

    public boolean isDisplayed() {
        this.getElement();
        return this.element.isDisplayed();
    }

}
