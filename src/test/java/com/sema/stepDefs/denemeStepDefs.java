package com.sema.stepDefs;

import com.sema.utilities.Driver;
import io.cucumber.java.en.When;

public class denemeStepDefs extends BaseStep {

    @When("user get column data")
    public void userGetColumnData() {
        Driver.getDriver().get("https://sandbox-ui.efectura.com/Enrich/Items?itemType=Event");
        pages.userHomePage().getData();
    }
}
