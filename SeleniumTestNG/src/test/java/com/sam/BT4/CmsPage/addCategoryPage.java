package com.sam.BT4.CmsPage;

import com.sam.constants.ConfigData;
import com.sam.keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class addCategoryPage extends WebUI {
    private WebDriver driver;
    public addCategoryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        new WebUI(driver);

    }
        private By nameCategory = By.id("name");
        private By dropdownParentCategory = By.xpath("(//select[@name='parent_id']/ancestor::div)/button");
        private By inputParentCategory = By.xpath("//div[@class='dropdown-menu show']//input[@type='search']");
        private By inputOrderingNumber = By.xpath("(//select[@name='parent_id']/ancestor::div)/button");
        private By dropdownType = By.xpath("(//div[normalize-space()='Physical'])[1]");
        private By selectType = By.xpath("//a[normalize-space()='Physical']");
        private By clickBanner = By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[1]");
        private By searchBanner = By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']");
        private By selectBanner = By.xpath("//img[@src='//cms.anhtester.com/public/uploads/all/ayPNrcw9RZbHlyAS9haXXsfofRYXNejWrl11JmFs.jpg']");
        private By clickIcon = By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[2]");
        private By selectIcon = By.xpath("//img[@src='//cms.anhtester.com/public/uploads/all/gqgVzXYdkORZhfIHQ51ZZy8iuCMYy9h9bVeIdElW.png']");
        private By searchIcon = By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']");
        private By addFileButton = By.xpath("//button[normalize-space()='Add Files']");
        private By inputMetaTiTle = By.name("meta_title");
        private By inputMetaDescription = By.name("meta_description");
        private By dropdownFilteringAttributes = By.xpath("//select[@name='filtering_attributes[]']/following-sibling::button");
        private By inputFilteringAttributes = By.xpath("//div[@class='dropdown-menu show']/descendant::input");
        private By buttonSave = By.xpath("//button[normalize-space()='Save']");
    private  By tabCategory = By.xpath("//a[@href='https://cms.anhtester.com/admin/categories']");
    private  By searchCategory = By.xpath("//input[@id='search']");
    private By itemSearch = By.xpath("((//div[@class='card-body']//table)//tbody/tr/td)[2]");


        public void ClickCategory () {
            this.waitForPageLoaded(1000);
            //this.waitForElementsToBeClickabled(driver, ConfigData.clickMenuBar);
            //driver.findElement(ConfigData.clickMenuBar).click();
            //click subtab category
            this.waitForElementsVisibled(tabCategory);
            //driver.findElement(tabCategory).click();
            this.clickElement(tabCategory);

        }

        public addNewProductPage SearchCategory () {

            this.setText(searchCategory,"hoa hong do");
            //driver.findElement(searchCategory).sendKeys("hoa hong do");
            this.setWithKeys(searchCategory, Keys.ENTER);
           // driver.findElement(searchCategory).sendKeys(Keys.ENTER);
            this.waitForElementsToBeClickabled(driver,itemSearch);
            String getName = driver.findElement(itemSearch).getText();
            System.out.println(getName);
            Assert.assertEquals(getName, "hoa hong do");
            return new addNewProductPage(driver);
        }

        public void AddNewCategory () {
            this.clickElement(nameCategory);
            // add name
            this.setText(nameCategory,"hoa hong do");
            // add parent category
            this.clickElement(dropdownParentCategory);
            this.setText(inputParentCategory,"Sport shoes");
            this.setWithKeys(inputParentCategory,Keys.ENTER);

// add Ordering Number
            this.setText(inputOrderingNumber,"1");
            // add type
            this.clickElement(dropdownType);
            this.clickElement(selectType);
// add banner
            this.clickElement(clickBanner);
            this.waitForElementsToBeClickabled(driver, clickBanner);
            this.setText(searchBanner,"hoa hong");
            this.waitForElementsToBeClickabled(driver, selectBanner);
            this.clickElement(selectBanner);
            this.waitForElementsToBeClickabled(driver, addFileButton);
            this.clickElement(addFileButton);
            this.waitForElementsToBeClickabled(driver, clickIcon);
            // add icon
            this.clickElement(clickIcon);
            this.setText(selectIcon,"balo");
            this.waitForElementsToBeClickabled(driver, searchIcon);
            this.clickElement(selectIcon);
            this.clickElement(addFileButton);
            // input Meta TiTle
            this.setText(inputMetaTiTle,"balo");

            //Input meta description
            this.setText(inputMetaDescription,"hello");
            //Filtering Attributes
            this.clickElement(dropdownFilteringAttributes);
            this.setText(inputFilteringAttributes,"size");
            this.setWithKeys(inputFilteringAttributes,Keys.ENTER);
            this.clickElement(buttonSave);
        }

    }

