package io.github.tquality.DataHarvest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class WebcrawlerGetDataFromListElement {

    private static String getTextFromElement(List<WebElement> elements,int elementNumber){
        return elements.get(elementNumber).getText();
    }

    public static String withXpath(WebDriver webDriver,String xpath,int elementWeWant){
        List<WebElement> elements = webDriver.findElements(By.xpath(xpath));
        return getTextFromElement(elements,elementWeWant);
    }

    public static String withId(WebDriver webDriver,String id,int elementWeWant){
        List<WebElement> elements = webDriver.findElements(By.id(id));
        return getTextFromElement(elements,elementWeWant);
    }

    public static String withName(WebDriver webDriver,String name,int elementWeWant){
        List<WebElement> elements = webDriver.findElements(By.name(name));
        return getTextFromElement(elements,elementWeWant);
    }

    public static String withByElement(WebDriver webDriver,By by,int elementWeWant){
        List<WebElement> elements = webDriver.findElements(by);
        return getTextFromElement(elements,elementWeWant);
    }
}
