package com.sema.pages.MDMPage.FinancialAccount;

import com.sema.pages.BasePage;

public class FinancialAccount extends BasePage {
    public void onTheUserPage(){
        driver.navigate().to("https://sandbox.efectura.com/Enrich/Items?itemType=FinancialAccount");
    }
}
