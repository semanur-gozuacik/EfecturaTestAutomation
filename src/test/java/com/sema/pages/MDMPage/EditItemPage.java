package com.sema.pages.MDMPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


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
}
