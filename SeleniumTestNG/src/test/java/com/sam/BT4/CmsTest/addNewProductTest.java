package com.sam.BT4.CmsTest;

import com.sam.BT4.CmsPage.addCategoryPage;
import com.sam.BT4.CmsPage.addNewProductPage;
import com.sam.common.Basetest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addNewProductTest extends Basetest {
    private addNewProductPage addNewProductPage;
    //private loginCmsPage loginCmsPage;
    private addCategoryPage ddCategoryPage;
    @BeforeMethod

    
    @AfterMethod

    @Test(priority = 1)
    public void createNewProduct() {
        addCategoryPage = new addCategoryPage(driver);

        //addNewProductPage  = new addNewProductPage(driver);
        addNewProductPage.addNewProduct();

    }

    @Test(priority = 2)
    public void checkDisplayColorsSuccess() {
        addNewProductPage = new addNewProductPage(driver);
        addNewProductPage.colorDropdownIsDisplayed();
        addNewProductPage.countColors();
    }


    @Test(priority = 3)
    public void checkCreateNewProductSuccess() {
        addNewProductPage = new addNewProductPage(driver);
        addNewProductPage.displayNewProductSuccess();
    }
}
