package com.sema.pages.SettingsPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attributes extends BasePage {
    @FindBy(id="attributesid")
    private WebElement attributesElement;
    @FindBy(xpath="//a[normalize-space()='Attributes Overview']")
    private WebElement attrbutesPageVerificationsElement;
    @FindBy(xpath="//tbody/tr[1]/td[9]/a[1]")
    private WebElement editButton;
    public Attributes() {
    }
    public void clickAttributeElement(){
        BrowserUtils.waitForVisibility(attributesElement,20);
        attributesElement.click();
    }
    public void verifyFamilyPage(){
        BrowserUtils.waitForVisibility(attrbutesPageVerificationsElement,25);
        Assert.assertTrue(attrbutesPageVerificationsElement.isDisplayed());
    }
    public void clickEditButton() {
        BrowserUtils.wait(6);
        editButton.click();
    }
}
