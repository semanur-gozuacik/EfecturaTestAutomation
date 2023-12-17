package com.sema.stepDefs;

import io.cucumber.java.en.Given;

public class MDMAccountHomePageStepDefs extends BaseStep{
    @Given("The user is on the Account item home page")
    public void the_user_is_on_the_account_item_home_page() {
       pages.accountHomePage().onTheAccountPage();
    }
}
