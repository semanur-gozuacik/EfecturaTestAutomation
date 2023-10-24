package com.sema.stepDefs;

import io.cucumber.java.en.Then;

public class MDMKPIHomePageSteps extends BaseStep {
    @Then("The User performs a mouseover on the KPI Management element")
    public void the_user_performs_a_mouseover_on_the_kpı_management_element() {
        pages.homePage().clicksOnTheKPIElement();
    }
    @Then("The User performs a mouseover on the KPI element")
    public void the_user_performs_a_mouseover_on_the_kpı_element() {
        pages.homePage().mouseoverOnTheKPIManagementElement();
    }
    @Then("The User clicks on the KPI element")
    public void the_user_clicks_on_the_KPI_element() {
        pages.homePage().clicksOnTheKPIElement();
    }


}
