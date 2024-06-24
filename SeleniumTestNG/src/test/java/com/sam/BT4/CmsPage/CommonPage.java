package com.sam.BT4.CmsPage;

import com.sam.keywords.WebUI;
import org.openqa.selenium.WebDriver;

public class CommonPage {
    private static WebDriver driver;
    public CommonPage(){
        this.driver = driver;
        new WebUI(driver);
    }

}
