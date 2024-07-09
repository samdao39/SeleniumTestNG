package com.sam.BT4.CmsPage;
import static com.sam.keywords.WebUI.*;

import com.sam.BT4.Model.Category;
import com.sam.constants.ConfigData;
import com.sam.keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddCategoryPage extends WebUI {
    private WebDriver driver;
    public AddCategoryPage(WebDriver driver) {
        super(driver);

        new WebUI(driver);

    }
        private By button_AddNewCategory = By.xpath("//a[normalize-space()='Add New category']");
        private By nameCategory = By.id("name");
        private By dropdownParentCategory = By.xpath("(//select[@name='parent_id']/ancestor::div)/button");
        private By inputParentCategory = By.xpath("(//input[@type='search'])[1]");
        private By inputOrderingNumber = By.xpath("//input[@id='order_level']");
        private By dropdownType = By.xpath("(//button[@type='button'])[2]");
        private By selectType = By.xpath("//a[@id='bs-select-2-1']/parent::li");
        private By clickBanner = By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[1]");
        private By searchBanner = By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']");
        private By selectBanner = By.xpath("(//div[@id='aiz-select-file']//img)[1]");
        private By clickIcon = By.xpath("(//div[@data-type='image']//div[contains(text(),'Browse')])[2]");
        private By selectIcon = By.xpath("(//div[@id='aiz-select-file']//img)[1]");
        private By searchIcon = By.xpath("//div[@class='modal-content h-100']//div//input[@placeholder='Search your files']");
        private By addFileButton = By.xpath("//button[normalize-space()='Add Files']");
        private By inputMetaTiTle = By.name("meta_title");
        private By inputMetaDescription = By.name("meta_description");
        private By dropdownFilteringAttributes = By.xpath("//select[@name='filtering_attributes[]']/following-sibling::button");
        private By inputFilteringAttributes = By.xpath("//div[@class='dropdown-menu show']/descendant::input");
        private By buttonSave = By.xpath("//button[normalize-space()='Save']");
    private  By tabCategory = By.xpath("//span[normalize-space()='Category']");
    private  By searchCategory = By.xpath("//input[@id='search']");
    private By itemSearch = By.xpath("((//div[@class='card-body']//table)//tbody/tr/td)[2]");


        public void ClickCategory () {
          waitForPageLoaded(3);
          //getWebElement(ConfigData.clickMenuBar).click();
            waitForElementsToBeClickabled(tabCategory);
          getWebElement(tabCategory).click();
        }

        public AddNewProductPage SearchCategory (String categoryName) {
          setText(searchCategory, categoryName);
            //driver.findElement(searchCategory).sendKeys("hoa hong do");
          setWithKeys(searchCategory, Keys.ENTER);
           // driver.findElement(searchCategory).sendKeys(Keys.ENTER);
          waitForElementsToBeClickabled(itemSearch);
            String getName =getWebElement(itemSearch).getText();
            System.out.println(getName);
            Assert.assertEquals(getName, categoryName,"Category name matching ");
            return new AddNewProductPage(driver);

        }

        public void AddNewCategory (Category category) {
            waitForElementsToBeClickabled(button_AddNewCategory);
            getWebElement(button_AddNewCategory).click();
            waitForPageLoaded(3);
          clickElement(nameCategory);
            // add name
          setText(nameCategory,category.name);
            // add parent category
          clickElement(dropdownParentCategory);
          setText(inputParentCategory,category.parentCategory);
          setWithKeys(inputParentCategory,Keys.ENTER);

// add Ordering Number
          waitForElementsToBeClickabled(inputOrderingNumber);
          setText(inputOrderingNumber,"1");
            // add type
          clickElement(dropdownType);
          clickElement(selectType);
// add banner
          clickElement(clickBanner);
          waitForPageLoaded(3);
          waitForElementsToBeClickabled(searchBanner);
          setText(searchBanner,category.banner);
          waitForPageLoaded(5);
         // waitForElementsToBeClickabled(selectBanner);
          clickElement(selectBanner);
         // waitForElementsToBeClickabled(driver, addFileButton);
          clickElement(addFileButton);

            // add icon
            waitForElementsToBeClickabled(clickIcon);
          clickElement(clickIcon);
          waitForPageLoaded(5);
          waitForElementsToBeClickabled(searchIcon);

          setText(searchIcon,"balo");
            waitForPageLoaded(5);
          //waitForElementsToBeClickabled(selectIcon);
          clickElement(selectIcon);
          clickElement(addFileButton);
            // input Meta TiTle
          setText(inputMetaTiTle,"balo");

            //Input meta description
          setText(inputMetaDescription,"hello");
            //Filtering Attributes
          clickElement(dropdownFilteringAttributes);
          setText(inputFilteringAttributes,"size");
          setWithKeys(inputFilteringAttributes,Keys.ENTER);
          clickElement(buttonSave);
          waitForPageLoaded(5);
        }

    }

