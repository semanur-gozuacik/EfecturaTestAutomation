package com.sema.stepDefs;

import com.sema.utilities.BrowserUtils;
import com.sema.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemOverviewStepDefs extends BaseStep {

    @And("The user verify Reset button func for {string} text filter")
    public void theUserVerifyResetButtonFuncForTextFilter(String columnName) {
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

    @And("The user verifies {string} button is {string}")
    public void theUserVerifiesButtonIs(String btnName, String btnStatus) {
        pages.itemOverviewPage().verifyButtonStatus(btnName,btnStatus);
    }

    @When("The user clicks {string} pagination button")
    public void theUserClicksLastPageTablePaginationButton(String btnName) {
        pages.itemOverviewPage().clickPaginationButton(btnName);
    }

    @And("The user clicks add list button")
    public void theUserClicksAddListButton() {
        BrowserUtils.wait(1);
        pages.itemOverviewPage().openSideAccordionInOverview();
        BrowserUtils.waitForVisibility(pages.itemOverviewPage().getCreateListButton(), 15);
        pages.itemOverviewPage().getCreateListButton().click();
    }

    @Then("The user verifies New List popup is open")
    public void theUserVerifiesNewListPopupIsOpen() {
        BrowserUtils.waitForVisibility(pages.itemOverviewPage().getNewListPopup(), 10);
        Assert.assertTrue(pages.itemOverviewPage().getNewListPopup().isDisplayed());
    }

    @When("The user enters list name as {string}")
    public void theUserEntersListNameAs(String listName) {
        pages.itemOverviewPage().getListNameInputBox().sendKeys(listName);
    }

    @Then("The user verify list {string} exists")
    public void theUserVerifyListExists(String listName) {
        if (pages.itemOverviewPage().getAllListsAccordion().getAttribute("class").contains("active")) {
            pages.itemOverviewPage().getAllListsAccordion().click();
        }

        boolean exists = pages.itemOverviewPage().getAvaliableLists().stream()
                .anyMatch(e -> listName.equals(e.getText()));
        Assert.assertTrue(exists);
    }

    @Then("The user verify list {string} do not exists")
    public void theUserVerifyListDoNotExists(String listName) {
        if (pages.itemOverviewPage().getAllListsAccordion().getAttribute("class").contains("active")) {
            pages.itemOverviewPage().getAllListsAccordion().click();
        }

        boolean exists = pages.itemOverviewPage().getAvaliableLists().stream()
                .anyMatch(e -> listName.equals(e.getText()));
        Assert.assertFalse(exists);
    }

    @And("The user clicks delete button in {string} list")
    public void theUserClicksDeleteButtonInList(String listName) {
        pages.itemOverviewPage().clickDeleteBtnOfList(listName);
    }

    @And("The user clicks {string} button in delete list modal")
    public void theUserClicksCancelButtonInCreateListModal(String btnName) {
        String locate = "//div[@id='delete-list-modal']/div/div/div/button[contains(text(),'" + btnName + "')]";
        WebElement button = Driver.getDriver().findElement(By.xpath(locate));
        button.click();
    }

    @And("The user clicks {string} button in create list modal")
    public void theUserClicksButtonInCreateListModal(String btnName) {
        String locate = "//div[@id='create-new-list']/div/div/div/button[contains(text(),'" + btnName + "')]";
        WebElement btn = Driver.getDriver().findElement(By.xpath(locate));
        BrowserUtils.waitForClickability(btn,10);
        btn.click();
        BrowserUtils.wait(1);
    }
}
