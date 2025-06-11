package com.sema.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MDMAssetStepDefs extends BaseStep {
    @Then("The User performs a    mouseover on the Asset Management element")
    public void the_user_performs_a_mouseover_on_the_asset_management_element() {
        pages.homePage().mouseoverOnTheAssetManagement();
    }

    @Then("The User performs a    mouseover on the Asset element")
    public void the_user_performs_a_mouseover_on_the_asset_element() {
        pages.homePage().mouseoverOnTheAssetManagementElement();
    }
    @Then("The User clicks on the Asset element")
    public void the_user_clicks_on_the_asset_element() {
        pages.homePage().clicksOnTheAssetElement();
    }
    @Then("The User gets the current URL and stores it in {string} Asset page")
    public void the_user_gets_the_current_url_and_stores_it_in_asset_page(String partialUrl) {
        pages.homePage().currentUrlAndStoresItInUrl(partialUrl);
    }
    @Then("The User waits until the Asset Categories element is visible with a timeout of {int} seconds")
    public void the_user_waits_until_the_asset_categories_element_is_visible_with_a_timeout_of_seconds(Integer timeout) {
        pages.asset().verifyAssetCategories(timeout);
    }
    @Then("The User clicks on the new node element")
    public void the_user_clicks_on_the_new_node_element() {
        pages.asset().clickNewNode();
    }

    @Given("The user waits until the element with id  Infoitem is visible.")
    public void the_user_waits_until_the_element_with_id_ınfoitem_is_visible() {
        pages.asset().verifyInfoItem();
    }
    @Then("The User presses the down arrow key and then presses Enter in the Cooler element")
    public void the_user_presses_the_down_arrow_key_and_then_presses_enter_in_the_cooler_element() {
     pages.asset().selectCoolerFamily();    }
    @Then("The user clicks delete button- {string}")
    public void the_user_clicks_delete_button(String string) {
       pages.asset().clickDeleteButtonAsset();
    }

    @Then("The user clicks cancel button in popup")
    public void the_user_clicks_cancel_button_in_popup() {
        pages.asset().clickCancelButtonInPopup();
    }

    @Then("The user clicks delete button in popup")
    public void the_user_clicks_delete_button_in_popup() {
       pages.asset().clickDeleteButtonAssetPopup();
    }
    @Then("The User waits until the page contains {string} with a timeout of {int} seconds-Asset")
    public void the_user_waits_until_the_page_contains_with_a_timeout_of_seconds_Asset(String text, Integer timeout) {
        pages.asset().verifyDeleteItemText(text,timeout);
    }

    @When("The user enters {string} Can view")
    public void the_user_enters_can_view(String view) {
        pages.asset().setCanView(view);
    }
    @When("The user enters {string} Can edit")
    public void the_user_enters_can_edit(String edit) {
        pages.asset().setCanEdit(edit);
    }
    @When("The user clicks cancel button-New List")
    public void the_user_clicks_cancel_button_new_list() {
        pages.asset().clickNewListCancelButton();
    }

    @Then("The user verifies is invalid visible")
    public void the_user_verifies_is_invalid_visible() {
        pages.asset().verifyNoResultsFound();
    }

    @Then("The user selects deleted element")
    public void the_user_selects_deleted_element() {
      pages.asset().clickDeleteButton();
    }

    @Then("The user clicks cancel button in delete popup")
    public void the_user_clicks_cancel_button_in_delete_popup() {
      pages.asset().clickCancelButtonPopUp();
    }



}


