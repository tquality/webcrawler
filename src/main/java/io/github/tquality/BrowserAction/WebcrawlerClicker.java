package io.github.tquality.BrowserAction;

import io.github.tquality.Waiting.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.UnsupportedEncodingException;
import java.util.Optional;

/**
 * Class to click on different objects
 */
public abstract class WebcrawlerClicker {

    /**
     * Do the effective click on the webelement
     * @param elementOptional the element we will click on
     * @param webDriver the webdriver containing the browser
     */
    private static void clickOnWebElement(Optional elementOptional, WebDriver webDriver){
        WebElement element = (WebElement) elementOptional.get();
        element.click();
        WaitForIt.waitForPageToLoad(webDriver);
    }

    /**
     * Click on the element with name
     * @param webDriver the webdriver containing the browser
     * @param elementName the name of the element
     */
    public static void onElementWithName(WebDriver webDriver, String elementName){
        Optional<WebElement> webElement = WaitForIt.waitForElementNameClickable(webDriver,elementName);
        clickOnWebElement(webElement,webDriver);
        WaitForIt.waitForPageToLoad(webDriver);
    }

    /**
     * Click on the element with xpath
     * @param webDriver the webdriver containing the browser
     * @param elementXpath the xpath of the element
     */
    public static void onElementWithXpath(WebDriver webDriver, String elementXpath){
        Optional<WebElement> webElement = WaitForIt.waitForElementXpathClickable(webDriver,elementXpath);
        clickOnWebElement(webElement,webDriver);
        WaitForIt.waitForPageToLoad(webDriver);
    }

    /**
     * Click on the element with linked text
     * @param webDriver the webdriver containing the browser
     * @param linkedText the text of the link of the element
     */
    public static void onLinkedText(WebDriver webDriver, String linkedText){
        Optional<WebElement> webElement = WaitForIt.waitForElementLinkedTextClickable(webDriver,linkedText);
        clickOnWebElement(webElement,webDriver);
        WaitForIt.waitForPageToLoad(webDriver);
    }

    /**
     * Click on the element with text
     * @param webDriver the webdriver containing the browser
     * @param textInElement the text inside the element
     */
    public static void lastElementWithExactText(WebDriver webDriver, String textInElement){
        try {
            textInElement = new String(textInElement.getBytes(), "UTF8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String createdXpath = "(//*[contains(text(),'"+ textInElement + "')])[last()]";
        onElementWithXpath(webDriver,createdXpath);
        WaitForIt.waitForPageToLoad(webDriver);
    }

    /**
     * Click on the element with text
     * @param webDriver the webdriver containing the browser
     * @param textInElement the text inside the element
     */
    public static void firstElementWithExactText(WebDriver webDriver, String textInElement){
        String createdXpath = "//*[contains(text(),'"+ textInElement + "')]";
        onElementWithXpath(webDriver,createdXpath);
        WaitForIt.waitForPageToLoad(webDriver);
    }

    /**
     * Click on the element with By selector
     * @param webDriver the running browser
     * @param elementToClick the element we want to click on
     */
    public static void clickOnByElement(WebDriver webDriver, By elementToClick){
        Optional<WebElement> webElement = WaitForIt.waitForElementByClickable(webDriver,elementToClick);
        clickOnWebElement(webElement,webDriver);
        WaitForIt.waitForPageToLoad(webDriver);
    }
}
