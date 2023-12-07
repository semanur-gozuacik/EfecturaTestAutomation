package com.sema.pages.MDMPage.UserManagement;

import com.sema.pages.BasePage;

public class UserHomePage extends BasePage {

    public UserHomePage() {
    }
    public void onTheUserPage(){
        driver.navigate().to("https://sandbox.efectura.com/Enrich/Items?itemType=MRP");
    }
}
