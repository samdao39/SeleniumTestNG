package com.sam.BT4.CmsTest;

import com.sam.BT4.CmsPage.LoginCmsPage;
import com.sam.common.Basetest;

public class LoginCmsTest extends Basetest {
    LoginCmsPage loginCmsPage;
    public void loginCmssuccess(){
       loginCmsPage= new LoginCmsPage(driver);
       loginCmsPage.loginCmsSuccess();
    }

}
