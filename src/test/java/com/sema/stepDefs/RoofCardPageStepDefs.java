package com.sema.stepDefs;

import io.cucumber.java.en.Given;

public class RoofCardPageStepDefs extends BaseStep{
    @Given("The user is on the RoofCard item home page")
    public void the_user_is_on_the_Product_item_home_page() {
        pages.roofCardPage().onTheUserPage();
    }
}
