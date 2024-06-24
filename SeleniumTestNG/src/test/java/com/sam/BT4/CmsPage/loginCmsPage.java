package com.sam.BT4.CmsPage;

import com.sam.constants.ConfigData;
import com.sam.keywords.WebUI;
import org.openqa.selenium.WebDriver;

public class loginCmsPage extends WebUI {
    private WebDriver driver;
    public loginCmsPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
    }
    public addCategoryPage loginCmsSuccess(){
        driver.get(ConfigData.Url);
        this.waitForElementsVisibled(driver,(ConfigData.textboxEmail));
        driver.findElement(ConfigData.textboxEmail).sendKeys(ConfigData.Email);
        this.waitForElementsVisibled(driver,(ConfigData.textboxPassword));
        driver.findElement(ConfigData.textboxPassword).sendKeys(ConfigData.Password);
        this.waitForElementsToBeClickabled(driver,(ConfigData.buttonLogin));
        driver.findElement(ConfigData.buttonLogin).click();
        driver.findElement(ConfigData.clickMenuBar).click();
        return new addCategoryPage(driver);
    }
}
