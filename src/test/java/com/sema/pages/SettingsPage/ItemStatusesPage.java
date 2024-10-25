package com.sema.pages.SettingsPage;

import com.sema.pages.BasePage;
import com.sema.pages.SystemPage.CurrenciesPage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.sema.pages.SystemPage.CurrenciesPage.clickHeaderForAscendingSort;


public class ItemStatusesPage extends BasePage {
    @FindBy(id = "setting-wheel")
    private WebElement settingsWheelSymbol;

    @FindBy(xpath = "//li/a[text()='Settings']")
    private WebElement settingsMenu;

    @FindBy(xpath = "//a[@id='systemid']")
    private WebElement systemMenu;

    @FindBy(xpath = "//li[6]/ul/li[1]/ul/li/a")
    private List<WebElement> settingsOptions;

    @FindBy(xpath = "//li[6]/ul/li[2]/ul/li/a")
    private List<WebElement> systemOptions;

    @FindBy(xpath = "//tbody")
    private WebElement itemStatusesTableValuePart;

    @FindBy(xpath= "//input[@id='id-item-statuses-table']")
    private WebElement idFilterInputBox;

    @FindBy(xpath = "//a[contains(text(),'Id')]")
    private WebElement idFilter;

    @FindBy(xpath = "//tr/td[1]")
    private List<WebElement> idValues;

    @FindBy(xpath = "//tr/th[1]")
    private WebElement idHeader;

    @FindBy(id = "createItem")
    private WebElement createNewButton;

    @FindBy(xpath= "//button[@id='save-resource']/preceding-sibling::button[contains(text(),'Cancel')]")
    private WebElement cancelButtonInCreateNewModal;

    @FindBy(xpath = "//input[contains(@class,'locale-input')]")
    private List<WebElement> localeInputBoxesInCreateNewModal;

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
        BrowserUtils.waitForVisibility(itemStatusesTableValuePart, 10);
    }

    public void goToItemStatusesPage() {
        goToSubMenu("Settings", "ItemStatuses");
        BrowserUtils.wait(2);
    }

    public void enterIdInToIdFilter(int idValue) {
        idFilter.click();
        idFilterInputBox.sendKeys(idValue + "");
        BrowserUtils.wait(2);
    }

    public void verifyIdColumnHasOnlySearchValue(int idValue) {
        BrowserUtils.wait(2);
        Assert.assertEquals(1, idValues.size());
        for (WebElement value : idValues) {
            Assert.assertTrue(value.getText().equalsIgnoreCase(idValue + ""));
        }
    }

    public void verifyIdFilterHasNoValueInItemStatusesPage() {
        String actualValue = CurrenciesPage.getValueInInputBox(idFilterInputBox);
        Assert.assertEquals("", actualValue);
    }

    public void clickIdHeaderForAscendingSort() {
        clickHeaderForAscendingSort(idHeader);
    }

    public void clickCreateNewButtonInItemStatus() {
        BrowserUtils.waitForVisibility(createNewButton,20);
        createNewButton.click();
    }

    public void verifyCancelButtonIsActiveInCreateItemStatusModal() {
        BrowserUtils.waitForVisibility(cancelButtonInCreateNewModal,20);
        Assert.assertTrue(BrowserUtils.isButtonActive(cancelButtonInCreateNewModal));
    }

    public void fillLocaleInputsExceptOneOfThem() {
        for (int i = 0; i < localeInputBoxesInCreateNewModal.size() - 1; i++) {
            localeInputBoxesInCreateNewModal.get(i).sendKeys("testLocale");
        }
    }

    public void fillAllLocaleInputs() {
        for (WebElement webElement : localeInputBoxesInCreateNewModal) {
            webElement.sendKeys("testLocale");
        }
    }
}
