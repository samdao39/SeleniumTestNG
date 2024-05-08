//import org.checkerframework.checker.units.qual.C;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
//
//import java.time.Duration;
//
//public class BT_WebElementAndWebDriver {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();// khai baó trình duyệt
//        //driver = new ChromeDriver();//Mở trình duyệt chrome
//        driver.manage().window().maximize();// phóng to trình duyệt driver.mânge.wwindon.max
//        // chờ đợi một element tối đa là 10s
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://crm.anhtester.com/admin/authentication");
//      //  Thread.sleep(3000);
////        driver.findElement(By.xpath("//input[@id='email']")).clear();
////        Thread.sleep(3000);
////        driver.findElement(By.xpath("//input[@type='password']")).clear();
////        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
//       // Thread.sleep(3000);
//        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
//       // Thread.sleep(3000);
//        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//       // Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
//        //Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
//      //  Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[normalize-space()='Customer Details']")).click();
//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("salome");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("09051234");
//
//
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='phonenumber']")).sendKeys("09082233");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='website']")).sendKeys("ecomdy.com");
//        Thread.sleep(3000);
//        WebElement element = driver.findElement(By.xpath("//button[@data-id='groups_in[]']"));
//        element.sendKeys("Gold");
//       // element.click();
//
//
//        //driver.findElement(By.xpath("//button[@data-id='groups_in[]']")).sendKeys("Gold");
//        Thread.sleep(3000);
//        WebElement  element1 =driver.findElement(By.xpath("//button[@data-id='default_currency']"));
//        element1.sendKeys("USD");
//        //element1.click();
//        Thread.sleep(3000);
//       // driver.findElement(By.xpath("//button[@data-id='default_currency']")).sendKeys("USD");
//        driver.findElement(By.xpath("//button[@data-id='default_language']")).click();
//
//
//        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("123 nguyễn công hoan");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("đà nẵng");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("việt nam");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("550000");
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//select[@id='country']/following-sibling::button")).sendKeys("vietnam");
//        driver.findElement(By.xpath("//button[@class='btn btn-primary only-save customer-form-submiter]")).click();
//        Thread.sleep(3000);
//
//
//
//        driver.quit();
//
//    }
//
//}
