package com.sam.common;

import com.sam.constants.ConfigData;
import com.sam.keywords.WebUI;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.sql.DriverManager;
import java.time.Duration;


public class Basetest {
    public WebDriver driver;
    @BeforeMethod
    public void createDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().window().maximize();


            driver.get(ConfigData.Url);
            WebUI.waitForPageLoaded(driver);
            WebUI.waitForElementsVisibled(driver,By.xpath("//input[@id='email']"));
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys(ConfigData.Email);
            WebUI.waitForElementsVisibled(driver,By.xpath("//input[@id='password']"));
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ConfigData.Password);
            WebUI.waitForElementsToBeClickabled(driver,By.xpath("//button[normalize-space()='Login']"));
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
            driver.findElement(By.xpath("(//ul[@id='main-menu'])/descendant::span[normalize-space()='Products']")).click();

            //click subtab category
        WebUI.waitForElementsToBeClickabled(driver,By.xpath("//a[@href='https://cms.anhtester.com/admin/categories']"));
            driver.findElement(By.xpath("//a[@href='https://cms.anhtester.com/admin/categories']")).click();

        }
       // WebDriverWait Wait = new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(10),Duration.ofMillis(500));
//        driver.get("https://cms.anhtester.com/login");
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
//        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
      //  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();



@AfterMethod

    public void closeDriver() {
        driver.quit();
    }




}

