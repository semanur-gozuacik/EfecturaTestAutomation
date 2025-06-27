package com.sema.stepDefs;

import com.sema.pages.GeneralPage;
import com.sema.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditItemStepDefs extends BaseStep{

    @Then("The user clicks {string} tab")
    public void the_user_clicks_tab(String tabName) {
        pages.editItemPage().clickEditItemTab(tabName);
    }

    @And("The user verifies {string} {string} button is {string}")
    public void theUserVerifiesGroupButtonIs(String tabName, String btnName, String btnStatus) {
        pages.editItemPage().verifyButtonStatus(tabName,btnName,btnStatus);
    }

    @When("The user clicks {string} {string} page button")
    public void theUserClicksPageButton(String tabName, String btnName) {
        pages.editItemPage().clickPermissionPageBtn(tabName,btnName);
    }

    @And("The user select item at order {int} in association tab")
    public void theUserSelectItemAtOrderInAssociationTab(int assocCheckboxOrder) {
        pages.editItemPage().selectItemAtOrderInAssociationTab(assocCheckboxOrder);
    }

    @Then("The user verifies info {string} appears")
    public void theUserVerifiesInfoAppears(String expectedMessage) {
        BrowserUtils.wait(1);
        BrowserUtils.waitForVisibility(pages.generalPage().getInfoMessage(),20);
        Assert.assertEquals(expectedMessage, pages.generalPage().getInfoMessage().getText());
        BrowserUtils.wait(1);
    }

    @And("The user select ItemStatus as {string}")
    public void theUserSelectItemStatusAs(String status) {
        BrowserUtils.wait(2);
        pages.editItemPage().getSideBarButton().click();
        pages.editItemPage().getStatusExpandArrow().click();
        pages.editItemPage().getStatusSelectInput().sendKeys(status);
        pages.editItemPage().getResultOption().click();
        pages.editItemPage().getSideBarButton().click();
//        pages.contactEditPage().selectItemStatus(status);
    }

    @And("The user clicks save button in edit item")
    public void theUserClicksSaveButtonInEditItem() {
//        pages.editItemPage().getAccordionButton().click();
        BrowserUtils.waitForVisibility(pages.editItemPage().getSaveButton(),10);
        pages.editItemPage().getSaveButton().click();
    }

    @And("The user clicks save button in edit item save modal")
    public void theUserClicksSaveButtonInEditItemSaveModal() {
        pages.editItemPage().getSaveBtnInEditItemSaveModal().click();
    }

    @And("The user clicks cancel button in edit item save modal")
    public void theUserClicksCancelButtonInEditItemSaveModal() {
        BrowserUtils.waitForVisibility(pages.editItemPage().getCancelBtnInEditItemSaveModal(),10);
        pages.editItemPage().getCancelBtnInEditItemSaveModal().click();
    }
}
