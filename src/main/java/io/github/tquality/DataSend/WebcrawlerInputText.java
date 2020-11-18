package io.github.tquality.DataSend;

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
     * Send the data to the element
     * @param element the element we want to send the text to
     * @param text the text we want to send
     */
    private static void typeInWebElement(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param element the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithBy(WebDriver webDriver, By element, String text){
       WaitForIt.waitForElementPresentByElement(webDriver,element);
       typeInWebElement(webDriver.findElement(element),text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param nameElement the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithName(WebDriver webDriver, String nameElement, String text){
        WaitForIt.waitForElementPresentName(webDriver,nameElement);
        typeInWebElement(webDriver.findElement(By.name(nameElement)),text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param idElement the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithId(WebDriver webDriver, String idElement, String text){
        WaitForIt.waitForElementPresentId(webDriver,idElement);
        typeInWebElement(webDriver.findElement(By.id(idElement)),text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param xpathElement the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithXpath(WebDriver webDriver, String xpathElement, String text){
        WaitForIt.waitForElementPresentXpath(webDriver,xpathElement);
        typeInWebElement(webDriver.findElement(By.xpath(xpathElement)),text);
    }

    /**
     * Type text in an element
     * @param webDriver the running webdriver
     * @param cssSelector the element we want to type into
     * @param text the text we want to type
     */
    public static void typeInElementWithCssSelector(WebDriver webDriver, String cssSelector, String text){
        WaitForIt.waitForElementPresentCssSelector(webDriver,cssSelector);
        typeInWebElement(webDriver.findElement(By.cssSelector(cssSelector)),text);
    }
}
