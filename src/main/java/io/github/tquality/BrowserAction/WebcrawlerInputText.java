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
       WaitForIt.waitForElementPresentByElement(webDriver,element);
       WebElement webElement = webDriver.findElement(element);
       webElement.sendKeys(text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param nameElement the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithName(WebDriver webDriver, String nameElement, String text){
        WaitForIt.waitForElementPresentName(webDriver,nameElement);
        WebElement webElement = webDriver.findElement(By.name(nameElement));
        webElement.sendKeys(text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param id the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithId(WebDriver webDriver, String id, String text){
        WaitForIt.waitForElementPresentId(webDriver,id);
        WebElement webElement = webDriver.findElement(By.id(id));
        webElement.sendKeys(text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param xpath the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithXpath(WebDriver webDriver, String xpath, String text){
        WaitForIt.waitForElementPresentXpath(webDriver,xpath);
        WebElement webElement = webDriver.findElement(By.xpath(xpath));
        webElement.sendKeys(text);
    }
}
