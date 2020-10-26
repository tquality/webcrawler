package io.github.tquality.Waiting;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public static Optional<WebElement> waitForElementXpath(WebDriver webdriver, String xpathElement) {
        WebDriverWait wait = WaitForIt.setupWait(webdriver);
        return  IntStream.range(0, WaitForIt.getMaxCounter())
                .mapToObj(i -> {
                    return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathElement)));
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
    public static Optional<WebElement> waitForElementName(WebDriver webdriver, String nameElement){
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
    public static Optional<WebElement> waitForElementID(WebDriver webdriver, String idElement){
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
    public static Optional<WebElement> waitForElementLinkedText(WebDriver webdriver, String linkedText){
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
    public static Optional<WebElement> waitForElementBy(WebDriver webDriver, By element){
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
                waitForElementBy(webDriver, element);
                waitForPageToLoad(webDriver);
            }
        }catch (NoSuchElementException ignored){}
    }
}
