package com.sema.pages.RuleEngines;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static com.sema.pages.SystemPage.CurrenciesPage.getStringListFromWebElementList;
import static com.sema.pages.SystemPage.CurrenciesPage.getValueInInputBox;

public class Event_ContactRulePage extends BasePage {

    @FindBy(xpath = "//tr/td[1]/a")
    private List<WebElement> idValues;

    @FindBy(xpath = "//a[contains(text(),'ACCOUNT_CONTACT')]")
    private WebElement accountContactTab;

    @FindBy(xpath = "//a[contains(.,'Associated')]")
    private WebElement associatedFilter;

    @FindBy(xpath = "//li[contains(text(),'Yes')]")
    private WebElement associatedFilterYesOption;

    @FindBy(xpath = "//a[contains(text(),'ACCOUNT_INFO')]")
    private WebElement accountInfoSection;

    @FindBy(xpath = "//header[span[contains(text(),'Contact Mobile')]]/following-sibling::input")
    private WebElement contactMobileInputBox;

    @FindBy(xpath = "//header[span[contains(text(),'Contact Email')]]/following-sibling::input")
    private WebElement contactEmailInputBox;



    String contactMobileValue = "5461146716";
    String contactEmailValue = "rule@rule.com";

    public void verifyDetailInfoForRuleOfOr(List<String> ids) {
//        List<String> idValuesAsString = getStringListFromWebElementList(ids);
        for (String id : ids) {
            Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + id);
            BrowserUtils.wait(3);
            accountInfoSection.click();
            BrowserUtils.wait(2);
            String actualContactEmail = getValueInInputBox(contactEmailInputBox);
            String actualContactMobile = getValueInInputBox(contactMobileInputBox);
            Assert.assertTrue(contactEmailValue.equals(actualContactEmail) || contactMobileValue.equals(actualContactMobile));
        }
    }

    public void goToItemsToVerifyDetailInfoWithTwoStepForOr(String tabName) {
        List<String> contactIds = getStringListFromWebElementList(idValues);
        List<String> accountIds = new ArrayList<>();

        for (String contactId : contactIds) {
            driver.get(ConfigurationReader.getProperty("editItemLinkWithoutId") + contactId);
            driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]")).click();
            BrowserUtils.wait(2);
            associatedFilter.click();
            associatedFilterYesOption.click();
            BrowserUtils.wait(1);
            accountIds.add(idValues.get(0).getText());
        }
        verifyDetailInfoForRuleOfOr(accountIds);
    }



    public void verifyDetailInfoForRuleOfAnd(List<String> ids) {
        for (String id : ids) {
            Driver.getDriver().get(ConfigurationReader.getProperty("editItemLinkWithoutId") + id);
            BrowserUtils.wait(3);
            accountInfoSection.click();
            String actualContactEmail = getValueInInputBox(contactEmailInputBox);
            String actualContactMobile = getValueInInputBox(contactMobileInputBox);
            Assert.assertTrue(contactEmailValue.equals(actualContactEmail) && contactMobileValue.equals(actualContactMobile));
        }
    }

    public void goToItemsToVerifyDetailInfoWithTwoStepForAnd(String tabName) {
        List<String> contactIds = getStringListFromWebElementList(idValues);
        List<String> accountIds = new ArrayList<>();

        for (String contactId : contactIds) {
            driver.get(ConfigurationReader.getProperty("editItemLinkWithoutId") + contactId);
            driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]")).click();
            associatedFilter.click();
            associatedFilterYesOption.click();
            BrowserUtils.wait(1);
            accountIds.add(idValues.get(0).getText());
        }
        verifyDetailInfoForRuleOfAnd(accountIds);
    }

    String itemIdForAssociationForContact = "7";
    String itemIdForAssociationForUser = "292374";
    public void verifyEditedItemIsAssociatedWithTwoStep(String tabName, String itemIdForRule, String itemIdForAssociation) {
        driver.get(ConfigurationReader.getProperty("editItemLinkWithoutId") + ConfigurationReader.getProperty(itemIdForRule));
        driver.navigate().refresh();
        BrowserUtils.wait(17);
        driver.navigate().refresh();
        BrowserUtils.wait(8);
        driver.findElement(By.xpath("//a[contains(text(),'" + tabName + "')]")).click();
        BrowserUtils.waitForVisibility(associatedFilter,30);
        associatedFilter.click();
        associatedFilterYesOption.click();
        BrowserUtils.wait(6);
        Assert.assertEquals(ConfigurationReader.getProperty(itemIdForAssociation), idValues.get(0).getText());
    }
}
