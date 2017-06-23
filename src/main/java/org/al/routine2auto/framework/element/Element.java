package org.al.routine2auto.framework.element;


import org.al.routine2auto.framework.browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Element {

    private By by;
    private Browser browser;

    public Element(By by) {
        browser = Browser.getBrowser();
        this.by = by;
    }

    public By getBy() {
        return by;
    }

    public String getText() {
        return getWrappedWebElement(by).getText();
    }

    public WebElement getWrappedWebElement(By by) {
        return browser.findElement(by);
    }

    public boolean isPresent() {
        return browser.isElementPresent(by);
    }

    public boolean isVisible() {
        return browser.isElementVisible(by);
    }

    public void waitForAppear() {
        browser.waitForElementIsVisible(by);
    }

}
