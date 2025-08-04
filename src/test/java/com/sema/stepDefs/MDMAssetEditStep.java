package com.sema.stepDefs;
import com.sema.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MDMAssetEditStep extends BaseStep {
    public MDMAssetEditStep() {
    }

    @Then("The user clicks list drop down button")
    public void the_user_clicks_list_drop_down_button() {
        pages.assetEditPage().clickListDropDown();
    }

    @Then("The user clicks new list item")
    public void the_user_clicks_new_list_item() {
        pages.assetEditPage().clickListItem();
    }

    @Then("The user clicks new list second item")
    public void the_user_clicks_new_list_second_item() {
        pages.assetEditPage().clickListSecondItem();
    }

    @Then("The user verifies item is added")
    public void the_user_verifies_item_is_added() {
        pages.assetEditPage().verifyEditListItem();
    }

    @Then("The user waits ten seconds")
    public void the_user_waits_ten_seconds() {
        BrowserUtils.wait(10);
    }

    @Then("The user verifies item is added allItem")
    public void the_user_verifies_item_is_added_allItem() {
        pages.assetEditPage().verifyAllItemList();
    }

    @Then("The user clicks removed button")
    public void the_user_clicks_removed_button() {
        pages.assetEditPage().clicksDeleteEditList();
    }

    @Then("The user verifies item is removed")
    public void the_user_verifies_item_is_removed() {
        pages.assetEditPage().verifyEditRemoved();
    }

}