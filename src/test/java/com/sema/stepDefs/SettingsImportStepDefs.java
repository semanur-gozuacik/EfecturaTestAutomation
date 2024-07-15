package com.sema.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SettingsImportStepDefs extends BaseStep {
    @Given("The user on the settings ımport page")
    public void the_user_on_the_settings_families_page() {
        pages.importPage().onTheImportSettingPage();
    }

    @And("The user accepts the popup OK")
    public void theUserAcceptsThePopupOK() {
        pages.importPage().acceptPopUpElement();
    }

    @Then("The User verifies import page table is displayed")
    public void the_user_verifies_import_page_table_is_displayed() {
        pages.importPage().verifyImportPage();
    }

    @When("The user selects {string} into show entries import")
    public void the_user_selects_into_show_entries_import(String length) {
        pages.importPage().selectLengthFromTableLengthInImportPage(length);
    }

    @Then("The user should see  {string} entrie in everypage import")
    public void the_user_should_see_entrie_in_everypage_import(String length) {
        pages.importPage().verifyTableContainsRightRowsAccordingToLength(length);
    }

    @Given("the user clicks on Refresh button")
    public void the_user_clicks_on_refresh_button() {

    }

    @Given("The user clicks name button")
    public void the_user_clicks_name_button() {
        pages.importPage().clickNameFilter();
    }

    @Given("The user {string} code field")
    public void the_user_code_field(String name) {
        pages.importPage().enterInputToNameFilter(name);
    }

    @Given("The User verifies that name filter results contains {string}")
    public void the_user_verifies_name_filter_results_contains(String searchedValue) {
        pages.importPage().verifyNameFilterResultsAreCorrect(searchedValue);
    }

    @When("The user selects {string} into select status")
    public void the_user_selects_into_select_status(String statusOption) {
        pages.importPage().selectStatusOption(statusOption);
    }

    @Then("The user should see  {string}  import select status")
    public void the_user_should_see_import_select_status(String selectedOption) {
        pages.importPage().verifyStatusFilterResultAreCorrect(selectedOption);
    }

    @Given("The user clicks user filter")
    public void the_user_clicks_user_filter() {

    }

    @Given("The user {string} user field")
    public void the_user_user_field(String string) {

    }

    @Given("The user verifies user filter")
    public void the_user_verifies_user_filter() {

    }

    @Given("The user clicks username button")
    public void the_user_clicks_username_button() {

    }

    @Given("The user {string} username field")
    public void the_user_username_field(String string) {

    }

    @Given("The user verifies username filter import")
    public void the_user_verifies_username_filter_import() {

    }

    @When("The user update excel with point {string} and endDate {string}")
    public void theUserUpdateExcel(String point, String endDate) throws IOException {
        pages.importPage().updateExcel(point,endDate);
    }

    @When("The user upload AccountCallback file")
    public void theUserUploadAccountCallbackFile() {
        pages.importPage().uploadAccountCallbackFile();
    }

    @When("The user approve the import")
    public void theUserApproveTheImport() {
        pages.importPage().approveImport();
    }

    @Then("The user verifies that one earning is added to point history")
    public void theUserVerifiesThatOneEarningIsAddedToPointHistory() {
        pages.importPage().verifyOneEarningIsAddedToPointHistory();
    }

    @When("The user update excel with TransactionType {string}")
    public void theUserUpdateExcelWithTransactionType(String transactionType) throws IOException {
        pages.importPage().updateExcelWithTransActionType(transactionType);
    }

    @When("The user update excel with TaskId {string}")
    public void theUserUpdateExcelWithTaskId(String taskId) throws IOException {
        pages.importPage().updateExcelWithTaskId(taskId);
    }

    @When("The user import the uploaded file")
    public void theUserImportTheUploadedFile() {
        pages.importPage().importTheImport();
    }

    @When("The user select AccountCallback for importType")
    public void theUserSelectAccountCallbackForImportType() {
        pages.importPage().selectAccountCallbackForImportType();
    }

    @When("The user select ResourceTranslations for importType")
    public void theUserSelectResourceTranslationsForImportType() {
        pages.importPage().selectResourceTranslationsForImportType();
    }

    @When("The user upload ResourceTranslations file")
    public void theUserUploadResourceTranslationsFile() {
        pages.importPage().uploadResourceTranslationsFile();
    }

    @Then("The user verifies that the resource added to Resources")
    public void theUserVerifiesThatTheResourceAddedToResources() throws IOException {
        pages.importPage().verifyTheResourceIsAddedToResources();
    }

    @Then("The user tear down changes in resources")
    public void theUserTearDownChangesInResources() {
        pages.importPage().tearDownChangesInResources();
    }

    @When("The user select {string} for importType")
    public void theUserSelectForImportType(String importType) {
        pages.importPage().selectImportType(importType);
    }

    @When("The user upload Contact file")
    public void theUserUploadContactFile() {
        pages.importPage().uploadContactFile();
    }

    @Then("The user verifies that the {string} is created")
    public void theUserVerifiesThatTheItemIsCreated(String importType) throws IOException {
        pages.importPage().verifyItemIsCreated(importType);
    }

    @Then("The user verifies that the contact is associated with stated account")
    public void theUserVerifiesThatTheContactIsAssociatedWithStatedAccount() throws IOException {
        pages.importPage().verifyThatContactIsAssociatedWithStatedAccount();
    }

    @Then("The user tear down all changes in Contact Case")
    public void theUserTearDownAllChangesInContactCase() {
        pages.importPage().tearDownAllChangesInContactCase();
    }

    @When("The user upload Account file")
    public void theUserUploadAccountFile() {
        pages.importPage().uploadAccountFile();
    }

    @Then("The user tear down all changes in Account Case")
    public void theUserTearDownAllChangesInAccountCase() {
        pages.importPage().tearDownAllChangesInAccountCase();
    }

    @When("The user upload Association file")
    public void theUserUploadAssociationFile() {
        pages.importPage().uploadAssociationFile();
    }

    @Then("The user verifies that the {string} is associated with the {string}")
    public void theUserVerifiesThatAItemIsAssociatedWithAnotherItem(String item1, String item2) throws IOException {
        pages.importPage().verifyTheAccountIsAssociatedWithTheMrp(item1,item2);
    }

    @Then("The user tear down all changes in Association Case")
    public void theUserTearDownAllChangesInAssociationCase() {
        pages.importPage().tearDownAllChangesInAssociationCase();
    }

    @When("The user update Account excel with random sku")
    public void theUserUpdateAccountExcelWithRandomSku() throws IOException {
        pages.importPage().updateAccountExcelWithRandomSku();
    }

    @When("The user update Contact excel with random sku")
    public void theUserUpdateContactExcelWithRandomSku() throws IOException {
        pages.importPage().updateContactExcelWithRandomSku();
    }

    @When("The user upload Attribute file")
    public void theUserUploadAttributeFile() {
        pages.importPage().uploadAttributeFile();
    }

    @Then("The user verifies that attributes are created")
    public void theUserVerifiesThatAttributesAreCreated() {
        pages.importPage().verifyAttributesAreCreated();
    }

    @Then("The user tear down all changes in Attribute Case")
    public void theUserTearDownAllChangesInAttributeCase() {
        pages.importPage().tearDownAllChangesInAttributeCase();
    }
}
