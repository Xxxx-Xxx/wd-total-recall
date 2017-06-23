package org.al.routine2auto.product.time;

import org.al.routine2auto.framework.element.Input;
import org.openqa.selenium.By;

public class TimePage {

    private static final By SAVE_BUTTON_LOCATOR =
        By.xpath("//button[@data-name='SAVE'][ancestor::*[contains(@class,'controller-panel')]]");

    private static final String TARGET_DAY_TOPCELL_LOCATOR_PATTERN =
        "";

    private static final By TODAY_TOPCELL_LOCATOR = By.xpath("//div[contains(@class, 'journal-day cell today')]");

    private static final By MONTH_BUTTON_LOCATOR = By.xpath("//a[contains(@class,'switch-item')][text()='month']");

    private static final By TODAY_CELL_LOCATOR = By.xpath("//div[contains(@class,'cell today')]//input");

    private static final Input TODAY_CELL = new Input(TODAY_CELL_LOCATOR);

    private static final By RECENT_DAY_CELL_LOCATOR = By.xpath("");

    private static final Input RECENT_DAY_CELL = new Input(RECENT_DAY_CELL_LOCATOR);



}
