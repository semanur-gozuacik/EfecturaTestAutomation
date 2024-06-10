package com.sema.stepDefs;

import io.cucumber.java.en.Given;

public class FinancialAccountStepDefs extends BaseStep{
    @Given("The user is on the Financial Account item home page")
    public void theUserIsOnTheFinancialAccountHomePage() {
        pages.financialAccount().onTheUserPage();
    }
}
