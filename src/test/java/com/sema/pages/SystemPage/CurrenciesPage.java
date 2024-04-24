package com.sema.pages.SystemPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.sema.pages.SettingsPage.TagsPage.isRowCountCorrectAccordingToTableLength;
import static com.sema.pages.SettingsPage.TagsPage.selectLengthFromTableLength;

public class CurrenciesPage extends BasePage {

    @FindBy(xpath = "//tbody")
    private WebElement currenciesTableValuePart;

    @FindBy(xpath = "//tr/td[1]")
    private List<WebElement> codeValues;

    @FindBy(xpath = "//tr/td[2]")
    private List<WebElement> statusValues;

    @FindBy(xpath = "//tr/th[1]")
    private WebElement codeHeader;

    @FindBy(xpath = "//tr/th[.='Status']")
    private WebElement statusHeader;

    @FindBy(xpath = "//input[@placeholder='Code']")
    private WebElement codeFilterInputBox;

    @FindBy(id = "create-tag-button")
    private WebElement createNewButton;

    @FindBy(xpath = "//span[text()='Refresh']")
    private WebElement refreshButton;

    @FindBy(xpath = "//span[text()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//td/a[1]")
    private List<WebElement> editButtonsInCurrenciesPage;

    @FindBy(xpath = "//td/a[2]")
    private List<WebElement> deleteButtonsInCurrenciesPage;

    @FindBy(xpath = "//div[2]/div[3]/button[1]")
    private WebElement cancelButtonInDeleteCurrencyPopup;

    @FindBy(xpath = "//div[2]/div[3]/button[2]")
    private WebElement deleteButtonInDeleteCurrencyPopup;

    @FindBy(xpath = "(//div[@class='modal-dialog modal-confirm'])[1]")
    private WebElement deleteCurrencyPopup;

    @FindBy(xpath = "//div[@id='edit-currency-modal']/div[2]/div")
    private WebElement editCurrencyPopup;

    @FindBy(xpath = "//input[@id='edit-currency-code']")
    private WebElement editCurrencyCodeInputBox;

    @FindBy(xpath = "//div[2]/div/div[3]/div/a[2]")
    private WebElement cancelButtonInEditCurrencyPopup;

    @FindBy(xpath = "//a[@id='edit-currency']")
    private WebElement saveButtonInEditCurrencyPopup;

    @FindBy(xpath = "//input[@id='edit-is-activate']")
    private WebElement statusCheckboxInEditCurrencyPopup;

    @FindBy(xpath = "//a[@id='create-currency']")
    private WebElement saveButtonInAddCurrencyPopup;

    @FindBy(xpath = "//div[2]/div/div[3]/div/a[2]")
    private WebElement cancelButtonInAddCurrencyPopup;

    @FindBy(xpath = "//*[@id='add-currency-modal']/div[2]")
    private WebElement addCurrencyPopup;

    @FindBy(xpath = "//button[@id='locales_tableFirstPage']")
    private WebElement firstPaginationButton;

    @FindBy(xpath = "//button[@id='locales_tableLastPage']")
    private WebElement lastPaginationButton;

    @FindBy(xpath = "//span[@id='locales_table_previous']")
    private WebElement previousPaginationButton;

    @FindBy(xpath = "//span[@id='locales_table_next']")
    private WebElement nextPaginationButton;

    @FindBy(xpath = "//div[@id='locales_table_info']")
    private WebElement tableInfoInCurrenciesPage;

    @FindBy(xpath = "//input[@class='pagination-text']")
    private WebElement paginationInputBox;

    @FindBy(xpath = "//input[@id='currency-code']")
    private WebElement addCurrencyCodeInputBox;

    @FindBy(xpath = "//select[@name='locales_table_length']")
    private WebElement tableLengthSelectDropdown;

    @FindBy(xpath = "//tr/td")
    private WebElement emptyTableMessage;


    public void goToCurrenciesPage() {
        Driver.getDriver().navigate().to("https://sandbox.efectura.com/Settings/Currencies");
        BrowserUtils.waitForVisibility(currenciesTableValuePart, 15);
    }

    public void enterInputToCodeFilter(String filterInput) {
        codeFilterInputBox.sendKeys(filterInput);
        BrowserUtils.wait(6);
    }

    public void verifyCodeFilterResultsAreCorrect(String filterInput) {
        for (WebElement value : codeValues) {
            Assert.assertTrue(value.getText().toLowerCase().contains(filterInput));
        }
    }

    public static List<String> getStringListFromWebElementList(List<WebElement> webElementList) {
        List<String> stringList = new ArrayList<>();
        BrowserUtils.wait(2);
        for (WebElement element : webElementList) {
            stringList.add(element.getText().toLowerCase());
        }
        return stringList;
    }

    public static boolean areValuesAscending(List<WebElement> values) {
        List<String> valuesAsString = getStringListFromWebElementList(values);
        for (int i = 0; i < valuesAsString.size() - 1; i++) {
            if (valuesAsString.get(i).compareTo(valuesAsString.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean areCodeValuesAscending() {
        return areValuesAscending(codeValues);
    }

    public void clickCodeHeaderForDescending() {
        clickHeaderForDescendingSort(codeHeader);
    }

    public static boolean areValuesDescending(List<WebElement> values) {
        List<String> valuesAsString = getStringListFromWebElementList(values);
        for (int i = 0; i < valuesAsString.size() - 1; i++) {
            if (valuesAsString.get(i).compareTo(valuesAsString.get(i + 1)) < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean areCodeValuesDescending() {
        return areValuesDescending(codeValues);
    }

    public static void clickHeaderForAscendingSort(WebElement header) {
        waitForAttribute(header,"aria-sort");
        while (header.getAttribute("aria-sort").equals("descending")) {
            header.click();
            BrowserUtils.wait(3);
        }
    }

    public static void clickHeaderForDescendingSort(WebElement header) {
        waitForAttribute(header,"aria-sort");
        while (header.getAttribute("aria-sort").equals("ascending")) {
            header.click();
            BrowserUtils.wait(3);
        }
    }

    public void clickStatusHeaderForAscending() {
        statusHeader.click();
        clickHeaderForAscendingSort(statusHeader);
    }

    public boolean areStatusValuesAscending() {
        List<String> statusValuesAsString = getStringListFromWebElementList(statusValues);
        for (int i = 0; i < statusValuesAsString.size() - 1; i++) {
            if (statusValuesAsString.get(i).equals("Active") && statusValuesAsString.get(i + 1).equals("Inactive")) {
                return false;
            }
        }
        return true;
    }

    public void clickStatusHeaderForDescending() {
        statusHeader.click();
        clickHeaderForDescendingSort(statusHeader);
    }

    public boolean areStatusValuesDescending() {
        List<String> statusValuesAsString = getStringListFromWebElementList(statusValues);
        for (int i = 0; i < statusValuesAsString.size() - 1; i++) {
            if (statusValuesAsString.get(i).equals("Inactive") && statusValuesAsString.get(i + 1).equals("Active")) {
                return false;
            }
        }
        return true;
    }

    public static void waitForAttribute(WebElement element, String attribute) {
        while (element.getAttribute(attribute) == null) {
            BrowserUtils.wait(1);
        }
    }

    public void clickResetButton() {resetButton.click();}

    public void verifyCodeFilterHasNoValue() {
        String actualValue = getValueInInputBox(codeFilterInputBox);
        Assert.assertEquals("", actualValue);
    }

    String currencyStatusToBeClicked;
    String currencyCodeToBeClicked;
    public void clickCurrencyEditButton() {
        List<String> codeValuesAsString = getStringListFromWebElementList(codeValues);
        for (int i = 0; i < codeValuesAsString.size(); i++) {
            if (!codeValuesAsString.get(i).equalsIgnoreCase("Dolar") && !codeValuesAsString.get(i).equalsIgnoreCase("Lira")) {
                currencyStatusToBeClicked = statusValues.get(i).getText();
                currencyCodeToBeClicked = codeValuesAsString.get(i);
                editButtonsInCurrenciesPage.get(i).click();
                break;
            }
        }
        BrowserUtils.waitForVisibility(cancelButtonInEditCurrencyPopup,5);
    }

    public void verifyCancelButtonIsActiveInEditCurrencyPopup() {Assert.assertTrue(cancelButtonInEditCurrencyPopup.isEnabled());}

    public static boolean isButtonActive(WebElement button) {
        String classAttribute = button.getAttribute("class");
        return !classAttribute.contains("disabled");
    }

    public void verifySaveButtonIsInactiveInEditCurrencyPopup() {
        Assert.assertFalse(isButtonActive(saveButtonInEditCurrencyPopup));
    }

    public void clickCancelButtonInEditCurrencyPopup() {cancelButtonInEditCurrencyPopup.click();}

    public void verifyEditCurrencyPopupIsClosed() {Assert.assertTrue(isPopupClosed(editCurrencyPopup));}

    public static boolean isPopupClosed(WebElement popupName) {
        BrowserUtils.wait(2);
        try {
            return !popupName.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Belirtilen element bulunamazsa, modal kapatılmıştır.
            return true;
        }
    }

    public void enterInputToEditCurrencyCode(String editCurrencyCodeInput) {
        editCurrencyCodeInputBox.sendKeys(editCurrencyCodeInput);
        BrowserUtils.wait(1);
    }

    public void verifySaveButtonIsActiveInEditCurrencyPopup() {
        Assert.assertTrue(isButtonActive(saveButtonInEditCurrencyPopup));
    }

    public void clickStatusCheckboxInEditCurrencyPopup() {statusCheckboxInEditCurrencyPopup.click();}

    public void verifyRefreshButtonIsActiveInCurrencies() {Assert.assertTrue(isButtonActive(refreshButton));}

    public void clickCreateNewButtonInCurrenciesPage() {
        createNewButton.click();
        BrowserUtils.wait(2);
        BrowserUtils.waitForVisibility(cancelButtonInAddCurrencyPopup,10);
    }

    public void clickCancelButtonInAddCurrencyPopup() {cancelButtonInAddCurrencyPopup.click();}

    public void verifyAddCurrencyPopupIsClosed() {Assert.assertTrue(isPopupClosed(addCurrencyPopup));}

    public void verifySaveButtonIsInactiveInAddCurrencyPopup() {
        Assert.assertFalse(isButtonActive(saveButtonInAddCurrencyPopup));
    }

    public void enterPageNumberInToPaginationInputBox(String pageNumber) {
        paginationInputBox.clear();
        paginationInputBox.sendKeys(pageNumber);
        BrowserUtils.wait(6);
    }

    public void verifyFirstAndPreviousButtonsAreInactiveInFirstPageOfTableInCurrencies() {
        Assert.assertFalse(isButtonActive(firstPaginationButton) || isButtonActive(previousPaginationButton));
    }

    public void enterInputToAddCurrencyCode(String addCurrencyCodeInput) {
        addCurrencyCodeInputBox.sendKeys(addCurrencyCodeInput);
        BrowserUtils.wait(1);
    }

    public void verifySaveButtonIsActiveInAddCurrencyPopup() {
        Assert.assertTrue(isButtonActive(saveButtonInAddCurrencyPopup));
    }

    public void enterAlreadyExistingCodeValueInTo(String s) {
        String alreadyExistingCodeValue = "Dolar";
        if (s.contains("Add")) {
            addCurrencyCodeInputBox.sendKeys(alreadyExistingCodeValue);
        }else if(s.contains("Edit")) {
            editCurrencyCodeInputBox.clear();
            editCurrencyCodeInputBox.sendKeys(alreadyExistingCodeValue);
        }
    }

    public void clickSaveButtonInAddCurrencyPopup() {
        waitForClickableOfButton(saveButtonInAddCurrencyPopup);
        saveButtonInAddCurrencyPopup.click();
    }

    public static void waitForClickableOfButton(WebElement button) {
        while (!isButtonActive(button)) {
            BrowserUtils.wait(2);
        }
    }

    public static void waitForUnclickableOfButton(WebElement button) {
        try {
            while (isButtonActive(button)) {
                BrowserUtils.wait(1);
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Stale Element");
        }
    }

    public void clickSaveButtonInEditCurrencyPopup() {
        waitForClickableOfButton(saveButtonInEditCurrencyPopup);
        saveButtonInEditCurrencyPopup.click();
    }

    String randomCurrencyCode;
    public static String generateRandomCurrencyCode() {
        int length = 5;
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

    public void enterNonExistingCodeValueInTo(String popupName) {
        randomCurrencyCode = generateRandomCurrencyCode();

        if (popupName.contains("Add")) {
            addCurrencyCodeInputBox.sendKeys(randomCurrencyCode);
        }else if(popupName.contains("Edit")) {
            editCurrencyCodeInputBox.clear();
            editCurrencyCodeInputBox.sendKeys(randomCurrencyCode);
        }
    }

    public boolean isCurrencyCodeValueInTable(String currencyCodeToBeCheck) {
        enterInputToCodeFilter(currencyCodeToBeCheck);
        List<String> codeValuesAsString = getStringListFromWebElementList(codeValues);
        return codeValuesAsString.contains(currencyCodeToBeCheck.toLowerCase());
    }

    public void verifyEditedCurrencyIsInTable() {
        Assert.assertTrue(isCurrencyCodeValueInTable(randomCurrencyCode));
    }

    public void verifyStatusOfEditedCurrencyHasChanged() {
        codeFilterInputBox.sendKeys(currencyCodeToBeClicked);
        BrowserUtils.wait(3);
        String newStatus = statusValues.get(0).getText();
        Assert.assertNotEquals(currencyStatusToBeClicked,newStatus);
    }

    public void verifyNewCurrencyIsInTable() {
        Assert.assertTrue(isCurrencyCodeValueInTable(randomCurrencyCode));
    }

    String currencyCodeToBeDeleted;
    public void clickCurrencyDeleteButton() {
        List<String> codeValuesAsString = getStringListFromWebElementList(codeValues);
        for (int i = 0; i < codeValuesAsString.size(); i++) {
            if (!codeValuesAsString.get(i).equalsIgnoreCase("Dolar") && !codeValuesAsString.get(i).equalsIgnoreCase("Lira")) {
                currencyCodeToBeDeleted = codeValuesAsString.get(i);
                deleteButtonsInCurrenciesPage.get(i).click();
                break;
            }
        }
        BrowserUtils.waitForVisibility(cancelButtonInDeleteCurrencyPopup,10);
    }

    public void verifyThatCancelButtonIsActiveInDeleteCurrencyPopup() {
        Assert.assertTrue(isButtonActive(cancelButtonInDeleteCurrencyPopup));
    }

    public void verifyThatDeleteButtonIsActiveInDeleteCurrencyPopup() {
        Assert.assertTrue(isButtonActive(deleteButtonInDeleteCurrencyPopup));
    }

    public void clickCancelButtonInDeleteCurrencyPopup() {cancelButtonInDeleteCurrencyPopup.click();}

    public void verifyDeleteCurrencyPopupIsClosed() {
        Assert.assertTrue(isPopupClosed(deleteCurrencyPopup));
    }

    public void clickDeleteButtonInDeleteCurrencyPopup() {deleteButtonInDeleteCurrencyPopup.click();}

    public void verifyDeletedCurrencyIsNotInTable() {
        Assert.assertFalse(isCurrencyCodeValueInTable(currencyCodeToBeDeleted));
    }

    public void verifyCancelButtonIsActiveInAddCurrencyPopup() {
        Assert.assertTrue(isButtonActive(cancelButtonInAddCurrencyPopup));
    }

    public static String getSelectedOption(WebElement selectElement) {
        Select select = new Select(selectElement);
        return select.getFirstSelectedOption().getText();
    }

    public static int findLastPageNumber(WebElement tableInfo, WebElement tableLengthSelectDropdown) {
        int totalCurrencyCount = Integer.parseInt(tableInfo.getText().split(" ")[5]);
        int visibleCurrencyCount = Integer.parseInt(getSelectedOption(tableLengthSelectDropdown));
        return (int) Math.ceil((double) totalCurrencyCount / visibleCurrencyCount);
    }

    public void enterLastPageNumberInToPaginationInputBox() {
        paginationInputBox.clear();
        paginationInputBox.sendKeys(findLastPageNumber(tableInfoInCurrenciesPage, tableLengthSelectDropdown) + "");
        BrowserUtils.wait(5);
    }

    public void verifyLastAndNextButtonsAreInactiveInLastPageOfTable() {
        BrowserUtils.waitForVisibility(lastPaginationButton, 10);
        Assert.assertFalse(isButtonActive(lastPaginationButton) || isButtonActive(nextPaginationButton));
    }

    public void clickLastPaginationButtonInCurrenciesPage() {
        lastPaginationButton.click();
        waitForUnclickableOfButton(lastPaginationButton);
    }

    public static String getValueInInputBox(WebElement inputBox) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        return (String) js.executeScript("return arguments[0].value;", inputBox);
    }

    public void verifyTableIsInLastPageInCurrenciesPage() {
        verifyTableIsInLastPage(paginationInputBox,tableInfoInCurrenciesPage,tableLengthSelectDropdown);
    }

    public void clickFirstPaginationButtonInCurrenciesPage() {
        firstPaginationButton.click();
        waitForUnclickableOfButton(firstPaginationButton);
    }

    public void verifyTableIsInFirstPageInCurrenciesPage() {
        verifyTableIsInFirstPage(paginationInputBox);
    }

    public static void verifyTableIsInFirstPage(WebElement inputBox) {
        BrowserUtils.wait(2);
        String actualPageNumber = getValueInInputBox(inputBox);
        Assert.assertEquals("1",actualPageNumber);
    }

    public static void verifyTableIsInLastPage(WebElement inputBox, WebElement tableInfo, WebElement tableLengthSelectDropdown) {
        String actualPageNumber = getValueInInputBox(inputBox);
        Assert.assertEquals(findLastPageNumber(tableInfo,tableLengthSelectDropdown) + "",actualPageNumber);
    }

    public void clickNextPaginationButtonInCurrenciesPage() {
        BrowserUtils.wait(5);
        nextPaginationButton.click();
        BrowserUtils.wait(1);
        waitForClickableOfButton(firstPaginationButton);
    }

    public void verifyTableIsInNextPageInCurrenciesPage() {
        BrowserUtils.wait(5);
        Assert.assertEquals("2", getValueInInputBox(paginationInputBox));
    }

    public void clickPreviousPaginationButtonInCurrenciesPage() {
        previousPaginationButton.click();
        waitForUnclickableOfButton(firstPaginationButton);
    }

    public void verifyTableGoToPreviousPageInCurrenciesPage() {
         BrowserUtils.wait(5);
        Assert.assertEquals("1", getValueInInputBox(paginationInputBox));
    }

    public void selectLengthFromTableLengthInCurrenciesPage(String length) {
        selectLengthFromTableLength(tableLengthSelectDropdown,length);
    }

    public void verifyTableContainsRightRowsAccordingToLengthInCurrencies(String length) {
        Assert.assertTrue(isRowCountCorrectAccordingToTableLength(tableInfoInCurrenciesPage,length));
    }

    public void undoneTheChangesInCurrencyCodeInEditCurrencyModal() {
        String oldValue = editCurrencyCodeInputBox.getAttribute("data-old-value");
        editCurrencyCodeInputBox.clear();
        editCurrencyCodeInputBox.sendKeys(oldValue);
    }
}
