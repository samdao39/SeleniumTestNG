package Bai7_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DemofindElementsMenu {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        // get list menu with findElements method
        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@id='side-menu']/li"));
        for( int i = 0; i<listMenu.size();i++){
            // lâấy ra text của các phần tử
            System.out.println(listMenu.get(i).getText());
        }
        driver.quit();

    }

}
