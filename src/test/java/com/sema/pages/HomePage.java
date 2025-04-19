package com.sema.pages;


import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//img[@id='navLogo']")
    private WebElement basariliLoginDogrulama;
    @FindBy(xpath = "//a[contains(text(),'Entities')]")
    private WebElement MDM;
    @FindBy(id = "Persons")
    private WebElement Persons;
    @FindBy(id = "Contract ManagementH")
    private WebElement contractManagement;
    @FindBy(id = "Contract")
    private WebElement contract;
    @FindBy(id = "Asset ManagementH")
    private WebElement assetManagement;
    @FindBy(xpath = "//a[@id='KPI']")
    private WebElement KPI;
    @FindBy(xpath = "//a[contains(text(), 'KPI Management')]")
    private WebElement KPIManagement;
    @FindBy(xpath = "//a[text()='Asset']")
    private WebElement asset;
    @FindBy(id = "Gift ManagementH")
    private WebElement giftManagement;
    @FindBy(id = "Gift")
    private WebElement gift;
    @FindBy(id = "Contact")
    private WebElement contact;
    @FindBy(id = "User")
    private WebElement user;
    @FindBy(id = "User ManagementH")
    private WebElement userManagement;
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
    private WebElement settingsElementSymbol;
    @FindBy(xpath = "//a[@id='systemid']")
    private WebElement systemElement;
    @FindBy(xpath = "//a[@id='blacklistid']")
    private WebElement blackListElement;
    @FindBy(xpath = "//a[@id='familiesid']")
    private WebElement famiiliesElement;
    @FindBy(xpath = "//a[@id='settingnav']")
    private WebElement settingsElement;
    @FindBy(id = "Persons")
    private WebElement personsElement;
    @FindBy(id = "usermanagementid")
    private WebElement usersManagementElement;
    @FindBy(id = "usersid")
    private WebElement usersElement;
    @FindBy(id = "Connector")
    private WebElement connector;
    @FindBy(id = "Connector ManagementH")
    private WebElement connectorManagement;


    public HomePage() {
    }

    public void verifyMDMElement(int timeout) {
        BrowserUtils.waitForVisibility(MDM, timeout);
        Assert.assertTrue(MDM.isDisplayed());
    }
    public void verifyPersonsElement(int timeout) {
        BrowserUtils.waitForVisibility(Persons, timeout);
        Assert.assertTrue(Persons.isDisplayed());
    }
    public void mouseoverOnThePersonsElement() {
        BrowserUtils.hoverOver(Persons);
    }


    public void mouseoverOnTheMdmElement() {
        BrowserUtils.hoverOver(MDM);
    }

    public void mouseoverOnTheKisilerElement() {
        BrowserUtils.hoverOver(personsElement);
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
        BrowserUtils.wait(7);
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains(partialUrl));
    }

    public void mouseoverOnTheAssetManagement() {
        BrowserUtils.waitForVisibility(assetManagement, 5);
        BrowserUtils.hoverOver(assetManagement);
    }

    public void mouseoverOnTheAssetManagementElement() {
        BrowserUtils.waitForVisibility(assetManagement, 5);
        BrowserUtils.hoverOver(assetManagement);
    }

    public void clicksOnTheAssetElement() {
        asset.click();
    }

    public void mouseoverOnTheGiftElement() {
        BrowserUtils.waitForVisibility(gift, 5);
        BrowserUtils.hoverOver(gift);
    }

    public void mouseoverOnTheGiftManagementElement() {
        BrowserUtils.waitForVisibility(giftManagement, 5);
        BrowserUtils.hoverOver(giftManagement);
    }

    public void clicksOnTheGiftElement() {
        gift.click();
    }

    public void mouseoverOnTheContactManagementElement() {
        BrowserUtils.waitForVisibility(contactManagement, 5);
        BrowserUtils.hoverOver(contactManagement);
    }

    public void mouseoverOnTheContactElement() {
        BrowserUtils.waitForVisibility(contact, 5);
        BrowserUtils.hoverOver(contact);
    }


    public void clicksOnTheContactElement() {
        contact.click();
    }

    public void clicksOnTheKPIElement() {
        BrowserUtils.waitForVisibility(KPI, 10);
        KPI.click();
    }

    public void mouseoverOnTheKPIManagementElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var event = new MouseEvent('mouseover', {'view': window, 'bubbles': true, 'cancelable': true}); arguments[0].dispatchEvent(event);", KPIManagement);
    }

    public void mouseoverOnTheKPIElement() {
        BrowserUtils.waitForVisibility(KPI, 7);
        BrowserUtils.hoverOver(KPI);  }
        public void mouseoverOnTheUserManagementElement() {
            BrowserUtils.waitForVisibility(userManagement, 5);
            BrowserUtils.hoverOver(userManagement);
        }

        public void mouseoverOnTheUserElement() {
            BrowserUtils.waitForVisibility(user, 5);
            BrowserUtils.hoverOver(user);
        }


        public void clicksOnTheUserElement() {
            user.click();
        }


    public void mouseoverOnTheSystemElementSymbol() {
        BrowserUtils.waitForVisibility(settingsElementSymbol, 20);
        BrowserUtils.hoverOver(settingsElementSymbol);
    }

    public void verifySystemElementSymbol(int timeout) {
        BrowserUtils.waitForVisibility(settingsElementSymbol, timeout);
        Assert.assertTrue(settingsElementSymbol.isDisplayed());
        BrowserUtils.wait(50);
    }

    public void mouseoverOnTheSystemElement() {
        BrowserUtils.waitForVisibility(systemElement, 10);
        BrowserUtils.hoverOver(systemElement);
    }

    public void mouseoverOnTheBlackListElement() {
        BrowserUtils.waitForVisibility(blackListElement, 10);
        BrowserUtils.hoverOver(blackListElement);
    }

    public void clickBlackListElement() {
        BrowserUtils.waitForVisibility(blackListElement, 10);
        blackListElement.click();

    }

    public void mouseoverOnTheEventManagementElement() {
        BrowserUtils.waitForVisibility(eventManagement, 8);
        BrowserUtils.hoverOver(eventManagement);
    }

    public void mouseoverOnTheEventElement() {
        BrowserUtils.waitForVisibility(event, 20);
        BrowserUtils.hoverOver(event);
    }

    public void clicksOnTheEventElement() {
        BrowserUtils.waitForVisibility(event, 10);
        event.click();
    }

    public void mouseoverOnTheCampaignManagementElement() {
        BrowserUtils.waitForVisibility(campaignManagement, 10);
        BrowserUtils.hoverOver(campaignManagement);
    }

    public void mouseoverOnTheCampaignElement() {
        BrowserUtils.waitForVisibility(campaign, 5);
        BrowserUtils.hoverOver(campaign);
    }

    public void clicksOnTheCampaignElement() {
        campaign.click();
    }

    public void mouseoverOnTheFamiliesElement() {
        BrowserUtils.waitForVisibility(famiiliesElement, 10);
        BrowserUtils.hoverOver(famiiliesElement);
    }

    public void clicksOnTheFamiliesElement() {
        famiiliesElement.click();
    }

    public void mouseoverOnTheSettingsElement() {
        BrowserUtils.waitForVisibility(settingsElement, 10);
        BrowserUtils.hoverOver(settingsElement);
    }

    public void verifySettingsElement(int timeout) {
        BrowserUtils.waitForVisibility(settingsElement, timeout);
        Assert.assertTrue(settingsElement.isDisplayed());
    }

    public void clicksOnTheUsersElement() {
        usersElement.click();
    }

    public void mouseoverOnTheUsersElement() {
        BrowserUtils.waitForVisibility(usersElement, 10);
        BrowserUtils.hoverOver(usersElement);
    }

    public void mouseoverOnTheUsersManagementElement() {
        BrowserUtils.waitForVisibility(usersManagementElement, 10);
        BrowserUtils.hoverOver(usersManagementElement);
    }

    public void mouseoverOnTheConnectorManagementElement() {
        BrowserUtils.waitForVisibility(connectorManagement, 10);
        BrowserUtils.hoverOver(connectorManagement);
    }

    public void mouseoverOnTheConnectorElement() {
        BrowserUtils.waitForVisibility(connector, 10);
        BrowserUtils.hoverOver(connector);
    }

    public void clicksOnTheConnectorElement() {
        connector.click();
    }
}

