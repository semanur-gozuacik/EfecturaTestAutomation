package com.sema.pages.MDMPage.AssetManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Pages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssetEditPage extends BasePage {
    public AssetEditPage() {
    }

    @FindBy(xpath = "//a[@id='listDropdown']//*[name()='svg']")
    private WebElement listDropDownButton;

    @FindBy(xpath = "//a[normalize-space()='Sematestyeni']")
    private WebElement editListItem;
    @FindBy(xpath = "//li[@class='list-tag']")
    private WebElement verifyEditListItem;
    @FindBy(xpath = "//span[@class='cancel-button']")
    private WebElement deleteEditList;
    @FindBy(xpath = "//div[@class='notifyjs-success']")
    private WebElement verifyRemovedListPopUp;
    @FindBy(xpath = "//a[normalize-space()='test12234testt52']")
    private WebElement editListSecondItem;
    @FindBy(xpath = "//a[normalize-space()='AllListsAdded']")
    private WebElement allListAddedItem;
    @FindBy(xpath = "//a[@id='_group-permissions']")
    private WebElement groupPermissions;
    @FindBy(xpath = "//button[@id='group-permissions-tableFirstPage']")
    private WebElement leftPreviousPage;
    @FindBy(xpath = "//button[@id='user-permissions-tableFirstPage']")
    private WebElement leftPreviousPageUser;
    @FindBy(xpath = "//span[@id='group-permissions-table_previous']")
    private WebElement previousPage;
    @FindBy(xpath = "//span[@id='user-permissions-table_previous']")
    private WebElement previousPageUser;
    @FindBy(xpath = "//span[@id='group-permissions-table_next']")
    private WebElement nextPage;
    @FindBy(xpath = "//span[@id='user-permissions-table_next']")
    private WebElement nextPageUser;
    @FindBy(xpath = "//button[@id='group-permissions-tableLastPage']")
    private WebElement lastPage;
    @FindBy(xpath = "//div[@class='custom-button-right userPermissions custom-button-page']")
    private WebElement lastPageUser;
    @FindBy(xpath = "//input[@class='pagination-text']")
    private WebElement lastPageVerificationText;
    @FindBy(xpath = "//input[@class='pagination-text']")
    private WebElement lastPageVerificationTextUser;
    @FindBy(xpath = "//a[@id='_user-permissions']")
    private WebElement userPermissions;

    public void clickListDropDown() {
        BrowserUtils.waitForVisibility(listDropDownButton, 10);
        listDropDownButton.click();
    }

    public void clickListItem() {
        BrowserUtils.waitForVisibility(editListItem, 10);
        editListItem.click();
    }

    public void clickListSecondItem() {
        BrowserUtils.waitForVisibility(editListSecondItem, 12);
        editListSecondItem.click();
    }

    public void verifyEditListItem() {
    BrowserUtils.wait(5);
    Assert.assertTrue(verifyEditListItem.isDisplayed());
    }

    public void clicksDeleteEditList() {
        BrowserUtils.waitForVisibility(deleteEditList, 10);
        deleteEditList.click();
    }

    public void verifyEditRemoved() {
        BrowserUtils.waitForVisibility(verifyRemovedListPopUp, 10);
        Assert.assertTrue(verifyRemovedListPopUp.isDisplayed());
    }

    public void verifyAllItemList() {
        BrowserUtils.waitForVisibility(allListAddedItem, 10);
        Assert.assertTrue(allListAddedItem.isDisplayed());
    }

    public void onTheUserPage(){
        driver.navigate().to("https://sandbox-ui.efectura.com/Enrich/Items?itemType=Asset");
    }

}
