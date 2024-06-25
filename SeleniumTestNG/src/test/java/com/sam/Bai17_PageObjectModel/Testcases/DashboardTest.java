package com.sam.Bai17_PageObjectModel.Testcases;

import com.sam.Bai17_PageObjectModel.Pages.DashboardPage;
import com.sam.Bai17_PageObjectModel.Pages.LoginPage;
import com.sam.common.Basetest;
import org.testng.annotations.Test;

public class DashboardTest extends Basetest {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    @Test(priority = 1)
    public void testCheckSectionQuickStatisticsDisplay(){
        loginPage = new LoginPage(driver);
       dashboardPage= loginPage.loginCRM("admin@example.com", "123456");

        //dashboardPage = new DashboardPage(driver);
        dashboardPage.clickButtonDashboardOptions();
        dashboardPage.verifyCheckboxQuickStatistics();
    }

    @Test(priority = 2)
    public void testCheckTotalSectionQuickStatistics(){
        loginPage = new LoginPage(driver);
       dashboardPage= loginPage.loginCRM("admin@example.com", "123456");

        //dashboardPage = new DashboardPage(driver);
        dashboardPage.checkTotalInvoicesAwaitingPayment();
        dashboardPage.checkTotalConvertedLeads();
        dashboardPage.checkTotalProjectsInProgress();
        dashboardPage.checkTotalTasksNotFinished();
    }
}
