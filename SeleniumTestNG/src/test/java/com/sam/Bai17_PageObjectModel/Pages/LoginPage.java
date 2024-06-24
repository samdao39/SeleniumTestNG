package com.sam.Bai17_PageObjectModel.Pages;

import com.sam.constants.ConfigData;
import com.sam.keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    //khai báo driver cục bộ cho class loginPage này để sử dụng cho LoginTest nên dùng private cho mỗi class này thôi
    private WebDriver driver;
    //Hàm xây dựng cho từng class page
 public LoginPage(WebDriver driver){
     this.driver= driver;//Nhận giá trị driver từ bên ngoài( baseTest) khi khởi tạo class LoginPage
     new WebUI(driver);
 }
    //Khai báo các elelment (chưa dùng) dạng đối tượng của By chứ không phải driver.findElement -> cái này chỉ khai báo thôi chứ chưa có tìm kiếm
    //khai báo các element, các hàm , các locator thuộc LoginPageprivate By headerPage = By.xpath("");
    private By headerPage = By.xpath("//h1[normalize-space()='Login']");
    private By inputEmail = By.xpath("//input[@id='email']");
    private By inputPassword = By.xpath("//input[@id='password']");
    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");
    private By errorMessage = By.xpath("//div[@id='alerts']");

    // khai baó cơ chế wait
    //khai báo các hàm  thuộc LoginPage
    public void enterEmail(String email){
    driver.findElement(inputEmail).sendKeys(email);
}
    public void enterPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(buttonLogin).click();
    }
    public void throwErrorMessage(String message){
        driver.findElement(errorMessage).sendKeys(message);
    }
    public DashboardPage loginCRM(String email, String password){
        driver.get(ConfigData.Url);
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        return new DashboardPage(driver);

    }
public void verifyLoginSuccess(){
    WebUI.waitForPageLoaded(driver);
    //Assert.assertTrue(driver.findElement(menuDashboard).isDisplayed(),"Fail,Can not redirect to Dashboard page");
    Assert.assertEquals(driver.getCurrentUrl(),"https://crm.anhtester.com/admin/", "FAIL. The current url not match.");

}

    public void verifyLoginFail(String expectedMessage) {
        WebUI.waitForPageLoaded(driver);
        Assert.assertTrue(WebUI.checkElementExist(driver, errorMessage),"FAIL. The error message not display.");
        Assert.assertEquals(driver.findElement(errorMessage).getText(), expectedMessage, "FAIL. The content of error massge not match.");

    }

}
