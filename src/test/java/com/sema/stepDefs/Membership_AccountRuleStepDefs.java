package com.sema.stepDefs;

import com.sema.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Membership_AccountRuleStepDefs extends BaseStep {

    @When("The User is on the Similar overview")
    public void theUserIsOnSimilarOverview() {
        //pages.membershipAccountRulePage().goToItemOverview(itemName);
        pages.membershipAccountRulePage().goToSimilarOverview();
    }

    @When("The user go in to item {string}")
    public void theUserGoInToItem(String itemId) {
        pages.membershipAccountRulePage().goToItemEditPage(itemId);
    }

    @When("The user click rule tab")
    public void theUserClickRuleTab() {
        pages.membershipAccountRulePage().clickRuleTab();
    }

    @When("The user sets a rule")
    public void theUserSetsARule() {
        pages.membershipAccountRulePage().setARule();
    }

    @When("The user clicks view list button")
    public void theUserClicksViewListButton() {
        pages.membershipAccountRulePage().clickViewListButton();
    }

    @When("The user set an item in rule which is not in rule")
    public void theUserSetAnItemInRuleWhichIsNotInRule() {
        pages.membershipAccountRulePage().setAnItemInRuleWhichIsNotInRule();
    }

    @When("The user clicks Set Rules button")
    public void theUserClicksSetRulesButton() {
        pages.membershipAccountRulePage().clickSetRulesButton();
    }

    @Then("The item that is set in rule should appear in InList")
    public void theItemThatIsSetInRuleShouldAppearInInList() {
        pages.membershipAccountRulePage().verifyTheItemThatIsSetInRuleIsAppearInInList();
    }

    @Then("The item that is set in rule should been associated according to Account Tab")
    public void theItemThatIsSetInRuleShouldBeenAssociatedAccordingToAccountTab() {
        pages.membershipAccountRulePage().verifyTheItemThatIsSetInRuleIsAssociatedInAccountTab();
    }

    @Then("The user tear down all rules")
    public void theUserTearDownAllRules() {
        Driver.getDriver().get("https://sandbox.efectura.com/Enrich/EditItem/295213");
        pages.membershipAccountRulePage().clickRuleTab();
        pages.membershipAccountRulePage().tearDownAllChanges();
    }

    @When("The user sets two rule with or operator")
    public void theUserSetsTwoRuleWithOrOperator() {
        pages.membershipAccountRulePage().setTwoRuleWithOrOperator();
    }

    @Then("The user edit an account to meet the rules {string}")
    public void theUserEditAnAccountToMeetTheRules(String attributeValueToChange) {
        pages.membershipAccountRulePage().editAnAccountToMeetTheRules(attributeValueToChange);
    }

    @Then("The user verifies that the edited item is associated")
    public void theUserVerifiesThatTheEditedItemIsAssociated() {
        pages.membershipAccountRulePage().verifyEditedItemIsAssociated();
    }

    @When("The user click Calculate button")
    public void theUserClickCalculateButton() {
        pages.membershipAccountRulePage().clickCalculateButton();
    }

    @Then("The user delete changes for item")
    public void theUserDeleteChangesForItem() {
        pages.membershipAccountRulePage().deleteItemChanges();
    }


    @Then("The user verifies that association of this item is removed")
    public void theUserVerifiesThatAssociationOfThisItemIsRemoved() {
        pages.membershipAccountRulePage().verifyAssociationOfTheItemRemoved();
    }

    @When("The user set an item out rule which is in rule")
    public void theUserSetAnItemOutRuleWhichIsInRule() {
        pages.membershipAccountRulePage().setItemOutRuleWhichIsInRule();
    }

    @Then("The item that is set out rule should appear in NotInList")
    public void theItemThatIsSetOutRuleShouldAppearInNotInList() {
        pages.membershipAccountRulePage().verifyTheItemThatIsSetOutRuleIsAppearInInList();
    }

    @Then("The item that is set out rule should not been associated")
    public void theItemThatIsSetOutRuleShouldNotBeenAssociated() {
        pages.membershipAccountRulePage().verifyItemThatIsSetOutRuleNotAssociated();
    }

    @When("The user sets two different rule with or")
    public void theUserSetsTwoDifferentRuleWithOr() {
        pages.membershipAccountRulePage().setTwoDifferentRuleWithOr();
    }

    @Then("The user verify detail info of associated items for or")
    public void theUserVerifyDetailInfoOfAssociatedItemsForOr() {
        pages.membershipAccountRulePage().verifyDetailInfoOfAssociatedItemsForOr();
    }

    @When("The user sets two different rule with and")
    public void theUserSetsTwoDifferentRuleWithAnd() {
        pages.membershipAccountRulePage().setTwoDifferentRuleWithAnd();
    }

    @Then("The user verify detail info of associated items for and")
    public void theUserVerifyDetailInfoOfAssociatedItemsForAnd() {
        pages.membershipAccountRulePage().verifyDetailInfoOfAssociatedItemsForAnd();
    }
}
