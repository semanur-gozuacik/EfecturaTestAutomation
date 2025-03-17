package com.sema.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

    @And("The user enter {string} into {string} filter text")
    public void theUserEnterIntoFilterText(String value, String filterName) {
        pages.editItemPage().useTextFilterInAssocTab(value,filterName);
    }
}
