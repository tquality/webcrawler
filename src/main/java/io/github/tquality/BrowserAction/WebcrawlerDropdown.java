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

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param element the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementBy(WebDriver webDriver, By element,String value){
        Optional<WebElement> webElements = WaitForIt.waitForElementBy(webDriver,element);
        WebElement webElement = webElements.get();
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param name the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementName(WebDriver webDriver, String name,String value){
        Optional<WebElement> webElements = WaitForIt.waitForElementName(webDriver,name);
        WebElement webElement = webElements.get();
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param id the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementId(WebDriver webDriver, String id,String value){
        Optional<WebElement> webElements = WaitForIt.waitForElementID(webDriver,id);
        WebElement webElement = webElements.get();
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    /**
     * Select a value from a dropdown element
     * @param webDriver the running webdriver
     * @param xpath the dropdown element
     * @param value the value we want to select
     */
    public static void selectValueInElementXpath(WebDriver webDriver, String xpath,String value){
        Optional<WebElement> webElements = WaitForIt.waitForElementXpath(webDriver,xpath);
        WebElement webElement = webElements.get();
        Select select = new Select(webElement);
        select.selectByValue(value);
    }
}
