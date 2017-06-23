package org.al.routine2auto.framework.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Input extends Element {
    private By by;
    private WebElement input;

    public Input(By by) {
        super(by);
        input = getWrappedWebElement(by);
    }

    public void clear() {
        input.clear();
    }

    public void type(String text) {
        input.sendKeys(text);
    }

    public void submit() {
        input.submit();
    }
}
