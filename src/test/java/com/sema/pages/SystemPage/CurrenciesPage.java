package com.sema.pages.SystemPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedList;
import java.util.List;

public class CurrenciesPage extends BasePage {

    @FindBy(xpath = "//table[@id='locales_table']")
    private WebElement currenciesTable;

    @FindBy(xpath = "//tr/td[1]")
    public List<WebElement> codeValues;

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


    public void goToCurrenciesPage() {
        Driver.getDriver().navigate().to("https://sandbox.efectura.com/Settings/Currencies");
        BrowserUtils.waitForVisibility(currenciesTable, 10);
    }

    public void enterInputToCodeFilter(String filterInput) {
        codeFilterInputBox.sendKeys(filterInput);
        BrowserUtils.wait(4);
    }

    public void verifyFilterResultsAreCorrect(String filterInput) {
        for (WebElement value : codeValues) {
            Assert.assertTrue(value.getText().toLowerCase().contains(filterInput));
        }
    }

    private List<String> takeStringListFromWebElementList(List<WebElement> webElementList) {
        List<String> stringList = new LinkedList<>();
        for (WebElement element : webElementList) {
            stringList.add(element.getText());
        }
        return stringList;
    }

    public boolean areCodeValuesAscending() {
        List<String> codeValuesAsString = takeStringListFromWebElementList(codeValues);
        for (int i = 0; i < codeValuesAsString.size() - 1; i++) {
            if (codeValuesAsString.get(i).compareTo(codeValuesAsString.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    public void clickCodeHeaderForDescending() {
        waitForAttribute(codeHeader,"aria-sort");
        while (codeHeader.getAttribute("aria-sort").equals("ascending")) {
            codeHeader.click();
            BrowserUtils.wait(3);
        }
    }

    public boolean areCodeValuesDescending() {
        List<String> codeValuesAsString = takeStringListFromWebElementList(codeValues);
        for (int i = 0; i < codeValuesAsString.size() - 1; i++) {
            if (codeValuesAsString.get(i).compareTo(codeValuesAsString.get(i + 1)) < 0) {
                return false;
            }
        }
        return true;
    }

    public void clickStatusHeaderForAscending() {
        statusHeader.click();
        waitForAttribute(statusHeader,"aria-sort");
        while (statusHeader.getAttribute("aria-sort").equals("descending")) {
            statusHeader.click();
            BrowserUtils.wait(3);
        }
    }

    public boolean areStatusValuesAscending() {
        List<String> statusValuesAsString = takeStringListFromWebElementList(statusValues);
        for (int i = 0; i < statusValuesAsString.size() - 1; i++) {
            if (statusValuesAsString.get(i).equals("Active") && statusValuesAsString.get(i + 1).equals("Inactive")) {
                return false;
            }
        }
        return true;
    }

    public void clickStatusHeaderForDescending() {
        statusHeader.click();
        waitForAttribute(statusHeader,"aria-sort");
        while (statusHeader.getAttribute("aria-sort").equals("ascending")) {
            statusHeader.click();
            BrowserUtils.wait(3);
        }
    }

    public boolean areStatusValuesDescending() {
        List<String> statusValuesAsString = takeStringListFromWebElementList(statusValues);
        for (int i = 0; i < statusValuesAsString.size() - 1; i++) {
            if (statusValuesAsString.get(i).equals("Inactive") && statusValuesAsString.get(i + 1).equals("Active")) {
                return false;
            }
        }
        return true;
    }

    public void waitForAttribute(WebElement element, String attribute) {
        while (element.getAttribute(attribute) == null) {
            BrowserUtils.wait(1);
        }
    }

    public void clickResetButton() {resetButton.click();}

    public void verifyCodeFilterHasNoValue() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String actualValue = (String) js.executeScript("return arguments[0].value;", codeFilterInputBox);
        Assert.assertEquals("", actualValue);
    }

    public void clickEditButton() {editButtonsInCurrenciesPage.get(0).click();}

    public void verifyCancelButtonIsActive() {Assert.assertTrue(cancelButtonInEditCurrencyPopup.isEnabled());}

    public boolean isButtonIsInactive(WebElement button) {
        String classAttribute = saveButtonInEditCurrencyPopup.getAttribute("class");
        return classAttribute.contains("disabled");
    }

    public void verifySaveButtonIsInactiveInEditCurrencyPopup() {
        Assert.assertTrue(isButtonIsInactive(saveButtonInEditCurrencyPopup));
    }

    public void clickCancelButtonInEditCurrencyPopup() {cancelButtonInEditCurrencyPopup.click();}

    public void verifyEditCurrencyPopupIsClosed() {Assert.assertTrue(isPopupClosed(editCurrencyPopup));}

    public boolean isPopupClosed(WebElement popupName) {
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
        String classAttribute = saveButtonInEditCurrencyPopup.getAttribute("class");
        Assert.assertFalse(classAttribute.contains("disabled"));
    }

    public void clickStatusCheckboxInEditCurrencyPopup() {statusCheckboxInEditCurrencyPopup.click();}

    public void verifyRefreshButtonIsActiveInCurrencies() {Assert.assertTrue(refreshButton.isEnabled());}

    public void clickCreateNewButtonInCurrenciesPage() {createNewButton.click();}

    public void clickCancelButtonInAddCurrencyPopup() {cancelButtonInAddCurrencyPopup.click();}

    public void verifyAddCurrencyPopupIsClosed() {Assert.assertTrue(isPopupClosed(addCurrencyPopup));}

    public void verifySaveButtonIsInactiveInAddCurrencyPopup() {
        Assert.assertTrue(isButtonIsInactive(saveButtonInAddCurrencyPopup));
    }

    public void enterPageNumberInToPaginationInputBox(String pageNumber) {
        paginationInputBox.clear();
        paginationInputBox.sendKeys(pageNumber);
        BrowserUtils.wait(2);
    }

    public void verifyFirstAndPreviousButtonsAreInactiveInFirstPageOfTable() {
        Assert.assertTrue(isButtonIsInactive(firstPaginationButton) && isButtonIsInactive(previousPaginationButton));
    }
}
