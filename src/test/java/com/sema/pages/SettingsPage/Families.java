package com.sema.pages.SettingsPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class Families extends BasePage {
    @FindBy(xpath = "//a[normalize-space()='Families Overview']")
    private WebElement familiesPageVerificationsElement;
    @FindBy(xpath = "//input[@id='code']")
    private WebElement codeField;
    @FindBy(xpath = "//a[normalize-space()='Code']//*[name()='svg']")
    private WebElement codeFieldFamilies;
    @FindBy(xpath = "//input[@id='code-families_table']")
    private WebElement codeFieldFamiliesText;
    @FindBy(xpath = "//input[@id='code']")
    private WebElement showentries;
    @FindBy(name = "families_table_length")
    private WebElement entrieNumber;
    @FindBy(xpath = "//button[@id='families_tableFirstPage']")
    private WebElement firstPageButton;
    @FindBy(xpath = "//button[@id='families_tableFirstPage']")
    private WebElement previousPageButton;
    @FindBy(xpath = "//button[@id='families_tableLastPage']")
    private WebElement lastPageButton;
    @FindBy(xpath = "//span[@id='families_table_next']")
    private WebElement nextPageButton;
    public Families() {
    }
public void verifyFamilyPage(){
    BrowserUtils.waitForVisibility(familiesPageVerificationsElement,20);
    assertTrue(familiesPageVerificationsElement.isDisplayed());
}
public void setCodeField(String code){
        BrowserUtils.waitForVisibility(codeField,20);
        codeField.click();
        codeField.sendKeys(code);
}
    public void setcodeFieldFamilies(String code){
        BrowserUtils.waitForVisibility(codeFieldFamilies,20);
        BrowserUtils.wait(5);
        codeFieldFamilies.click();
        codeFieldFamiliesText.click();
        codeFieldFamiliesText.sendKeys(code);
    }
    public void verifyResetButton() {
        BrowserUtils.wait(5);
     Assert.assertTrue(codeFieldFamiliesText.getAttribute("placeholder").contains("Code"));

    }
public void clickShowEntries(){
        showentries.click();
}

    public void verifyFirstPageButtonUnClickable() {
        BrowserUtils.wait(5);
        String classes = firstPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertTrue(isDisabled);
    }
    public void verifyFirstPageButtonClickable() {
        BrowserUtils.wait(5);
        String classes = firstPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(isDisabled);
    }
    public void verifyPreviousPageButtonUnClickable() {
        BrowserUtils.wait(5);
        String classes = previousPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertTrue(isDisabled);
    }
    public void verifyPreviousPageButtonClickable() {
        BrowserUtils.wait(5);
        String classes = previousPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(isDisabled);
    }
    public void verifyNextPageButtonUnClickable() {
        BrowserUtils.wait(5);
        String classes = nextPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertTrue(isDisabled);
    }
    public void verifyNextPageButtonClickable() {
        BrowserUtils.wait(5);
        String classes = nextPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(isDisabled);
    }
    public void clickLastPage(){
        BrowserUtils.waitForVisibility(lastPageButton,20);
        lastPageButton.click();
    }
    public void verifyLastPageButtonUnClickable() {
        BrowserUtils.wait(5);
        String classes = lastPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertTrue(isDisabled);
    }
    public void verifyLastPageButtonClickable() {
        BrowserUtils.wait(5);
        String classes = lastPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(isDisabled);
    }  public void onTheFamiliesSettingPage(){
        driver.navigate().to("https://sandbox-ui.efectura.com/Settings/Families");
    }
}

