package com.sema.pages;

import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Database;
import com.sema.utilities.Driver;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static com.sema.utilities.BrowserUtils.isButtonActive;

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

    @FindBy(xpath = "//button[contains(@id,'-reset-basic')]")
    private WebElement basicResetButton;

    @FindBy(xpath = "//div[@class='notyf__message']")
    private WebElement infoMessage;

    @FindBy(xpath = "//div[contains(@id,'_wrapper')]/div/div/div/label/div/select")
    private WebElement tableShowEntrySelect;

    @FindBy(xpath = "//div[@class='pagination-container']/div[contains(@id,'_info')]")
    private WebElement tableInfo;


    // you can use selectFilter as IsAssociated, Family, ItemStatuses in feature file
    public void selectOptionInSelectFilter(String selectOption, String selectFilter) {

        WebElement selectElement = driver.findElement(By.xpath("//select[contains(@id,'-" + selectFilter + "')]"));
        BrowserUtils.selectDropdownOptionByVisibleText(selectElement,selectOption);
        BrowserUtils.wait(3);
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

    public static boolean isRowCountCorrectAccordingToTableLength(WebElement tableInfo, String length) {
        BrowserUtils.waitForVisibility(tableInfo,30);
        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//div[contains(@id,'_wrapper')]/div/div/table/tbody/tr/td[2]"));
        String maxDataCountAsString = tableInfo.getText().split(" ")[5].replace(",","");
        System.out.println("maxDataCountAsString " + maxDataCountAsString);
        System.out.println("LengthAsInt " + Integer.parseInt(length.split(" ")[0]));
        int maxDataCount = Integer.parseInt(maxDataCountAsString);
        int lengthAsInt = Integer.parseInt(length.split(" ")[0]);
        System.out.println("Row sayısı " + rows.size());
        System.out.println(Math.min(maxDataCount, lengthAsInt));
        return rows.size() == Math.min(maxDataCount, lengthAsInt);
    }

    public void verifyTableContainsRightRowsAccordingToLength(String length) {
        Assert.assertTrue(isRowCountCorrectAccordingToTableLength(tableInfo,length));
    }

    /*
    You can write button names like these in future file:
    firstpage
    previous
    next
    lastpage
     */
    public void verifyButtonStatus(String btnName, String btnStatus) {
        BrowserUtils.wait(4);
        String locate = "//div[@class='pagination-container']//*[contains(translate(@id, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" +
                btnName + "')]";
        System.out.println(locate);
        WebElement btn = driver.findElement(By.xpath(locate));
//        WebElement button = driver.findElement(By.id(btnName));
        if(btnStatus.equalsIgnoreCase("Active")) {
            Assert.assertTrue(isButtonActive(btn));
        } else if (btnStatus.equalsIgnoreCase("Passive")) {
            Assert.assertFalse(isButtonActive(btn));
        }
    }

    public void clickPaginationButton(String btnName) {
        BrowserUtils.wait(10);
        String locate = "//div[@class='pagination-container']//*[contains(translate(@id, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '" +
                btnName + "')]";
        WebElement btn = driver.findElement(By.xpath(locate));
//        WebElement btn2 = driver.findElement(By.id(btnName));
//        WebElement button = driver.findElement
//                (By.xpath("//div[@class='pagination-container']//button[@id='" + btnName + "']"));
        btn.click();
    }

}
