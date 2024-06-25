package com.sam.BT4.CmsTest;

import com.sam.BT4.CmsPage.addCategoryPage;
import com.sam.BT4.CmsPage.addNewProductPage;
import com.sam.BT4.CmsPage.loginCmsPage;
import com.sam.common.Basetest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addNewProductTest extends Basetest {
    private addNewProductPage addNewProductPage;
    //private loginCmsPage loginCmsPage;
    private addCategoryPage addCategoryPage;
    private loginCmsPage loginCmsPage;

    @Test(priority = 1)
    public void createNewProduct() {
        loginCmsPage = new loginCmsPage(driver);
        loginCmsPage.loginCmsSuccess();
        addNewProductPage  = new addNewProductPage(driver);
        addNewProductPage.addNewProduct();

    }

    @Test(priority = 2)
    public void checkDisplayColorsSuccess() {
        loginCmsPage = new loginCmsPage(driver);
        loginCmsPage.loginCmsSuccess();
        addNewProductPage = new addNewProductPage(driver);
        addNewProductPage.colorDropdownIsDisplayed();
        addNewProductPage.countColors();
    }


    @Test(priority = 3)
    public void checkCreateNewProductSuccess() {
        loginCmsPage = new loginCmsPage(driver);
        loginCmsPage.loginCmsSuccess();
        addNewProductPage = new addNewProductPage(driver);
        addNewProductPage.displayNewProductSuccess();
    }
}
