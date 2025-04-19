package com.sema.stepDefs;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class EditItemStepDefs extends BaseStep{

    @Then("The user clicks {string} tab")
    public void the_user_clicks_tab(String tabName) {
        pages.editItemPage().clickEditItemTab(tabName);
    }

    @And("The user verifies {string} {string} button is {string}")
    public void theUserVerifiesGroupButtonIs(String tabName, String btnName, String btnStatus) {
        pages.editItemPage().verifyButtonStatus(tabName,btnName,btnStatus);
    }

    @When("The user clicks {string} {string} page button")
    public void theUserClicksPageButton(String tabName, String btnName) {
        pages.editItemPage().clickPermissionPageBtn(tabName,btnName);
    }

    @And("The user select {string} in {string} select filter")
    public void theUserSelectInSelectFilter(String selectOption, String selectFilter) {
        pages.editItemPage().selectOptionInSelectFilter(selectOption,selectFilter);
    }

    @And("The user select item at order {int} in association tab")
    public void theUserSelectItemAtOrderInAssociationTab(int assocCheckboxOrder) {
        BrowserUtils.wait(2);
        pages.editItemPage().getAssociateCheckBoxes().get(assocCheckboxOrder - 1).click();
    }

    @And("The user saves changes with comment {string}")
    public void theUserSavesChangesWithComment(String saveComment) {
        pages.editItemPage().getSaveChangesBtn().click();
        pages.editItemPage().getSaveCommentTextarea().sendKeys(saveComment);
        pages.editItemPage().getSaveButtonInSaveChanges().click();
    }

    @Then("The user verifies info {string} appears")
    public void theUserVerifiesInfoAppears(String expectedMessage) {
        BrowserUtils.wait(3);
        BrowserUtils.waitForVisibility(pages.editItemPage().getInfoMessage(),20);
        Assert.assertEquals(expectedMessage, pages.editItemPage().getInfoMessage().getText());
    }

    @Then("The user verify {string} filter with value {string}")
    public void theUserVerifyFilterWithValue(String columnName, String expectedValue) {
        BrowserUtils.wait(2);
        List<String> values =  BasePage.getColumnData(pages.editItemPage().getAssociationTable(),columnName);

        System.out.println(values);
        BrowserUtils.wait(10);
        for (String actualValue : values) {
            Assert.assertEquals(expectedValue,actualValue);
        }
    }
}
