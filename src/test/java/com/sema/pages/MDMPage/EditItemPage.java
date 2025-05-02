package com.sema.pages.MDMPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static com.sema.utilities.BrowserUtils.isButtonActive;


@Getter
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

    @FindBy(xpath = "//table[@id='association-table']/thead/tr[1]/th")
    private List<WebElement> assocTabTableHeaders;

    //table[@id='association-table']/thead/tr[2]/th/div/input   id'ler için

    @FindBy(xpath = "//table[@id='association-table']/thead/tr[2]/th")
    private List<WebElement> assocTabFilters;

    @FindBy(xpath = "//ul[@class='nav nav-tabs current_nav_tabs']//li//a")
    private List<WebElement> editItemTabs;

    @FindBy(xpath = "//*[@id='association-table']/tbody/tr/td/input")
    private List<WebElement> associateCheckBoxes;

    @FindBy(xpath = "//div[@id='saveChangeButton']")
    private WebElement saveChangesBtn;

    @FindBy(xpath = "//textarea[@id='comment']")
    private WebElement saveCommentTextarea;

    @FindBy(xpath = "//button[@id='floatingSaveButton']")
    private WebElement saveButtonInSaveChanges;

    @FindBy(xpath = "/html/body/div[7]/div/div[1]/div[2]")
    private WebElement infoMessage;

    @FindBy(xpath = "//*[@id='association-table']/tbody/tr/td[4]/div")
    private List<WebElement> isAssociatedValues;

    @FindBy(id = "association-table")
    private WebElement associationTable;

    @FindBy(xpath = "//div[3]/div/div/div[1]/h4[contains(text(),'Column Selection')]")
    private WebElement associationTableColumnsBtn;


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

    public static List<String> getStringListFromWebElementList(List<WebElement> webElementList) {
        List<String> stringList = new ArrayList<>();
        BrowserUtils.wait(2);
        for (WebElement element : webElementList) {
            stringList.add(element.getText().toLowerCase());
        }
        return stringList;
    }

    // you can use selectFilter as IsAssociated, Family, ItemStatuses in feature file
    public void selectOptionInSelectFilter(String selectOption, String selectFilter) {

        WebElement selectElement = driver.findElement(By.xpath("//select[contains(@id,'-" + selectFilter + "')]"));
        BrowserUtils.selectDropdownOptionByVisibleText(selectElement,selectOption);

    }
}
