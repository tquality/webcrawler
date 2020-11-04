package io.github.tquality.BrowserAction;

import io.github.tquality.Waiting.WaitForIt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Optional;

/**
 * Abstract class to send text to the webpage
 */
public abstract class WebcrawlerInputText {

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param element the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithBy(WebDriver webDriver, By element, String text){
       Optional<WebElement> webElements = WaitForIt.waitForElementByClickable(webDriver,element);
       WebElement webElement = webElements.get();
       webElement.sendKeys(text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param nameElement the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithName(WebDriver webDriver, String nameElement, String text){
        Optional<WebElement> webElements = WaitForIt.waitForElementNameClickable(webDriver,nameElement);
        WebElement webElement = webElements.get();
        webElement.sendKeys(text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param id the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithId(WebDriver webDriver, String id, String text){
        Optional<WebElement> webElements = WaitForIt.waitForElementIDClickable(webDriver,id);
        WebElement webElement = webElements.get();
        webElement.sendKeys(text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param xpath the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithXpath(WebDriver webDriver, String xpath, String text){
        Optional<WebElement> webElements = WaitForIt.waitForElementXpathClickable(webDriver,xpath);
        WebElement webElement = webElements.get();
        webElement.sendKeys(text);
    }
}
