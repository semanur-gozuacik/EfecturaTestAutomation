package com.sema.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SettingsItemStatusesStepDefs extends BaseStep {

    @When("The user is on the ItemStatuses page")
    public void theUserIsOnTheItemStatusesPage() {
        pages.itemStatusesPage().goToItemStatusesPage();
    }

    @When("The user enters {int} in to Id filter")
    public void theUserEntersInToIdFilter(int idValue) {
        pages.itemStatusesPage().enterIdInToIdFilter(idValue);
    }

    @Then("The user verifies that id column has only {int}")
    public void theUserVerifiesThatIdColumnHasOnly(int idValue) {
        pages.itemStatusesPage().verifyIdColumnHasOnlySearchValue(idValue);
    }
}
