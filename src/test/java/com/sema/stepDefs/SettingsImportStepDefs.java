package com.sema.stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.Map;

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

    @Then("The user verifies that the {string} added to Resources")
    public void theUserVerifiesThatTheResourceAddedToResources(String fileName) throws IOException {
        pages.importPage().verifyTheResourceIsAddedToResources(fileName);
    }

    @Then("The user tear down changes in resources")
    public void theUserTearDownChangesInResources() {
        pages.importPage().tearDownChangesInResources();
    }

    @When("The user select {string} for importType")
    public void theUserSelectForImportType(String importType) {
        pages.importPage().selectImportType(importType);
    }

    @Then("The user verifies that the {string} is created")
    public void theUserVerifiesThatTheItemIsCreated(String importType) throws IOException {
        pages.importPage().verifyItemIsCreated(importType,pages);
    }

    @Then("The user verifies that the {string} is associated with stated account")
    public void theUserVerifiesThatTheContactIsAssociatedWithStatedAccount(String itemType) throws IOException {
        pages.importPage().verifyThatContactIsAssociatedWithStatedAccount(itemType);
    }

    @Then("The user tear down all changes in Contact Case")
    public void theUserTearDownAllChangesInContactCase() {
        pages.importPage().tearDownAllChangesInContactCase();
    }

    @Then("The user tear down all changes in Account Case")
    public void theUserTearDownAllChangesInAccountCase() {
        pages.importPage().tearDownAllChangesInAccountCase(pages);
    }

    @Then("The user verifies that the {string} is associated with the {string}")
    public void theUserVerifiesThatAItemIsAssociatedWithAnotherItem(String item1, String item2) throws IOException {
        pages.importPage().verifyTheAccountIsAssociatedWithTheMrp(item1,item2);
    }

    @Then("The user tear down all changes in Association Case")
    public void theUserTearDownAllChangesInAssociationCase() {
        pages.importPage().tearDownAllChangesInAssociationCase();
    }

//    @When("The user update Account excel with random sku")
//    public void theUserUpdateAccountExcelWithRandomSku() throws IOException {
//        pages.importPage().updateAccountExcelWithRandomSku();
//    }

    @When("The user update {string} excel with random {string} in index {int}")
    public void theUserUpdateExcelWithRandomInIndex(String excelFile, String columnName, int index) throws IOException {
        pages.importPage().updateExcelWithRandom(excelFile, columnName,index);
    }

    @Then("The user verifies that attributes are created")
    public void theUserVerifiesThatAttributesAreCreated() {
        pages.importPage().verifyAttributesAreCreated();
    }

    @Then("The user tear down all changes in Attribute Case")
    public void theUserTearDownAllChangesInAttributeCase() {
        pages.importPage().tearDownAllChangesInAttributeCase();
    }

    @When("The user upload {string} file")
    public void theUserUploadFile(String excelFile) {
        pages.importPage().uploadExcelFile(excelFile);

    }


    @Then("The user verifies that attribute is edited")
    public void theUserVerifiesThatAttributeIsEdited(DataTable dataTable) throws IOException {
        Map<String,String> mapParam = dataTable.asMap(String.class, String.class);
        pages.importPage().verifyAttributeIsEdited(
                mapParam.get("Attribute Label"),
                mapParam.get("Column Name"),
                mapParam.get("File Name")
        );
    }

    @Then("The user verifies that attribute option is added")
    public void theUserVerifiesThatAttributeOptionIsAdded() {
        pages.importPage().verifyAttributeOptionIsAdded();
    }

    @When("The user go to attributes page and find the attribute {string}")
    public void theUserGoToAttributesPageAndFindTheAttribute(String attributeCode) {
        pages.importPage().findAttribute(attributeCode);
    }

    @When("The user go into attribute edit page")
    public void theUserGoIntoAttributeEditPage() {
        pages.importPage().goIntoAttributeEditPage();
    }

    @When("The user clicks Values tab")
    public void theUserClicksValuesTab() {
        pages.importPage().clickValuesTab();
    }

    @When("The user select {string} for itemType and {string} for family")
    public void theUserSelectForItemTypeAndForFamily(String itemType, String family) {
        pages.importPage().selectItemTypeAndFamily(itemType,family);
    }
}
