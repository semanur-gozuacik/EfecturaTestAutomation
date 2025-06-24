package com.sema.stepDefs;

import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SettingsItemStatusesStepDefs extends BaseStep {

    @When("The user is on the ItemStatuses page")
    public void theUserIsOnTheItemStatusesPage() {
        Driver.getDriver().navigate().to("https://sandbox-ui.efectura.com/Settings/ItemStatuses");
//        pages.itemStatusesPage().goToItemStatusesPage();
    }

    @When("The user enters {int} in to Id filter")
    public void theUserEntersInToIdFilter(int idValue) {
        pages.itemStatusesPage().enterIdInToIdFilter(idValue);
    }

    @Then("The user verifies that id column has only {int}")
    public void theUserVerifiesThatIdColumnHasOnly(int idValue) {
        pages.itemStatusesPage().verifyIdColumnHasOnlySearchValue(idValue);
    }

    @Then("The user verifies that id filter has no value in ItemStatuses page")
    public void theUserVerifiesThatIdFilterHasNoValueInItemStatusesPage() {
        pages.itemStatusesPage().verifyIdFilterHasNoValueInItemStatusesPage();
    }

    @When("The user clicks Id header for ascending sort")
    public void theUserClicksIdHeaderForAscendingSort() {
        pages.itemStatusesPage().clickIdHeaderForAscendingSort();
    }

    @Then("The user verifies that id values are ascending order")
    public void theUserVerifiesThatIdValuesAreAscendingOrder() {
        Assert.assertTrue(pages.tagsPage().areIdValuesAscending());
    }

    @When("The user clicks CreateNew button in ItemStatus page")
    public void theUserClicksCreateNewButtonInItemStatusPage() {
        pages.itemStatusesPage().clickCreateNewButtonInItemStatus();
    }

    @Then("The user verifies that Cancel button is active in CreateItemStatus modal")
    public void theUserVerifiesThatCancelButtonIsActiveInCreateItemStatusModal() {
        pages.itemStatusesPage().verifyCancelButtonIsActiveInCreateItemStatusModal();
    }

    @When("The user fills locale inputs except one of them")
    public void theUserFillsLocaleInputsExceptOneOfThem() {
        pages.itemStatusesPage().fillLocaleInputsExceptOneOfThem();
    }

    @When("The user fills all locale inputs")
    public void theUserFillsAllLocaleInputs() {
        pages.itemStatusesPage().fillAllLocaleInputs();
    }
}
