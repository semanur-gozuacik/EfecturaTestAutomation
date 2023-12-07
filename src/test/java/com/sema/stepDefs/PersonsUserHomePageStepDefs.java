package com.sema.stepDefs;

import com.sema.pages.BasePage;
import io.cucumber.java.en.Given;

public class PersonsUserHomePageStepDefs extends BaseStep {
    @Given("The user is on the Users item home page")
    public void the_user_is_on_the_users_item_home_page() {
       pages.userHomePage().onTheUserPage();
    }

}
