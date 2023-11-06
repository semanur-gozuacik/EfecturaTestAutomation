package com.sema.pages.MDMPage.AssetManagement;

import com.sema.pages.BasePage;
import com.sema.stepDefs.BaseStep;
import com.sema.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
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
    @FindBy(xpath = "//button[@id='firtPageTableGroup']")
    private WebElement leftPreviousPage;
    @FindBy(xpath = "//span[@id='group-permissions-table_previous']")
    private WebElement previousPage;
    @FindBy(xpath = "//span[@id='group-permissions-table_next']")
    private WebElement nextPage;
    @FindBy(xpath = "//div[@class='custom-button-right groupPermissions custom-button-page']")
    private WebElement lastPage;
    @FindBy(xpath = "//input[@class='pagination-text']")
    private WebElement lastPageVerificationText;
    @FindBy(xpath = "//a[@id='_user-permissions']")
    private WebElement userPermissions;

    public void clickListDropDown() {
        BrowserUtils.waitForVisibility(listDropDownButton, 20);
        listDropDownButton.click();
    }

    public void clickListItem() {
        BrowserUtils.waitForVisibility(editListItem, 20);
        editListItem.click();
    }

    public void clickListSecondItem() {
        BrowserUtils.waitForVisibility(editListSecondItem, 20);
        editListSecondItem.click();
    }

    public void verifyEditListItem() {
        BrowserUtils.waitForVisibility(verifyEditListItem, 20);
        Assert.assertTrue(verifyEditListItem.isDisplayed());
    }

    public void clicksDeleteEditList() {
        BrowserUtils.waitForVisibility(deleteEditList, 20);
        deleteEditList.click();
    }

    public void verifyEditRemoved() {
        BrowserUtils.waitForVisibility(verifyRemovedListPopUp, 20);
        Assert.assertTrue(verifyRemovedListPopUp.isDisplayed());
    }

    public void verifyAllItemList() {
        BrowserUtils.waitForVisibility(allListAddedItem, 20);
        Assert.assertTrue(allListAddedItem.isDisplayed());
    }

    public void clickGroupPermission() {
        BrowserUtils.waitForVisibility(groupPermissions, 20);
        groupPermissions.click();
    }

    public void verifyLeftPreviousePageIsNotClicible() {
        String classAttribute = leftPreviousPage.getAttribute("class");
        Assert.assertTrue(classAttribute.contains("disabled"));
    }

    public void verifyPreviousePageIsNotClicible() {
        String classAttribute = previousPage.getAttribute("class");
        Assert.assertTrue(classAttribute.contains("disabled"));
    }

    public void clicksNextPageButton() {
        BrowserUtils.wait(5);
        nextPage.click();
    }

    public void verifyNextPageIsNotClicible() {
        String classAttribute = nextPage.getAttribute("class");
        Assert.assertTrue(classAttribute.contains("disabled"));
    }

    public void clickPreviousPageButton() {
        BrowserUtils.waitForVisibility(previousPage,20);
        previousPage.click();
    }

    public void verifyPreviousPageIsClickable() {
        BrowserUtils.wait(5);
        String classAttribute = previousPage.getAttribute("class");
        Assert.assertTrue(!classAttribute.contains("disabled"));
    }

    public void clickLastPageButton() {
      BrowserUtils.wait(5);
        lastPage.click();
    }

    public void verifyLastPageIsClickable() {
        BrowserUtils.wait(2);
        Assert.assertTrue(!lastPageVerificationText.getText().equalsIgnoreCase("1"));
    }

    public void verifyLastPageIsUnClickable() {
        BrowserUtils.wait(5);
        Assert.assertTrue(!lastPageVerificationText.getText().equalsIgnoreCase("1"));  }

    public void verifyNextPageIsClickable() {
        BrowserUtils.wait(2);
        String classAttribute = nextPage.getAttribute("class");
        Assert.assertTrue(!classAttribute.contains("disabled"));
    }

    public void verifyFirstPageIsClickable() {
        BrowserUtils.wait(5);
        String classAttribute = leftPreviousPage.getAttribute("class");
        Assert.assertTrue(!classAttribute.contains("disabled"));
    }

    public void clickUserPermission() {
        BrowserUtils.waitForVisibility(userPermissions, 20);
        userPermissions.click();
    }
}
