package com.sema.pages;

import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Database;
import com.sema.utilities.Driver;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Getter
public class GeneralPage extends BasePage {

    @FindBy(xpath = "//div[@class='notyf__message']")
    private WebElement generalWarningElement;

    @FindBy(xpath = "//select[@id='chooseFamilies']")
    private WebElement familySelectInCreateModal;

    @FindBy(xpath = "//tbody/tr/td[@class='dataTables_empty']")
    private WebElement emptyDataTableInfo;

    @FindBy(xpath = "//a[contains(@class,'t-edit')]")
    private WebElement editBtnInTable;

    @FindBy(xpath = "//a[contains(@class,'danger-btn')]")
    private WebElement deleteBtnInTable;

    @FindBy(xpath = "//select[contains(@id,'-ItemStatuses')]")
    private WebElement tableItemStatusSelect;

    @FindBy(xpath = "//select[contains(@id,'-Family')]")
    private WebElement tableFamilySelect;

    @FindBy(xpath = "//textarea[@id='comment']")
    private WebElement changeSaveCommentTextArea;


    // you can use selectFilter as IsAssociated, Family, ItemStatuses in feature file
    public void selectOptionInSelectFilter(String selectOption, String selectFilter) {

        WebElement selectElement = driver.findElement(By.xpath("//select[contains(@id,'-" + selectFilter + "')]"));
        BrowserUtils.selectDropdownOptionByVisibleText(selectElement,selectOption);

    }

    public void useTextFilter(String value, String columnName) {
        //thead/tr[1]/th[normalize-space()='Address']/following::tr[1]/th[position()=count(//thead/tr[1]/th[normalize-space()='Address']/preceding-sibling::th)+1]//input
        String locate = "//thead/tr[1]/th[normalize-space()='" + columnName +
                "']/following::tr[1]/th[position()=count(//thead/tr[1]/th[normalize-space()='" + columnName +
                "']/preceding-sibling::th)+1]//input";

        WebElement filterInput = Driver.getDriver().findElement(By.xpath(locate));
        filterInput.sendKeys(value + Keys.ENTER);

    }


    public String getItemStatus(String itemCode) {
        String query = "SELECT Text FROM TEST_MDM.dbo.ItemStatusesTranslations is2 \n" +
                "WHERE LanguageCode = 'en-US' \n" +
                "AND ItemStatusesId = (SELECT ItemStatusesId FROM TEST_MDM.dbo.Items WHERE SKU = '" + itemCode + "')";

        String itemStatus = "";

        try (Connection conn = Database.getInstance();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                itemStatus = rs.getString("Text");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("item status of the item with code " + itemCode + " is " + itemStatus);
        return itemStatus;

    }
}
