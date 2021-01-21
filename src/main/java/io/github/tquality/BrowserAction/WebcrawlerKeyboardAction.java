package io.github.tquality.BrowserAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Press enter on an element
 */
public abstract class WebcrawlerKeyboardAction {

    /**
     * Press the effective enter button
     * @param webElement the element
     */
    private static void pressEnter(WebElement webElement){
        webElement.sendKeys(Keys.ENTER);
    }

    /**
     * Press on an element with given xpath
     * @param webDriver the running webdriver
     * @param xpath the element
     */
    public static void enterElementXpath(WebDriver webDriver,String xpath){
        WebElement element = webDriver.findElement(By.xpath(xpath));
        pressEnter(element);
    }

    /**
     * Press on an element with given id
     * @param webDriver the running webdriver
     * @param id the element
     */
    public static void enterElementId(WebDriver webDriver,String id){
        WebElement element = webDriver.findElement(By.id(id));
        pressEnter(element);
    }

    /**
     * Press on an element with given name
     * @param webDriver the running webdriver
     * @param name the element
     */
    public static void enterElementName(WebDriver webDriver,String name){
        WebElement element = webDriver.findElement(By.name(name));
        pressEnter(element);
    }

    /**
     * Press on an element with given By element
     * @param webDriver the running webdriver
     * @param enterElement the element
     */
    public static void enterElementBy(WebDriver webDriver,By enterElement){
        WebElement element = webDriver.findElement(enterElement);
        pressEnter(element);
    }
}
