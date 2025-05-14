package com.sema.pages.MDMPage.AccountManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountHomePage extends BasePage {
    
    @FindBy(xpath = "//span[contains(@class, 'select2-selection') and contains(@class, 'select2-selection--single')]\n")
    private WebElement associatedFilterClick;
    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='textbox']")
    private WebElement associatedAllFilter;
    @FindBy(xpath = "(//input[@id='userselect'])[1]")
    private WebElement selectFirstItem;
    @FindBy(xpath = "//tbody/tr/td[3]/div[1]")
    private List<WebElement> noAssociatedText;
    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='textbox']")
    private WebElement associatedNoFilter;
    public void onTheAccountPage() {
        driver.navigate().to("https://sandbox-ui.efectura.com/Enrich/Items?itemType=Account");
    }

    public void clickAssociatedFilter() {
        BrowserUtils.wait(7);
        associatedFilterClick.click();

    }

    public void clickAssociatedAllFilter() {
        BrowserUtils.waitForVisibility(associatedAllFilter, 10);
        associatedAllFilter.sendKeys("All"+ Keys.ENTER);
    }

    public void clicksSelectFirstItem() {
        accordionButton.click();
        BrowserUtils.wait(7);
        selectFirstItem.click();
        BrowserUtils.wait(5);
    }

}
