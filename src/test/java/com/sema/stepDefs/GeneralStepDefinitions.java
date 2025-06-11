package com.sema.stepDefs;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.SQLException;
import java.util.List;

public class GeneralStepDefinitions extends BaseStep {


    @And("The user select {string} in {string} select filter")
    public void theUserSelectInSelectFilter(String selectOption, String selectFilter) {
        pages.generalPage().selectOptionInSelectFilter(selectOption,selectFilter);
        BrowserUtils.wait(5);
    }

    @And("The user enters {string} into {string} filter text input box")
    public void theUserEntersIntoFilterTextInputBox(String value, String columnName) {
        pages.generalPage().useTextFilter(value,columnName);
    }

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
        BrowserUtils.wait(2);
        for (String actualValue : values) {
            Assert.assertTrue(actualValue.toLowerCase().contains(expectedValue.toLowerCase()));
//            Assert.assertEquals(expectedValue,actualValue);
        }
    }

    @And("The user verify empty data table info {string}")
    public void theUserVerifyEmptyDataTableInfoNoMatchingRecordsFound(String emptyTableInfo) {
        Assert.assertEquals(emptyTableInfo, pages.generalPage().getEmptyDataTableInfo().getText());
    }

    @And("The User clicks on delete button in table")
    public void theUserClicksOnDeleteButtonInTable() {
        BrowserUtils.wait(2);
        BrowserUtils.adjustScreenSize(80,Driver.getDriver());
        pages.generalPage().getDeleteBtnInTable().click();
    }

    @And("The user clicks on edit button in table")
    public void theUserClicksOnEditButtonInTable() {
        pages.itemOverviewPage().closeSideAccordionInOverview();
        BrowserUtils.wait(5);
        BrowserUtils.adjustScreenSize(80,Driver.getDriver());
        pages.generalPage().getEditBtnInTable().click();
    }

    @When("The user enters {string} in comment area")
    public void the_user_enters_in_comment_area(String comment) {
//        pages.contactEditPage().setChangeCommentArea(comment);
        BrowserUtils.waitForVisibility(pages.generalPage().getChangeSaveCommentTextArea(),15);
        pages.generalPage().getChangeSaveCommentTextArea().sendKeys(comment);
    }

    @And("The user verify item status is not {string} on item with code {string}")
    public void theUserVerifyItemStatusIsNotOnItemWithCodeTEST(String status, String itemCode) {
        Assert.assertFalse(pages.generalPage().getItemStatus(itemCode).isEmpty());
        Assert.assertNotEquals(status,pages.generalPage().getItemStatus(itemCode));
    }

    @And("The user verify item status is {string} on item with code {string}")
    public void theUserVerifyItemStatusIsOnItemWithCode(String status, String itemCode) {
        Assert.assertFalse(pages.generalPage().getItemStatus(itemCode).isEmpty());
        Assert.assertEquals(status,pages.generalPage().getItemStatus(itemCode));
    }

    @Then("The user verify that first item with code {string} has association on {string}")
    public void theUserVerifyThatFirstItemWithCodeHasAssociationOn(String itemCode, String associationTypeCode) throws SQLException {
        BrowserUtils.wait(2);
        Assert.assertTrue(pages.editItemPage().getAssociations(itemCode,associationTypeCode));
    }

    @And("The user reset the basic filters")
    public void theUserResetTheBasicFilters() {
        BrowserUtils.wait(10);
        BrowserUtils.waitForClickability(pages.generalPage().getBasicResetButton(),20);
        pages.generalPage().getBasicResetButton().click();
        BrowserUtils.wait(10);
    }

    @And("The user verify Reset button func for {string} simple select filter")
    public void theUserVerifyResetButtonFuncForSimpleSelectFilter(String filterName) {
        String locate = "//span[contains(@id,'-" + filterName + "')]/span[text()='Select']";
        WebElement simpleSelectFilterPlaceholder = Driver.getDriver().findElement(By.xpath(locate));
        Assert.assertTrue(simpleSelectFilterPlaceholder.isDisplayed());
    }
}
