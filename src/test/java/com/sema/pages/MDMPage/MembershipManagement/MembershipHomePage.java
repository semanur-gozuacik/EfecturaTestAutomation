package com.sema.pages.MDMPage.MembershipManagement;

import com.sema.pages.BasePage;

public class MembershipHomePage extends BasePage {
    public void onTheMembershipPage(){
        driver.navigate().to("https://sandbox-ui.efectura.com/Enrich/Items?itemType=Membership");
    }
}
