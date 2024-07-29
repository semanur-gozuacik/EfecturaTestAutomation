package com.sema.stepDefs;

import io.cucumber.java.en.Then;

public class Event_ContactRuleStepDef extends BaseStep{

    @Then("The user go to items to verify detail info with two step for or {string}")
    public void theUserGoToItemsToVerifyDetailInfoWithTwoStepForOr(String tabName) {
        pages.eventContactRulePage().goToItemsToVerifyDetailInfoWithTwoStepForOr(tabName);
    }

    @Then("The user go to items to verify detail info with two step for and {string}")
    public void theUserGoToItemsToVerifyDetailInfoWithTwoStepForAnd(String tabName) {
        pages.eventContactRulePage().goToItemsToVerifyDetailInfoWithTwoStepForAnd(tabName);
    }


    @Then("The user verifies edited item is associated with two step {string} {string} {string}")
    public void theUserVerifiesEditedItemIsAssociatedWithTwoStep(String tabName, String itemIdForRule, String itemIdForAssociation) {
        pages.eventContactRulePage().verifyEditedItemIsAssociatedWithTwoStep(tabName,itemIdForRule,itemIdForAssociation);
    }
}
