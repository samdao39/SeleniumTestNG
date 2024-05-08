import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class baseTest {
     static WebDriver driver;
    @Test
    public static void createDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
    }

    public static void closeDriver() {
        driver.quit();
    }
    public static void sleep(double second)  {// douple: truyền vào giây lẻ cung được
        try {
            Thread.sleep((long) (1000*second));// lấy phần nguyên
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

