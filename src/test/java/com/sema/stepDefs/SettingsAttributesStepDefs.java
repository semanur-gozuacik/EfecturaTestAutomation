package com.sema.stepDefs;

import io.cucumber.java.en.Then;

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
    @Then("The user clicks on Edit Button-Attributes")
    public void the_user_clicks_on_edit_button_attributes() {
      pages.attributes().clickEditButton();
    }
}
