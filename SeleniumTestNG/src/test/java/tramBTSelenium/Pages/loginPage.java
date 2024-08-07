package tramBTSelenium.Pages;

import com.sam.constants.ConfigData;
import com.sam.keywords.WebUI;
import static com.sam.keywords.WebUI.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage extends WebUI {
    private WebDriver driver;
    public loginPage(WebDriver driver) {
        super(driver);
        new  WebUI (driver);

    this.driver = driver;
    }

        private By inputEmail = By.xpath("//input[@id='email']");
        private By inputPassWord = By.xpath("//input[@id='password']");
        private By clickLoginButton = By.xpath("/button[normalize-space()='Login']");



public void loginSucess(String email,String password){

    driver.get(ConfigData.Url);
    waitForPageLoaded(driver);

    driver.findElement(ConfigData.textboxEmail).sendKeys(ConfigData.Email);
    driver.findElement(ConfigData.textboxPassword).sendKeys(ConfigData.Password);
    driver.findElement(ConfigData.buttonLogin).click();
    waitForPageLoaded(5);
    waitForElementsToBeClickabled(ConfigData.clickMenuBar);
    driver.findElement(ConfigData.clickMenuBar).click();
    }
}
