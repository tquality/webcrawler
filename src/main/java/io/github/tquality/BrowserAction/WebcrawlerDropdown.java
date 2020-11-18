package io.github.tquality.BrowserAction;

import io.github.tquality.Waiting.WaitForIt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Optional;

/**
 * Abstract class to use dropdown boxes
 */
public class WebcrawlerDropdown {

    private static void selectValue(WebElement webElement, String value){
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param element the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementBy(WebDriver webDriver, By element,String value){
        WaitForIt.waitForElementPresentByElement(webDriver,element);
        WebElement webElement = webDriver.findElement(element);
        selectValue(webElement,value);
    }

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param name the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementName(WebDriver webDriver, String name,String value){
        WaitForIt.waitForElementPresentName(webDriver,name);
        WebElement webElement = webDriver.findElement(By.name(name));
        selectValue(webElement,value);
    }

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param id the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementId(WebDriver webDriver, String id,String value){
        WaitForIt.waitForElementPresentId(webDriver,id);
        WebElement webElement = webDriver.findElement(By.id(id));
        selectValue(webElement,value);
    }

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param xpath the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementXpath(WebDriver webDriver, String xpath,String value){
        WaitForIt.waitForElementPresentXpath(webDriver,xpath);
        WebElement webElement = webDriver.findElement(By.xpath(xpath));
        selectValue(webElement,value);
    }

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param cssSelector the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementCssSelector(WebDriver webDriver, String cssSelector,String value){
        WaitForIt.waitForElementPresentCssSelector(webDriver,cssSelector);
        WebElement webElement = webDriver.findElement(By.cssSelector(cssSelector));
        selectValue(webElement,value);
    }
}
