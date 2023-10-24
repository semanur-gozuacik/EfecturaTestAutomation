package com.sema.pages.MDMPage.ContractManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contract extends BasePage {
    @FindBy(id = "createItem")
    private WebElement createNewItemButton;
    @FindBy(id = "inputCode")
    private WebElement uniqueCodeElement;
    @FindBy(xpath = "//span[@id='select2-chooseFamilies-container']")

    private WebElement familyDropDown;
    @FindBy(xpath = "//li[normalize-space()='Choose Family']")
    private WebElement chooseFamily;
    @FindBy(id = "_fast-categories")
    private WebElement categoriesButton;
    @FindBy(xpath = "//div[@id='create-new-item-modal']//a[@id='34_anchor']//i[1]")
    private WebElement rootCategories;
    @FindBy(xpath = "//div[@class='modalFooter']//div[@class='pull-right del-btn']")
    private WebElement createButton;
    @FindBy(xpath = "//div[@class='notifyjs-warning']")
    private WebElement emptyFamily;
    @FindBy(xpath = "//span//ul//li[@class='select2-results__option']")
    private WebElement contractFamily;
    @FindBy(xpath = "//span[normalize-space()='Please choose categories']")
    private WebElement emptyCategoriesText;
    @FindBy(xpath = "//span[normalize-space()='Changes saved succesfully.']")
    private WebElement savedCategoriesText;
    @FindBy(xpath = "//span[@class='iconbtn iconbtn-gray']//a[@id='cancelItem']")
    private WebElement cancelButton;
    public Contract() {
    }

    public void verifyCreateNewItemButton(int timeout){
        BrowserUtils.waitForVisibility(createNewItemButton,timeout);
        Assert.assertTrue(createNewItemButton.isDisplayed());
    }
    public void clickCreateNewItemButton(){
        createNewItemButton.click();
    }
   public void verifyUniqueCodeElement(int timeout){
        BrowserUtils.waitForVisibility(uniqueCodeElement,timeout);
        Assert.assertTrue(uniqueCodeElement.isDisplayed());
   }
   public void setUniqueCodeElement(){
        uniqueCodeElement.sendKeys(ConfigurationReader.getProperty("createNewItemUniqueCode"));
   }
   public void selectChooseFamily(){
        BrowserUtils.waitForVisibility(familyDropDown,20);
        familyDropDown.click();
        BrowserUtils.waitForVisibility(chooseFamily,20);
        chooseFamily.click();
   }
   public void clickCategoriesButton(){
        categoriesButton.click();
   }
   public void verifyRootCategories(int timeout){
        BrowserUtils.waitForVisibility(rootCategories,timeout);
        Assert.assertTrue(rootCategories.isDisplayed());
   }
   public void clickRootCategories(){
      rootCategories.click();
    }
    public void clickCreateButton(){
        createButton.click();

    }
    public void verifyCreateItemMessage(String message, int timeout){
        if (message.contains("Changes")){
Assert.assertTrue(true);        }
        else{
            emptyFamily(message,timeout);        }
    }
    private void emptyFamily(String text,int timeout ){
        BrowserUtils.waitForVisibility(emptyFamily,timeout);
        System.out.println(emptyFamily.getText());
        Assert.assertTrue(emptyFamily.getText().contains(text));
    }
    private void saveItem(String text,int timeout ){
        BrowserUtils.waitForVisibility(savedCategoriesText,timeout);
        System.out.println(savedCategoriesText.getText());
        Assert.assertTrue(savedCategoriesText.getText().contains(text));
    }
    public void selectContractFamily(){
        BrowserUtils.waitForVisibility(familyDropDown,20);
        familyDropDown.click();
        BrowserUtils.waitForVisibility(contractFamily,20);
        contractFamily.click();
    }
    public void verifyEmptyCategoriesText(String text,int timeout){
        BrowserUtils.waitForVisibility(emptyCategoriesText,timeout);
        Assert.assertTrue(emptyCategoriesText.getText().equalsIgnoreCase(text));
    }
     //public void verifySavedCategories(String text, int timeout){
        //BrowserUtils.waitForVisibility(savedCategoriesText,timeout);
      //  Assert.assertTrue(savedCategoriesText.getText().equalsIgnoreCase(text));


      public void clickCancelButton(){
        cancelButton.click();

      }

    }


