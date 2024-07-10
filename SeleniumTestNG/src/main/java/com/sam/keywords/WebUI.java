package com.sam.keywords;

import com.sam.constants.ConfigData;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class WebUI {
    private static WebDriver driver;
    private static int EXPLICIT_WAIT_TIMEOUT = 5;
    private static double STEP_TIME = 3;
    private static int PAGE_LOAD_TIMEOUT = 10;

    public WebUI (WebDriver driver){
        this.driver= driver;

    }
    public void sleep(double second) {
        try {
            Thread.sleep((long) (1000 * second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void logConsole(Object message){
        System.out.println(message);
    }
    public void openURL(String url){
        driver.get(url);
        sleep(STEP_TIME);
        logConsole("Open:"+url);
    }
    public void waitForPageLoaded(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(PAGE_LOAD_TIMEOUT), Duration.ofMillis(500));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return js.executeScript("return document.readyState").toString().equals("complete");
            }
        };
        //Check JS is Ready
        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");
        //Wait Javascript until it is Ready!
        if (!jsReady) {
            System.out.println("Javascript is NOT Ready.");
            //Wait for Javascript to load
            try {
                wait.until(jsLoad);
            } catch (Throwable error) {
                error.printStackTrace();
                Assert.fail("FAILED. Timeout waiting for page load.");
            }
        }
    }
    public void waitForPageLoaded(long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout), Duration.ofMillis(500));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return js.executeScript("return document.readyState").toString().equals("complete");
            }
        };
        //Check JS is Ready
        boolean jsReady = js.executeScript("return document.readyState").toString().equals("complete");
        //Wait Javascript until it is Ready!
        if (!jsReady) {
            System.out.println("Javascript is NOT Ready.");
            //Wait for Javascript to load
            try {
                wait.until(jsLoad);
            } catch (Throwable error) {
                error.printStackTrace();
                Assert.fail("FAILED. Timeout waiting for page load.");
            }
        }
    }
    public void waitForElementsVisibled( By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public  void waitForElementsToBeClickabled( By by){
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait1.until(ExpectedConditions.elementToBeClickable(by));
    }
    public  void clickElement(By by){
       waitForElementsToBeClickabled(by);
       getWebElement(by).click();
       logConsole("click element:"+by);

    }
    public WebElement getWebElement(By by){
        return driver.findElement(by);
    }
    public List<WebElement> getListWebElements(By by){
        return driver.findElements(by);

    }
    public String getElementText(By by){
        String text = getWebElement(by).getText();
       logConsole("Get text: " + text +"on element"+by);
        return text; //Trả về một giá trị kiểu String


    }
    public WebElement highLightElement (By by, String color ) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid'"+ color+"'", getWebElement(by));
            sleep(STEP_TIME);
        }
        return getWebElement(by);
    }
    //.`arguments[0].style.border='3px solid ${color}'`



    public void setText( By by, String Text){
        waitForElementsVisibled(by);
        getWebElement(by).sendKeys(Text);
        logConsole("\uD83D\uDC49 setText "+Text+" on element "+by);
    }

    /**
     *
     * @param by
     * @param keys
     */
    public void setWithKeys( By by,Keys keys){
        waitForElementsVisibled(by);
        getWebElement(by).sendKeys(keys);
    }
    public String getElementAttribute(By by, String attributeName){
        waitForElementsVisibled(by);
        sleep(STEP_TIME);
        String text = getWebElement(by).getAttribute(attributeName);
        logConsole( "Attribute value" +text);
        return  text;
    }


    public void waitForElementsVisibled(WebDriver driver, By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public  void waitForElementsToBeClickabled(WebDriver driver, By by){
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait1.until(ExpectedConditions.elementToBeClickable(by));
    }
    public  Boolean checkElementExist(WebDriver driver, By by) {
        List<WebElement> listElement = getListWebElements(by);

        if (listElement.size() > 0) {
            System.out.println("✅Check Element " +true + by + " existing.");
            return true;
        } else {
            System.out.println("\uD83C\uDD98Check Element " +false+ by + " NOT exist.");
            return false;
        }
    }
    public  void refreshElement(WebDriver driver,By by){
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait.until(ExpectedConditions.stalenessOf(getWebElement(by)));
    }
    public void waitforAlertIsPresent(By by){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait.until(ExpectedConditions.alertIsPresent());
        logConsole("Allert message" +by);
    }
    public void titleIsPresent(By by,String text){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait.until(ExpectedConditions.titleIs(text));
        logConsole("Title is" + text +"on element"+by);

    }
    public void elementToBeSelected(By by){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeSelected(by));
        logConsole(" element is selected"+by);
    }
    public void frameToBeAvailableAndSwitchToIt(By by){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
        logConsole("Frame available" + by );
    }
    public boolean verifyEquals(Object actual, Object expected) {
        waitForPageLoaded(3);
        System.out.println("Verify equals: " + actual + " =" + expected);
        boolean check = actual.equals(expected);
        return check;
    }

    public void assertEquals(Object actual, Object expected, String message) {
        waitForPageLoaded(3);
        System.out.println("Assert equals: " + actual + " = " + expected);
        Assert.assertEquals(actual, expected, message);
    }

    public boolean verifyContains(String actual, String expected) {
        waitForPageLoaded(3);
        System.out.println("Verify contains: " + actual + " and " + expected);
        boolean check = actual.contains(expected);
        return check;
    }

    public void assertContains(String actual, String expected, String message) {
        waitForPageLoaded(3);
        System.out.println("Assert contains: " + actual + " and " + expected);
        boolean check = actual.contains(expected);
        Assert.assertTrue(check, message);
    }
}



//public void myFunction() {
//        try {
//           // copy toàn bộ code của function hiện tại bỏ vào đây
//        } catch (Exception e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        } finally {
//            System.out.println("This is the finally block.");
//        }
//    }