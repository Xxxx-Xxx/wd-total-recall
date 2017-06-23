package org.al.routine2auto.framework.element;

import org.al.routine2auto.framework.browser.Browser;
import org.openqa.selenium.By;

public class Button extends Element {

    private Browser browser;
    private By by;

    public Button(By by) {
        super(by);
    }

    public void click() {
        browser.waitForElementIsClickable(by);
        getWrappedWebElement(by).click();
    }

}
