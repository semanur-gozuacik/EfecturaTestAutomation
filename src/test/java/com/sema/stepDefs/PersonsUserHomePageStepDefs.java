package com.sema.stepDefs;


import com.sema.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class PersonsUserHomePageStepDefs extends BaseStep {
    @Given("The user is on the Users item home page")
    public void the_user_is_on_the_users_item_home_page() {
       pages.userHomePage().onTheUserPage();
    }
    @Given("The user enters valid label filter-{string}")
    public void the_user_enters_valid_label_filter(String validLabel) {
        pages.userHomePage().validLabelFilter(validLabel);
    }
    @Given("The user verifies that filter is displayed")
    public void the_user_verifies_that_filter_is_displayed() {
     pages.userHomePage().verifiesLabelIsDisplayed();
    }
    @Given("The user enters invalid label filter-{string}")
    public void the_user_enters_invalid_label_filter(String invalidLabel) {
     pages.userHomePage().inValidLabelFilter(invalidLabel);
    }
    @Given("The user verifies that filter is not displayed")
    public void the_user_verifies_that_filter_is_not_displayed() {
     pages.userHomePage().verifiesLabelIsNotDisplayed();
    }
    @Given("The user clicks family filter")
    public void the_user_clicks_family_filter() {
    }
    @Given("The user selects {string}")
    public void the_user_selects(String family) {
//pages.userHomePage().selectFamily(family);
    }
    @Given("The user selects edit item {string}")
    public void the_user_selects_edit_item(String status) {
        pages.userHomePage().selectStatus(status);
    }
    @Given("The user clicks Reset button edit item")
    public void the_user_clicks_reset_button_edit_item() {
pages.userHomePage().clickResetButton();
    }
    @Given("The user clicks Refresh button edit item")
    public void the_user_clicks_refresh_button_edit_item() {
pages.userHomePage().clickRefresgButton();
    }

    @Given("The user clicks export button {string}")
    public void the_user_clicks_export_button(String string) {

    }

    @And("The user enters columns button")
    public void theUserEntersColumnsButton() {
        BrowserUtils.waitForVisibility(pages.itemOverviewPage().getConfigureColumnsButton(),20);
        pages.itemOverviewPage().getConfigureColumnsButton().click();
        BrowserUtils.wait(3);
//        pages.userHomePage().columnsButton();
    }

    @And("The user selected columns")
    public void theUserSelectedColumns() {
        BrowserUtils.wait(1);
        BrowserUtils.dragAndDrop(pages.itemOverviewPage().getToBeSelectedColumns().get(0),
                pages.itemOverviewPage().getAlreadySelectedColumns().get(0));
        
    }

    @And("The user clicks cancel button columns")
    public void theUserClicksCancelButtonColumns() {
        BrowserUtils.wait(3);
        BrowserUtils.waitForVisibility(pages.itemOverviewPage().getColumnsCancelButton(),15);
        pages.itemOverviewPage().getColumnsCancelButton().click();
    }

    @And("The user clicks save button columns")
    public void theUserClicksSaveButtonColumns() {
        BrowserUtils.waitForVisibility(pages.itemOverviewPage().getColumnsSaveButton(),5);
        pages.itemOverviewPage().getColumnsSaveButton().click();
        BrowserUtils.wait(5);
//        pages.userHomePage().setColumnsSaveButton();
    }

    @And("The user clicks Default button columns")
    public void theUserClicksDefaultButtonColumns() {pages.userHomePage().setDefaultColumnsButton();
    }
}

