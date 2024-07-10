package tramBTSelenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void CreateDriver(@Optional("chrome") String browser) {
        setupDriver(browser);
    }
    public WebDriver setupDriver(String browserName)
    {
switch (browserName.trim().toLowerCase()){
    case"chrome":
        driver= initChromeDriver();
        break;
    case"safari":
        driver = initSafari();
        break;
    default:
        System.out.println("Browser:"+ browserName+ " not supported,Launching Chrome as browser default");
        driver = initChromeDriver();
}
return driver;
    }
    private WebDriver initChromeDriver(){
        System.out.println( "launching chrome browser");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
    private  WebDriver initSafari(){
        System.out.println("launching safari browser");
        driver = new SafariDriver();
        driver.manage().window().maximize();
        return driver;
    }
    @AfterClass
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}

