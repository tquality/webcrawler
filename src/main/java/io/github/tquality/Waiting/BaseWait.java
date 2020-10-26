package io.github.tquality.Waiting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import waiter.Waiter;

import java.util.concurrent.TimeUnit;

/**
 * Base waiting class
 */
class BaseWait {
    private int useableWaitAmount = 3;
    private static int hardcodedWaitAmount = 3;
    private static int maxCounter = 5;
    private static Waiter waiter = new Waiter();

    /**
     * Setup the wait element
     * @param browser the running browser
     * @return wait element
     */
    protected static WebDriverWait setupWait(WebDriver browser){
        return new WebDriverWait(browser,hardcodedWaitAmount);
    }

    /**
     * Timeout the browser
     * @param browser the running browser
     */
    protected static void timeout(WebDriver browser){
        browser.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    /**
     * Let the browsser wait until the web page is ready
     * @param browser the running browser
     */
    public static void waitForPageToLoad(WebDriver browser){
        waiter.waitForPageLoadComplete(browser);
    }

    /**
     * Get the max counter you want to check for an element
     * @return the max counter
     */
    public static int getMaxCounter() {
        return maxCounter;
    }

    public int getUseableWaitAmount() {
        return useableWaitAmount;
    }

    public void setWaitTime(int waitAmount) {
        this.useableWaitAmount = waitAmount;
    }

    public void setMaxCounter(int maxCounter) {
        this.maxCounter = maxCounter;
    }

    protected static int getHardcodedWaitAmount() {
        return hardcodedWaitAmount;
    }
}
