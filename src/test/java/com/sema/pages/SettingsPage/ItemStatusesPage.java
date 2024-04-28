package com.sema.pages.SettingsPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemStatusesPage extends BasePage {
    @FindBy(id = "setting-wheel")
    private WebElement settingsWheelSymbol;

    @FindBy(xpath = "//li/a[text()='Settings']")
    private WebElement settingsMenu;

    @FindBy(xpath = "//a[@id='systemid']")
    private WebElement systemMenu;

    @FindBy(xpath = "//li[5]/ul/li[1]/ul/li/a")
    private List<WebElement> settingsOptions;

    @FindBy(xpath = "//li[5]/ul/li[2]/ul/li/a")
    private List<WebElement> systemOptions;

    @FindBy(xpath = "//tbody")
    private WebElement itemStatusesTableValuePart;

    @FindBy(id = "id")
    private WebElement idFilterInputBox;

    @FindBy(xpath = "//tr/td[1]")
    private List<WebElement> idValues;

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
        BrowserUtils.waitForVisibility(itemStatusesTableValuePart, 10);
    }

    public void goToItemStatusesPage() {
        goToSubMenu("Settings", "ItemStatuses");
        BrowserUtils.wait(2);
    }

    public void enterIdInToIdFilter(int idValue) {
        idFilterInputBox.sendKeys(idValue + "");
        BrowserUtils.wait(2);
    }

    public void verifyIdColumnHasOnlySearchValue(int idValue) {
        Assert.assertEquals(1, idValues.size());
        for (WebElement value : idValues) {
            Assert.assertTrue(value.getText().equalsIgnoreCase(idValue + ""));
        }
    }
}
