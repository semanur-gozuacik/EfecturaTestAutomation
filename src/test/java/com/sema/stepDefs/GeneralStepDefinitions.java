package com.sema.stepDefs;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GeneralStepDefinitions extends BaseStep {

    @Then("The user verify {string} warning")
    public void theUserVerifyEMPTY_FAMILYWarning(String expectedWarningText) {
        BrowserUtils.waitForVisibility(pages.generalPage().getGeneralWarningElement(),30);
        Assert.assertEquals(expectedWarningText, pages.generalPage().getGeneralWarningElement().getText());
    }

    @And("The user select family {string} in create modal")
    public void theUserSelectFamilyCoolerInCreateModal(String family) {
        BrowserUtils.selectDropdownOptionByVisibleText(pages.generalPage().getFamilySelectInCreateModal(),family);
    }

    @Then("The user verify {string} select filter with value {string} in {string}")
    public void theUserVerifySelectFilterWithValue(String columnName, String expectedValue, String table) {
        BrowserUtils.wait(2);
        WebElement tableElement = Driver.getDriver().findElement(By.id(ConfigurationReader.getProperty(table)));
        List<String> values =  BasePage.getColumnData(tableElement,columnName);

        System.out.println(values);
        BrowserUtils.wait(10);
        for (String actualValue : values) {
            Assert.assertEquals(expectedValue,actualValue);
        }
    }

    @Then("The user verify {string} text filter with value {string} in {string}")
    public void theUserVerifyTextFilterWithValueIn(String columnName, String expectedValue, String table) {
        BrowserUtils.wait(2);
        WebElement tableElement = Driver.getDriver().findElement(By.id(ConfigurationReader.getProperty(table)));
        List<String> values =  BasePage.getColumnData(tableElement,columnName);

        System.out.println(values);
        BrowserUtils.wait(10);
        for (String actualValue : values) {
            Assert.assertTrue(actualValue.toLowerCase().contains(expectedValue.toLowerCase()));
//            Assert.assertEquals(expectedValue,actualValue);
        }
    }

    @And("The user verify empty data table info {string}")
    public void theUserVerifyEmptyDataTableInfoNoMatchingRecordsFound(String emptyTableInfo) {
        Assert.assertEquals(emptyTableInfo, pages.generalPage().getEmptyDataTableInfo().getText());
    }
}
