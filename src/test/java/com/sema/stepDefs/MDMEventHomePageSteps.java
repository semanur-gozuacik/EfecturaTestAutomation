package com.sema.stepDefs;

import io.cucumber.java.en.Then;

public class MDMEventHomePageSteps extends BaseStep {
    @Then("The User performs a mouseover on the Event Management element")
    public void the_user_performs_a_mouseover_on_the_event_management_element() {
    pages.homePage().mouseoverOnTheEventManagementElement();
    }
    @Then("The User performs a mouseover on the Event element")
    public void the_user_performs_a_mouseover_on_the_event_element() {
        pages.homePage().mouseoverOnTheEventElement();
    }
    @Then("The User clicks on the Event element")
    public void the_user_clicks_on_the_event_element() {
        pages.homePage().clicksOnTheEventElement();
    }
    @Then("The user clicks on WSET Filtre")
    public void the_user_clicks_on_wset_filtre() {
        pages.eventHomePage().selectIWSAFamilyFilter();
    }
    @Then("the user verify on family filter WSET functionality")
    public void the_user_verify_on_family_filter_wset_functionality() {
     pages.eventHomePage().verifyWSETFamilyFilter();
    }
}
