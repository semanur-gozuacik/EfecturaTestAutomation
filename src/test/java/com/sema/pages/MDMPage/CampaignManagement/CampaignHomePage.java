package com.sema.pages.MDMPage.CampaignManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class CampaignHomePage extends BasePage {
    @FindBy(xpath = "//tr//td[7]")
    private WebElement verifyCampaignCodeFilter;
    public CampaignHomePage() {
    }
    public void verifyCampaignCodeFilter(String code) {
        BrowserUtils.waitForVisibility(verifyCampaignCodeFilter,25);
        assertTrue(verifyCampaignCodeFilter.getText().equalsIgnoreCase(code));
    }
}
