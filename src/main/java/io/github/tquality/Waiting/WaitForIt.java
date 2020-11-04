package io.github.tquality.Waiting;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;

public abstract class WaitForIt extends BaseWait{

    /**
     * Wait for an element with xpath selector
     * @param webdriver the running webdriver
     * @param xpathElement the element
     * @return Optional if we found the element
     */
    public static Optional<WebElement> waitForElementXpathClickable(WebDriver webdriver, String xpathElement) {
        WebDriverWait wait = WaitForIt.setupWait(webdriver);
        return  IntStream.range(0, WaitForIt.getMaxCounter())
                .mapToObj(i -> {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathElement)));
                })
                .filter(Objects::nonNull)
                .findFirst();
    }

    /**
     * Wait for an element with xpath selector
     * @param webdriver the running webdriver
     * @param cssSelector the element
     * @return Optional if we found the element
     */
    public static Optional<WebElement> waitForElementCSSSelectorClickable(WebDriver webdriver, String cssSelector) {
        WebDriverWait wait = WaitForIt.setupWait(webdriver);
        return  IntStream.range(0, WaitForIt.getMaxCounter())
                .mapToObj(i -> {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cssSelector)));
                })
                .filter(Objects::nonNull)
                .findFirst();
    }

    /**
     * Wait for an element with name selector
     * @param webdriver the running webdriver
     * @param nameElement the element
     * @return Optional if we found the element
     */
    public static Optional<WebElement> waitForElementNameClickable(WebDriver webdriver, String nameElement){
        WebDriverWait wait = setupWait(webdriver);
        return  IntStream.range(0, getMaxCounter())
                .mapToObj(i -> {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.name(nameElement)));
                })
                .filter(Objects::nonNull)
                .findFirst();
    }

    /**
     * Wait for an element with id selector
     * @param webdriver the running webdriver
     * @param idElement the element
     * @return Optional if we found the element
     */
    public static Optional<WebElement> waitForElementIDClickable(WebDriver webdriver, String idElement){
        WebDriverWait wait = setupWait(webdriver);
        return  IntStream.range(0, getMaxCounter())
                .mapToObj(i -> {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.id(idElement)));
                })
                .filter(Objects::nonNull)
                .findFirst();
    }

    /**
     * Wait for an element with linked Text selector
     * @param webdriver the running webdriver
     * @param linkedText the element
     * @return Optional if we found the element
     */
    public static Optional<WebElement> waitForElementLinkedTextClickable(WebDriver webdriver, String linkedText){
        WebDriverWait wait = setupWait(webdriver);
        return  IntStream.range(0, getMaxCounter())
                .mapToObj(i -> {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkedText)));
                })
                .filter(Objects::nonNull)
                .findFirst();
    }

    /**
     * Wait for an element wit By selector
     * @param webDriver the running webdriver
     * @param element the element we want to wait for
     * @return Optional met the first found element
     */
    public static Optional<WebElement> waitForElementByClickable(WebDriver webDriver, By element){
        WebDriverWait wait = setupWait(webDriver);
        return  IntStream.range(0, getMaxCounter())
                .mapToObj(i -> {
                    return wait.until(ExpectedConditions.elementToBeClickable(element));
                })
                .filter(Objects::nonNull)
                .findFirst();
    }

    /**
     * Wait for an element to dissapear
     * @param webDriver the running webdriver
     * @param element element that needs to go away
     */
    public static void waitForElementBydissapeared(WebDriver webDriver, By element){
        WebDriverWait wait = setupWait(webDriver);
        try {
            for(int i = 0;i<getHardcodedWaitAmount();i++) {
                waitForElementByClickable(webDriver, element);
                waitForPageToLoad(webDriver);
            }
        }catch (NoSuchElementException ignored){}
    }

    public static List<WebElement> waitForWebElement(WebDriver webDriver, String xpath){
        return webDriver.findElements(By.xpath(xpath));
    }

    public static void waitForElementPresentXpath(WebDriver webDriver, String xpath){
        for (int i=0;i<10;i++){
            WaitForIt.waitForPageToLoad(webDriver);
            try{
                webDriver.findElement(By.xpath(xpath));
                break;
            }catch (NoSuchElementException ignored){}
        }
    }

    public static void waitForElementPresentName(WebDriver webDriver, String name){
        for (int i=0;i<10;i++){
            WaitForIt.waitForPageToLoad(webDriver);
            try{
                webDriver.findElement(By.name(name));
                break;
            }catch (NoSuchElementException ignored){}
        }
    }

    public static void waitForElementPresentId(WebDriver webDriver, String id){
        for (int i=0;i<10;i++){
            WaitForIt.waitForPageToLoad(webDriver);
            try{
                webDriver.findElement(By.id(id));
                break;
            }catch (NoSuchElementException ignored){}
        }
    }

    public static void waitForElementPresentCssSelector(WebDriver webDriver, String cssSelector){
        for (int i=0;i<10;i++){
            WaitForIt.waitForPageToLoad(webDriver);
            try{
                webDriver.findElement(By.cssSelector(cssSelector));
                break;
            }catch (NoSuchElementException ignored){}
        }
    }

    public static void waitForElementPresentLinkText(WebDriver webDriver, String linkText){
        for (int i=0;i<10;i++){
            WaitForIt.waitForPageToLoad(webDriver);
            try{
                webDriver.findElement(By.linkText(linkText));
                break;
            }catch (NoSuchElementException ignored){}
        }
    }
}
