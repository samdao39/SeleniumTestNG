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
        }




@AfterMethod

    public void closeDriver() {
        driver.quit();
    }


}

