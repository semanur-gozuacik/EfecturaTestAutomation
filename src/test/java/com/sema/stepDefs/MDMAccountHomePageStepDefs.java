package com.sema.stepDefs;

import com.sema.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MDMAccountHomePageStepDefs extends BaseStep{
    @Given("The user is on the Account item home page")
    public void the_user_is_on_the_account_item_home_page() {
       pages.accountHomePage().onTheAccountPage();
    }
    @Given("The user Assocaited All filter")
    public void the_user_assocaited_all_filter() {
      pages.accountHomePage().clickAssociatedFilter();
      pages.accountHomePage().clickAssociatedAllFilter();
    }
    @Given("The user clicks item")
    public void the_user_clicks_item() {
     pages.accountHomePage().clicksSelectFirstItem();
    }
    @Given("The user Assocaited No filter")
    public void the_user_assocaited_no_filter() {
        pages.accountHomePage().clickAssociatedFilter();
        pages.accountHomePage().clickAssociatedNoFilter();
    }
    @Then("The user verify No Filter")
    public void the_user_verify_no_filter() {
    pages.accountHomePage().verifyAssociatedNoFilter();
    }

}
