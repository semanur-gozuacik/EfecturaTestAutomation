package com.sema.stepDefs;

import io.cucumber.java.en.Given;

public class MDMMembershipHomePAgeStepDefs extends BaseStep{
    @Given("The user is on the Membership item home page")
    public void the_user_is_on_the_Membership_item_home_page() {
        pages.membershipHomePage().onTheMembershipPage();
    }
}
