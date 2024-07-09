package com.sam.BT4.CmsTest;

import com.sam.BT4.CmsPage.AddCategoryPage;
import com.sam.BT4.CmsPage.LoginCmsPage;
import com.sam.BT4.Model.Category;
import com.sam.common.Basetest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddCategoryTest extends Basetest {
   private AddCategoryPage addCategoryPage;
   private LoginCmsPage loginCmsPage;
   Category balo = new Category("Balo tre em","hinhbalo.png","balo");
    Category giay = new Category("Giay tre em","giay.png","Giay");


    @BeforeMethod
    public void ClickCategory () {
        loginCmsPage = new LoginCmsPage(driver);
        addCategoryPage = loginCmsPage.loginCmsSuccess();
       // AddCategoryPage = new AddCategoryPage(driver);
         addCategoryPage.ClickCategory();
    }
   @Test
   public void addNewCategory(){
        //LoginCmsPage = new LoginCmsPage(driver);
        //AddCategoryPage=LoginCmsPage.loginCmsSuccess();
       //AddCategoryPage= new AddCategoryPage(driver);
       addCategoryPage.AddNewCategory(balo);
   }


    @AfterMethod
    public void SearchCategory () {
        addCategoryPage =new AddCategoryPage(driver);
        addCategoryPage.SearchCategory(balo.name);

    }


}


