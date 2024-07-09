package com.sam.BT4.CmsPage;

import com.sam.keywords.WebUI;
import static com.sam.keywords.WebUI.*;
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
         new WebUI(driver);
    }
    private By addNewProductTab = By.xpath("//a[@href='https://cms.anhtester.com/admin/products/create']");
    private By allProductsTab = By.xpath("//a[@href='https://cms.anhtester.com/admin/products/all']");
    private By searchProductName = By.xpath("//div[@class='col-md-2']//input[@id='search']");
    private By displayProductNameCreated = By.xpath("(//span[@class='text-muted text-truncate-2'])[1]");
    private By inputProductname = By.xpath("(//div[@class='card-body']//div)//input[@placeholder='Product Name']");
    private By clickCategoryDropdown = By.xpath("//button[@data-id='category_id']");
    private By searchCategory = By.xpath("//button[@data-id='category_id']/following-sibling::div/div/input");
    private By clickBrand = By.xpath("//div[@class='card-body']/descendant::button[@data-id='brand_id']");
    private By searchBrand = By.xpath("//button[@data-id='brand_id']/following-sibling::div/div/input");
    private By inputUnit = By.xpath("//div[@class='card-body']/descendant::input[@placeholder='Unit (e.g. KG, Pc etc)']");
    private By inputWeight = By.xpath("(//div[@class='card-body']/descendant::input[@type='number'])[1]");
    private By inputMinimumPurchaseQty = By.xpath("(//div[@class='card-body']/descendant::input[@type='number'])[2]");
   // private By inputTags = By.xpath("//div[@class='card-body']/descendant::tags[@class='tagify form-control aiz-tag-input']");
    private By galleryImages = By.xpath("//input[@name='photos']/parent::div");
    private By searchGalleryImage = By.xpath("//div[@class='aiz-uploader-search text-right']/input");
    private By imageLenovo = By.xpath("(//div[@id='aiz-select-file']//img)[1]");
    private By addFilesButton = By.xpath("//button[normalize-space()='Add Files']");
   // private By thumbnailImage = By.xpath("((//div[@class='card']/descendant::div)//div//div[@data-type='image'])[2]");
   // private By videoProvider = By.xpath("");
   // private By videoLink = By.xpath("");
    private By colors_Toggle = By.xpath("(//div[@class='col-md-1']/ancestor::div[@class='card'])//following-sibling::label[@class='aiz-switch aiz-switch-success mb-0']");
    private By inputColors = By.xpath("//button[@data-id='colors']/following-sibling::div//input");
    private By colorsDropdown = By.xpath("//button[@data-id='colors']/preceding-sibling::select");//((//div[@class='card']/descendant::div)//div//div//div/button[@data-id='colors'])[1]
    private By selectAttributes = By.xpath("//button[@data-id='choice_attributes']");
    private By inputAttributes = By.xpath("//button[@data-id='choice_attributes']/following-sibling::div/div/input");
    private By inputUnitPrice = By.xpath("//input[@name='unit_price']/parent::div");
    private By inputDiscount = By.xpath("//input[@name='discount']/parent::div");
    private By inputQuantity = By.xpath("(//div[@class='col-md-6']/ancestor::div[@class='card'])//following-sibling::input[@name='current_stock']");
    private By saveButton = By.xpath("//div[@aria-label='Second group']/button[normalize-space()='Save & Publish']");

    // Vết hàm taọ product thành công
    public void addNewProduct() {

        waitForPageLoaded(5);
        waitForElementsToBeClickabled(addNewProductTab);
        //driver.findElement(addNewProductTab).click();
        getWebElement(addNewProductTab).click();
         checkElementExist(driver,inputProductname);
        waitForElementsVisibled(inputProductname);
        //WebUI.checkElementExist(driver,inputProductname);
       getWebElement(inputProductname).sendKeys("body suit");
       getWebElement(clickCategoryDropdown).click();
       waitForElementsToBeClickabled(searchCategory);
        Actions action = new Actions(driver);
        action.sendKeys(getWebElement(searchCategory), "sam test 01").perform();
        action.sendKeys(Keys.ENTER).perform();
        waitForElementsToBeClickabled( clickBrand);
       getWebElement(clickBrand).click();
        action.sendKeys(getWebElement(searchBrand), "cosy").perform();
        action.sendKeys(Keys.ENTER).perform();
       getWebElement(inputUnit).sendKeys("KG");
        // Input Weight
        action.keyDown(getWebElement(inputWeight), Keys.COMMAND).sendKeys("A").keyUp(Keys.COMMAND).build().perform();
        action.keyDown(getWebElement(inputWeight), Keys.COMMAND).sendKeys("X").keyUp(Keys.COMMAND).build().perform();
        action.sendKeys(getWebElement(inputWeight), Keys.COMMAND, "10").build().perform();
       getWebElement(inputMinimumPurchaseQty).sendKeys("1");
//        WebUI.waitForElementsVisibled(driver,inputTags);
//       getWebElement((inputTags).sendKeys("Sam Test product 1");

       getWebElement(galleryImages).click();
        waitForElementsVisibled(driver, searchGalleryImage);
       getWebElement(searchGalleryImage).click();
        action.sendKeys(getWebElement(searchGalleryImage), "lenovo");
        waitForElementsVisibled(driver, imageLenovo);
       getWebElement(imageLenovo).click();
       getWebElement(addFilesButton).click();
        waitForElementsToBeClickabled(colors_Toggle);
       getWebElement(colors_Toggle).click();
        waitForElementsVisibled( colorsDropdown);
        waitForPageLoaded(driver);
       getWebElement(colorsDropdown).click();
        waitForElementsVisibled(inputColors);
       getWebElement(inputColors).click();
        action.sendKeys(getWebElement(inputColors), "MediumPurple").sendKeys(Keys.ENTER).build().perform();
        sleep(3);
       getWebElement(colorsDropdown).click();
        sleep(3);
        waitForElementsToBeClickabled(selectAttributes);
       getWebElement(selectAttributes).click();
        waitForElementsVisibled(inputAttributes);
       getWebElement(inputAttributes).sendKeys("size");
        action.sendKeys(Keys.ENTER).perform();
        sleep(3);
       getWebElement(inputUnitPrice).sendKeys("1000");
       getWebElement(inputDiscount).sendKeys("10");
       getWebElement(inputQuantity).sendKeys("10");
       getWebElement(saveButton).click();
        sleep(3);

    }

    // check colorDropdownIsDisplayed
    public void enabledDropdownToggle() {
        waitForPageLoaded(5);
       getWebElement(addNewProductTab).click();
       getWebElement(colors_Toggle).click();
        Assert.assertTrue(checkElementExist(driver, colorsDropdown), "colorDropdown is exist");
      // getWebElement(colorsDropdown).isEnabled();
    }

    // Viết hàm verify Text của color check số lượng
    public void countColors() {
        waitForPageLoaded(5);
//       getWebElement((addNewProductTab);
//       getWebElement((colors_Toggle).click();
        WebElement element = getWebElement(colorsDropdown);

        Select dropdown = new Select(element);
        List<WebElement> colorsList = dropdown.getOptions();
        Number quatityColors = colorsList.size();
        for (int i = 0; i <= colorsList.size(); i++) {
            WebElement webElement = colorsList.get(i);
            System.out.println("Danh sách colors:" + webElement.getText());
        }
        // Assert.assertEquals(quatityColors,"Số lượng Colors là bằng quatity Colors", "Số lượng Colors không đủ");
        getWebElement(colorsDropdown).click();
        Assert.assertEquals(getWebElement(colorsDropdown).getText(), quatityColors, "The quantity colors is displayed correct");
    }

    //Viết hàm hiển thị product vừa tạo
    public void displayNewProductSuccess() {
       // WebUI.loginCmsSuccess(driver);
        waitForPageLoaded(5);
       getWebElement(allProductsTab).click();
       waitForElementsToBeClickabled(searchProductName);
       getWebElement(searchProductName).sendKeys("body suit");
        checkElementExist(driver, displayProductNameCreated);
       getWebElement(displayProductNameCreated).isDisplayed();
        Assert.assertEquals(getWebElement(displayProductNameCreated).getText(), "body suit", "Name is matching ");
    }

}
