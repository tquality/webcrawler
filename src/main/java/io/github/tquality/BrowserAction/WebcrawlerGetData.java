package io.github.tquality.BrowserAction;

import io.github.tquality.Waiting.WaitForIt;
import io.github.tquality.Waiting.WaitForIt;
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

    /**
     * Get the text from an Xpath element without cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param xpathOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextXpathElementWithoutCuttingNewline(WebDriver webDriver, String xpathOfElement){
        Optional<WebElement> presentElement = WaitForIt.waitForElementXpath(webDriver,xpathOfElement);
        if(presentElement.isPresent()) {
            return getTextFromElement(presentElement);
        }else {
            throw new NoSuchElementException("Could not find element:" + xpathOfElement);
        }
    }

    /**
     * Get the text from an Xpath element with cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param xpathOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextXpathElementWithCuttingNewline(WebDriver webDriver, String xpathOfElement){
        Optional<WebElement> presentElement = WaitForIt.waitForElementXpath(webDriver,xpathOfElement);
        if(presentElement.isPresent()) {
            String textFromElement = getTextFromElement(presentElement);
            return stripNewLine(textFromElement);
        }else {
            throw new NoSuchElementException("Could not find element:" + xpathOfElement);
        }
    }

    /**
     * Get the text from an Name element without cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param nameOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextNameElementWithoutCuttingNewline(WebDriver webDriver, String nameOfElement){
        Optional<WebElement> presentElement = WaitForIt.waitForElementName(webDriver,nameOfElement);
        if(presentElement.isPresent()) {
            return getTextFromElement(presentElement);
        }else {
            throw new NoSuchElementException("Could not find element:" + nameOfElement);
        }
    }

    /**
     * Get the text from an Name element with cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param nameOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextNameElementWithCuttingNewline(WebDriver webDriver, String nameOfElement){
        Optional<WebElement> presentElement = WaitForIt.waitForElementName(webDriver,nameOfElement);
        if(presentElement.isPresent()) {
            String textFromElement = getTextFromElement(presentElement);
            return stripNewLine(textFromElement);
        }else {
            throw new NoSuchElementException("Could not find element:" + nameOfElement);
        }
    }

    /**
     * Get the text from an ID element without cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param idOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextIDElementWithoutCuttingNewline(WebDriver webDriver, String idOfElement){
        Optional<WebElement> presentElement = WaitForIt.waitForElementID(webDriver,idOfElement);
        if(presentElement.isPresent()) {
            return getTextFromElement(presentElement);
        }else {
            throw new NoSuchElementException("Could not find element:" + idOfElement);
        }
    }

    /**
     * Get the text from an ID element with cutting the newline
     * @param webDriver the running webdriver with the browser
     * @param idOfElement the element we want to get the text from
     * @return String that contains the text
     */
    public static String getTextIDElementWithCuttingNewline(WebDriver webDriver, String idOfElement){
        Optional<WebElement> presentElement = WaitForIt.waitForElementName(webDriver,idOfElement);
        if(presentElement.isPresent()) {
            String textFromElement = getTextFromElement(presentElement);
            return stripNewLine(textFromElement);
        }else {
            throw new NoSuchElementException("Could not find element:" + idOfElement);
        }
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
        Optional<WebElement> presentElement = WaitForIt.waitForElementXpath(webDriver,xpathOfElement);
        if (presentElement.isPresent()){
            return getAllSelectElements(presentElement);
        }else{
            throw new NoSuchElementException("Could not find element:" + xpathOfElement);
        }
    }

    /**
     * Get All the options from a dropdown element
     * @param webDriver the webdriver with the browser
     * @param nameOfElement the element we want the options of
     * @return List of webelements with the options
     */
    public static List<WebElement> getTextElementsFromDropDownName(WebDriver webDriver, String nameOfElement){
        Optional<WebElement> presentElement = WaitForIt.waitForElementName(webDriver,nameOfElement);
        if (presentElement.isPresent()){
            return getAllSelectElements(presentElement);
        }else{
            throw new NoSuchElementException("Could not find element:" + nameOfElement);
        }
    }

    /**
     * Get All the options from a dropdown element
     * @param webDriver the webdriver with the browser
     * @param idOfElement the element we want the options of
     * @return List of webelements with the options
     */
    public static List<WebElement> getTextElementsFromDropDownID(WebDriver webDriver, String idOfElement){
        Optional<WebElement> presentElement = WaitForIt.waitForElementID(webDriver,idOfElement);
        if (presentElement.isPresent()){
            return getAllSelectElements(presentElement);
        }else{
            throw new NoSuchElementException("Could not find element:" + idOfElement);
        }
    }
}
