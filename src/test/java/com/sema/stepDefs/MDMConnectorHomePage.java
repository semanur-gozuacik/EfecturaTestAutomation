package com.sema.stepDefs;

import com.sema.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MDMConnectorHomePage extends BaseStep {
    public MDMConnectorHomePage() {
    }

    @Then("The User performs a  mouseover on the Connector Management element")
    public void the_user_performs_a_mouseover_on_the_connector_management_element() {
        pages.homePage().mouseoverOnTheConnectorManagementElement();
    }
    @Then("The User performs a  mouseover on the Connector element")
    public void the_user_performs_a_mouseover_on_the_connector_element() {
        pages.homePage().mouseoverOnTheConnectorElement();
    }
    @Then("The User clicks on the Connector element")
    public void the_user_clicks_on_the_connector_element() {
        pages.homePage().clicksOnTheConnectorElement();
    }
    @Then("The user enters {string} into ıd field")
    public void the_user_enters_into_ıd_field(String id) {
        pages.connectorHomePage().clickIdFilter(id);
    }
    @Then("the user verify on ıd filter functionality {string}")
    public void the_user_verify_on_ıd_filter_functionality(String id) {
        pages.connectorHomePage().verifyIdFilter(id);
    }

    @Then("The user verify Edit Page-Connector")
    public void the_user_verify_edit_page() {
        pages.connectorHomePage().verifyEditPage();
    }
    @Then("The user clicks new list item-connector")
    public void the_user_clicks_new_list_item() {
        pages.connectorHomePage().clickListItem();
    }
    @Given("The user is on the Connector item home page")
    public void the_user_is_on_the_Connector_item_home_page() {
        pages.connectorHomePage().onTheUserPage();
    }
}

