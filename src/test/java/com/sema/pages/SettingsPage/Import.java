package com.sema.pages.SettingsPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.Driver;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.sema.pages.SettingsPage.TagsPage.isRowCountCorrectAccordingToTableLength;
import static com.sema.pages.SettingsPage.TagsPage.selectLengthFromTableLength;
import static com.sema.utilities.CommonExcelReader.*;

public class Import extends BasePage {

    SoftAssertions softAssertions = new SoftAssertions();

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement popUpOkButton;

    @FindBy(xpath = "//a[normalize-space()='Import Overview']")
    private WebElement importPageVerificationsElement;

    @FindBy(xpath = "//label/select")
    private WebElement tableLengthSelectDropdown;

    @FindBy(xpath = "//div[contains(text(),'Showing')]")
    private WebElement tableInfo;

    @FindBy(xpath = "//tr/td[1]")
    private List<WebElement> nameValues;

    @FindBy(xpath = "//a[contains(text(),'Name')]")
    private WebElement nameFilter;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement nameFilterInputBox;

    @FindBy(xpath = "//a[contains(text(),'SelectStatus')]")
    private WebElement selectStatusFilter;

    @FindBy(xpath = "//select[@id='StatusNamefiles']")
    private WebElement selectStatusSelectElement;

    @FindBy(xpath = "//tr/td[4]/div")
    private List<WebElement> statusValues;

    @FindBy(id = "addcsvfile")
    private WebElement addCsvInputElement;

    @FindBy(xpath = "//span[text()='Select import type']")
    private WebElement selectImportTypeElement;

    @FindBy(xpath = "//span/span/span[1]/input")
    private WebElement selectImportTypeInputBox;

    @FindBy(xpath = "//li[contains(text(),'AccountCallback')]")
    private WebElement accountCallbackOption;

    @FindBy(xpath = "//li[contains(text(),'ResourceTranslations')]")
    private WebElement resourceTranslationsOption;

    @FindBy(xpath = "//button[contains(text(),'Save Changes')]")
    private WebElement saveChangesButtonInAreYouSureModal;

    @FindBy(id = "approve-import")
    private WebElement approveButton;

    @FindBy(xpath = "//span[contains(text(),'Import')]")
    private WebElement importButton;

    @FindBy(id = "GetAccountCallbackHistory_tab")
    private WebElement pointHistoryTab;

    @FindBy(xpath = "//tr/td[7]")
    private List<WebElement> taskNameValues;

    @FindBy(xpath = "//tr/td[9]")
    private List<WebElement> callbackTypeValues;

    @FindBy(xpath = "//tr/td[4]")
    private List<WebElement> pointValues;

    @FindBy(xpath = "//tr/td[13]")
    private List<WebElement> callbackStatusValues;

    @FindBy(xpath = "//a[contains(text(),'Task Name')]")
    private WebElement taskNameFilter;

    @FindBy(xpath = "//input[contains(@placeholder,'Task Name')]")
    private WebElement taskNameFilterInputBox;

    @FindBy(xpath = "//a[contains(text(),'Code')]")
    private WebElement codeFilter;

    @FindBy(xpath = "//input[@placeholder='Code']")
    private WebElement codeFilterInputBox;

    @FindBy(xpath = "//tr/td[1]")
    private WebElement resourceCodeValue;

    @FindBy(xpath = "//tr/td/a")
    private WebElement resourceDeleteButton;

    @FindBy(xpath = "//button[contains(@id,'delete-confirmedResources')]")
    private WebElement deleteResourceButtonInDeleteResourceModal;

    @FindBy(xpath = "//ul[@id='select2-ItemType-results']/li")
    private List<WebElement> filteredImportTypeOptions;

    @FindBy(xpath = "//a[starts-with(text(),'Code')]")
    private WebElement itemOverviewCodeFilter;

    @FindBy(xpath = "//input[@id='filter-SKU']")
    private WebElement itemOverviewCodeFilterInputBox;

    @FindBy(xpath = "//tr/th")
    private List<WebElement> overviewTableHeaders;

    @FindBy(xpath = "//tr[1]/td")
    private List<WebElement> firstRowOfContactOverviewTableValues;

    @FindBy(xpath = "//a[@title='Edit']")
    private WebElement itemOverviewTableValueEditButton;

    @FindBy(xpath = "//a[contains(@class,'t-delete danger-btn')]")
    private WebElement itemOverviewTableValueDeleteButton;

    @FindBy(xpath = "//a[contains(text(),'ACCOUNT_CONTACT')]")
    private WebElement accountContactTabInContactEditItem;

    @FindBy(xpath = "//a[contains(text(),'Account MRP')]")
    private WebElement accountMrpTabInAccountEditItem;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/thead/tr/th")
    private List<WebElement> editItemAssociationTabsTableHeaders;

    @FindBy(xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td")
    private List<WebElement> firstRowOfEditItemAssociatedTabTableValues;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchButton;

    @FindBy(xpath = "//span[contains(text(),'Refresh')]")
    private WebElement refreshButton;

    @FindBy(xpath = "(//input[@id='userselect'])[1]")
    private WebElement associationTabsFirstRowCheckBox;

    @FindBy(xpath = "//span[contains(text(),'Unsaved Changes')]")
    private WebElement unsavedChangesButton;

    @FindBy(xpath = "//a[@id='savebutton']")
    private WebElement saveButtonInChangeItemModal;

    @FindBy(xpath = "//button[@id='deletItemButton']")
    private WebElement editItemDeleteButton;

    @FindBy(xpath = "//button[@id='removeItemBtn']")
    private WebElement deleteButtonInAreYouSureModal;

    @FindBy(xpath = "//button[@id='deleteItemPopup']")
    private WebElement deleteButtonInOverviewDeleteConfirmationModal;

    @FindBy(xpath = "//div[contains(@class,'associationsLinksNav')]/ul/li/a")
    private List<WebElement> editItemTabs;

    @FindBy(xpath = "//tr/td[1]")
    private List<WebElement> codeValues;

    @FindBy(xpath = "//tr/td[3]")
    private List<WebElement> attributesTypeValues;

    @FindBy(xpath = "//tr/td/a[2]")
    private List<WebElement> deleteButtons;

    @FindBy(xpath = "//button[contains(@class,'delete-confirmed')]")
    private WebElement deleteButtonInModalInAttributes;

    @FindBy(xpath = "//a[@title='Edit Attribute']")
    private List<WebElement> attributeEditButtons;

    @FindBy(xpath = "//a[text()='Values']")
    private WebElement attributeValuesTab;

    @FindBy(xpath = "//input[contains(@class,'o-code input-options-attr')]")
    private List<WebElement> selectAttributeOptionsCodeValues;




    public static String generateRandomImportDescription() {
        int length = 10;
        String characters = "ABCDEFGHJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder stringBuilder = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }

    public static String generateRandomSkuWithNumbers() {
        int length = 10;
        String characters = "0123456789";
        StringBuilder stringBuilder = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }


    public String getValueOfTableInContactOverview(String headerName) {
        int i = 0;
        for (i = 0; i < overviewTableHeaders.size(); i++) {
            if (overviewTableHeaders.get(i).getText().equals(headerName)) {
                break;
            }
        }
        return firstRowOfContactOverviewTableValues.get(i).getText();
    }

    public String getValueOfTableInEditItem(String headerName) {
        int j = 0;
        for (int i = 1; i < editItemAssociationTabsTableHeaders.size(); i++) {
            if (i == 2) {
                continue;
            }
            if (editItemAssociationTabsTableHeaders.get(i).getText().equals(headerName)) {
                j = i;
                break;
            }
        }
        return firstRowOfEditItemAssociatedTabTableValues.get(j).getText();
    }


    public void onTheImportSettingPage() {
        driver.navigate().to("https://sandbox-ui.efectura.com/Import");
    }

    public void acceptPopUpElement() {
        popUpOkButton.click();
    }

    public void verifyImportPage() {
        BrowserUtils.waitForVisibility(importPageVerificationsElement, 20);
        Assert.assertTrue(importPageVerificationsElement.isDisplayed());
    }

    public void selectLengthFromTableLengthInImportPage(String length) {
        selectLengthFromTableLength(tableLengthSelectDropdown,length);
    }

    public void verifyTableContainsRightRowsAccordingToLength(String length) {
        Assert.assertTrue(isRowCountCorrectAccordingToTableLength(tableInfo,length));
    }

    public void clickNameFilter() {
        nameFilter.click();
    }

    public void enterInputToNameFilter(String input) {
        nameFilterInputBox.sendKeys(input);
        BrowserUtils.wait(2);
    }

    public void verifyNameFilterResultsAreCorrect(String searchedValue) {
        BrowserUtils.wait(2);
        for (WebElement value : nameValues) {
            Assert.assertTrue(value.getText().toLowerCase().contains(searchedValue.toLowerCase()));
        }
    }

    public void selectStatusOption(String option) {
        selectStatusFilter.click();
        BrowserUtils.selectDropdownOptionByVisibleText(selectStatusSelectElement,option);
        BrowserUtils.wait(2);
    }

    public void verifyStatusFilterResultAreCorrect(String selectedOption) {
        for (WebElement status : statusValues) {
            Assert.assertEquals(selectedOption, status.getText());
        }
    }

    String newDescription;
    public void updateExcel(String point, String endDate) throws IOException {
        newDescription = generateRandomImportDescription();
        updateCellValue(accountCallbackExcel,"Description", 1,newDescription);
        updateCellValue(accountCallbackExcel,"Point", 1,point);
        updateCellValue(accountCallbackExcel,"DateEnd",1,endDate);
    }

    public void approveImport() {
        //BrowserUtils.wait(5);
        BrowserUtils.waitForVisibility(approveButton,10);
        approveButton.click();
    }

    public void verifyOneEarningIsAddedToPointHistory() {
        Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + "6516");
        pointHistoryTab.click();
        BrowserUtils.wait(2);
        taskNameFilter.click();
        BrowserUtils.wait(1);
        taskNameFilterInputBox.sendKeys(newDescription);
        BrowserUtils.wait(3);
        Assert.assertEquals(1,taskNameValues.size());
    }

    public void updateExcelWithTransActionType(String transactionType) throws IOException {
        updateCellValue(accountCallbackExcel,"TransactionType",1,transactionType);
    }

    public void updateExcelWithTaskId(String taskId) throws IOException {
        updateCellValue(accountCallbackExcel,"TaskId",1,taskId);
    }

    public void importTheImport() {
        BrowserUtils.wait(2);
        BrowserUtils.waitForVisibility(importButton,10);
        importButton.click();
        BrowserUtils.wait(4);
    }

    public void verifyTheResourceIsAddedToResources(String fileName) throws IOException {
        BrowserUtils.wait(1);
        Driver.getDriver().get(ConfigurationReader.getProperty("sbLink") + "Resources");
        String resourceCode = getCellValue(getExcelPath(fileName),"Code",1);
        codeFilter.click();
        codeFilterInputBox.sendKeys(resourceCode);
        BrowserUtils.wait(5);
        Assert.assertEquals(resourceCode,resourceCodeValue.getText());
    }

    public void tearDownChangesInResources() {
        resourceDeleteButton.click();
        BrowserUtils.waitForVisibility(deleteResourceButtonInDeleteResourceModal,10);
        deleteResourceButtonInDeleteResourceModal.click();
        BrowserUtils.wait(2);
    }


    public void selectImportType(String importType) {
        BrowserUtils.wait(3);
        selectImportTypeElement.click();
        selectImportTypeInputBox.sendKeys(importType);
        BrowserUtils.wait(1);
        for (WebElement option : filteredImportTypeOptions) {
            if (option.getText().equals(importType)) {
                option.click();
                break;
            }
        }
    }

    public void verifyItemIsCreated(String importType) throws IOException {
        BrowserUtils.wait(2);
        Driver.getDriver().get(ConfigurationReader.getProperty("itemLinkWithoutItemName") + importType);
        String itemCode = getCellValue(getExcelPath(importType),"SKU",1);

        itemOverviewCodeFilter.click();
        itemOverviewCodeFilterInputBox.sendKeys(itemCode);
        searchButton.click();
        BrowserUtils.wait(5);
//        refreshButton.click();
        Assert.assertEquals(itemCode, getValueOfTableInContactOverview("CODE"));
    }

    public void verifyThatContactIsAssociatedWithStatedAccount(String itemType) throws IOException {
        itemOverviewTableValueEditButton.click();
        accountContactTabInContactEditItem.click();
        String expectedAccountNumber = getCellValue(getExcelPath(itemType),"Account Number",1);
        String actualAssociatedValue = getValueOfTableInEditItem("ASSOCIATED");
        Boolean isAccount = expectedAccountNumber.equals(getValueOfTableInEditItem("CODE"));
        Boolean isAccountAssociated = actualAssociatedValue.equals("Yes");

//        Assert.assertEquals(expectedAccountNumber,getValueOfTableInEditItem("CODE"));
        Assert.assertTrue(isAccount && isAccountAssociated);
    }

    public void tearDownAllChangesInContactCase() {
        associationTabsFirstRowCheckBox.click();
        unsavedChangesButton.click();
        saveButtonInChangeItemModal.click();
        BrowserUtils.wait(2);
//        driver.navigate().refresh();
//        BrowserUtils.wait(2);
//        editItemDeleteButton.click();
//        deleteButtonInAreYouSureModal.click();
//        BrowserUtils.wait(2);
    }

    public void tearDownAllChangesInAccountCase() {
        itemOverviewTableValueDeleteButton.click();
        deleteButtonInOverviewDeleteConfirmationModal.click();
    }

    public void verifyTheAccountIsAssociatedWithTheMrp(String item1, String item2) throws IOException {
        Driver.getDriver().get(ConfigurationReader.getProperty("itemLinkWithoutItemName") + item1);
        String SKUItem1 = getCellValue(getExcelPath("Association"),"SKUItem1",1);
        String SKUItem2 = getCellValue(getExcelPath("Association"),"SKUItem2",1);
        itemOverviewCodeFilter.click();
        itemOverviewCodeFilterInputBox.sendKeys(SKUItem1);
        searchButton.click();
        BrowserUtils.wait(5);
//        overviewTableHeaders.stream().filter(e -> e.getText().contains("CODE")).findFirst().ifPresent(WebElement::click);
        BrowserUtils.wait(5);
        itemOverviewTableValueEditButton.click();
        editItemTabs.stream().filter(e -> e.getText().contains(item2)).findFirst().ifPresent(WebElement::click);
        BrowserUtils.wait(3);
        String actualAssociatedValue = getValueOfTableInEditItem("ASSOCIATED");

        Boolean isAccount = SKUItem2.equals(getValueOfTableInEditItem("CODE"));
        Boolean isAccountAssociated = actualAssociatedValue.equals("Yes");

        Assert.assertTrue(isAccount && isAccountAssociated);

    }

    public void tearDownAllChangesInAssociationCase() {
        associationTabsFirstRowCheckBox.click();
        unsavedChangesButton.click();
        saveButtonInChangeItemModal.click();
        BrowserUtils.wait(2);
//        editItemDeleteButton.click();
//        BrowserUtils.wait(1);
//        deleteButtonInAreYouSureModal.click();
    }

    String randomValue;
//    public void updateAccountExcelWithRandomSku() throws IOException {
//        randomSKU = generateRandomImportDescription();
//        CommonExcelReader.updateCellValue(accountExcel,"SKU",1,randomSKU);
//    }

    public void updateExcelWithRandom(String excelFile, String columnName, int index) throws IOException {
        randomValue = generateRandomSkuWithNumbers();
        updateCellValue(getExcelPath(excelFile),columnName,index, randomValue);
    }

    public void verifyAttributesAreCreated() {
        List<String> expectedTypeValues = Arrays.asList("Date","MultipleSelect","Simple Select","Text","Number","Bool","Resource Select");
        Driver.getDriver().get("https://sandbox-ui.efectura.com/Settings/Attributes");
        codeFilter.click();
        codeFilterInputBox.sendKeys("TestAutomationAtt" + Keys.ENTER);
        BrowserUtils.wait(1);

        for (int i = 0; i < codeValues.size(); i++) {
            softAssertions.assertThat(codeValues.get(i).getText().contains("TestAutomationAtt"))
                    .as("Check if code contains 'TestAutomationAtt' at index %d", i)
                    .isTrue();

            softAssertions.assertThat(attributesTypeValues.get(i).getText())
                    .as("Check if attribute type matches expected type at index %d", i)
                    .isEqualTo(expectedTypeValues.get(i));

        }
        softAssertions.assertAll();
    }

    public void tearDownAllChangesInAttributeCase() {
        for (int i = 0; i < 7; i++) {
            deleteButtons.get(0).click();
            BrowserUtils.wait(1);
            deleteButtonInModalInAttributes.click();
            BrowserUtils.wait(2);
        }
    }

    String projectDir = System.getProperty("user.dir");

    String accountCallbackRelativePath = "src/test/resources/testData/AccountCallback.xlsx";
    String accountCallbackExcel = Paths.get(projectDir, accountCallbackRelativePath).toString();

    public void uploadExcelFile(String fileName) {
        addCsvInputElement.sendKeys(getExcelPath(fileName));
        BrowserUtils.wait(2);
        saveChangesButtonInAreYouSureModal.click();
    }

    public static String getExcelPath(String fileName) {
        String projectDir = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testData/" + fileName + ".xlsx";
        return Paths.get(projectDir, relativePath).toString();
    }

    public WebElement getEditItemShowcaseElement(String attributeLabel) {
        return driver.
                findElement(By.xpath(
                        "//div[contains(@class, 'line-name-div')]//div[contains(@class, 'title-input-block') and .//b[text()='"
                        + attributeLabel + "']]/following-sibling::div[contains(@class, 'line-div-right')]"));
    }

    public void verifyAttributeIsEdited(String attributeLabel,String columnName,String fileName) throws IOException {
        driver.get(
                ConfigurationReader.getProperty("editItemLinkWithoutId") + getCellValue(getExcelPath(fileName),
                        "Id",
                        2)
        );
        WebElement actualAttribute = getEditItemShowcaseElement(attributeLabel);
        Assert.assertEquals(getCellValue(getExcelPath(fileName),columnName,2),actualAttribute.getText());
    }

    public void verifyAttributeOptionIsAdded() {
        Assert.assertTrue(selectAttributeOptionsCodeValues.stream()
                .anyMatch(element -> element.getAttribute("value").contains(randomValue)));
    }

    public void findAttribute(String attributeCode) {
        Driver.getDriver().get("https://sandbox-ui.efectura.com/Settings/Attributes");
        codeFilter.click();
        codeFilterInputBox.sendKeys(attributeCode + Keys.ENTER);
        BrowserUtils.wait(1);
    }

    public void goIntoAttributeEditPage() {
        attributeEditButtons.get(0).click();
    }

    public void clickValuesTab() {
        attributeValuesTab.click();
    }
}
