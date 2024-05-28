package tramBTSelenium.Pages;

import com.sam.constants.ConfigData;
import com.sam.keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

        private By inputEmail = By.xpath("//input[@id='email']");
        private By inputPassWord = By.xpath("//input[@id='password']");
        private By clickLoginButton = By.xpath("/button[normalize-space()='Login']");



public void loginSucess(){
    //WebUI.waitForPageLoaded(driver);
    driver.get(ConfigData.Url);
    driver.findElement(inputEmail).sendKeys(ConfigData.Email);
    driver.findElement(inputPassWord).sendKeys(ConfigData.Password);
    driver.findElement(clickLoginButton).click();

    }
}
