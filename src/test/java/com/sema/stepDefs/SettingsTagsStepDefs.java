package com.sema.stepDefs;

import com.sema.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SettingsTagsStepDefs extends BaseStep {

    @When("The user is on the Tags page")
    public void theUserIsOnTheTagsPage() {
        pages.tagsPage().goToTagsPage();
    }

    @When("The user enters {string} in to label filter")
    public void theUserEntersInToLabelFilter(String input) {
        pages.tagsPage().enterInputToLabelFilter(input);
    }

    @Then("The User verifies that label filter results contains {string}")
    public void theUserVerifiesThatLabelFilterResultsContains(String input) {
        pages.tagsPage().verifyLabelFilterResultsAreCorrect(input);
    }
    @Given("The user on the settings tags page")
    public void the_user_on_the_settings_tags_page() {
        pages.tagsPage().onTheTagsSettingPage();
    }
    @Then("The user verifies that {string} is displayed in table")
    public void theUserVerifiesThatNoDataAvailableInTableIsDisplayedInTable(String message) {
        pages.tagsPage().verifyNoMatchingRecordsFoundIsDisplayed(message);
    }

    @Then("The user verifies that label filter has no value")
    public void theUserVerifiesThatLabelFilterHasNoValue() {
        pages.tagsPage().verifyLabelFilterHasNoValue();
    }

    @Then("The user verifies that id values are ascending order with no action")
    public void theUserVerifiesThatIdValuesAreAscendingOrderWithNoAction() {
        Assert.assertTrue(pages.tagsPage().areIdValuesAscending());
    }

    @When("The user clicks Id header for descending sort")
    public void theUserClicksIdHeaderForDescendingSort() {
        pages.tagsPage().clickIdHeaderForDescending();
    }

    @Then("The user verifies that id values are descending order")
    public void theUserVerifiesThatIdValuesAreDescendingOrder() {
        Assert.assertTrue(pages.tagsPage().areIdValuesDescending());
    }

    @When("The user clicks Label header for ascending sort")
    public void theUserClicksLabelHeaderForAscendingSort() {
        pages.tagsPage().clickLabelHeaderForAscendingSort();
    }

    @Then("The user verifies that Label values are ascending order")
    public void theUserVerifiesThatLabelValuesAreAscendingOrder() {
        BrowserUtils.wait(4);
        Assert.assertTrue(pages.tagsPage().areLabelValuesAscending());
    }

    @When("The user clicks Label header for descending sort")
    public void theUserClicksLabelHeaderForDescendingSort() {
        pages.tagsPage().clickLabelHeaderForDescendingSort();
    }

    @Then("The user verifies that Label values are descending order")
    public void theUserVerifiesThatLabelValuesAreDescendingOrder() {
        Assert.assertTrue(pages.tagsPage().areLabelValuesDescending());
    }

    @When("The user clicks ItemType header for ascending sort")
    public void theUserClicksItemTypeHeaderForAscendingSort() {
        pages.tagsPage().clickItemTypeHeaderForAscendingSort();
    }

    @Then("The user verifies that ItemType values are ascending order")
    public void theUserVerifiesThatItemTypeValuesAreAscendingOrder() {
        Assert.assertTrue(pages.tagsPage().areItemTypesValuesAscending());
    }

    @When("The user clicks ItemType header for descending sort")
    public void theUserClicksItemTypeHeaderForDescendingSort() {
        pages.tagsPage().clickItemTypeHeaderForDescendingSort();
    }

    @Then("The user verifies that ItemType values are descending order")
    public void theUserVerifiesThatItemTypeValuesAreDescendingOrder() {
        Assert.assertTrue(pages.tagsPage().areItemTypesValuesDescending());
    }

    @When("The user enters {int} and {int} in to Id filter")
    public void theUserEntersAndInToIdFilter(int idFrom, int idTo) {
        pages.tagsPage().enterIdFilterValues(idFrom, idTo);
    }

    @When("The user clicks update button in Id filter")
    public void theUserClicksUpdateButtonInIdFilter() {
        pages.tagsPage().clickUpdateButtonInIdFilter();
    }

    @Then("The user verifies that ids are between {int} and {int} inclusive")
    public void theUserVerifiesThatIdsAreBetweenAndInclusive(int idFrom, int idTo) {
        pages.tagsPage().verifyIdsAreBetweenIdFromAndIdToInclusive(idFrom,idTo);
    }

    @Then("The user verifies that {string} warning is displayed")
    public void theUserVerifiesThatIdFromMustBeLessThanIdToWarningIsDisplayed(String expectedWarning) {
        pages.tagsPage().verifyIdFromMustBeLessThanIdToWarningIsDisplayed(expectedWarning);
    }

    @Then("The user verifies that Id filter has no value")
    public void theUserVerifiesThatIdFilterHasNoValue() {pages.tagsPage().verifyIdFilterHasNoValue();}

    @When("The user select {string} from Type filter")
    public void theUserSelectAccountFromTypeFilter(String option) {
        pages.tagsPage().selectValueFromTypeSelectFilter(option);
    }

    @Then("The user verifies that table has only {string} values")
    public void theUserVerifiesThatTableHasOnlyFilteredValues(String filteredValue) {
        pages.tagsPage().verifyTableHasOnlyFilteredValues(filteredValue);
    }

    @Then("The user verifies that ItemType filter has value {string}")
    public void theUserVerifiesThatItemTypeFilterHasValueTypeAll(String typeAll) {
        pages.tagsPage().verifyItemTypeFilterHasValueTypeAll(typeAll);
    }

    @Then("The user verifies that first and previous pagination buttons are inactive in first page of table in Tags page")
    public void theUserVerifiesThatFirstAndPreviousPaginationButtonsAreInactiveInFirstPageOfTableInTagsPage() {
        pages.tagsPage().verifyFirstAndPreviousButtonsAreInactiveInFirstPageOfTableInTagsPage();
    }

    @When("The user enters last page number in to pagination input box in Tags page")
    public void theUserEntersLastPageNumberInToPaginationInputBoxInTagsPage() {
        pages.tagsPage().enterLastPageNumberInToPaginationInputBox();
    }

    @Then("The user verifies that last and next pagination buttons are inactive in last page of table in Tags page")
    public void theUserVerifiesThatLastAndNextPaginationButtonsAreInactiveInLastPageOfTableInTagsPage() {
        pages.tagsPage().verifyLastAndNextButtonsAreInactiveInLastPageOfTable();
    }

    @When("The user clicks last pagination button in Tags page")
    public void theUserClicksLastPaginationButtonInTagsPage() {
        pages.tagsPage().clickLastPaginationButtonInTagsPage();
    }

    @Then("The user verifies that table is in last page in Tags page")
    public void theUserVerifiesThatTableIsInLastPageInTagsPage() {
        pages.tagsPage().verifyTableIsInLastPageInTagsPage();
    }

    @When("The user clicks first pagination button in Tags page")
    public void theUserClicksFirstPaginationButtonInTagsPage() {
        pages.tagsPage().clickFirstPaginationButton();
    }

    @Then("The user verifies that table is in first page in Tags page")
    public void theUserVerifiesThatTableIsInFirstPageInTagsPage() {
        pages.tagsPage().verifyTableIsInFirstPageInTagsPage();
    }

    @When("The user clicks next pagination button in Tags page")
    public void theUserClicksNextPaginationButtonInTagsPage() {
        pages.tagsPage().clickNextPaginationButtonInTagsPage();
    }

    @Then("The user verifies that table go to next page in Tags page")
    public void theUserVerifiesThatTableGoToNextPageInTagsPage() {
        pages.tagsPage().verifyTableGoToNextPageInTagsPage();
    }

    @When("The user clicks previous pagination button in Tags page")
    public void theUserClicksPreviousPaginationButtonInTagsPage() {
        pages.tagsPage().clickPreviousPaginationButtonInTagsPage();
    }

    @Then("The user verifies that table go to previous page in Tags page")
    public void theUserVerifiesThatTableGoToPreviousPageInTagsPage() {
        pages.tagsPage().verifyTableGoToPreviousPageInTagsPage();
    }

    @When("The user clicks CreateNew button in Tags page")
    public void theUserClicksCreateNewButtonInTagsPage() {
        pages.tagsPage().clickCreateNewButtonInTagsPage();
    }

    @Then("The user verifies that Cancel button is active in CreateTag modal")
    public void theUserVerifiesThatCancelButtonIsActiveInCreateTagModal() {
        pages.tagsPage().verifyCancelButtonIsActiveInCreateTagModal();
    }

    @When("The user fills the label input in CreateNew Modal")
    public void theUserFillsTheLabelInputInCreateNewModal() {
        pages.tagsPage().fillLabelInputInCreateNewTagModal();
    }

    @When("The user select itemType {string} in CreateTag Modal")
    public void theUserSelectItemTypeInCreateTagModal(String itemType) {
        pages.tagsPage().selectItemTypeInCreateTagModal(itemType);
    }

    @When("The user select itemType {string} in EditTag Modal")
    public void theUserSelectItemTypeInEditTagModal(String itemType) {
        pages.tagsPage().selectItemTypeInEditTagModal(itemType);
    }

    @Then("The user verifies that Create button is active in CreateNew Modal")
    public void theUserVerifiesThatCreateButtonIsActiveInCreateNewModal() {
        pages.tagsPage().verifyCreateButtonIsActiveInCreateNewModal();
    }

    @Then("The user verifies that Create button is passive in CreateNew Modal")
    public void theUserVerifiesThatCreateButtonIsPassiveInCreateNewModal() {
        pages.tagsPage().verifyCreateNewButtonIsInactiveInCreateNewModal();
    }

    @When("The user clicks create button in CreateNewTag Modal")
    public void theUserClicksCreateButtonInCreateNewTagModal() {
        pages.tagsPage().clickCreateButtonInCreateNewTagModal();
    }

    @Then("The user verifies that current tags include new tag with itemType {string}")
    public void theUserVerifiesThatCurrentTagsIncludeNewTag(String itemType) {
        pages.tagsPage().verifyNewTagIsInTable(itemType);
    }

    @Then("The user verifies that the {string} info appears in the top right")
    public void theUserVerifiesThatTheChangesSavedSuccessfullyInfoAppearsInTheTopRight(String message) {
        pages.tagsPage().verifyWarningMessageIsDisplayed(message);
    }

    @When("The user clicks EditTag button in Tags page")
    public void theUserClicksEditTagButtonInTagsPage() {
        pages.tagsPage().clickEditTagButton();
    }

    @Then("The user verifies that Cancel button is active in EditTag modal")
    public void theUserVerifiesThatCancelButtonIsActiveInEditTagModal() {
        pages.tagsPage().verifyCancelButtonIsActiveInEditTagModal();
    }

    @Then("The user verifies that Save button is passive in EditTag modal")
    public void theUserVerifiesThatSaveButtonIsPassiveInEditTagModal() {
        pages.tagsPage().verifySaveButtonIsPassiveInEditTagModal();
    }

    @When("The user clicks cancel button in CreateNewTag Modal")
    public void theUserClicksCancelButtonInCreateNewTagModal() {
        pages.tagsPage().clickCancelButtonInCreateNewTagModal();
    }

    @Then("The user verifies that CreateNewTag Modal is closed")
    public void theUserVerifiesThatCreateNewTagModalIsClosed() {
        pages.tagsPage().verifyCreateNewTagModalIsClosed();
    }

    @When("The user clicks cancel button in EditTag Modal")
    public void theUserClicksCancelButtonInEditTagModal() {
        pages.tagsPage().clickCancelButtonInEditTagModal();
    }

    @Then("The user verifies that EditTag Modal is closed")
    public void theUserVerifiesThatEditTagModalIsClosed() {
        pages.tagsPage().verifyEditTagModalIsClosed();
    }

    @When("The user edit Label in EditTag Modal")
    public void theUserEditLabelInEditTagModal() {
        pages.tagsPage().editLabelInEditTagModal();
    }

    @Then("The user verifies that Save button is active in EditTag modal")
    public void theUserVerifiesThatSaveButtonIsActiveInEditTagModal() {
        pages.tagsPage().verifySaveButtonIsActiveInEditTagModal();
    }

    @When("The user clicks Save button in EditTag modal")
    public void theUserClicksSaveButtonInEditTagModal() {
        pages.tagsPage().clickSaveButtonInEditTagModal();
    }

    @When("The user select {string} from table length")
    public void theUserSelectFromTableLength(String length) {
        pages.tagsPage().selectLengthFromTableLengthInTagsPage(length);
    }

    @Then("The user verifies that table contains right rows according to {string}")
    public void theUserVerifiesThatTableContainsRightRowsAccordingTo(String length) {
        BrowserUtils.wait(1);
        pages.generalPage().verifyTableContainsRightRowsAccordingToLength(length);
//        Assert.assertTrue(BrowserUtils.isOptionSelected(pages.generalPage().getTableShowEntrySelect(), length));
        Select select = new Select(pages.generalPage().getTableShowEntrySelect());
        Assert.assertEquals(select.getFirstSelectedOption().getAttribute("value"),length.split(" ")[0]);
    }

    @When("The user clicks DeleteTag button in Tags page")
    public void theUserClicksDeleteTagButtonInTagsPage() {
        pages.tagsPage().clickDeleteTagButton();
    }

    @Then("The user verifies that Cancel button is active in DeleteTag modal")
    public void theUserVerifiesThatCancelButtonIsActiveInDeleteTagModal() {
        pages.tagsPage().verifyCancelButtonIsActiveInDeleteTagButton();
    }

    @Then("The user verifies that Delete button is active in DeleteTag modal")
    public void theUserVerifiesThatDeleteButtonIsActiveInDeleteTagModal() {
        pages.tagsPage().verifyDeleteButtonIsActiveInDeleteTagButton();
    }

    @When("The user clicks Delete button in DeleteTag modal")
    public void theUserClicksDeleteButtonInDeleteTagModal() {
        pages.tagsPage().clickDeleteButtonInDeleteTagModal();
    }

    @When("The user clicks Cancel button in DeleteTag Modal")
    public void theUserClicksCancelButtonInDeleteTagModal() {
        pages.tagsPage().clickCancelButtonInDeleteTagModal();
    }

    @Then("The user verifies that DeleteTag Modal is closed")
    public void theUserVerifiesThatDeleteTagModalIsClosed() {
        pages.tagsPage().verifyDeleteTagModalIsClosed();
    }

    @When("The user undone the changes in Label")
    public void theUserUndoneTheChangesInLabel() {
        pages.tagsPage().undoneChangesInLabel();
    }

    @When("The user select AreYouSureTagEdit check box")
    public void theUserSelectAreYouSureTagEditCheckBox() {
        pages.tagsPage().selectAreYouSureTagEditCheckBox();
    }

}
