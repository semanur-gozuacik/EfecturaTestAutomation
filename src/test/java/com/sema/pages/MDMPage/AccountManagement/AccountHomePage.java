package com.sema.pages.MDMPage.AccountManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountHomePage extends BasePage {
    @FindBy(xpath = "//a[normalize-space()='Associated']")
    private WebElement associatedFilterClick;
    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='textbox']")
    private WebElement associatedAllFilter;
    @FindBy(xpath = "(//tr[@class='odd']//input[@id='userselect'])[1]")
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
        BrowserUtils.wait(7);
        selectFirstItem.click();
        BrowserUtils.wait(5);
    }
    public void clickAssociatedNoFilter() {
        BrowserUtils.wait(10);
        associatedNoFilter.sendKeys("No"+ Keys.ENTER);
    }
public void verifyAssociatedNoFilter(){
    BrowserUtils.wait(9);

    for (int i= 0; i<noAssociatedText.size();i++){
            Assert.assertTrue(noAssociatedText.get(i).getText().equals("No"));

        }

}
}
