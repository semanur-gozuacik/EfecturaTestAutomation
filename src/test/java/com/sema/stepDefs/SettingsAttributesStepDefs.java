package com.sema.stepDefs;

import com.sema.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SettingsAttributesStepDefs extends BaseStep{

    public SettingsAttributesStepDefs() {   }
        @Then("The User clicks on the Attributes element")
        public void the_user_clicks_on_the_Attributes_element() {
        pages.attributes().clickAttributeElement();
        }
    @Then("The User verifies Attributes page table is displayed")
    public void the_user_verifies_attributes_page_table_is_displayed() {
    pages.attributes().verifyFamilyPage();
    }

    @When("The user selects {string} into show entries attributes")
    public void the_user_selects_into_show_entries_attributes(String entrie) {
        pages.attributes().selectEntrie(entrie);
    }
    @Then("The user should see  {string} entrie in everypage attributes")
    public void the_user_should_see_entrie_in_everypage_attributes(String entrie) {
//        pages.attributes().verifySelectOption(entrie);
        Assert.assertTrue(BrowserUtils.isOptionSelected(pages.generalPage().getTableShowEntrySelect(), entrie));
    }

    @Given("The user on the settings attribute page")
    public void the_user_on_the_settings_attribute_page() {
    pages.attributes().onTheAttributeSettingPage();
    }
    @Then("The user export button attributes")
    public void the_user_export_button_attributes() {

    }@Then("The user  {string}")
    public void the_user(String string) {

    }

    @And("The user enters {string} into Code field-Settings Attributes")
    public void theUserEntersIntoCodeFieldSettingsAttributes(String code) {
        pages.attributes().setCodeField(code);
    }

    @And("the user verify Reset button functionality-Settings Attibutes")
    public void theUserVerifyResetButtonFunctionalitySettingsAttibutes() {
        pages.attributes().verifyResetButton();
    }

    @And("The user properties tab Transaction")
    public void theUserPropertiesTabTransaction() {pages.attributes().clickPropertiesTransactionTab();
    }

    @And("The user properties tab generalPropertiesTab")
    public void theUserPropertiesTabGeneralPropertiesTab() {pages.attributes().generalPropertiesTab();
    }

    @And("The user properties tab Validation_Rules")
    public void theUserPropertiesTabValidation_Rules() {pages.attributes().Validation_Rules();
    }

    @And("The History Tab")
    public void theHistoryTab() {pages.attributes().setHistoryTab();
    }

    @And("the user clicks on Reset button attribute edit")
    public void theUserClicksOnResetButtonAttributeEdit() {pages.attributes().setResetButtonEditAttribute();
    }

    @When("The user selects {string} into show entries edit attribute")
    public void theUserSelectsIntoShowEntriesEditAttribute(String entrie) {pages.attributes().showEntriesAttribute(entrie);
        
    }

    @Then("The user should see  {string} entrie in everypage edit attribute")
    public void theUserShouldSeeEntrieInEverypageEditAttribute(String entrie) {pages.attributes().verifySelectOptionAttribute(entrie);
    }
}

