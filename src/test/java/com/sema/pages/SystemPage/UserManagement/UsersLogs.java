package com.sema.pages.SystemPage.UserManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersLogs extends BasePage {
    @FindBy(xpath = "//table[@id='userLogs_table']")
    private WebElement usersLogsTableElement;
    @FindBy(xpath = "//button[normalize-space()='OK']")
    private WebElement logsclick;
    @FindBy(xpath = "//span[@id='userLogs_table-Search']//span[@class='icon']")
    private WebElement userlogsSeachButtons;

    public UsersLogs() {
    }

    public void verifyUsers() {
        BrowserUtils.wait(5);
        Assert.assertTrue(usersLogsTableElement.isDisplayed());
    }

    public void onTheUsersSettingPage() {
        driver.navigate().to("https://sandbox-ui.efectura.com/UserManage/LoginLogs");
    }

    public void logsClick() {
        logsclick.click();
    }

    public void logsSearhButton() {
        userlogsSeachButtons.click();
    }
}