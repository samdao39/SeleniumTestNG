package com.sam.Bai17_PageObjectModel.Testcases;

import com.sam.Bai17_PageObjectModel.Pages.DashboardPage;
import com.sam.Bai17_PageObjectModel.Pages.LoginPage;
import com.sam.common.Basetest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends Basetest {

    private LoginPage loginPage;

    @Test
    public void testLoginSuccess(){
        loginPage = new LoginPage(driver);

        loginPage.loginCRM("admin@example.com", "123456");// mắc xích liên kết hiện tại giữa 2 trang
        loginPage.verifyLoginSuccess();
    }

    @Test
    public void testLoginFailWithEmailInvalid(){
        loginPage = new LoginPage(driver);

        loginPage.loginCRM("admin123@example.com", "123456");
        loginPage.verifyLoginFail("Invalid email or password");
    }

    @Test
    public void testLoginFailWithPasswordInvalid(){
        loginPage = new LoginPage(driver);

        loginPage.loginCRM("admin@example.com", "123");
        loginPage.verifyLoginFail("Invalid email or password");
    }

    @Test
    public void testLoginFailWithEmailNull(){
        loginPage = new LoginPage(driver);

        loginPage.loginCRM("", "123");
        loginPage.verifyLoginFail("The Email Address field is required.");
    }

    @Test
    public void testLoginFailWithPasswordNull(){
        loginPage = new LoginPage(driver);

        loginPage.loginCRM("admin@example.com", "");
        loginPage.verifyLoginFail("The Password field is required.");
    }
}
