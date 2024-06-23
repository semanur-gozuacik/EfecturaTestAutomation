package com.sema.pages.MDMPage.FileManagement;

import com.sema.pages.BasePage;

public class FileManagementHomePage extends BasePage {
    public void onTheUserPage(){
        driver.navigate().to("https://sandbox-ui.efectura.com/Enrich/Items?itemType=File");
    }
}
