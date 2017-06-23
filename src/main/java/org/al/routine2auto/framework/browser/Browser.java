package org.al.routine2auto.framework.browser;

import org.al.routine2auto.framework.util.DriverTimeouts;
import org.al.routine2auto.framework.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Browser implements WrapsDriver {

    private static Browser instance;
    private WebDriver driver;

    private static final int EXPLICIT_WAIT_SEC = DriverTimeouts.EXPLICIT_WAIT.getValue();

    private Browser() {
        this.driver = WebDriverFactory.getDriver();
    }

    public static synchronized Browser getBrowser() {
        if (instance == null) {
            instance = new Browser();
        }
        return instance;
    }

    @Override
    public WebDriver getWrappedDriver() {
        return driver;
    }

    public void close() {
        try {
            if (getWrappedDriver() != null) {
                getWrappedDriver().quit();
            }
        } finally {
            instance = null;
        }
    }

    public void open(String url) {
        driver.get(url);
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void waitForElementIsPresent(By by) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_SEC);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void waitForElementIsVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_SEC);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementIsClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT_SEC);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public boolean isElementPresent(By by) {
        return findElements(by).size() > 1;
    }

    public boolean isElementVisible(By by) {
        if (!isElementPresent(by)) {
            return false;
        }
        return findElement(by).isDisplayed();
    }

}
