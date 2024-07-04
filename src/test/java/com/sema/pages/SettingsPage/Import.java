package com.sema.pages.SettingsPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.CommonExcelReader;
import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import static com.sema.pages.SettingsPage.TagsPage.isRowCountCorrectAccordingToTableLength;
import static com.sema.pages.SettingsPage.TagsPage.selectLengthFromTableLength;

public class Import extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement popUpOkButton;

    @FindBy(xpath = "//a[normalize-space()='Import Overview']")
    private WebElement importPageVerificationsElement;

    @FindBy(xpath = "//label/select")
    private WebElement tableLengthSelectDropdown;

    @FindBy(xpath = "//div[3]/div[1]/div/div[2]/div[1]/div[4]")
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

    @FindBy(xpath = "//input[contains(@placeholder,'Task Name')]")
    private WebElement taskNameFilterInputBox;

    @FindBy(xpath = "//input[@placeholder='Code']")
    private WebElement resourceCodeFilterInputBox;

    @FindBy(xpath = "//tr/td[1]")
    private WebElement resourceCodeValue;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement resourceSearchButton;

    @FindBy(xpath = "//tr/td/a")
    private WebElement resourceDeleteButton;

    @FindBy(xpath = "//button[contains(@id,'delete-confirmedResources')]")
    private WebElement deleteResourceButtonInDeleteResourceModal;

    @FindBy(xpath = "//ul[@id='select2-ItemType-results']/li")
    private List<WebElement> filteredImportTypeOptions;

    @FindBy(xpath = "//a[contains(text(),'Code')]")
    private WebElement itemOverviewCodeFilter;

    @FindBy(xpath = "//input[@id='filter-SKU']")
    private WebElement itemOverviewCodeFilterInputBox;

    @FindBy(xpath = "//tr/th")
    private List<WebElement> contactOverviewTableHeaders;

    @FindBy(xpath = "//tr[1]/td")
    private List<WebElement> firstRowOfContactOverviewTableValues;
    
    @FindBy(xpath = "//a[@title='Edit']")
    private WebElement itemOverviewTableValueEditButton;

    @FindBy(xpath = "//a[contains(@class,'t-delete danger-btn')]")
    private WebElement itemOverviewTableValueDeleteButton;

    @FindBy(xpath = "//a[contains(text(),'ACCOUNT_CONTACT')]")
    private WebElement accountContactTabInContactEditItem;

    @FindBy(xpath = "//tr[@role='row']/th")
    private List<WebElement> contactEditItemTableHeaders;

    @FindBy(xpath = "//tr[@role='row'][1]/td")
    private List<WebElement> firstRowOfContactEditItemTableValues;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    private WebElement searchButton;

    @FindBy(xpath = "(//input[@id='userselect'])[1]")
    private WebElement accountContactTabFirstRowCheckBox;

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


    public String getValueOfTableInContactOverview(String headerName) {
        int i = 0;
        for (i = 0; i < contactOverviewTableHeaders.size(); i++) {
            if (contactOverviewTableHeaders.get(i).getText().equals(headerName)) {
                break;
            }
        }
        return firstRowOfContactOverviewTableValues.get(i).getText();
    }

    public String getValueOfTableInContactEditItem(String headerName) {
        int j = 0;
        for (int i = 1; i < contactEditItemTableHeaders.size(); i++) {
            if (i == 2) {
                continue;
            }
            if (contactEditItemTableHeaders.get(i).getText().equals(headerName)) {
                j = i;
                break;
            }
        }
        return firstRowOfContactEditItemTableValues.get(j).getText();
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

    //String accountCallbackExcel = "C:\\Users\\fkara\\Desktop\\workspace\\EfecturaTestAutomation\\src\\test\\resources\\testData\\AccountCallback.xlsx";
    String newDescription;

    String projectDir = System.getProperty("user.dir");
    String accountCallbackRelativePath = "src/test/resources/testData/AccountCallback.xlsx";
    String accountCallbackExcel = Paths.get(projectDir, accountCallbackRelativePath).toString();

    public void updateExcel(String point, String endDate) throws IOException {
//        try {
//            String currentDescription = CommonExcelReader.getCellValue(accountCallbackExcel,"Description",1);
//            newDescription = currentDescription.split(" ")[0] + " " +
//                    (Integer.parseInt(currentDescription.split(" ")[1]) + 1);
//        } catch (IOException ioException) {
//            System.out.println("IOException Is Threw !!!!!!");
//        }

        newDescription = generateRandomImportDescription();
        CommonExcelReader.updateCellValue(accountCallbackExcel,"Description", 1,newDescription);
        CommonExcelReader.updateCellValue(accountCallbackExcel,"Point", 1,point);
        CommonExcelReader.updateCellValue(accountCallbackExcel,"DateEnd",1,endDate);
    }

    public void uploadAccountCallbackFile() {
        addCsvInputElement.sendKeys(accountCallbackExcel);
        BrowserUtils.wait(2);
        saveChangesButtonInAreYouSureModal.click();
    }

    public void approveImport() {
        //BrowserUtils.wait(5);
        BrowserUtils.waitForVisibility(approveButton,10);
        approveButton.click();
    }

    public void verifyOneEarningIsAddedToPointHistory() {
        Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + "6516");
        pointHistoryTab.click();
        taskNameFilterInputBox.sendKeys(newDescription);
        BrowserUtils.wait(3);
        Assert.assertEquals(1,taskNameValues.size());
    }

    public void updateExcelWithTransActionType(String transactionType) throws IOException {
        CommonExcelReader.updateCellValue(accountCallbackExcel,"TransactionType",1,transactionType);
    }

    public void updateExcelWithTaskId(String taskId) throws IOException {
        CommonExcelReader.updateCellValue(accountCallbackExcel,"TaskId",1,taskId);
    }

    public void importTheImport() {
        BrowserUtils.wait(2);
        BrowserUtils.waitForVisibility(importButton,10);
        importButton.click();
    }

    String resourceTranslationsRelativePath = "src/test/resources/testData/ResourceTranslations.xlsx";
    String resourceTranslationsExcel = Paths.get(projectDir, resourceTranslationsRelativePath).toString();
    public void selectAccountCallbackForImportType() {
        selectImportTypeElement.click();
        BrowserUtils.wait(1);
        if (!accountCallbackOption.isDisplayed()) {
            selectImportTypeElement.click();
        }
        accountCallbackOption.click();
    }

    public void selectResourceTranslationsForImportType() {
        BrowserUtils.wait(3);
        selectImportTypeElement.click();
        selectImportTypeInputBox.sendKeys("resource");
        resourceTranslationsOption.click();
    }

    public void uploadResourceTranslationsFile() {
        addCsvInputElement.sendKeys(resourceTranslationsExcel);
        BrowserUtils.wait(2);
        saveChangesButtonInAreYouSureModal.click();
    }

    public void verifyTheResourceIsAddedToResources() throws IOException {
        Driver.getDriver().get("https://sandbox-ui.efectura.com/Resources");
        String resourceCode = CommonExcelReader.getCellValue(resourceTranslationsExcel,"Code",1);
        BrowserUtils.wait(2);
        resourceCodeFilterInputBox.sendKeys(resourceCode);
        resourceSearchButton.click();
        BrowserUtils.wait(3);
        Assert.assertEquals(resourceCode,resourceCodeValue.getText());
    }

    public void tearDownChangesInResources() {
        resourceDeleteButton.click();
        BrowserUtils.waitForVisibility(deleteResourceButtonInDeleteResourceModal,10);
        deleteResourceButtonInDeleteResourceModal.click();
        BrowserUtils.wait(2);
    }



    String contactRelativePath = "src/test/resources/testData/Contact.xlsx";
    String contactExcel = Paths.get(projectDir, contactRelativePath).toString();
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

    public void uploadContactFile() {
        addCsvInputElement.sendKeys(contactExcel);
        BrowserUtils.wait(2);
        saveChangesButtonInAreYouSureModal.click();
    }

    public void verifyContactIsCreated(String importType) throws IOException {
        Driver.getDriver().get(ConfigurationReader.getProperty("itemLinkWithoutItemName") + importType);
        String contactCode = CommonExcelReader.getCellValue(contactExcel,"SKU",1);
        itemOverviewCodeFilter.click();
        itemOverviewCodeFilterInputBox.sendKeys(contactCode);
        searchButton.click();
        BrowserUtils.wait(5);
        Assert.assertEquals(contactCode, getValueOfTableInContactOverview("CODE"));
    }

    public void verifyThatContactIsAssociatedWithStatedAccount() throws IOException {
        itemOverviewTableValueEditButton.click();
        accountContactTabInContactEditItem.click();
        String expectedAccountNumber = CommonExcelReader.getCellValue(contactExcel,"Account Number",1);
        String actualAssociatedValue = getValueOfTableInContactEditItem("ASSOCIATED");
        Boolean isAccount = expectedAccountNumber.equals(getValueOfTableInContactEditItem("CODE"));
        Boolean isAccountAssociated = actualAssociatedValue.equals("Yes");

        Assert.assertTrue(isAccount && isAccountAssociated);
    }

    public void tearDownAllChangesInContactCase() {
        accountContactTabFirstRowCheckBox.click();
        unsavedChangesButton.click();
        saveButtonInChangeItemModal.click();
        editItemDeleteButton.click();
        deleteButtonInAreYouSureModal.click();
    }

    String accountRelativePath = "src/test/resources/testData/Account.xlsx";
    String accountExcel = Paths.get(projectDir, accountRelativePath).toString();
    public void uploadAccountFile() {
        addCsvInputElement.sendKeys(accountExcel);
        BrowserUtils.wait(2);
        saveChangesButtonInAreYouSureModal.click();
    }

    public void tearDownAllChangesInAccountCase() {
        itemOverviewTableValueDeleteButton.click();
        deleteButtonInOverviewDeleteConfirmationModal.click();
    }
}
