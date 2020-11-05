package io.github.tquality.BrowserAction;

import io.github.tquality.Waiting.WaitForIt;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Optional;

/**
 * Get data from specific element
 */
public abstract class WebcrawlerGetData {

    /**
     * Cut new line characters from a string
     * @param textToStrip the text we need to strip
     * @return Stripped text
     */
    private static String stripNewLine(String textToStrip){
        if(textToStrip.contains("\n")){
            textToStrip = textToStrip.split("\n")[0];
        }
        return textToStrip;
    }

    /**
     * Get the text from a present webelement
     * @param webElements the optional with the webelement
     * @return String that contains the text
     */
    private static String getTextFromElement(Optional<WebElement> webElements){
        WebElement webElement = webElements.get();
        return webElement.getText();
    }

    private static String getTextFromElement(WebElement webElement){
        return webElement.getText();
    }

    /**
     * Get the text from an Xpath element without cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param xpathOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextXpathElementWithoutCuttingNewline(WebDriver webDriver, String xpathOfElement){
        WaitForIt.waitForElementPresentXpath(webDriver,xpathOfElement);
        WebElement webElement = webDriver.findElement(By.xpath(xpathOfElement));
        return getTextFromElement(webElement);
    }

    /**
     * Get the text from an Xpath element with cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param xpathOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextXpathElementWithCuttingNewline(WebDriver webDriver, String xpathOfElement){
        WaitForIt.waitForElementPresentXpath(webDriver,xpathOfElement);
        WebElement webElement = webDriver.findElement(By.xpath(xpathOfElement));
        return getTextFromElement(webElement);
    }

    /**
     * Get the text from an Name element without cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param nameOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextNameElementWithoutCuttingNewline(WebDriver webDriver, String nameOfElement){
        WaitForIt.waitForElementPresentName(webDriver,nameOfElement);
        WebElement webElement = webDriver.findElement(By.name(nameOfElement));
        return getTextFromElement(webElement);
    }

    /**
     * Get the text from an Name element with cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param nameOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextNameElementWithCuttingNewline(WebDriver webDriver, String nameOfElement){
        WaitForIt.waitForElementPresentName(webDriver,nameOfElement);
        WebElement webElement = webDriver.findElement(By.name(nameOfElement));
        return getTextFromElement(webElement);
    }

    /**
     * Get the text from an ID element without cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param idOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextIDElementWithoutCuttingNewline(WebDriver webDriver, String idOfElement){
        WaitForIt.waitForElementPresentId(webDriver,idOfElement);
        WebElement webElement = webDriver.findElement(By.id(idOfElement));
        return getTextFromElement(webElement);
    }

    /**
     * Get the text from an ID element with cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param idOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextIDElementWithCuttingNewline(WebDriver webDriver, String idOfElement){
        WaitForIt.waitForElementPresentId(webDriver,idOfElement);
        WebElement webElement = webDriver.findElement(By.id(idOfElement));
        return getTextFromElement(webElement);
    }

    /**
     * Get all the elements from a dropdown
     * @param webElementOptional the element we want the options of
     * @return List of webelements with all the options
     */
    private static List<WebElement> getAllSelectElements(Optional<WebElement> webElementOptional){
        WebElement webElement = webElementOptional.get();
        Select select = new Select(webElement);
        return select.getOptions();
    }

    /**
     * Get All the options from a dropdown element
     * @param webDriver the webdriver with the browser
     * @param xpathOfElement the element we want the options of
     * @return List of webelements with the options
     */
    public static List<WebElement> getTextElementsFromDropDownXpath(WebDriver webDriver, String xpathOfElement){
        WaitForIt.waitForElementPresentXpath(webDriver,xpathOfElement);
        WebElement webElement = webDriver.findElement(By.xpath(xpathOfElement));
        Select select = new Select(webElement);
        return select.getOptions();
    }

    /**
     * Get All the options from a dropdown element
     * @param webDriver the webdriver with the browser
     * @param nameOfElement the element we want the options of
     * @return List of webelements with the options
     */
    public static List<WebElement> getTextElementsFromDropDownName(WebDriver webDriver, String nameOfElement){
        WaitForIt.waitForElementPresentName(webDriver,nameOfElement);
        WebElement webElement = webDriver.findElement(By.name(nameOfElement));
        Select select = new Select(webElement);
        return select.getOptions();
    }

    /**
     * Get All the options from a dropdown element
     * @param webDriver the webdriver with the browser
     * @param idOfElement the element we want the options of
     * @return List of webelements with the options
     */
    public static List<WebElement> getTextElementsFromDropDownID(WebDriver webDriver, String idOfElement){
        WaitForIt.waitForElementPresentId(webDriver,idOfElement);
        WebElement webElement = webDriver.findElement(By.id(idOfElement));
        Select select = new Select(webElement);
        return select.getOptions();
    }
}
