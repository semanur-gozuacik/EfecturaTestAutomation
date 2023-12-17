package com.sema.pages.MDMPage.AccountManagement;

import com.sema.pages.BasePage;

public class AccountHomePage extends BasePage {
    public void onTheAccountPage(){
        driver.navigate().to("https://sandbox.efectura.com/Enrich/Items?itemType=Account");
    }
}
