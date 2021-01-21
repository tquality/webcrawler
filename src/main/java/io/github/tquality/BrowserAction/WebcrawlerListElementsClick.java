package io.github.tquality.BrowserAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Click on a specific element in a list
 */
public abstract class WebcrawlerListElementsClick {

    /**
     * Click the specific element of the list with the given index
     * @param elements the elements
     * @param numberElement the index
     */
    private static void clickOnCorrectElement(List<WebElement> elements,int numberElement){
        elements.get(numberElement).click();
    }

    /**
     * Click in a list on specific element, found by xpath
     * @param webDriver the running webdriver
     * @param xpath the xpath of the element
     * @param numberElement the index of the wanted element
     */
    public static void onElementInListwithXpath(WebDriver webDriver,String xpath,int numberElement){
        List<WebElement> elements = webDriver.findElements(By.xpath(xpath));
        clickOnCorrectElement(elements,numberElement);
    }

    /**
     * Click in a list on specific element, found by id
     * @param webDriver the running webdriver
     * @param id the id of the element
     * @param numberElement the index of the wanted element
     */
    public static void onElementInListwithID(WebDriver webDriver,String id,int numberElement){
        List<WebElement> elements = webDriver.findElements(By.id(id));
        clickOnCorrectElement(elements,numberElement);
    }

    /**
     * Click in a list on specific element, found by name
     * @param webDriver the running webdriver
     * @param name the name of the element
     * @param numberElement the index of the wanted element
     */
    public static void onElementInListwithName(WebDriver webDriver,String name,int numberElement){
        List<WebElement> elements = webDriver.findElements(By.name(name));
        clickOnCorrectElement(elements,numberElement);
    }

    /**
     * Click in a list on specific element, found by By element
     * @param webDriver the running webdriver
     * @param element the By of the element
     * @param numberElement the index of the wanted element
     */
    public static void onElementInListwithBy(WebDriver webDriver,By element,int numberElement){
        List<WebElement> elements = webDriver.findElements(element);
        clickOnCorrectElement(elements,numberElement);
    }
}
