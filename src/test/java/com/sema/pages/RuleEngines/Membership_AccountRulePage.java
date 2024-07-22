package com.sema.pages.RuleEngines;

import com.sema.pages.BasePage;
import com.sema.pages.MDMPage.EditItemPage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import java.util.List;

import static com.sema.pages.MDMPage.EditItemPage.clickRuleTab2;
import static com.sema.pages.SystemPage.CurrenciesPage.*;

public class Membership_AccountRulePage extends BasePage {

    @FindBy(xpath = "//li[contains(@class,'menu-group')]")
    private List<WebElement> navBarMenuGroups;

    @FindBy(xpath = "//li[contains(@class,'menu-group')][2]/ul/li")
    private List<WebElement> mdmMenuOptions;

    @FindBy(xpath = "//li[contains(@class,'menu-group')][2]/ul/li")
    private List<WebElement> eventsMenuOptions;

    @FindBy(xpath = "//li[contains(@class,'menu-group')][2]/ul/li")
    private List<WebElement> personsMenuOptions;

    @FindBy(xpath = "//a[contains(text(),'Code')]")
    private WebElement codeFilter;
    
    @FindBy(xpath = "//input[@placeholder='Code']")
    private WebElement codeFilterInputBox;

    @FindBy(xpath = "//th")
    private WebElement overviewColumnNames;

    @FindBy(xpath = "//a[@title='Edit']")
    private WebElement editButton;

    @FindBy(xpath = "//a[text()='Similar']")
    private WebElement similarOverviewLink;

    @FindBy(xpath = "//a[contains(@class,'showRuleTabLi')]")
    private WebElement ruleTab;

    @FindBy(xpath = "//a[contains(@class,'linkAssociation')]")
    private WebElement accountAssociateTab;

    @FindBy(xpath = "//span[text()=' SelectPlaceholder']")
    private WebElement ruleAttributeDropDown;

    @FindBy(xpath = "//span/input[@role='textbox']")
    private WebElement ruleAttributeSearchInputBox;

    @FindBy(xpath = "//div[@class='rule-value-container']/input")
    private WebElement ruleAttributeValueInputBox;

    @FindBy(xpath = "//div[@class='rule-value-container']/input")
    private List<WebElement> ruleAttributeValueInputBoxes;

    @FindBy(xpath = "//button[text()='ViewList']")
    private WebElement viewListButton;

    @FindBy(xpath = "//button[contains(.,'Calculate')]")
    private WebElement calculateButton;

    @FindBy(xpath = "//select[@id='filter-InRule']")
    private WebElement inRuleFilterSelectElement;

    @FindBy(xpath = "//td[3]/input")
    private List<WebElement> checkBoxesInViewList;

    @FindBy(xpath = "//table//tr/th[text()='Label']/ancestor::table//tbody/tr/td[count(//table//tr/th[text()='Label']/preceding-sibling::th)+1]")
    private List<WebElement> labelValuesInViewList;

    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButton;

    @FindBy(xpath = "//button[contains(text(),'SetRules')]")
    private WebElement setRulesButton;

    @FindBy(xpath = "//textarea[@id='resultIn']")
    private WebElement inListTextArea;

    @FindBy(xpath = "//textarea[@id='resultNotIn']")
    private WebElement notInListTextArea;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    private WebElement continueButtonInSetRulesModal;

    @FindBy(xpath = "//select[@id='IsAssociatedassociationTable']")
    private WebElement associatedFilterSelectElement;

    @FindBy(xpath = "//a[contains(.,'Associated')]")
    private WebElement associatedFilter;

    @FindBy(xpath = "//li[contains(text(),'Yes')]")
    private WebElement associatedFilterYesOption;

    @FindBy(xpath = "//th[@aria-controls='DataTables_Table_0']")
    private List<WebElement> accountTabTableHeaders;

    @FindBy(xpath = "//tr[1]/td")
    private List<WebElement> firstRowElementsInTable;

    @FindBy(xpath = "//table//tr/th[text()='Label']/ancestor::table//tbody/tr/td[count(//table//tr/th[text()='Label']/preceding-sibling::th)+1]\n")
    private List<WebElement> labelValues;

    @FindBy(xpath = "//table//tr/th[text()='AssociationName']/ancestor::table//tbody/tr/td[count(//table//tr/th[text()='AssociationName']/preceding-sibling::th)+1]")
    private List<WebElement> assocNameValues;

    @FindBy(xpath = "//tr/td[1]/a")
    private List<WebElement> idValues;

    @FindBy(xpath = "//button[contains(text(),'DeleteAllRules')]")
    private WebElement deleteAllRulesButton;

    @FindBy(xpath = "//*[@id='delete-confirmed']/span/span[2]")
    private WebElement deleteButtonInDeleteConfirmModal;

    @FindBy(xpath = "//span/ul/li/ul/li[1]")
    private WebElement searchedRuleOption;

    @FindBy(xpath = "//button[@id='add-rule']")
    private WebElement addRuleButton;

    @FindBy(xpath = "//span[contains(text(),'Calculated User')]")
    private WebElement calculatedInfo;

    @FindBy(xpath = "//div[3]/div/div[1]/div[2]/label[2]")
    private WebElement globalOrButton;

    @FindBy(xpath = "//a[text()=' Id ']")
    private WebElement idFilter;

    @FindBy(xpath = "//input[@id='Id_from-associationTable']")
    private WebElement idFromInputBox;

    @FindBy(xpath = "//input[@id='Id_to-associationTable']")
    private WebElement idToInputBox;

    @FindBy(xpath = "//div[17]/div/div/div/div/div[1]/div/div[1]/div[1]/div/span[3]/div/a")
    private WebElement idUpdateButton;

    @FindBy(xpath = "//header[span[contains(text(),'Distributor Basis Code')]]/following-sibling::input")
    private WebElement distributorBasisCodeInputBox;

    @FindBy(xpath = "//header[span[contains(text(),'Contact Mobile')]]/following-sibling::input")
    private WebElement contactMobileInputBox;

    @FindBy(xpath = "//header[span[contains(text(),'Contact Email')]]/following-sibling::input")
    private WebElement contactEmailInputBox;

    @FindBy(xpath = "//a[contains(text(),'ACCOUNT_INFO')]")
    private WebElement accountInfoSection;

    @FindBy(xpath = "//body")
    private WebElement body;

    @FindBy(xpath = "/html/body/div[3]/div/div[8]/a")
    private WebElement scrollUpButton;

//span[contains(text(),'Unsaved Changes')]
    @FindBy(xpath = "/html/body/div[3]/div/div[6]/div[3]/div[2]/div[3]/div/div[1]/div/button[1]")
    private WebElement unsavedChangesButton;

    @FindBy(xpath = "//a[@id='savebutton']")
    private WebElement saveButtonInChangeItemModal;

    @FindBy(xpath = "//*[@id='renderBodyWrap']/div[6]/div[1]")
    private WebElement accordionButton;

    @FindBy(xpath = "//td[text()='No matching records found']")
    private WebElement noMatchingRecordsText;

    @FindBy(xpath = "//span[text()='Rule saved successfully']")
    private WebElement ruleSaveWarning;

    @FindBy(xpath = "//span[text()='All rules deleted and saved.']")
    private WebElement allRuleDeleteWarning;

    @FindBy(id = "_attributes")
    private WebElement attributesTab;

    @FindBy(xpath = "//a[contains(text(),'InRule')]")
    private WebElement inRuleFilter;

    @FindBy(xpath = "//span[@id='arrowbtn-down']")
    private WebElement scrollRightButton;

    @FindBy(xpath = "//input[@id='rule-assoc-name']")
    private WebElement ruleAssociationNameInputBox;

    @FindBy(xpath = "//input[@id='rule-random-assoc']")
    private WebElement ruleRandomAssociationNameCheckBox;




    public void goToItemOverview(String itemName) {
        for (WebElement menuGroup : navBarMenuGroups) {
            if (menuGroup.getText().equals("MDM")) {
                BrowserUtils.hoverOver(menuGroup);
                for (WebElement mdmOption : mdmMenuOptions) {
                    if (mdmOption.getText().equals(itemName)) {
                        BrowserUtils.hoverOver(mdmOption);
                        mdmOption.click();
                    }
                }
            }
            else if (menuGroup.getText().equals("Events")) {
                BrowserUtils.hoverOver(menuGroup);
                for (WebElement mdmOption : mdmMenuOptions) {
                    if (mdmOption.getText().equals(itemName)) {
                        BrowserUtils.hoverOver(mdmOption);
                        mdmOption.click();
                    }
                }
            }
            else if (menuGroup.getText().equals("Persons")) {
                BrowserUtils.hoverOver(menuGroup);
                for (WebElement mdmOption : mdmMenuOptions) {
                    if (mdmOption.getText().equals(itemName)) {
                        BrowserUtils.hoverOver(mdmOption);
                        mdmOption.click();
                    }
                }
            }
        }
    }

    public void goToItemEditPage(String itemId) {
        BrowserUtils.wait(3);
        Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + ConfigurationReader.getProperty(itemId));
        if (!accordionButton.getAttribute("class").contains("active")) {
            accordionButton.click();
        }
        BrowserUtils.wait(1);
    }

    public void goToSimilarOverview() {
        BrowserUtils.hoverOver(navBarMenuGroups.get(1));
        BrowserUtils.hoverOver(eventsMenuOptions.get(1));
//        BrowserUtils.waitForVisibility(similarOverviewLink,5);
        similarOverviewLink.click();
    }



    public void setARule() {
        BrowserUtils.waitForVisibility(ruleAttributeDropDown,10);
        ruleAttributeDropDown.click();
        BrowserUtils.wait(2);
        ruleAttributeSearchInputBox.sendKeys("First Name");
        driver.findElement(By.xpath("//li[text()='First name']")).click();
        ruleAttributeValueInputBox.sendKeys("ygcsl");
    }

    public void clickViewListButton() {
        viewListButton.click();
        BrowserUtils.wait(10);
    }

    String labelValueThatIsSetInRule;
    public void setAnItemInRuleWhichIsNotInRule() {
        BrowserUtils.wait(4);
        inRuleFilter.click();
        BrowserUtils.selectDropdownOptionByVisibleText(inRuleFilterSelectElement, "No");
        BrowserUtils.wait(2);
        inRuleFilter.click();
        checkBoxesInViewList.get(0).click();
        labelValueThatIsSetInRule = labelValuesInViewList.get(0).getText();
        saveChangesButton.click();
    }

    public void clickSetRulesButton() {
        setRulesButton.click();
        continueButtonInSetRulesModal.click();
        BrowserUtils.wait(1);
        BrowserUtils.waitForVisibility(ruleSaveWarning,18);
        BrowserUtils.wait(5);
    }

    public void verifyTheItemThatIsSetInRuleIsAppearInInList() {
        Assert.assertEquals(labelValueThatIsSetInRule, getValueInInputBox(inListTextArea));
        BrowserUtils.wait(10);
    }

    public void verifyTheItemThatIsSetInRuleIsAssociated(String tabName) {
        BrowserUtils.wait(3);
        driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]")).click();
        BrowserUtils.wait(5);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]")).click();
        BrowserUtils.wait(5);
        associatedFilter.click();
        associatedFilterYesOption.click();
        BrowserUtils.wait(3);
        Assert.assertEquals(labelValueThatIsSetInRule, labelValues.get(0).getText());
        BrowserUtils.wait(2);
    }

    public void tearDownAllChanges() {
        BrowserUtils.wait(3);
        BrowserUtils.waitForVisibility(deleteAllRulesButton,10);
        BrowserUtils.waitForClickability(deleteAllRulesButton,10);
        deleteAllRulesButton.click();
        deleteButtonInDeleteConfirmModal.click();
        BrowserUtils.waitForVisibility(allRuleDeleteWarning,10);
    }

    String numberOfCalculatedBeforeEditItem;
    public void setTwoRuleWithOrOperator() {
        BrowserUtils.wait(2);
        BrowserUtils.waitForVisibility(ruleAttributeDropDown,10);
        ruleAttributeDropDown.click();
        BrowserUtils.wait(2);
        ruleAttributeSearchInputBox.sendKeys("Distributor Basis Code");
        searchedRuleOption.click();
        ruleAttributeValueInputBox.sendKeys("TestAutomation");
        addRuleButton.click();
        globalOrButton.click();
        ruleAttributeDropDown.click();
        BrowserUtils.wait(2);
        ruleAttributeSearchInputBox.sendKeys("Distributor Basis Code");
        searchedRuleOption.click();
        BrowserUtils.wait(1);
        ruleAttributeValueInputBoxes.get(1).sendKeys("Automation");
    }


    String idOfEditedItem = "50193";
    public void editAnAccountToMeetTheRules(String attributeValueToChange) {
        driver.get(ConfigurationReader.getProperty("editItemLinkWithoutId") + idOfEditedItem);
        attributesTab.click();
        accountInfoSection.click();
        scrollBy(0,distributorBasisCodeInputBox.getLocation().getY());
        String currentDistributorBasisCodeInputBoxValue = getValueInInputBox(distributorBasisCodeInputBox);
        if (!currentDistributorBasisCodeInputBoxValue.equals(attributeValueToChange)) {
            distributorBasisCodeInputBox.clear();
            distributorBasisCodeInputBox.sendKeys(attributeValueToChange);
            scrollUpButton.click();
            BrowserUtils.wait(3);
            unsavedChangesButton.click();
            BrowserUtils.wait(2);
            saveButtonInChangeItemModal.click();
        }
        BrowserUtils.wait(4);
    }

    public static void scrollBy(int xOffset, int yOffset) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(" + xOffset + ", " + yOffset + ")");
    }

    public void verifyEditedItemIsAssociated(String tabName, String itemIdForRule) {
        driver.get(ConfigurationReader.getProperty("editItemLinkWithoutId") + ConfigurationReader.getProperty(itemIdForRule));
        driver.navigate().refresh();
        BrowserUtils.wait(16);
        driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]")).click();
        BrowserUtils.waitForVisibility(associatedFilter,30);
        associatedFilter.click();
        associatedFilterYesOption.click();
        BrowserUtils.wait(6);
        Assert.assertEquals(idOfEditedItem, idValues.get(0).getText());
    }

    public void clickCalculateButton() {
        calculateButton.click();
        BrowserUtils.waitForVisibility(calculatedInfo, 8);
        numberOfCalculatedBeforeEditItem = calculatedInfo.getText().split(" ")[0];
    }

    public void deleteItemChanges() {
        Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + idOfEditedItem);
        accountInfoSection.click();
        scrollBy(0,distributorBasisCodeInputBox.getLocation().getY());
        distributorBasisCodeInputBox.clear();
        distributorBasisCodeInputBox.sendKeys("TestAutomation");
    }
    public void verifyAssociationOfTheItemRemoved(String tabName, String itemIdForRule) {
        BrowserUtils.wait(7);
        driver.get(ConfigurationReader.getProperty("editItemLinkWithoutId") + ConfigurationReader.getProperty(itemIdForRule));
        BrowserUtils.wait(17);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]")).click();
        BrowserUtils.wait(8);
        BrowserUtils.waitForVisibility(associatedFilter,30);
        associatedFilter.click();
        associatedFilterYesOption.click();
        Assert.assertTrue(noMatchingRecordsText.isDisplayed());
    }

    public void waitForRemovingOfAssociation() {
        BrowserUtils.waitForVisibility(accountAssociateTab,8);
        Driver.getDriver().navigate().refresh();
        accountAssociateTab.click();
        BrowserUtils.waitForVisibility(associatedFilter,30);
        associatedFilter.click();
        associatedFilterYesOption.click();
        int n = 0;
        while (!noMatchingRecordsText.isDisplayed() || n != 10) {
            Driver.getDriver().navigate().refresh();
            BrowserUtils.waitForVisibility(accountAssociateTab,8);
            accountAssociateTab.click();
            BrowserUtils.waitForVisibility(associatedFilter,10);
            associatedFilter.click();
            associatedFilterYesOption.click();
            n++;
        }
    }

    String labelValueThatIsSetOutRule;
    public void setItemOutRuleWhichIsInRule() {
        BrowserUtils.wait(2);
        checkBoxesInViewList.get(0).click();
        labelValueThatIsSetOutRule = labelValuesInViewList.get(0).getText();
        BrowserUtils.wait(3);
        saveChangesButton.click();
    }

    public void verifyTheItemThatIsSetOutRuleIsAppearInInList() {
        Assert.assertTrue(getValueInInputBox(notInListTextArea).contains(labelValueThatIsSetOutRule));
    }

    public void verifyItemThatIsSetOutRuleNotAssociated(String tabName, String itemIdForRule) {
        Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + ConfigurationReader.getProperty(itemIdForRule));
        BrowserUtils.wait(5);
        driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]")).click();
        associatedFilter.click();
        associatedFilterYesOption.click();
        Assert.assertTrue(BrowserUtils.isElementDisplayed(noMatchingRecordsText));
    }

    String contactMobileValue = "5461146716";
    String contactEmailValue = "rule@rule.com";
    public void setTwoDifferentRuleWithOr() {
        BrowserUtils.waitForVisibility(ruleAttributeDropDown,10);
        ruleAttributeDropDown.click();
        BrowserUtils.wait(2);
        ruleAttributeSearchInputBox.sendKeys("Contact Mobile");
        searchedRuleOption.click();
        ruleAttributeValueInputBox.sendKeys(contactMobileValue);
        addRuleButton.click();
        BrowserUtils.wait(1);
        globalOrButton.click();
        ruleAttributeDropDown.click();
        BrowserUtils.wait(2);
        ruleAttributeSearchInputBox.sendKeys("Contact Email");
        searchedRuleOption.click();
        BrowserUtils.wait(1);
        ruleAttributeValueInputBoxes.get(1).sendKeys(contactEmailValue);
    }

    public void verifyDetailInfoForRuleOfOr(List<String> ids) {
//        List<String> idValuesAsString = getStringListFromWebElementList(ids);
        for (String id : ids) {
            Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + id);
            BrowserUtils.wait(3);
            accountInfoSection.click();
            BrowserUtils.wait(2);
            String actualContactEmail = getValueInInputBox(contactEmailInputBox);
            String actualContactMobile = getValueInInputBox(contactMobileInputBox);
            Assert.assertTrue(contactEmailValue.equals(actualContactEmail) || contactMobileValue.equals(actualContactMobile));
        }
    }

    public void verifyDetailInfoOfAssociatedItemsForOr(String tabName) {
        verifyDetailInfoForRuleOfOr(getStringListFromWebElementList(idValues));
    }

    public void setTwoDifferentRuleWithAnd() {
        BrowserUtils.waitForVisibility(ruleAttributeDropDown,10);
        ruleAttributeDropDown.click();
        BrowserUtils.wait(2);
        ruleAttributeSearchInputBox.sendKeys("Contact Mobile");
        searchedRuleOption.click();
        ruleAttributeValueInputBox.sendKeys(contactMobileValue);
        addRuleButton.click();
        ruleAttributeDropDown.click();
        BrowserUtils.wait(2);
        ruleAttributeSearchInputBox.sendKeys("Contact Email");
        searchedRuleOption.click();
        BrowserUtils.wait(1);
        ruleAttributeValueInputBoxes.get(1).sendKeys(contactEmailValue);
    }

    public void verifyDetailInfoForRuleOfAnd(List<String> ids) {
        for (String id : ids) {
            Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + id);
            BrowserUtils.wait(3);
            accountInfoSection.click();
            String actualContactEmail = getValueInInputBox(contactEmailInputBox);
            String actualContactMobile = getValueInInputBox(contactMobileInputBox);
            Assert.assertTrue(contactEmailValue.equals(actualContactEmail) && contactMobileValue.equals(actualContactMobile));
        }
    }

    public void verifyDetailInfoOfAssociatedItemsForAnd() {
        verifyDetailInfoForRuleOfAnd(getStringListFromWebElementList(idValues));
    }

    public void deleteAllRulesIfAnyExists() {
        BrowserUtils.wait(5);
        if (deleteAllRulesButton.isEnabled()) {
            deleteAllRulesButton.click();
            deleteButtonInDeleteConfirmModal.click();
            BrowserUtils.waitForVisibility(allRuleDeleteWarning,10);
            driver.navigate().refresh();
            clickRuleTab2(ruleTab,scrollRightButton);
            BrowserUtils.wait(1);
            if (!accordionButton.getAttribute("class").contains("active")) {
                accordionButton.click();
            }
        }
    }

    public void clickSetRulesButtonWithAssociationName(String assocName) {
        setRulesButton.click();
        ruleAssociationNameInputBox.sendKeys(assocName);
        continueButtonInSetRulesModal.click();
        BrowserUtils.wait(1);
        BrowserUtils.waitForVisibility(ruleSaveWarning,18);
        BrowserUtils.wait(5);
    }

    public void verifyAssociatedItemHasAssociationName(String expectedAssocName) {
        BrowserUtils.wait(5);
        for (WebElement assocNameValue : assocNameValues) {
            Assert.assertEquals(expectedAssocName,assocNameValue.getText());
        }
    }

    public void clickSetRulesButtonWithRandomAssociationName() {
        setRulesButton.click();
        ruleRandomAssociationNameCheckBox.click();
        continueButtonInSetRulesModal.click();
        BrowserUtils.wait(1);
        BrowserUtils.waitForVisibility(ruleSaveWarning,18);
        BrowserUtils.wait(5);
    }
}
