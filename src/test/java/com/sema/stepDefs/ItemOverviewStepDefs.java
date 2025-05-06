package com.sema.stepDefs;

import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemOverviewStepDefs extends BaseStep {

    @And("The user enters {string} into {string} filter text input box")
    public void theUserEntersIntoFilterTextInputBox(String value, String columnName) {
        pages.itemOverviewPage().useTextFilter(value,columnName);
    }

    @And("The user verify Reset button func for {string} filter")
    public void theUserVerifyResetButtonFuncForFilter(String columnName) {
        String locate = "//thead/tr[1]/th[normalize-space()='" + columnName +
                "']/following::tr[1]/th[position()=count(//thead/tr[1]/th[normalize-space()='" + columnName +
                "']/preceding-sibling::th)+1]//input";
        WebElement textFilterInputBox = Driver.getDriver().findElement(By.xpath(locate));
        String actualValue = BrowserUtils.getValueInInputBox(textFilterInputBox);
        Assert.assertEquals("", actualValue);
    }

    @When("The user selects {string} as main category")
    public void theUserSelectsAsMainCategory(String mainCategory) {
        BrowserUtils.selectDropdownOptionByVisibleText(pages.itemOverviewPage().getCategorySelect(), mainCategory);
    }

    @And("The user add {string} to columns")
    public void theUserAddToColumns(String columnName) {
        WebElement matchingElement = pages.itemOverviewPage().getToBeSelectedColumns().stream()
                .filter(el -> el.getText().trim().equalsIgnoreCase(columnName))
                .findFirst()
                .orElse(null);

        BrowserUtils.dragAndDrop(matchingElement, pages.itemOverviewPage().getAlreadySelectedColumns().get(0));
        BrowserUtils.wait(1);

    }

    @And("The user remove {string} from columns")
    public void theUserRemoveFromColumns(String columnName) {
        WebElement matchingElement = pages.itemOverviewPage().getAlreadySelectedColumns().stream()
                .filter(el -> el.getText().trim().equalsIgnoreCase(columnName))
                .findFirst()
                .orElse(null);
        System.out.println("already Element: " + matchingElement.getText());

        BrowserUtils.dragAndDrop(matchingElement, pages.itemOverviewPage().getToBeSelectedArea());
        BrowserUtils.wait(5);
    }

    @And("The user select {string} for category in create")
    public void theUserSelectNewNodeForCategoryInCreate(String category) {
        WebElement categoryElement = Driver.getDriver().findElement(By.xpath("//ul/li/ul/li/a[text()='" + category + "']"));
        categoryElement.click();
    }

    @And("The user click on {string} button in create modal")
    public void theUserClickOnCreateButtonInCreateModal(String btnName) {
        if (btnName.equalsIgnoreCase("Create")) {
            pages.itemOverviewPage().getCreateButtonInCreateModal().click();
        } else if (btnName.equalsIgnoreCase("Cancel")) {
            pages.itemOverviewPage().getCancelButtonInCreateModal().click();
        } else {
            throw new RuntimeException("Invalid Button Name in this modal: " + btnName);
        }

    }

    @And("The user click on {string} tab in create modal")
    public void theUserClickOnCategoriesTabInCreateModal(String tabNameInCreateModal) {
        WebElement tab = Driver.getDriver().findElement(By.xpath("//a[text()='" + tabNameInCreateModal + "']"));
        tab.click();
    }

    @And("The user clicks cancel button in overview delete popup")
    public void theUserClicksCancelButtonInOverviewDeletePopup() {
        pages.itemOverviewPage().getCancelBtnInDeleteModal().click();
    }
}
