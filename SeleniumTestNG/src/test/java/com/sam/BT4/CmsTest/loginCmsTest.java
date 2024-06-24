package com.sam.BT4.CmsTest;

import com.sam.BT4.CmsPage.loginCmsPage;
import com.sam.common.Basetest;

public class loginCmsTest extends Basetest {
    loginCmsPage loginCmsPage;
    public void loginCmssuccess(){
       loginCmsPage= new loginCmsPage(driver);
       loginCmsPage.loginCmsSuccess();
    }

}
