package com.sema.pages.SettingsPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.sema.pages.SystemPage.CurrenciesPage;

import java.util.ArrayList;
import java.util.List;

import static com.sema.pages.SystemPage.CurrenciesPage.*;

public class TagsPage extends BasePage {

    @FindBy(xpath = "//a[@id='setting-wheel']")
    private WebElement settingsWheelSymbol;

    @FindBy(xpath = "//li/a[text()='Settings']")
    private WebElement settingsMenu;

    @FindBy(xpath = "//a[@id='systemid']")
    private WebElement systemMenu;

    @FindBy(xpath = "//li[5]/ul/li[1]/ul/li/a")
    private List<WebElement> settingsOptions;

    @FindBy(xpath = "//li[5]/ul/li[2]/ul/li/a")
    private List<WebElement> systemOptions;

    @FindBy(xpath = "//span[contains(text(),'Id')]")
    private WebElement idFilter;

    @FindBy(xpath = "//input[@id='Id_From']")
    private WebElement idFromInputBox;

    @FindBy(xpath = "//input[@id='Id_To']")
    private WebElement idToInputBox;

    @FindBy(xpath = "//span[text()='Update']")
    private WebElement idFilterUpdateButton;

    @FindBy(xpath = "//input[@placeholder='Label']")
    private WebElement labelFilterInputBox;

    @FindBy(xpath = "//select[@id='Type']")
    private WebElement itemTypeSelectFilter;

    @FindBy(xpath = "//span[@id='select2-Type-container']")
    private WebElement itemTypeFilterBox;

    @FindBy(xpath = "//tbody")
    private WebElement tagsTableValuePart;

    @FindBy(xpath = "//tr/th[1]")
    private WebElement idHeader;

    @FindBy(xpath = "//tr/td[1]")
    private List<WebElement> idValues;

    @FindBy(xpath = "//tr/th[2]")
    private WebElement labelHeader;

    @FindBy(xpath = "//tr/td[2]")
    private List<WebElement> labelValues;

    @FindBy(xpath = "//tr/th[3]")
    private WebElement itemTypeHeader;

    @FindBy(xpath = "//tr/td[3]")
    private List<WebElement> itemTypeValues;

    @FindBy(xpath = "//tr/td[4]/a[1]")
    private List<WebElement> editTagButtons;

    @FindBy(xpath = "//tr/td[4]/a[2]")
    private List<WebElement> deleteTagButtons;

    @FindBy(xpath = "//button[@id='tags_tableFirstPage']")
    private WebElement firstPaginationButton;

    @FindBy(xpath = "//button[@id='tags_tableLastPage']")
    private WebElement lastPaginationButton;

    @FindBy(xpath = "//span[@id='tags_table_previous']")
    private WebElement previousPaginationButton;

    @FindBy(xpath = "//span[@id='tags_table_next']")
    private WebElement nextPaginationButton;

    @FindBy(xpath = "//div[@id='tags_table_info']")
    private WebElement tableInfoInTagsPage;

    @FindBy(xpath = "//input[@class='pagination-text']")
    private WebElement paginationInputBox;

    @FindBy(xpath = "//div[@id='notifyjs-container-top-right']/div/span")
    private WebElement generalWarningElement;

    @FindBy(xpath = "//select[@name='tags_table_length']")
    private WebElement tableLengthSelectDropdown;

    @FindBy(xpath = "//tr/td")
    private WebElement emptyTableMessage;

    @FindBy(xpath = "//span[text()='IdFromMustBeLessThanIdTo']")
    private WebElement idFromMustBeLessThanIdToWaringPopup;

    @FindBy(id = "create-tag-button")
    private WebElement createNewTagButton;

    @FindBy(id = "cancelCreate")
    private WebElement cancelButtonInCreateNewTagModal;

    @FindBy(id = "labelTag")
    private WebElement labelInputBoxInCreateNewTagModal;

    @FindBy(xpath = "//div[2]/div/div[2]/div[2]/select")
    private WebElement itemTypesSelectInCreateNewTagModal;

    @FindBy(id = "create-tag-button-modal")
    private WebElement createButtonInCreateNewTagModal;

    @FindBy(id = "cancelEditTag")
    private WebElement cancelButtonInEditTagModal;

    @FindBy(id = "edit-tag")
    private WebElement saveButtonInEditTagModal;

    @FindBy(xpath = "//h4[text()='Create New']")
    private WebElement createNewTagModalHeader;

    @FindBy(xpath = "//h4[text()='EditTag']")
    private WebElement editTagModalHeader;

    @FindBy(id = "labelTagEdit")
    private WebElement labelInputBoxInEditTagModal;

    @FindBy(id = "checkbox-item-type")
    private WebElement areYouSureTagEditCheckBox;

    @FindBy(id = "cancelTagBtn")
    private WebElement cancelButtonInDeleteTagModal;

    @FindBy(id = "removeTagBtn")
    private WebElement deleteButtonInDeleteTagModal;

    String tagLabelForCreate = "newTagLabel";
    String tagLabelWithDifferentItemType = "newTagLabel";
    String tagLabelForEdit = "editedTagLabel";

    public void goToTagsPage() {
        goToSubMenu("Settings", "Tags");
        BrowserUtils.wait(2);
    }

    public void goToSubMenu(String dropdownMenu, String subMenu) {
        if (dropdownMenu.equalsIgnoreCase("Settings")) {
            settingsWheelSymbol.click();
            settingsMenu.click();
            BrowserUtils.waitForClickability(settingsOptions.get(0), 10);

            for (WebElement option : settingsOptions) {
                if (option.getText().equalsIgnoreCase(subMenu)) {
                    option.click();
                    return;
                }
            }
        } else if (dropdownMenu.equalsIgnoreCase("System")) {
            settingsWheelSymbol.click();
            systemMenu.click();

            for (WebElement option : systemOptions) {
                if (option.getText().equalsIgnoreCase(subMenu)) {
                    option.click();
                    return;
                }
            }
        }
        BrowserUtils.waitForVisibility(tagsTableValuePart, 10);
    }

    public void enterInputToLabelFilter(String input) {
        labelFilterInputBox.clear();
        labelFilterInputBox.sendKeys(input);
        BrowserUtils.wait(5);
    }

    public void verifyLabelFilterResultsAreCorrect(String input) {
        for (WebElement value : labelValues) {
            Assert.assertTrue(value.getText().toLowerCase().contains(input));
        }
    }

    public void verifyNoMatchingRecordsFoundIsDisplayed(String message) {
        Assert.assertTrue(emptyTableMessage.isDisplayed());
        Assert.assertEquals(message, emptyTableMessage.getText());
    }

    public void verifyLabelFilterHasNoValue() {
        String actualValue = CurrenciesPage.getValueInInputBox(labelFilterInputBox);
        Assert.assertEquals("", actualValue);
    }

    public static List<Integer> getIntListFromWebElementList(List<WebElement> webElementList) {
        List<Integer> intList = new ArrayList<>();
        for (WebElement webElement : webElementList) {
            intList.add(Integer.parseInt(webElement.getText().trim()));
        }
        return intList;
    }

    public boolean areIdValuesAscending() {
        List<Integer> idValuesAsInt = getIntListFromWebElementList(idValues);
        for (int i = 0; i < idValuesAsInt.size() - 1; i++) {
            if (idValuesAsInt.get(i) > idValuesAsInt.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void clickIdHeaderForDescending() {
        clickHeaderForDescendingSort(idHeader);
    }

    public boolean areIdValuesDescending() {
        List<Integer> idValuesAsInt = getIntListFromWebElementList(idValues);
        for (int i = 0; i < idValuesAsInt.size() - 1; i++) {
            if (idValuesAsInt.get(i) < idValuesAsInt.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void clickLabelHeaderForAscendingSort() {
        labelHeader.click();
        clickHeaderForAscendingSort(labelHeader);
    }

    public boolean areLabelValuesAscending() {
        return areValuesAscending(labelValues);
    }

    public void clickLabelHeaderForDescendingSort() {
        labelHeader.click();
        clickHeaderForDescendingSort(labelHeader);
    }

    public boolean areLabelValuesDescending() {
        return areValuesDescending(labelValues);
    }

    public void clickItemTypeHeaderForAscendingSort() {
        itemTypeHeader.click();
        clickHeaderForAscendingSort(itemTypeHeader);
    }

    public boolean areItemTypesValuesAscending() {
        return areValuesAscending(itemTypeValues);
    }

    public void clickItemTypeHeaderForDescendingSort() {
        itemTypeHeader.click();
        clickHeaderForDescendingSort(itemTypeHeader);
    }

    public boolean areItemTypesValuesDescending() {
        return areValuesDescending(itemTypeValues);
    }

    public void enterIdFilterValues(int idFrom, int idTo) {
        idFilter.click();
        BrowserUtils.waitForVisibility(idFromInputBox,8);
        idFromInputBox.sendKeys(idFrom + "");
        idToInputBox.sendKeys(idTo + "");
    }

    public static void waitForInvisibilityOfElement(WebElement element) {
        while (element.isDisplayed()) {
            BrowserUtils.wait(1);
        }
    }

    public void clickUpdateButtonInIdFilter() {
        idFilterUpdateButton.click();
        waitForInvisibilityOfElement(idFilterUpdateButton);
        BrowserUtils.wait(2);
    }

    public void verifyIdsAreBetweenIdFromAndIdToInclusive(int idFrom, int idTo) {
        boolean isResultCorrect = true;
        List<Integer> idValuesAsIntList = getIntListFromWebElementList(idValues);
        for (int id : idValuesAsIntList) {
            if (id < idFrom || id > idTo) {
                isResultCorrect = false;
                break;
            }
        }
        Assert.assertTrue(isResultCorrect);
    }

    public void verifyIdFromMustBeLessThanIdToWarningIsDisplayed(String expectedWarning) {
        BrowserUtils.waitForVisibility(idFromMustBeLessThanIdToWaringPopup,5);
        Assert.assertEquals(idFromMustBeLessThanIdToWaringPopup.getText(), expectedWarning);
    }

    public void verifyIdFilterHasNoValue() {
        /*BrowserUtils.wait(2);
        idFilter.click();
        BrowserUtils.waitForVisibility(idFromInputBox,8);*/
        String actualValueFrom = CurrenciesPage.getValueInInputBox(idFromInputBox);
        String actualValueTo = CurrenciesPage.getValueInInputBox(idToInputBox);
        Assert.assertEquals("", actualValueFrom);
        Assert.assertEquals("", actualValueTo);
    }

    public void selectValueFromTypeSelectFilter(String option) {
        BrowserUtils.selectDropdownOptionByVisibleText(itemTypeSelectFilter, option);
        BrowserUtils.wait(2);
    }

    public void verifyTableHasOnlyFilteredValues(String filteredValue) {
        for (WebElement value : itemTypeValues) {
            Assert.assertEquals(filteredValue, value.getText());
        }
    }

    public void verifyItemTypeFilterHasValueTypeAll(String typeAll) {
        Assert.assertEquals(typeAll, itemTypeFilterBox.getText());
    }

    public void verifyFirstAndPreviousButtonsAreInactiveInFirstPageOfTableInTagsPage() {
        Assert.assertFalse(isButtonActive(firstPaginationButton) || isButtonActive(previousPaginationButton));
    }

    public void enterLastPageNumberInToPaginationInputBox() {
        paginationInputBox.clear();
        paginationInputBox.sendKeys(findLastPageNumber() + "");
        BrowserUtils.wait(5);
    }

    public int findLastPageNumber() {
        int totalCurrencyCount = Integer.parseInt(tableInfoInTagsPage.getText().split(" ")[5]);
        int visibleCurrencyCount = Integer.parseInt(getSelectedOption(tableLengthSelectDropdown));
        return (int) Math.ceil((double) totalCurrencyCount / visibleCurrencyCount);
    }

    public void verifyLastAndNextButtonsAreInactiveInLastPageOfTable() {
        BrowserUtils.waitForVisibility(lastPaginationButton, 10);
        Assert.assertFalse(isButtonActive(lastPaginationButton) || isButtonActive(nextPaginationButton));
    }

    public void clickLastPaginationButtonInTagsPage() {
        waitForClickableOfButton(lastPaginationButton);
        lastPaginationButton.click();
        waitForUnclickableOfButton(lastPaginationButton);
    }

    public void verifyTableIsInLastPageInTagsPage() {
        BrowserUtils.wait(2);
        verifyTableIsInLastPage(paginationInputBox,tableInfoInTagsPage,tableLengthSelectDropdown);
    }

    public void clickFirstPaginationButton() {
        BrowserUtils.wait(2);
        firstPaginationButton.click();
        waitForUnclickableOfButton(firstPaginationButton);
    }

    public void verifyTableIsInFirstPageInTagsPage() {
        verifyTableIsInFirstPage(paginationInputBox);
    }

    public void clickNextPaginationButtonInTagsPage() {
        nextPaginationButton.click();
        BrowserUtils.wait(2);
    }

    public void verifyTableGoToNextPageInTagsPage() {
        Assert.assertEquals("2", getValueInInputBox(paginationInputBox));
    }

    public void clickPreviousPaginationButtonInTagsPage() {previousPaginationButton.click();}

    public void verifyTableGoToPreviousPageInTagsPage() {
        BrowserUtils.wait(2);
        Assert.assertEquals("1", getValueInInputBox(paginationInputBox));
    }

    public void clickCreateNewButtonInTagsPage() {
        BrowserUtils.waitForVisibility(createNewTagButton,20);
        createNewTagButton.click();
    }

    public void verifyCancelButtonIsActiveInCreateTagModal() {
        BrowserUtils.waitForVisibility(cancelButtonInCreateNewTagModal,20);
        Assert.assertTrue(isButtonActive(cancelButtonInCreateNewTagModal));
    }

    public void fillLabelInputInCreateNewTagModal() {
        BrowserUtils.waitForVisibility(labelInputBoxInCreateNewTagModal,20);
        labelInputBoxInCreateNewTagModal.sendKeys(tagLabelForCreate);
    }

    public void selectItemTypeInCreateOrEditTagModal(String itemType) {
        BrowserUtils.waitForVisibility(itemTypesSelectInCreateNewTagModal,10);
        BrowserUtils.selectDropdownOptionByVisibleText(itemTypesSelectInCreateNewTagModal, itemType);
    }

    public void verifyCreateButtonIsActiveInCreateNewTagModal() {
        Assert.assertTrue(isButtonActive(createButtonInCreateNewTagModal));
    }

    public void verifyCreateNewButtonIsInactiveInCreateNewTagModal() {
        Assert.assertFalse(isButtonActive(createButtonInCreateNewTagModal));
    }

    public void clickCreateButtonInCreateNewTagModal() {
        createButtonInCreateNewTagModal.click();
    }

    public void verifyNewTagIsInTable(String itemType) {
        Assert.assertTrue(isTagLabelValueInTable(tagLabelForCreate,itemType));
    }

    private boolean isTagLabelValueInTable(String tagLabelForCreate, String itemType) {
        enterInputToLabelFilter(tagLabelForCreate);
        selectValueFromTypeSelectFilter(itemType);
        List<String> labelValuesAsString = getStringListFromWebElementList(labelValues);
        return labelValuesAsString.contains(tagLabelForCreate.toLowerCase());
    }

    public void verifyWarningMessageIsDisplayed(String message) {
        BrowserUtils.waitForVisibility(generalWarningElement,10);
        Assert.assertEquals(generalWarningElement.getText(), message);
    }

    public void clickEditTagButton() {
        enterInputToLabelFilter(tagLabelForCreate);
        editTagButtons.get(0).click();
    }

    public void verifyCancelButtonIsActiveInEditTagModal() {
        Assert.assertTrue(isButtonActive(cancelButtonInEditTagModal));
    }

    public void verifySaveButtonIsPassiveInEditTagModal() {
        Assert.assertFalse(isButtonActive(saveButtonInEditTagModal));
    }

    public void clickCancelButtonInCreateNewTagModal() {
        BrowserUtils.waitForVisibility(cancelButtonInCreateNewTagModal,5);
        cancelButtonInCreateNewTagModal.click();
    }

    public void verifyCreateNewTagModalIsClosed() {
        Assert.assertTrue(isPopupClosed(createNewTagModalHeader));
    }

    public void clickCancelButtonInEditTagModal() {
        BrowserUtils.waitForVisibility(cancelButtonInEditTagModal,5);
        cancelButtonInEditTagModal.click();
    }

    public void verifyEditTagModalIsClosed() {
        Assert.assertTrue(isPopupClosed(editTagModalHeader));
    }

    public void editLabelInEditTagModal() {
        labelInputBoxInEditTagModal.clear();
        labelInputBoxInEditTagModal.sendKeys(tagLabelForEdit);
    }

    public void verifySaveButtonIsActiveInEditTagModal() {
        Assert.assertTrue(isButtonActive(saveButtonInEditTagModal));
    }

    public void clickSaveButtonInEditTagModal() {
        saveButtonInEditTagModal.click();
    }

    public static void selectLengthFromTableLength(WebElement select, String length) {
        BrowserUtils.selectDropdownOptionByVisibleText(select,length);
        BrowserUtils.wait(2);
    }

    public void selectLengthFromTableLengthInTagsPage(String length) {
        selectLengthFromTableLength(tableLengthSelectDropdown,length);
    }

    public static boolean isRowCountCorrectAccordingToTableLength(WebElement tableInfo, String length) {
        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//tr/td[1]"));
        int maxDataCount = Integer.parseInt(tableInfo.getText().split(" ")[5]);
        int lengthAsInt = Integer.parseInt(length);
        return rows.size() == Math.min(maxDataCount, lengthAsInt);
    }

    public void verifyTableContainsRightRowsAccordingToLengthInTag(String length) {
        Assert.assertTrue(isRowCountCorrectAccordingToTableLength(tableInfoInTagsPage,length));
    }

    public void clickDeleteTagButton() {
        enterInputToLabelFilter(tagLabelForEdit);
        BrowserUtils.waitForVisibility(deleteTagButtons.get(0),10);
        deleteTagButtons.get(0).click();
    }

    public void verifyCancelButtonIsActiveInDeleteTagButton() {
        Assert.assertTrue(isButtonActive(cancelButtonInDeleteTagModal));
    }

    public void verifyDeleteButtonIsActiveInDeleteTagButton() {
        Assert.assertTrue(isButtonActive(deleteButtonInDeleteTagModal));
    }

    public void clickDeleteButtonInDeleteTagModal() {
        deleteButtonInDeleteTagModal.click();
    }

    public void clickCancelButtonInDeleteTagModal() {
        cancelButtonInDeleteTagModal.click();
    }

    public void verifyDeleteTagModalIsClosed() {
        Assert.assertTrue(isPopupClosed(deleteButtonInDeleteTagModal));
    }

    public void undoneChangesInLabel() {
        labelInputBoxInEditTagModal.clear();
        labelInputBoxInEditTagModal.sendKeys(tagLabelForCreate);
    }
}
