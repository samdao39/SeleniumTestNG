package com.sam.BT4.CmsTest;

import com.sam.BT4.CmsPage.addCategoryPage;
import com.sam.BT4.CmsPage.loginCmsPage;
import com.sam.common.Basetest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addCategoryTest extends Basetest {
   private addCategoryPage addCategoryPage;
   private loginCmsPage loginCmsPage;


    @BeforeMethod
    public void ClickCategory () {
        loginCmsPage = new loginCmsPage(driver);
    loginCmsPage.loginCmsSuccess();
        addCategoryPage = new addCategoryPage(driver);
 addCategoryPage.ClickCategory();
    }
   @Test
   public void addNewCategory(){
        loginCmsPage = new loginCmsPage(driver);
        addCategoryPage=loginCmsPage.loginCmsSuccess();

       //addCategoryPage= new addCategoryPage(driver);
       addCategoryPage.AddNewCategory();
   }


    @AfterMethod
    public void SearchCategory () {
        addCategoryPage =new addCategoryPage(driver);
        addCategoryPage.SearchCategory();
    }


}


