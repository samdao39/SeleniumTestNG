package Bai9_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoTestNG {
    @Test
public void createDriverChrome() {


    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.quit();
}

@Test
public void createDriverSafari() {


    WebDriver driver = new SafariDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.get("https://crm.anhtester.com/admin/authentication");
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");

    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

    driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();

    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    driver.quit();
}


}
