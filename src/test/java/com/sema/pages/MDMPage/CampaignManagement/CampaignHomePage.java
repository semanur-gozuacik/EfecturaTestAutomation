package com.sema.pages.MDMPage.CampaignManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class CampaignHomePage extends BasePage {

    @FindBy(xpath = "//tr//td[6]")
    private WebElement verifyCampaignCodeFilter;

    @FindBy(xpath = "//td[normalize-space()='TESTSETSET123123']")
    private WebElement deletingObject;

    public CampaignHomePage() {
    }

    public void verifyCampaignCodeFilter(String code) {
        BrowserUtils.wait(5);
        Assert.assertEquals(getColumnData(table, "CODE").get(0), code);
//        assertTrue(verifyCampaignCodeFilter.getText().equalsIgnoreCase(code));
    }

    public void verifyDeletingObject(String code) {
        BrowserUtils.waitForVisibility(deletingObject, 5);
        assertTrue(deletingObject.getText().equalsIgnoreCase(code));
    }
}
