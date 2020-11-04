package io.github.tquality.BrowserAction;

import io.github.tquality.Waiting.WaitForIt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * Get webelements with certain parameter
 */
public abstract class WebcrawlerGetElements {

    /**
     * Return all the elments with the xpath
     * @param webdriver the running webdriver
     * @param xpathElement the element
     * @return List of webelements
     */
    public static List<WebElement> getWebElementsXpath(WebDriver webdriver, String xpathElement) {
        WaitForIt.waitForElementPresentXpath(webdriver,xpathElement);
        return webdriver.findElements(By.xpath(xpathElement));
    }

    /**
     * Return all the elments with the xpath
     * @param webdriver the running webdriver
     * @param nameElement the element
     * @return List of webelements
     */
    public static List<WebElement> getWebElementsName(WebDriver webdriver, String nameElement) {
        WaitForIt.waitForElementPresentName(webdriver,nameElement);
        return webdriver.findElements(By.xpath(nameElement));
    }

    /**
     * Return all the elments with the xpath
     * @param webdriver the running webdriver
     * @param idElement the element
     * @return List of webelements
     */
    public static List<WebElement> getWebElementsId(WebDriver webdriver, String idElement) {
        WaitForIt.waitForElementPresentId(webdriver,idElement);
        return webdriver.findElements(By.id(idElement));
    }
}
