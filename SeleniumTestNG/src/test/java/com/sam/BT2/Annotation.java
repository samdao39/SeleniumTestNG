//package com.sam.BT2;
//
//
//import com.sam.common.Basetest;
//import com.sam.keywords.WebUI;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import static java.lang.Thread.sleep;
//
//public class Annotation extends Basetest {
//
//    //click tab products
//    @BeforeMethod
//    public void ClickCategory() {
//        WebUI.waitForElementsToBeClickabled(driver,By.xpath("//span[normalize-space()='Products']"));
//        driver.findElement(By.xpath("//span[normalize-space()='Products']")).click();
//
//        //click subtab category
//        WebUI.waitForElementsToBeClickabled(driver,By.xpath("//a[@href='https://cms.anhtester.com/admin/categories']"));
//        driver.findElement(By.xpath("//a[@href='https://cms.anhtester.com/admin/categories']")).click();
//
//    }
//
//    //click button [Add new category]
//    @Test
//    public void AddNewCategory() {
//        driver.findElement(By.xpath("//a[@href='https://cms.anhtester.com/admin/categories/create']")).click();
//        // add name
//        driver.findElement(By.id("name")).sendKeys("hoa hong do");
//        // add parent category
//        driver.findElement(By.xpath("(//select[@name='parent_id']/ancestor::div)/button")).click();
//
//        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@type='search']")).sendKeys("Sport shoes");
//        driver.findElement(By.xpath("//div[@class='dropdown-menu show']//input[@type='search']")).sendKeys(Keys.ENTER);
//// add Ordering Number
//        driver.findElement(By.xpath("//input[@id='order_level']")).sendKeys("1");
//        // add type
//        driver.findElement(By.xpath("(//div[normalize-space()='Physical'])[1]")).click();
//
//        driver.findElement(By.xpath("//a[normalize-space()='Physical']")).click();
//// add banner
//        driver.findElement(By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[1]")).click();
//        WebUI.waitForElementsToBeClickabled(driver,By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']"));
//
//        driver.findElement(By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']")).sendKeys("hoa hong");
//        WebUI.waitForElementsToBeClickabled(driver,By.xpath("//img[@src='//cms.anhtester.com/public/uploads/all/ayPNrcw9RZbHlyAS9haXXsfofRYXNejWrl11JmFs.jpg']"));
//
//        driver.findElement(By.xpath("//img[@src='//cms.anhtester.com/public/uploads/all/ayPNrcw9RZbHlyAS9haXXsfofRYXNejWrl11JmFs.jpg']")).click();
//        WebUI.waitForElementsToBeClickabled(driver,By.xpath("//button[normalize-space()='Add Files']"));
//        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
//        WebUI.waitForElementsToBeClickabled(driver,By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[2]"));
//        // add icon
//
//        driver.findElement(By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[2]")).click();
//
//
//        driver.findElement(By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']")).sendKeys("balo");
//        WebUI.waitForElementsToBeClickabled(driver,By.xpath("//img[@src='//cms.anhtester.com/public/uploads/all/gqgVzXYdkORZhfIHQ51ZZy8iuCMYy9h9bVeIdElW.png']"));
//        driver.findElement(By.xpath("//img[@src='//cms.anhtester.com/public/uploads/all/gqgVzXYdkORZhfIHQ51ZZy8iuCMYy9h9bVeIdElW.png']")).click();
//
//        driver.findElement(By.xpath("//button[normalize-space()='Add Files']")).click();
//        // input Meta TiTle
//        driver.findElement(By.name("meta_title")).sendKeys("balo");
//        //Input meta description
//        driver.findElement(By.name("meta_description")).sendKeys("hello");
//        //Filtering Attributes
//        driver.findElement(By.xpath("//select[@name='filtering_attributes[]']/following-sibling::button")).click();
//        driver.findElement(By.xpath("//div[@class='dropdown-menu show']/descendant::input")).sendKeys("size");
//        driver.findElement(By.xpath("//div[@class='dropdown-menu show']/descendant::input")).sendKeys(Keys.ENTER);
//        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
//
//    }
//
//    @AfterMethod
//    public void SearchCategory() {
//        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("hoa hong do");
//        driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
//        WebUI.waitForElementsToBeClickabled(driver,By.xpath("((//div[@class='card-body']//table)//tbody/tr/td)[2]"));
//        String getName = driver.findElement(By.xpath("((//div[@class='card-body']//table)//tbody/tr/td)[2]")).getText();
//        System.out.println(getName);
//        Assert.assertEquals(getName, "hoa hong do");
//    }
//    }
//
//
//
//
//
//
//
