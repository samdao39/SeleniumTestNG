package com.sam.BT4.CmsTest;

import com.sam.BT4.CmsPage.AddCategoryPage;
import com.sam.BT4.CmsPage.AddNewProductPage;
import com.sam.BT4.CmsPage.LoginCmsPage;
import com.sam.common.Basetest;
import org.testng.annotations.Test;

public class AddNewProductTest extends Basetest {
    private AddNewProductPage addNewProductPage;
    //private LoginCmsPage LoginCmsPage;
    private AddCategoryPage addCategoryPage;
    private LoginCmsPage loginCmsPage;

  @Test(priority = 1)
    public void createNewProduct() {
      loginCmsPage = new LoginCmsPage(driver);
      loginCmsPage.loginCmsSuccess();
      addNewProductPage  = new AddNewProductPage(driver);
      addNewProductPage.addNewProduct();

    }

    @Test(priority = 3)
    public void checkDisplayColorsSuccess() {
        loginCmsPage = new LoginCmsPage(driver);
        loginCmsPage.loginCmsSuccess();
        addNewProductPage = new AddNewProductPage(driver);
        addNewProductPage.enabledDropdownToggle();
        addNewProductPage.countColors();
    }


   @Test(priority = 2)
 public void checkCreateNewProductSuccess() {
       loginCmsPage = new LoginCmsPage(driver);
       loginCmsPage.loginCmsSuccess();
       addNewProductPage = new AddNewProductPage(driver);
       addNewProductPage.displayNewProductSuccess();
   }
}
