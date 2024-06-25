package com.sam.BT4.CmsPage;

import com.sam.keywords.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class AddNewProductPage extends WebUI {
    private WebDriver driver;
    public AddNewProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
         new WebUI(driver);
    }
    private By addNewProductTab = By.xpath("//a[@href='https://cms.anhtester.com/admin/products/create']");
    private By allProductsTab = By.xpath("//a[@href='https://cms.anhtester.com/admin/products/all']");
    private By searchProductName = By.xpath("//div[@class='col-md-2']//input[@id='search']");
    private By displayProductNameCreated = By.xpath("((//table[@class='table aiz-table mb-0 footable footable-1 breakpoint breakpoint-lg']/descendant::div)/span[@class='text-muted text-truncate-2'])[1]");
    private By inputProductname = By.xpath("(//div[@class='card-body']//div)//input[@placeholder='Product Name']");
    private By clickCategoryDropdown = By.xpath("//div[@class='card-body']/descendant::button[@data-id='category_id']");
    private By searchCategory = By.xpath("(//div[@class='card-body']/descendant::div[@class='dropdown-menu show'])//div//input[@type='search']");
    private By clickBrand = By.xpath("//div[@class='card-body']/descendant::button[@data-id='brand_id']");
    private By searchBrand = By.xpath("(//div[@class='card-body']/descendant::div[@class='dropdown-menu show'])//div//input[@type='search']");
    private By inputUnit = By.xpath("//div[@class='card-body']/descendant::input[@placeholder='Unit (e.g. KG, Pc etc)']");
    private By inputWeight = By.xpath("(//div[@class='card-body']/descendant::input[@type='number'])[1]");
    private By inputMinimumPurchaseQty = By.xpath("(//div[@class='card-body']/descendant::input[@type='number'])[2]");
    private By inputTags = By.xpath("//div[@class='card-body']/descendant::tags[@class='tagify form-control aiz-tag-input']");
    private By galleryImages = By.xpath("((//div[@class='card']/descendant::div)//div//div[@data-type='image'])[1]");
    private By searchGalleryImage = By.xpath("//div[@class='aiz-uploader-search text-right']//input");
    private By imageLenovo1 = By.xpath("(//div[@class='aiz-uploader-all clearfix c-scrollbar-light']//div//div//div//div[position()=1])[1]");
    private By addFilesButton = By.xpath("//button[normalize-space()='Add Files']");
    private By thumbnailImage = By.xpath("((//div[@class='card']/descendant::div)//div//div[@data-type='image'])[2]");
    private By videoProvider = By.xpath("");
    private By videoLink = By.xpath("");
    private By colors_Toggle = By.xpath("(//div[@class='col-md-1']/ancestor::div[@class='card'])//following-sibling::label[@class='aiz-switch aiz-switch-success mb-0']");
    private By inputColors = By.xpath("//button[@data-id='colors']/following-sibling::div//input");// //button[@data-id='colors']/following-sibling::div//input
    private By colorsDropdown = By.xpath("((//div[@class='card']/descendant::div)//div//div//div/button[@data-id='colors'])[1]");
    private By selectAttributes = By.xpath("((//div[@class='col-md-8']/ancestor::div[@class='card'])//following-sibling::div[@class='dropdown bootstrap-select show-tick form-control aiz-'])[1]");
    private By inputAttributes = By.xpath("(//div[@class='col-md-8']/descendant::div[@class='dropdown-menu show'])//div/input");
    private By inputUnitPrice = By.xpath("(//div[@class='col-md-6']/ancestor::div[@class='card'])//following-sibling::input[@name='unit_price']");
    private By inputDiscount = By.xpath("(//div[@class='col-md-6']/ancestor::div[@class='card'])//following-sibling::input[@name='discount']");
    private By inputQuantity = By.xpath("(//div[@class='col-md-6']/ancestor::div[@class='card'])//following-sibling::input[@name='current_stock']");
    private By saveButton = By.xpath("//div[@aria-label='Second group']/button[normalize-space()='Save & Publish']");

    // Vết hàm taọ product thành công
    public void addNewProduct() {

       // WebUI.loginCmsSuccess(driver);
        this.waitForPageLoaded(driver);
        this.waitForElementsToBeClickabled(driver, addNewProductTab);
        driver.findElement(addNewProductTab).click();
        this.checkElementExist(driver, inputProductname);
        this.waitForElementsVisibled(driver, inputProductname);
        //WebUI.checkElementExist(driver,inputProductname);
        driver.findElement(inputProductname).sendKeys("body suit");
        driver.findElement(clickCategoryDropdown).click();
        Actions action = new Actions(driver);
        //driver.findElement(searchCategory).sendKeys("hoa hong do");
        action.sendKeys(driver.findElement(searchCategory), "hoa hong do").perform();
        action.sendKeys(Keys.ENTER).perform();
        this.waitForElementsVisibled(driver, clickBrand);
        this.waitForElementsToBeClickabled(driver, clickBrand);
        driver.findElement(clickBrand).click();
        action.sendKeys(driver.findElement(searchBrand), "cosy").perform();
        action.sendKeys(Keys.ENTER).perform();
        driver.findElement(inputUnit).sendKeys("KG");
        // Input Weight
        action.keyDown(driver.findElement(inputWeight), Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).build().perform();
        action.keyDown(driver.findElement(inputWeight), Keys.COMMAND).sendKeys("X").keyUp(Keys.COMMAND).build().perform();
        action.sendKeys(driver.findElement(inputWeight), Keys.COMMAND, "10").build().perform();
        driver.findElement(inputMinimumPurchaseQty).sendKeys("1");
//        WebUI.waitForElementsVisibled(driver,inputTags);
//        driver.findElement(inputTags).sendKeys("Sam Test product 1");

        driver.findElement(galleryImages).click();
        this.waitForElementsVisibled(driver, searchGalleryImage);
        driver.findElement(searchGalleryImage).click();
        action.sendKeys(driver.findElement(searchGalleryImage), "lenovo");
        this.waitForElementsVisibled(driver, imageLenovo1);
        driver.findElement(imageLenovo1).click();
        driver.findElement(addFilesButton).click();
        //driver.findElement(thumbnailImage).click();
        this.waitForElementsToBeClickabled(driver, colors_Toggle);
        this.waitForElementsVisibled(driver, colors_Toggle);
        driver.findElement(colors_Toggle).click();
        this.waitForElementsVisibled(driver, colorsDropdown);
        this.waitForPageLoaded(driver);
        driver.findElement(colorsDropdown).click();
        //WebUI.checkElementExist(driver,inputColors);
        this.waitForElementsVisibled(driver, inputColors);
        this.refreshElement(driver,inputColors);
        driver.findElement(inputColors).click();
        this.sleep(3);
        action.sendKeys(driver.findElement(inputColors), "MediumPurple").sendKeys(Keys.ENTER).build().perform();
        driver.findElement(colorsDropdown).click();
        this.sleep(3);
        this.waitForElementsToBeClickabled(driver, selectAttributes);
        driver.findElement(selectAttributes).click();
        this.waitForElementsVisibled(driver, inputAttributes);
        driver.findElement(inputAttributes).sendKeys("size");
        action.sendKeys(Keys.ENTER).perform();
        this.sleep(3);
        driver.findElement(inputUnitPrice).sendKeys("1000");
        driver.findElement(inputDiscount).sendKeys("10");
        driver.findElement(inputQuantity).sendKeys("10");
        driver.findElement(saveButton).click();
        this.sleep(3);

    }

    // check colorDropdownIsDisplayed
    public void colorDropdownIsDisplayed() {
        //WebUI.loginCmsSuccess(driver);
        this.waitForPageLoaded(driver);
        driver.findElement(addNewProductTab).click();
        driver.findElement(colors_Toggle).click();
        Assert.assertTrue(this.checkElementExist(driver, colorsDropdown), "colorDropdown is exist");
        driver.findElement(colorsDropdown).isEnabled();
    }

    // Viết hàm verify Text của color check số lượng
    public void countColors() {
        this.waitForPageLoaded(driver);
//        driver.findElement(addNewProductTab);
//        driver.findElement(colors_Toggle).click();
        driver.findElement(colorsDropdown).click();
        Select count = new Select(driver.findElement(colorsDropdown));
        List<WebElement> colorsList = count.getOptions();
        Number quatityColors = colorsList.size();

        for (int i = 0; i <= colorsList.size(); i++) {
            System.out.println("Danh sách colors:" + colorsList.get(i).getText());
        }

        // Assert.assertEquals(quatityColors,"Số lượng Colors là bằng quatity Colors", "Số lượng Colors không đủ");

        Assert.assertEquals(driver.findElement(colorsDropdown).getText(), quatityColors, "The quantity colors is displayed correct");
    }

    //Viết hàm hiển thị product vừa tạo
    public void displayNewProductSuccess() {
       // WebUI.loginCmsSuccess(driver);
        this.waitForPageLoaded(driver);
        driver.findElement(allProductsTab).click();
        driver.findElement(searchProductName).sendKeys("body suit");
        this.checkElementExist(driver, displayProductNameCreated);
        driver.findElement(displayProductNameCreated).isDisplayed();
        Assert.assertEquals(driver.findElement(displayProductNameCreated).getText(), "body suit", "Name is matching ");
    }

}
