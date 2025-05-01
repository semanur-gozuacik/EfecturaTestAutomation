package com.sema.stepDefs;

import com.sema.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GeneralStepDefinitions extends BaseStep {

    @Then("The user verify {string} warning")
    public void theUserVerifyEMPTY_FAMILYWarning(String expectedWarningText) {
        BrowserUtils.waitForVisibility(pages.generalPage().getGeneralWarningElement(),30);
        Assert.assertEquals(expectedWarningText, pages.generalPage().getGeneralWarningElement().getText());
    }

    @And("The user select family {string} in create modal")
    public void theUserSelectFamilyCoolerInCreateModal(String family) {
        BrowserUtils.selectDropdownOptionByVisibleText(pages.generalPage().getFamilySelectInCreateModal(),family);
    }
}
