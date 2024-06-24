package com.sam.constants;

import org.openqa.selenium.By;

public class ConfigData {
    public static String Url ="https://cms.anhtester.com/login";
    public static String Email ="admin@example.com";
    public static String Password ="123456";
    public static By textboxEmail =By.xpath("//input[@id='email']");
    public static By  textboxPassword = By.xpath("//input[@id='password']");
    public  static By buttonLogin=By.xpath("//button[normalize-space()='Login']");
    public static By clickMenuBar = By.xpath("//span[normalize-space()='Products']");
//(//ul[@id='main-menu'])/descendant::span[normalize-space()='Products']

}
