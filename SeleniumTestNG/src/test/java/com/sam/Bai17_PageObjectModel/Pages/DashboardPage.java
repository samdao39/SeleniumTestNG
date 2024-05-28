//package com.sam.Bai17_PageObjectModel.Pages;
//
//import com.sam.keywords.WebUI;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//
//public class DashboardPage {
//    //khai báo các biến liên quan đến page này
//        private WebDriver driver;
//
//        public DashboardPage(WebDriver driver)// nhớ add Webdriver chớ k báo null driver
//        {
//
//            this.driver = driver;
//        }
//
//        private By buttonDashboardOptions = By.xpath("//div[normalize-space()='Dashboard Options']");
//        private By totalInvoicesAwaitingPayment = By.xpath("(//span[normalize-space()='Invoices Awaiting Payment']/parent::div)/following-sibling::span");
//        private By totalConvertedLeads = By.xpath("(//span[normalize-space()='Converted Leads']/parent::div)/following-sibling::span");
//        private By totalProjectsInProgress = By.xpath("(//span[normalize-space()='Projects In Progress']/parent::div)/following-sibling::span");
//        private By totalTasksNotFinished = By.xpath("(//span[normalize-space()='Tasks Not Finished']/parent::div)/following-sibling::span");
//
//        public void checkTotalInvoicesAwaitingPayment() {
//            Assert.assertTrue(WebUI.checkElementExist(driver, totalInvoicesAwaitingPayment), "The section Invoices Awaiting Payment not display.");
//            Assert.assertEquals(driver.findElement(totalInvoicesAwaitingPayment).getText(), "1 / 1", "FAIL!! Invoices Awaiting Payment total not match.");
//        }
//
//        public void checkTotalConvertedLeads() {
//            Assert.assertTrue(WebUI.checkElementExist(driver, totalConvertedLeads), "The section Converted Leads not display.");
//            Assert.assertEquals(driver.findElement(totalConvertedLeads).getText(), "0 / 5", "FAIL!! Converted Leads total not match.");
//        }
//
//        public void checkTotalProjectsInProgress() {
//            Assert.assertTrue(WebUI.checkElementExist(driver, totalProjectsInProgress), "The section Projects In Progress not display.");
//            Assert.assertEquals(driver.findElement(totalProjectsInProgress).getText(), "4 / 4", "FAIL!! Projects In Progress total not match.");
//        }
//
//        public void checkTotalTasksNotFinished() {
//            Assert.assertTrue(WebUI.checkElementExist(driver, totalTasksNotFinished), "The section Tasks Not Finished not display.");
//            Assert.assertEquals(driver.findElement(totalTasksNotFinished).getText(), "8 / 8", "FAIL!! Tasks Not Finished total not match.");
//        }
//    }
//}
