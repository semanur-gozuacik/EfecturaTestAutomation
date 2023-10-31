package com.sema.pages;


import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//img[@id='navLogo']")
    private WebElement basariliLoginDogrulama;
    @FindBy(id = "MDL")
    private WebElement MDM;
    @FindBy(id = "Contract ManagementH")
    private WebElement contractManagement;
    @FindBy(id = "Contract")
    private WebElement contract;
    @FindBy(id = "Asset ManagementH")
    private WebElement assetManagement;
    @FindBy(id = "KPI")
    private WebElement KPI;
    @FindBy(id = "KPI ManagementH")
    private WebElement KPIManagement;
    @FindBy(id = "Asset")
    private WebElement asset;
    @FindBy(id = "Gift ManagementH")
    private WebElement giftManagement;
    @FindBy(id = "Gift")
    private WebElement gift;
    @FindBy(id = "Contact")
    private WebElement contact;
    @FindBy(id = "Contact ManagementH")
    private WebElement contactManagement;
    @FindBy(id = "Campaign")
    private WebElement campaign;
    @FindBy(id = "Campaign ManagementH")
    private WebElement campaignManagement;
    @FindBy(xpath = "//a[@id='Event']")
    private WebElement event;
    @FindBy(xpath = "//a[@id='Event ManagementH']")
    private WebElement eventManagement;
    @FindBy(xpath = "//a[@id='setting-wheel']")
    private WebElement systemElementSymbol;
    @FindBy(xpath = "//a[@id='systemid']")
    private WebElement systemElement;
    @FindBy(xpath = "//a[@id='blacklistid']")
    private WebElement blackListElement;

    public HomePage() {
    }

    public void loginVerification() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("Home/Index"));
    }

    public void verifyMDMElement(int timeout) {
        BrowserUtils.waitForVisibility(MDM, timeout);
        Assert.assertTrue(MDM.isDisplayed());
    }

    public void mouseoverOnTheMdmElement() {
        BrowserUtils.hoverOver(MDM);
    }

    public void mouseoverOnTheContractManagementElement() {
        BrowserUtils.waitForVisibility(contractManagement, 10);
        BrowserUtils.hoverOver(contractManagement);
    }

    public void mouseoverOnTheContractElement() {
        BrowserUtils.waitForVisibility(contract, 20);
        BrowserUtils.hoverOver(contract);
    }

    public void clicksOnTheContractElement() {
        contract.click();
    }

    public void currentUrlAndStoresItInUrl(String partialUrl) {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains(partialUrl));
    }

    public void mouseoverOnTheAssetManagement() {
        BrowserUtils.waitForVisibility(assetManagement, 10);
        BrowserUtils.hoverOver(assetManagement);
    }

    public void mouseoverOnTheAssetManagementElement() {
        BrowserUtils.waitForVisibility(assetManagement, 10);
        BrowserUtils.hoverOver(assetManagement);
    }

    public void clicksOnTheAssetElement() {
        asset.click();
    }

    public void mouseoverOnTheGiftElement() {
        BrowserUtils.waitForVisibility(gift, 10);
        BrowserUtils.hoverOver(gift);
    }

    public void mouseoverOnTheGiftManagementElement() {
        BrowserUtils.waitForVisibility(giftManagement, 10);
        BrowserUtils.hoverOver(giftManagement);
    }

    public void clicksOnTheGiftElement() {
        gift.click();
    }

    public void mouseoverOnTheContactManagementElement() {
        BrowserUtils.waitForVisibility(contactManagement, 10);
        BrowserUtils.hoverOver(contactManagement);
    }

    public void mouseoverOnTheContactElement() {
        BrowserUtils.waitForVisibility(contact, 10);
        BrowserUtils.hoverOver(contact);
    }

    public void clicksOnTheContactElement() {
        contact.click();
    }

    public void clicksOnTheKPIElement() {
        KPI.click();
    }

    public void mouseoverOnTheKPIManagementElement() {
        BrowserUtils.waitForVisibility(KPIManagement, 10);
        BrowserUtils.hoverOver(KPIManagement);
    }
    public void mouseoverOnTheKPIElement() {
        BrowserUtils.waitForVisibility(KPI, 10);
        BrowserUtils.hoverOver(KPI);
    }

    public void mouseoverOnTheSystemElementSymbol() {
        BrowserUtils.waitForVisibility(systemElementSymbol,20);
        BrowserUtils.hoverOver(systemElementSymbol);
    }
    public void verifySystemElementSymbol(int timeout) {
        BrowserUtils.waitForVisibility(systemElementSymbol, timeout);
        Assert.assertTrue(systemElementSymbol.isDisplayed());
    }
    public void mouseoverOnTheSystemElement() {
        BrowserUtils.waitForVisibility(systemElement,20);
        BrowserUtils.hoverOver(systemElement);
    }

    public void mouseoverOnTheBlackListElement() {
        BrowserUtils.waitForVisibility(blackListElement,15);
        BrowserUtils.hoverOver(blackListElement);
    }
    public void clickBlackListElement(){
        BrowserUtils.waitForVisibility(blackListElement,20);
        blackListElement.click();

    }
    public void mouseoverOnTheEventManagementElement() {
        BrowserUtils.waitForVisibility(eventManagement, 10);
        BrowserUtils.hoverOver(eventManagement);
    }

    public void mouseoverOnTheEventElement() {
        BrowserUtils.waitForVisibility(event, 20);
        BrowserUtils.hoverOver(event);
    }

    public void clicksOnTheEventElement() {
        event.click();
    }
    public void mouseoverOnTheCampaignManagementElement() {
        BrowserUtils.waitForVisibility(campaignManagement, 10);
        BrowserUtils.hoverOver(campaignManagement);
    }

    public void mouseoverOnTheCampaignElement() {
        BrowserUtils.waitForVisibility(campaign, 10);
        BrowserUtils.hoverOver(campaign);
    }

    public void clicksOnTheCampaignElement() {
        campaign.click();
    }

}
