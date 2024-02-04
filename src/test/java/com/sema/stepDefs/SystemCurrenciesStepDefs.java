package com.sema.stepDefs;

import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SystemCurrenciesStepDefs extends BaseStep{

    @When("The user on the currencies page")
    public void the_user_on_the_currencies_page() {
        pages.currenciesPage().goToCurrenciesPage();
    }

    @Then("The user verifies that reached the {string} page.")
    public void theUserVerifiesThatReachedThePage(String pageName) {
        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(pageName));
    }

    @When("The user enters {string} in to code filter")
    public void theUserEntersInToCodeFilter(String filterInput) {
        pages.currenciesPage().enterInputToCodeFilter(filterInput);
    }

    @Then("The User verifies that filter results contains {string}")
    public void theUserVerifiesThatFilterResultsContains(String filterInput) {
        pages.currenciesPage().verifyFilterResultsAreCorrect(filterInput);
    }

    @Then("The user verifies that code values are ascending order with no action")
    public void theUserVerifiesThatCodeValuesAreAscendingOrderWithNoAction() {
        Assert.assertTrue(pages.currenciesPage().areCodeValuesAscending());
    }

    @When("The user clicks data header for descending sort")
    public void theUserClicksDataHeaderForDescendingSort() {
        pages.currenciesPage().clickCodeHeaderForDescending();
    }

    @Then("The user verifies that code values are descending order")
    public void theUserVerifiesThatCodeValuesAreDescendingOrder() {
        Assert.assertTrue(pages.currenciesPage().areCodeValuesDescending());
    }

    @When("The user clicks status header for ascending sort")
    public void theUserClicksStatusHeaderForAscendingSort() {
        pages.currenciesPage().clickStatusHeaderForAscending();
    }

    @Then("The user verifies that status values are ascending order")
    public void theUserVerifiesThatStatusValuesAreAscendingOrder() {
        Assert.assertTrue(pages.currenciesPage().areStatusValuesAscending());
    }

    @When("The user clicks status header for descending sort")
    public void theUserClicksStatusHeaderForDescendingSort() {
        pages.currenciesPage().clickStatusHeaderForDescending();
    }

    @Then("The user verifies that status values are descending order")
    public void theUserVerifiesThatStatusValuesAreDescendingOrder() {
        Assert.assertTrue(pages.currenciesPage().areStatusValuesDescending());
    }

    @When("The user clicks reset button")
    public void theUserClicksResetButton() {
        pages.currenciesPage().clickResetButton();
    }

    @Then("The user verifies that code filter has no value")
    public void theUserVerifiesThatCodeFilterHasNoValue() {
        pages.currenciesPage().verifyCodeFilterHasNoValue();
    }

    @When("The user clicks first currency's edit button")
    public void theUserClicksFirstCurrencySEditButton() {
        pages.currenciesPage().clickEditButton();
    }

    @Then("The user verifies that cancel button is active in EditCurrency popup")
    public void theUserVerifiesThatCancelButtonIsActiveInEditCurrencyPopup() {
        pages.currenciesPage().verifyCancelButtonIsActive();
    }

    @Then("The user verifies that Save button is inactive without change in EditCurrency popup")
    public void theUserVerifiesThatSaveButtonIsInactiveWithoutChangeInEditCurrencyPopup() {
        pages.currenciesPage().verifySaveButtonIsInactiveInEditCurrencyPopup();
    }

    @When("The user clicks cancel button in EditCurrency popup")
    public void theUserClicksCancelButtonInEditCurrencyPopup() {
        pages.currenciesPage().clickCancelButtonInEditCurrencyPopup();
        BrowserUtils.wait(1);
    }

    @Then("The user verifies that EditCurrency popup is closed")
    public void theUserVerifiesThatEditCurrencyPopupIsClosed() {
        pages.currenciesPage().verifyEditCurrencyPopupIsClosed();
    }

    @When("The user enter {string} in to CurrencyCode input box in EditCurrency popup")
    public void theUserEnterAInToCurrencyCodeInputBoxInEditCurrencyPopup(String editCurrencyCodeInput) {
        pages.currenciesPage().enterInputToEditCurrencyCode(editCurrencyCodeInput);
    }

    @Then("The user verifies that Save button is active in EditCurrency popup")
    public void theUserVerifiesThatSaveButtonIsActiveInEditCurrencyPopup() {
        pages.currenciesPage().verifySaveButtonIsActiveInEditCurrencyPopup();
    }

    @When("The user clicks Status checkbox in EditCurrency popup")
    public void theUserClicksStatusCheckboxInEditCurrencyPopup() {
        pages.currenciesPage().clickStatusCheckboxInEditCurrencyPopup();
    }

    @Then("The user verifies that Refresh button is active")
    public void theUserVerifiesThatRefreshButtonIsActive() {
        pages.currenciesPage().verifyRefreshButtonIsActiveInCurrencies();
    }

    @When("The user clicks CreateNew button in Currencies page")
    public void theUserClicksCreateNewButtonInCurrenciesPage() {
        pages.currenciesPage().clickCreateNewButtonInCurrenciesPage();
    }

    @When("The user clicks cancel button in AddCurrency popup")
    public void theUserClicksCancelButtonInAddCurrencyPopup() {
        pages.currenciesPage().clickCancelButtonInAddCurrencyPopup();
        BrowserUtils.wait(1);
    }

    @Then("The user verifies that AddCurrency popup is closed")
    public void theUserVerifiesThatAddCurrencyPopupIsClosed() {
        pages.currenciesPage().verifyAddCurrencyPopupIsClosed();
    }

    @Then("The user verifies that Save button is inactive without change in AddCurrency popup")
    public void theUserVerifiesThatSaveButtonIsInactiveWithoutChangeInAddCurrencyPopup() {
        pages.currenciesPage().verifySaveButtonIsInactiveInAddCurrencyPopup();
    }

    @When("The user enters {string} in to pagination input box")
    public void theUserEntersInToPaginationInputBox(String firstPageNumber) {
        pages.currenciesPage().enterPageNumberInToPaginationInputBox(firstPageNumber);
    }

    @Then("The user verifies that first and previous pagination buttons are inactive in first page of table")
    public void theUserVerifiesThatFirstAndPreviousPaginationButtonsAreInactiveInFirstPageOfTable() {
        pages.currenciesPage().verifyFirstAndPreviousButtonsAreInactiveInFirstPageOfTable();
    }
}
