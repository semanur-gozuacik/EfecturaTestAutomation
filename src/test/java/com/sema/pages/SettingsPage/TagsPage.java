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
import static com.sema.utilities.BrowserUtils.isButtonActive;

public class TagsPage extends BasePage {

    @FindBy(xpath = "//a[@id='setting-wheel']")
    private WebElement settingsWheelSymbol;

    @FindBy(xpath = "//li/a[text()='Settings']")
    private WebElement settingsMenu;

    @FindBy(xpath = "//a[@id='systemid']")
    private WebElement systemMenu;

    @FindBy(xpath = "//li[6]/ul/li[1]/ul/li/a")
    private List<WebElement> settingsOptions;

    @FindBy(xpath = "//li[6]/ul/li[2]/ul/li/a")
    private List<WebElement> systemOptions;

    @FindBy(xpath = "//a[contains(text(),'Id')]")
    private WebElement idFilter;

    @FindBy(xpath = "//input[@id='Id_From-tags_table']")
    private WebElement idFromInputBox;

    @FindBy(xpath = "//input[@id='Id_To-tags_table']")
    private WebElement idToInputBox;

    @FindBy(xpath = "//span[text()='Update']")
    private WebElement idFilterUpdateButton;

    @FindBy(xpath = "//input[@placeholder='Label']")
    private WebElement labelFilterInputBox;

    @FindBy(xpath = "//a[contains(text(),'Label')]")
    private  WebElement labelFilter;

    @FindBy(xpath = "//select[@id='Typetags_table']")
    private WebElement itemTypeSelectFilter;

    @FindBy(xpath = "//a[contains(text(),'ItemType')]")
    private WebElement itemTypeFilter;

    @FindBy(xpath = "//span/span[1]/input")
    private WebElement itemTypeFilterInputBox;

    @FindBy(xpath = "//div[3]/div/span[1]/span[1]/span/span[1]")
    private WebElement itemTypeSelectedValuePart;

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

    @FindBy(xpath = "//a[@title='Delete']")
    private List<WebElement> deleteTagButtons;

    @FindBy(xpath = "//button[@id='tags_tableFirstPage']")
    private WebElement firstPaginationButton;

    @FindBy(xpath = "//button[@id='tags_tableLastPage']")
    private WebElement lastPaginationButton;

    @FindBy(xpath = "//span[@id='tags_table_previous']")
    private WebElement previousPaginationButton;

    @FindBy(xpath = "//span[@id='tags_table_next']")
    private WebElement nextPaginationButton;

    @FindBy(xpath = "//div[2]/div[1]/div/div[1]/div[4]")
    private WebElement tableInfo;

    @FindBy(xpath = "//input[@class='pagination-text']")
    private WebElement paginationInputBox;

    @FindBy(xpath = "//div[@id='notifyjs-container-top-right']/div/span")
    private WebElement generalWarningElement;

    @FindBy(xpath = "//label/select")
    private WebElement tableLengthSelectDropdown;

    @FindBy(xpath = "//tr/td")
    private WebElement emptyTableMessage;

    @FindBy(xpath = "//span[text()=\"'from' cannot be greater than 'to'\"]")
    private WebElement idFromMustBeLessThanIdToWaringPopup;

    @FindBy(id = "create-tag-button")
    private WebElement createNewTagButton;

    @FindBy(xpath= "//button[@id='create-tag-button-modal']/preceding-sibling::button[contains(text(),'Cancel')]")
    private WebElement cancelButtonInCreateNewTagModal;

    @FindBy(xpath = "//h5[text()='Label']/following-sibling::input[contains(@id, 'label')]")
    private WebElement labelInputBoxInCreateNewTagModal;

    @FindBy(xpath = "//span/span[1]/span/span[1]/span")
    private WebElement itemTypesSelectBoxInCreateNewTagModal;

    @FindBy(xpath = "//div[6]/div/div/div[2]/div[2]/span/span[1]/span/span[1]")
    private WebElement itemTypesSelectBoxInEditTagModal;

    @FindBy(xpath = "//h4[contains(@class,'modal-title modalTitle')]")
    private WebElement modalTitle;

    @FindBy(xpath = "//div/div[4]/div/div/div[2]/div[2]/select")
    private WebElement itemTypesSelectInCreateNewTagModal;

    @FindBy(xpath = "//div[6]/div/div/div[2]/div[2]/select")
    private WebElement itemTypesSelectInEditTagModal;

    @FindBy(xpath = "//button[contains(text(),'Cancel')]/following-sibling::button[@title='Create']")
    private WebElement createButtonInCreateNewModal;

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
    String tagLabelForEdit = "editedTagLabel";

    public void goToTagsPage() {
//        goToSubMenu("Settings", "Tags");
        driver.get("https://sandbox-ui.efectura.com/Settings/Tags");
        BrowserUtils.wait(3);
    }

    public void goToSubMenu(String dropdownMenu, String subMenu) {
        if (dropdownMenu.equalsIgnoreCase("Settings")) {
            settingsWheelSymbol.click();
            settingsMenu.click();
            BrowserUtils.wait(1);
            BrowserUtils.waitForClickability(settingsOptions.get(4), 10);

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
        labelFilter.click();
        labelFilterInputBox.clear();
        labelFilterInputBox.sendKeys(input);
        BrowserUtils.wait(5);
    }
    public void onTheTagsSettingPage(){
        driver.navigate().to("https://sandbox-ui.efectura.com/Settings/Tags");
    }
    public void verifyLabelFilterResultsAreCorrect(String input) {
        for (WebElement value : labelValues) {
            Assert.assertTrue(value.getText().toLowerCase().contains(input.toLowerCase()));
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
        BrowserUtils.wait(5);
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
        int count = 0;
        while (element.isDisplayed()) {
            BrowserUtils.wait(1);
            if (count == 10) {
                break;
            }
            count++;
        }
    }

    public void clickUpdateButtonInIdFilter() {
        idFilterUpdateButton.click();
        //waitForInvisibilityOfElement(idFilterUpdateButton);
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
        itemTypeFilter.click();
        BrowserUtils.selectDropdownOptionByVisibleText(itemTypeSelectFilter, option);
        BrowserUtils.wait(2);
    }

    public void verifyTableHasOnlyFilteredValues(String filteredValue) {
        BrowserUtils.wait(2);
        for (WebElement value : itemTypeValues) {
            Assert.assertEquals(filteredValue, value.getText());
        }
    }

    public void verifyItemTypeFilterHasValueTypeAll(String typeAll) {
        itemTypeFilter.click();
        BrowserUtils.isOptionSelected(itemTypeSelectFilter,typeAll);
        //Assert.assertEquals(typeAll, itemTypeSelectedValuePart.getText());
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
        BrowserUtils.wait(1);
        int totalCurrencyCount = Integer.parseInt(tableInfo.getText().split(" ")[5]);
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
        verifyTableIsInLastPage(paginationInputBox, tableInfo,tableLengthSelectDropdown);
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
        BrowserUtils.wait(2);
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
        BrowserUtils.wait(2);
        BrowserUtils.waitForVisibility(labelInputBoxInCreateNewTagModal,20);
        labelInputBoxInCreateNewTagModal.sendKeys(tagLabelForCreate);
    }

    public void selectItemTypeInCreateTagModal(String itemType) {
//        BrowserUtils.waitForVisibility(itemTypesSelectInCreateNewTagModal,10);
        itemTypesSelectBoxInCreateNewTagModal.click();
        BrowserUtils.wait(2);
        BrowserUtils.selectDropdownOptionByVisibleText(itemTypesSelectInCreateNewTagModal, itemType);
        BrowserUtils.wait(2);
        labelInputBoxInCreateNewTagModal.click();

    }

    public void selectItemTypeInEditTagModal(String itemType) {
        itemTypesSelectBoxInEditTagModal.click();
        BrowserUtils.wait(1);
        BrowserUtils.selectDropdownOptionByVisibleText(itemTypesSelectInEditTagModal, itemType);
        BrowserUtils.wait(1);
        labelInputBoxInEditTagModal.click();
    }

    public void verifyCreateButtonIsActiveInCreateNewModal() {
        Assert.assertTrue(isButtonActive(createButtonInCreateNewModal));
    }

    public void verifyCreateNewButtonIsInactiveInCreateNewModal() {
        Assert.assertFalse(isButtonActive(createButtonInCreateNewModal));
    }

    public void clickCreateButtonInCreateNewTagModal() {
        createButtonInCreateNewModal.click();
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
        BrowserUtils.wait(3);
        BrowserUtils.waitForVisibility(generalWarningElement,20);
        Assert.assertEquals(message, generalWarningElement.getText());
    }

    public void clickEditTagButton() {
        enterInputToLabelFilter(tagLabelForCreate);
        editTagButtons.get(0).click();
    }

    public void verifyCancelButtonIsActiveInEditTagModal() {
        Assert.assertTrue(isButtonActive(cancelButtonInEditTagModal));
    }

    public void verifySaveButtonIsPassiveInEditTagModal() {
        BrowserUtils.wait(5);
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
        BrowserUtils.wait(3);
        selectLengthFromTableLength(tableLengthSelectDropdown,length);
    }



    public void clickDeleteTagButton() {
        enterInputToLabelFilter(tagLabelForEdit);
        BrowserUtils.wait(1);
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
        BrowserUtils.wait(2);
    }

    public void selectAreYouSureTagEditCheckBox() {
        BrowserUtils.wait(4);
        areYouSureTagEditCheckBox.click();
    }

}
