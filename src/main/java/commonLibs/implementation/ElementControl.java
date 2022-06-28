package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementControl {
    WebDriver driver;

    public ElementControl(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void setText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void clear(WebElement element) {
        element.clear();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean isSelected(WebElement element) {
        return element.isSelected();
    }

    public boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void getTextFromAlert() {
        driver.switchTo().alert().getText();
    }

    public void selectViaVisibleText(WebElement element, String text) {
        Select selectDropDown= new Select(element);
        selectDropDown.selectByVisibleText(text);
    }

}
