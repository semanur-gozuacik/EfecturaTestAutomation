package com.sema.pages.MDMPage.AssetManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

@Getter
public class Asset extends BasePage {

    @FindBy(xpath = "//a[@id='_fast-item-info']")
    private WebElement infoItem;
    @FindBy(xpath = "//div[@id='jstreeFastCatalog_35']//a[@id='35_anchor']")
    private WebElement assetCategories;
    @FindBy(xpath = "//div[@id='create-new-item-modal']//a[@id='110_anchor']//i[1]")
    private WebElement newNodeClick;
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
    @FindBy(xpath = "//a[@id='createNewList']")
    private WebElement createListButton;
    @FindBy(xpath = "//div[@id='create-new-list']//button[@type='button'][normalize-space()='Cancel']")
    private WebElement createListCancelButton;
    @FindBy(xpath = "//h4[normalize-space()='New List']")
    private WebElement verifyNewListPopup;
    @FindBy(xpath = "//input[@id='input-list']")
    private WebElement listName;
    @FindBy(xpath = "//select[@id='can-view-select']")
    private WebElement canView;
    @FindBy(xpath = "//select[@id='can-view-select']//optgroup[@label='Users']//option")
    private List<WebElement> canViewList;
    @FindBy(xpath = "//select[@id='can-edit-select']")
    private WebElement canEdit;
    @FindBy(xpath = "//select[@id='can-edit-select']//optgroup[@label='Users']//option")
    private List<WebElement> canEditList;
    @FindBy(xpath = "//li[@class='list-item']/p")
    private List<WebElement> listItemsName;
    @FindBy(xpath = "//li[@id='select2-can-view-select-result-ejbv-user0007d59c-20cc-4ce2-a7f3-8031f22b03ce'and @role='treeitem']")
    private WebElement selectedCanView;
    @FindBy(xpath = "//button[@id='create-list']")
    private WebElement listCreateButton;
    @FindBy(xpath = "//div[@class='notifyjs-warning']")
    private WebElement createListErrorMessage;
    @FindBy(xpath = "//li[normalize-space()='No results found']")
    private WebElement verifyNoResultsFound;
    @FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='Cancel']")
    private WebElement deleteListCancelPopUp;
    @FindBy(xpath = "//button[@id='delete-list-button']")
    private WebElement deleteListDeletePopUp;
    @FindBy(xpath = "//li[normalize-space()='campaign-list']")
    private WebElement deletedListItem;
    @FindBy(xpath = "//li[normalize-space()='campaign-list']//i[@class='fa fa-trash edit-icon']")
    private WebElement deleteListButton;
    @FindBy(xpath = "//li[normalize-space()='otomasyon']")
    private WebElement deletedListItemAssetOtomasyonVerify;
    @FindBy(xpath = "//li[normalize-space()='otomasyon']//i[@class='fa fa-trash edit-icon']")
    private WebElement deleteListButtonAssetOtomasyon;




    public Asset() {
    }

    public void verifyInfoItem() {
        BrowserUtils.waitForVisibility(infoItem, 15);
        Assert.assertTrue(infoItem.isDisplayed());
    }

    public void verifyAssetCategories(int timeout) {
        BrowserUtils.waitForVisibility(assetCategories, timeout);
        Assert.assertTrue(assetCategories.isDisplayed());
    }

    public void clickNewNode() {
        BrowserUtils.waitForVisibility(newNodeClick, 15);
        newNodeClick.click();
    }

    public void selectCoolerFamily() {
        BrowserUtils.waitForVisibility(familyDropDown, 15);
        familyDropDown.click();
        BrowserUtils.waitForVisibility(coolerFamily, 20);
        coolerFamily.click();
    }

    public void verifyAssetEmptyFamilyText(String text, int timeout) {
        BrowserUtils.waitForVisibility(emptyFamilyAssetText, timeout);
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
        BrowserUtils.wait(3);
        deleteButtonAssetPopup.click();
    }

    public void verifyDeleteItemText(String text, int timeout) {
        BrowserUtils.wait(3);
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
        BrowserUtils.waitForVisibility(familyDropDown, 10);
        familyDropDown.click();
        if (family.equalsIgnoreCase("Cooler")) {
            BrowserUtils.waitForVisibility(selectCoolerFamily, 10);
            selectCoolerFamily.click();
        }
    }

    public void setCanView(String view) {
        Select select = new Select(canView);
        for (WebElement option : canViewList) {
            if (option.getText().equals(view)) {
                option.click();
                break;
            }
            BrowserUtils.wait(2);
        }
    }

    public void setCanEdit(String edit) {
        Select select = new Select(canEdit);
        for (WebElement option : canEditList) {
            if (option.getText().equals(edit)) {
                option.click();
                break;
            }
            BrowserUtils.wait(2);
        }
    }

    public void verifyNoResultsFound() {
        BrowserUtils.waitForVisibility(verifyNoResultsFound, 10);
        Assert.assertTrue(verifyNoResultsFound.isDisplayed());
    }

}
