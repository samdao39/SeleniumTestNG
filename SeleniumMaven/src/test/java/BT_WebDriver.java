import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BT_WebDriver extends baseTest {
    public static void main(String[] args) {
        createDriver();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("(//ul[@id='side-menu']//li)/descendant::a[@href='https://crm.anhtester.com/admin/projects']")).click();

        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/projects/gantt']/preceding-sibling::a")).click();

        // Input project name
        driver.findElement(By.xpath("//label[@for='name']/following-sibling::input")).sendKeys("samtest");
        //search "12 Company New"ở customer dropdowlist động bằng cách click

        driver.findElement(By.xpath("//select[@id='clientid']/ancestor::div[1]")).click();
        driver.findElement(By.xpath("(//div[@id='bs-select-6']/preceding-sibling::div)/input")).sendKeys("12 Company New");
        driver.findElement(By.xpath("//span[normalize-space()='12 Company New']")).click();

        // kiểm tra checkbox Calculate
        System.out.println(driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).isSelected());
        boolean isSelected = driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).isSelected();
        if (isSelected) {
            driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).click();
        }
        sleep(1);
        //  Kiểm tra Billing Type dropdown tĩnh // Kiểm tra xem dropdown có hổ trợ multi-select

        Select select = new Select(driver.findElement(By.xpath("//select[@id='billing_type']")));
        select.selectByVisibleText("Project Hours");
        System.out.println(select.getFirstSelectedOption().getText());
        //Assert.assertTrue(select.isMultiple());
        // Assert.assertEquals(select.getOptions().size(), 1);
        // Assert.assertEquals(select.getFirstSelectedOption().getText(), " Hours");
        sleep(3);

        //Kiểm tra Status dropdown

        Select select2 = new Select(driver.findElement(By.xpath("//select[@id='status']")));
        select2.selectByVisibleText("On Hold");
        System.out.println(select2.getFirstSelectedOption().getText());
        sleep(3);
// input Estimated Hours
        driver.findElement(By.xpath("//input[@id='estimated_hours']")).sendKeys("5");

// Click Start Date
        driver.findElement(By.xpath("//input[@id='start_date']/following-sibling::div")).click();


        // Check Members dropdown list động bằng cách enter
        driver.findElement(By.xpath("//button[@data-id='project_members[]']")).click();
        driver.findElement(By.xpath("//button[@data-id='project_members[]']/following-sibling::div//input[@type='search']")).sendKeys("Anh Tester Admin");
        sleep(1);
        driver.findElement(By.xpath("//button[@data-id='project_members[]']/following-sibling::div//input[@type='search']")).sendKeys(Keys.ENTER);
        sleep(5);

//        Check members Dropdown list động bằng cách click
//        driver.findElement(By.xpath("//button[@data-id='project_members[]']")).click();
//        driver.findElement(By.xpath("//button[@data-id='project_members[]']/following-sibling::div//input[@type='search']")).sendKeys("Anh Tester Admin");
//        sleep(1);
//        driver.findElement(By.xpath("//span[normalize-space()='Anh Tester Admin']")).click();
//        sleep(3);


       // Deadline
        driver.findElement(By.xpath("//input[@id='deadline']")).click();


// Input Description
        driver.findElement(By.xpath("//iframe[@id='description_ifr']")).sendKeys("sam test project");
        sleep(5);

// checkbox Send project created email
        boolean isSelected3 = driver.findElement(By.xpath("//input[@id='send_created_email']")).isSelected();
        if (!isSelected3) {
            driver.findElement(By.xpath("//input[@id='send_created_email']")).click();
        }
        driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).isSelected();
        driver.findElement(By.xpath("//select[@id='clientid']/ancestor::div[1]")).click();
        sleep(2);
        // button save
        driver.findElement(By.xpath("(//input[@id='send_created_email'])[1]")).click();


        closeDriver();



    }
}
