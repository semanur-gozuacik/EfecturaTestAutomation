package com.sema.stepDefs;

import io.cucumber.java.en.Given;

public class FileManagementHomePageStepDefs extends BaseStep{

    @Given("The user is on the File Managemenet item home page")
    public void theUserIsOnTheFileManagemenetItemHomePage() {
        pages.fileManagementHomePage().onTheUserPage();
    }
}
