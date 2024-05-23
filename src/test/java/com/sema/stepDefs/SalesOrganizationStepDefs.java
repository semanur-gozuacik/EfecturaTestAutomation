package com.sema.stepDefs;

import io.cucumber.java.en.Given;

public class SalesOrganizationStepDefs extends BaseStep{
    @Given("The user is on the SalesOrganization item home page")
    public void the_user_is_on_the_sales_organization_item_home_page() {
       pages.salesOrganization().onTheUserPage();
    }
}
