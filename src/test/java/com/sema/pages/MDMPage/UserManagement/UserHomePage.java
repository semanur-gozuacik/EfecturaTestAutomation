package com.sema.pages.MDMPage.UserManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserHomePage extends BasePage {
    @FindBy(xpath = "//a[normalize-space()='Label']")
    private WebElement labelFilter;
    @FindBy(xpath = "//input[@id='Label-associationTable']")
    private WebElement labelFilterSendKey;
    @FindBy(xpath = "//tbody/tr/td[6]")
    private List<WebElement> labelVerifies;
    @FindBy(xpath = "//span[@class='iconbtn iconbtn-green rrbutton reset_filter-new']//i[@class='fa fa-undo']")
    private WebElement resetButton;
    @FindBy(xpath = "//span[@class='iconbtn iconbtn-green rrbutton refresh']//span[@class='icon']")
    private WebElement refreshButton;
    @FindBy(xpath = "//span[@id='select2-filter-Family-container']")
    private WebElement familyFilter;
    @FindBy(xpath = "//li[contains(text(),'NEXIO') and @role='treeitem']")
    private WebElement NEXIOFamilyFılter;
    @FindBy(xpath = "//li[contains(text(),'DEF_ACCOUNT') and @role='treeitem']")
    private WebElement DEF_ACCOUNTFamilyFılter;
    @FindBy(xpath = "//li[contains(text(),'HOSPITALITY') and @role='treeitem']")
    private WebElement HOSPITALITYFamilyFılter;
    @FindBy(xpath = "//div[contains(@id,'ItemStatuses')]/a[contains(text(),'ItemStatuses')]")
    private WebElement statusFilter;
    @FindBy(xpath = "//li[contains(text(),'Active') and @role='treeitem']")
    private WebElement enabledStatusFilter;
    @FindBy(xpath = "//li[contains(text(),'Passive') and @role='treeitem']")
    private WebElement disabledStatusFilter;
    @FindBy(xpath = "//span[contains(text(),'Columns')]")
    private WebElement columnsButton;
    @FindBy(xpath = "//span[normalize-space()='SELECTED COLUMNS']")
    private WebElement selectedColumns;
    @FindBy(xpath = "//button[@id='cancelColumn']")
    private WebElement columnsCancelButton;
    @FindBy(xpath = "//button[@id='EfSaveColumns']")
    private WebElement columnsSaveButton;
    @FindBy(xpath = "//span[@class='text clear-btn']")
    private WebElement defaultColumnsButton;

    public UserHomePage() {
    }

    public void onTheUserPage() {
        driver.navigate().to("https://sandbox-ui.efectura.com/Enrich/Items?itemType=MRP");
    }

    public void validLabelFilter(String validLabel) {
        BrowserUtils.wait(5);
        labelFilter.click();
        labelFilterSendKey.sendKeys(validLabel);
        labelFilterSendKey.sendKeys(Keys.ENTER);

    }

    public void inValidLabelFilter(String invalidLabel) {
        labelFilter.sendKeys(invalidLabel);
        labelFilter.sendKeys(Keys.ENTER);

    }

    public void verifiesLabelIsDisplayed() {
        BrowserUtils.wait(5);
        Assert.assertTrue(labelVerifies.size() == 1);

    }

    public void verifiesLabelIsNotDisplayed() {
        BrowserUtils.wait(5);
        Assert.assertTrue(labelVerifies.size() == 0);
    }

    public void selectNEXIOFamilyFilter() {
        BrowserUtils.wait(10);
        familyFilter.click();
        BrowserUtils.wait(10);
        NEXIOFamilyFılter.click();
    }

    public void selectDEF_ACCOUNTFamilyFilter() {
        BrowserUtils.wait(10);
        familyFilter.click();
        BrowserUtils.wait(10);
        DEF_ACCOUNTFamilyFılter.click();
    }

    public void selectHOSPITALITYFamilyFilter() {
        BrowserUtils.wait(10);
        familyFilter.click();
        BrowserUtils.wait(10);
        HOSPITALITYFamilyFılter.click();
    }

    public void selectFamily(String family) {
        if (family.startsWith("NE")) {
            selectNEXIOFamilyFilter();
        } else if (family.startsWith("DEF")) {
            selectDEF_ACCOUNTFamilyFilter();

        } else {
            selectHOSPITALITYFamilyFilter();
        }
    }

    public void selectStatus(String status) {
        BrowserUtils.wait(7);
        statusFilter.click();
        if (status.startsWith("Active")) {
            selectEnabled();

        } else {
            selectDisabled();

        }
    }

    public void selectEnabled() {
        BrowserUtils.wait(10);
        enabledStatusFilter.click();
    }

    public void selectDisabled() {
        BrowserUtils.wait(5);
        disabledStatusFilter.click();
    }

    public void clickResetButton() {
        BrowserUtils.wait(2);
        resetButton.click();

    }

    public void clickRefresgButton() {
        BrowserUtils.wait(2);
        refreshButton.click();

    }

    public void columnsButton() {
        BrowserUtils.wait(4);
        columnsButton.click();

    }

    public void setSelectedColumns() {
        BrowserUtils.wait(5);
        selectedColumns.isDisplayed();

    }

    public void setColumnsCancelButton() {
        BrowserUtils.wait(5);
        columnsCancelButton.isDisplayed();

    }

    public void setColumnsSaveButton() {
        BrowserUtils.wait(5);
        columnsSaveButton.isDisplayed();

    }

    public void setDefaultColumnsButton() {
        BrowserUtils.wait(5);
        defaultColumnsButton.isDisplayed();

    }

    public void getData() {
        WebElement nextPageBtn = driver.findElement(By.id("items_next"));


        List<String> codeValues = getColumnData(itemOverviewTable, "CODE");
        List<String> labelValues = getColumnData(itemOverviewTable, "LABEL");
        Map<String, String> codeLabel = new HashMap<>();

        for (int i = 0; i < codeValues.size(); i++) {
            codeLabel.put(codeValues.get(i), labelValues.get(i));
        }

        if (BrowserUtils.isButtonActive(nextPageBtn)) {
            nextPageBtn.click();
        }

        codeLabel.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}
