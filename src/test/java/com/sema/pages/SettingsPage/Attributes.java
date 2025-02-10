package com.sema.pages.SettingsPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Attributes extends BasePage {
    @FindBy(id = "attributesid")
    private WebElement attributesElement;
    @FindBy(xpath = "//a[normalize-space()='Attributes Overview']")
    private WebElement attrbutesPageVerificationsElement;
    @FindBy(xpath = "//a[@title='Edit Attribute']")
    private WebElement editButton;
    @FindBy(name = "attributes_table_length")
    private WebElement entrieNumber;
    @FindBy(xpath = "//a[@class='filter-toggle-attributes_table filter-toggle']")
    private List<WebElement> attributes;
    @FindBy(xpath = "//input[@id='Code-attributes_table']")
    private WebElement codeField;
    @FindBy(xpath = "//a[normalize-space()='Properties']")
    private WebElement propertiesTab;
    @FindBy(xpath = "//input[@id='en-US']")
    private WebElement transactionsUS;
    @FindBy(xpath = "//a[@id='linkProperty']")
    private WebElement generalPropertiesTab;
    @FindBy(xpath = "//a[@id='linkRules']")
    private WebElement validation_Rules;
    @FindBy(xpath = "//a[@id='_history']")
    private WebElement historyTab;
    @FindBy(xpath = "//span[@class='iconbtn iconbtn-green rrbutton reset-history-table']//span[@class='icon']")
    private WebElement resetButtonEditAttribute;
    @FindBy(xpath = "//select[@name='history_table_Attribute_length']")
    private WebElement showEntriesAttribute;
    public Attributes() {
    }

    public void clickAttributeElement() {
        BrowserUtils.waitForVisibility(attributesElement, 20);
        attributesElement.click();
    }

    public void verifyFamilyPage() {
        BrowserUtils.waitForVisibility(attrbutesPageVerificationsElement, 25);
        Assert.assertTrue(attrbutesPageVerificationsElement.isDisplayed());
    }

    public void clickEditButton() {
        BrowserUtils.wait(6);
        editButton.click();
    }

    public void selectEntrie(String entrie) {
        BrowserUtils.selectOption(entrieNumber, entrie);
    }

    public void verifySelectOption(String entrie) {
        BrowserUtils.wait(5);
        Assert.assertTrue(BrowserUtils.isOptionSelected(entrieNumber, entrie));

    }

    public void onTheAttributeSettingPage() {
        driver.navigate().to("https://sandbox-ui.efectura.com/Settings/Attributes");
    }

    public void clickAttribute(String attribute) {
        for (int i = 0; i < attributes.size(); i++) {
            System.out.println(attributes.get(i).getText());
            if (attributes.get(i).getText().contains(attribute)) {
                attributes.get(i).click();
                break;
            }

        }

    }

    public void setCodeField(String code) {
        BrowserUtils.waitForVisibility(codeField, 30);
        codeField.click();
        codeField.sendKeys(code);
    }

    public void verifyResetButton() {
        BrowserUtils.wait(5);
        Assert.assertTrue(codeField.getAttribute("placeholder").contains("Code"));

    }

    public void clickPropertiesTransactionTab() {
        BrowserUtils.wait(5);
        propertiesTab.click();
        Assert.assertTrue(attrbutesPageVerificationsElement.isDisplayed());
    }
    public void generalPropertiesTab() {
        BrowserUtils.wait(5);
        generalPropertiesTab.click();
        Assert.assertTrue(generalPropertiesTab.isDisplayed());
    }
    public void Validation_Rules() {
        BrowserUtils.wait(5);
        validation_Rules.click();
        Assert.assertTrue(validation_Rules.isDisplayed());
    }
    public void setHistoryTab() {
        BrowserUtils.wait(5);
        historyTab.click();
        BrowserUtils.wait(5);
    }
    public void setResetButtonEditAttribute() {
        BrowserUtils.wait(5);
        resetButtonEditAttribute.click();
        BrowserUtils.wait(5);
    }
    public void showEntriesAttribute(String entrie){
        BrowserUtils.selectOption(showEntriesAttribute,entrie);
    }
    public void verifySelectOptionAttribute(String entrie){
        BrowserUtils.wait(5);
        assertTrue(BrowserUtils.isOptionSelected(showEntriesAttribute, entrie));

    }
}
