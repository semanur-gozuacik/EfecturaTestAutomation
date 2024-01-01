package com.sema.pages.MDMPage.AccountManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountHomePage extends BasePage {
    @FindBy(xpath = "//span[@id='select2-filter-IsAssociated-container']")
    private WebElement associatedFilter;
    @FindBy(xpath = "//li[contains(text(),'Associated All') and @role='treeitem']")
    private WebElement associatedAllFilter;
    @FindBy(xpath = "(//tr[@class='odd']//input[@id='userselect'])[1]")
    private WebElement selectFirstItem;
    @FindBy(xpath = "//tbody/tr/td[3]/div[1]")
    private List<WebElement> noAssociatedText;
    @FindBy(xpath = "//li[contains(text(),'No') and @role='treeitem']")
    private WebElement associatedNoFilter;
    public void onTheAccountPage() {
        driver.navigate().to("https://sandbox.efectura.com/Enrich/Items?itemType=Account");
    }

    public void clickAssociatedFilter() {
        BrowserUtils.waitForVisibility(associatedFilter, 30);
        associatedFilter.click();
    }

    public void clickAssociatedAllFilter() {
        BrowserUtils.waitForVisibility(associatedAllFilter, 30);
        associatedAllFilter.click();
    }

    public void clicksSelectFirstItem() {
        BrowserUtils.waitForVisibility(selectFirstItem, 20);
        selectFirstItem.click();
        BrowserUtils.wait(3);
    }
    public void clickAssociatedNoFilter() {
        BrowserUtils.waitForVisibility(associatedNoFilter, 20);
        associatedNoFilter.click();
    }
public void verifyAssociatedNoFilter(){
    BrowserUtils.wait(3);

    for (int i= 0; i<noAssociatedText.size();i++){
            Assert.assertTrue(noAssociatedText.get(i).getText().equals("No"));

        }

}
}