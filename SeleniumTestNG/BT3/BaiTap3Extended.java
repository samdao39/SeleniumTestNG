package com.sam.BT3;

import com.sam.common.Basetest;
import com.sam.constants.ConfigData;
import com.sam.keywords.WebUI;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaiTap3Extended extends Basetest {


    @Test(priority = 1)
    public void EditCategory() {

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("hoa hong do");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
        WebUI.waitForElementsToBeClickabled(driver, By.xpath("(//a[@class='btn btn-soft-primary btn-icon btn-circle btn-sm'])[1]"));
        driver.findElement(By.xpath("(//a[@class='btn btn-soft-primary btn-icon btn-circle btn-sm'])[1]")).click();

        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        name.click();
        action.keyDown(Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).build().perform();

        action.keyDown(Keys.COMMAND).sendKeys("X").keyUp(Keys.COMMAND).build().perform();

        action.sendKeys(name, "Giay adidas").build().perform();


        driver.findElement(By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[1]")).click();
        WebUI.waitForElementsVisibled(driver, By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']"));

        driver.findElement(By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']")).sendKeys("cosy");
        WebUI.waitForElementsToBeClickabled(driver, By.xpath("//img[@src='//cms.anhtester.com/public/uploads/all/SCZ5yVq1C1O0RBlUTfD70HnIZ1XqrUEQrxWj70KH.png']"));

        driver.findElement(By.xpath("//img[@src='//cms.anhtester.com/public/uploads/all/SCZ5yVq1C1O0RBlUTfD70HnIZ1XqrUEQrxWj70KH.png']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();

        // add icon
        WebUI.waitForElementsToBeClickabled(driver, By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[2]"));

        driver.findElement(By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[2]")).click();
        //Click search

        WebUI.waitForElementsVisibled(driver, By.xpath("//div[@class='aiz-uploader-search text-right']//input"));
        driver.findElement(By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']")).sendKeys("giay");
        WebUI.waitForElementsVisibled(driver, By.xpath("(//div[@class='aiz-uploader-all clearfix c-scrollbar-light']//div//div//div//div[position()=1])[1]"));
        WebUI.checkElementExist(driver, By.xpath("(//div[@class='aiz-uploader-all clearfix c-scrollbar-light']//div//div//div//div[position()=1])[1]"));
        driver.findElement(By.xpath("(//div[@class='aiz-uploader-all clearfix c-scrollbar-light']//div//div//div//div[position()=1])[1]")).click();
        WebUI.waitForElementsToBeClickabled(driver, (By.xpath("//button[normalize-space()='Add Files']")));
        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
        WebUI.waitForElementsToBeClickabled(driver, (By.xpath("//button[normalize-space()='Save']")));
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

    }

    @Test(priority = 2)
    public void DeleteCategory() {

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Giay adidas");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
        WebUI.waitForElementsToBeClickabled(driver, By.xpath("(//a[@class='btn btn-soft-danger btn-icon btn-circle btn-sm confirm-delete'])[1]"));
        driver.findElement(By.xpath("(//a[@class='btn btn-soft-danger btn-icon btn-circle btn-sm confirm-delete'])[1]")).click();
        WebUI.waitForElementsToBeClickabled(driver, By.xpath("//div[@class='modal-content']//div//a[normalize-space()='Delete']"));
        driver.findElement(By.xpath("//div[@class='modal-content']//div//a[normalize-space()='Delete']")).click();

    }

    @Test(priority = 3)
    public void SearchCategory() {
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Giay adidas");
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
        WebUI.waitForElementsVisibled(driver, By.xpath("//div[@class='card-body']//table//tbody//td[normalize-space()='Nothing found']"));
        Assert.assertEquals(WebUI.checkElementExist(driver, By.xpath("//div[@class='card-body']//table//tbody//td[normalize-space()='Nothing found']")), "Nothing found", "Content of message not match");

    }
}

