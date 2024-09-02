package com.sema.pages.MDMPage.roofCardManagement;

import com.sema.pages.BasePage;

public class RoofCardPage extends BasePage {
    public void onTheUserPage(){
        driver.navigate().to("https://sandbox-ui.efectura.com/Enrich/Items?itemType=RoofCard");
    }
}
