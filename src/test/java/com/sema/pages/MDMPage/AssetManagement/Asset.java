package com.sema.pages.MDMPage.AssetManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class Asset extends BasePage {

 @FindBy(xpath = "//a[@id='_fast-item-info']")
        private WebElement infoItem;
 @FindBy(xpath= "//div[@id='jstreeFastCatalog_35']//a[@id='35_anchor']")
 private  WebElement assetCategories;
@FindBy(xpath = "//div[@id='create-new-item-modal']//a[@id='110_anchor']//i[1]")
private  WebElement newNodeClick;
@FindBy(xpath = "//li[contains(text(),'Cooler') and @role='treeitem']")
private WebElement coolerFamily;
@FindBy(xpath = "//span//span[@id='select2-chooseFamilies-container']")
private WebElement familyDropDown;
@FindBy(xpath = "//span[normalize-space()='EMPTY_FAMILY']")
private WebElement emptyFamilyAssetText;
@FindBy(xpath = "//a[@class='t-delete danger-btn']")
private WebElement deleteButtonAsset;
@FindBy(xpath = "//button[@id='deleteItemPopup']")
private WebElement deleteButtonAssetPopup;
@FindBy(xpath = "//button[@id='cancelPopup']")
private WebElement cancelButtonAssetPopup;
@FindBy(xpath = "//span[normalize-space()='Item Deleted Succesfully.']")
private WebElement deleteItemText;
@FindBy(xpath = "//a[normalize-space()='Asset Overview']")
private WebElement verifyAssetEditButton;
@FindBy(xpath = "//a[@id='35']")
private WebElement mainAssetCategories;
@FindBy(xpath = "//a[@id='110_anchor']")
private WebElement newNodeElementAssetCategories;
@FindBy(xpath = "//li[contains(text(),'Cooler') and @role='treeitem']")
private WebElement selectCoolerFamily;


public Asset() {
}
public void verifyInfoItem(){
    BrowserUtils.waitForVisibility(infoItem,20);
    Assert.assertTrue(infoItem.isDisplayed());
}
    public void verifyAssetCategories(int timeout){
        BrowserUtils.waitForVisibility(assetCategories,timeout);
        Assert.assertTrue(assetCategories.isDisplayed());
    }
    public void clickNewNode(){
        BrowserUtils.waitForVisibility(newNodeClick,20);
        newNodeClick.click();
    }
    public void selectCoolerFamily(){
        BrowserUtils.waitForVisibility(familyDropDown,20);
        familyDropDown.click();
        BrowserUtils.waitForVisibility(coolerFamily,20);
        coolerFamily.click();
    }
    public void verifyAssetEmptyFamilyText(String text,int timeout){
    BrowserUtils.waitForVisibility(emptyFamilyAssetText,timeout);
    Assert.assertTrue(emptyFamilyAssetText.getText().contains(text));
    }
    public void clickDeleteButtonAsset() {
        BrowserUtils.hoverOver(deleteButtonAsset);
        BrowserUtils.wait(5);
        deleteButtonAsset.click();
    }
    public void clickCancelButtonInPopup() {
        cancelButtonAssetPopup.click();
    }
    public void clickDeleteButtonAssetPopup() {
        deleteButtonAssetPopup.click();
    }
    public void verifyDeleteItemText(String text,int timeout){
        BrowserUtils.waitForVisibility(deleteItemText,timeout);
        Assert.assertTrue(deleteItemText.getText().contains(text));
    }
    public void clickAssetCategoryButton() {
        BrowserUtils.waitForVisibility(assetCategories, 20);
        assetCategories.click();
    }

    public void verifyEditPage() {
        BrowserUtils.wait(2);
        assertTrue(verifyAssetEditButton.isDisplayed());

    }

    public void clickMainAssetCategories() {
        mainAssetCategories.click();
    }

    public void selectAssetFamily(String family) {
        BrowserUtils.waitForVisibility(familyDropDown,20);
        familyDropDown.click();
        if (family.equalsIgnoreCase("Cooler")) {
            BrowserUtils.waitForVisibility(selectCoolerFamily, 20);
            selectCoolerFamily.click();
        }
    }

}
