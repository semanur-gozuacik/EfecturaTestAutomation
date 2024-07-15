package com.sema.stepDefs;

import io.cucumber.java.en.Then;

public class Event_ContactRuleStepDef extends BaseStep{

    @Then("The user go to items to verify detail info with two step for or")
    public void theUserGoToItemsToVerifyDetailInfoWithTwoStepForOr() {
        pages.eventContactRulePage().goToItemsToVerifyDetailInfoWithTwoStepForOr();
    }

    @Then("The user go to items to verify detail info with two step for and")
    public void theUserGoToItemsToVerifyDetailInfoWithTwoStepForAnd() {
        pages.eventContactRulePage().goToItemsToVerifyDetailInfoWithTwoStepForAnd();
    }


    @Then("The user verifies that the edited item is associated with two step {string} {string}")
    public void theUserVerifiesThatTheEditedItemIsAssociatedWithTwoStep(String tabName, String itemIdForRule) {
        pages.eventContactRulePage().verifyEditedItemIsAssociatedWithTwoStep(tabName,itemIdForRule);
    }
}
