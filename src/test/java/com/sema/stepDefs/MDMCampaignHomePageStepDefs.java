package com.sema.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MDMCampaignHomePageStepDefs extends BaseStep {
    public MDMCampaignHomePageStepDefs() {
    }

    @Then("The User performs a  mouseover on the Campaign Management element")
    public void the_user_performs_a_mouseover_on_the_campaign_management_element() {
        pages.homePage().mouseoverOnTheCampaignManagementElement();
    }

    @Then("The User performs a  mouseover on the Campaign element")
    public void the_user_performs_a_mouseover_on_the_campaign_element() {
        pages.homePage().mouseoverOnTheCampaignElement();
    }

    @Then("The User clicks on the Campaign element")
    public void the_user_clicks_on_the_campaign_element() {
        pages.homePage().clicksOnTheCampaignElement();
    }

    @Given("The user is on the Campaign item home page")
    public void the_user_is_on_the_Campaign_item_home_page() {
        pages.campaignHomePage().onTheUserPage();
    }

}
