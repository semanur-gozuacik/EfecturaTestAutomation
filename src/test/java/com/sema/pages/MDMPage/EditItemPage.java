package com.sema.pages.MDMPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.sema.utilities.BrowserUtils.isButtonActive;


public class EditItemPage extends BasePage {


    @FindBy(xpath = "//span[@id='arrowbtn-down']")
    private WebElement scrollRightButton;

    @FindBy(xpath = "//a[contains(@class,'showRuleTabLi')]")
    private WebElement ruleTab;

    @FindBy(xpath = "//span[@id='select2-association-table-IsAssociated-container']")
    private WebElement associatedFilter;

    @FindBy(xpath = "//li[contains(text(),'Yes')]")
    private WebElement associatedFilterYesOption;

    @FindBy(xpath = "//tr/td[1]/a")
    private List<WebElement> idValues;

    @FindBy(xpath = "//div[contains(@class,'accordion-title')]")
    private WebElement accordionTitle;

    @FindBy(xpath = "//button[@id='group-permissions-tableFirstPage']")
    private WebElement groupFirstPageBtn;

    @FindBy(xpath = "//button[@id='group-permissions-tableLastPage']")
    private WebElement groupLastPageBtn;

    @FindBy(xpath = "//span[@id='group-permissions-table_previous']")
    private WebElement groupPreviousPageBtn;

    @FindBy(xpath = "//span[@id='group-permissions-table_next']")
    private WebElement groupNextPageBtn;

//    @FindBy(xpath = "//a[@id='_group-permissions']")
//    private WebElement groupPermissionsTab;
//
//    @FindBy(xpath = "//a[@id='_user-permissions']")
//    private WebElement userPermissionsTab;

    @FindBy(xpath = "//ul[@class='nav nav-tabs current_nav_tabs']//li//a")
    private List<WebElement> editItemTabs;


    public void clickRuleTab() {
        BrowserUtils.wait(5);
        BrowserUtils.scrollToRightEnd(driver);
        BrowserUtils.wait(1);
        while (!BrowserUtils.isElementDisplayed(ruleTab)) {
            scrollRightButton.click();
        }
        ruleTab.click();
    }

    public static void clickRuleTab2(WebElement ruleTab, WebElement scrollRightButton) {
        while (!BrowserUtils.isElementDisplayed(ruleTab)) {
            scrollRightButton.click();
        }
        ruleTab.click();
    }

    public void goToRuleAssociationTab(String tabName) {
        BrowserUtils.wait(10);
        driver.findElement(By.xpath("//li[@data-order-code='Associations']")).click();
        driver.findElement(By.xpath("//a[@href='#AssociationTab']/text[contains(.,'" + tabName + "')]")).click();
        BrowserUtils.wait(60);
        associatedFilter.click();
        associatedFilterYesOption.click();
        BrowserUtils.wait(9);
    }

    public void closeShowcase() {
        if (!accordionTitle.getAttribute("class").contains("active")) {
            accordionTitle.click();
        }
    }

    public void clickEditItemTab(String tabName) {
        BrowserUtils.wait(5);
        for (WebElement editItemTab : editItemTabs) {
            if (editItemTab.getText().contains(tabName)) {
                editItemTab.click();
                BrowserUtils.wait(2);
            }
        }
        BrowserUtils.adjustScreenSize(75,driver);
    }

    /*
    You can write button names like these in future file:
    _next, _previous, LastPage, FirstPage
     */
    public void verifyButtonStatus(String tabName, String btnName, String btnStatus) {
        BrowserUtils.wait(40);
        WebElement btn = driver.findElement(By.id(tabName.toLowerCase() + "-permissions-table" + btnName));
        if(btnStatus.equalsIgnoreCase("Active")) {
            Assert.assertTrue(isButtonActive(btn));
        } else if (btnStatus.equalsIgnoreCase("Passive")) {
            Assert.assertFalse(isButtonActive(btn));
        }
    }

    public void clickPermissionPageBtn(String tabName, String btnName) {
        BrowserUtils.wait(6);
        WebElement btn = driver.findElement(By.id(tabName.toLowerCase() + "-permissions-table" + btnName));
        btn.click();
    }

}
