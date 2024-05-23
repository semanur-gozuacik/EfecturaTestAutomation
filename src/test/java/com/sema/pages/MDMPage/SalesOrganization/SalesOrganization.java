package com.sema.pages.MDMPage.SalesOrganization;

import com.sema.pages.BasePage;

public class SalesOrganization extends BasePage {
    public void onTheUserPage(){
        driver.navigate().to("https://sandbox.efectura.com/Enrich/Items?itemType=SalesOrganization");
    }
}
