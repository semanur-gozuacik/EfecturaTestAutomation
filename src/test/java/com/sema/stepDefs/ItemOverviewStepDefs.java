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
    public void theUserAddAbcToColumns(String columnName) {
        WebElement matchingElement = pages.itemOverviewPage().getToBeSelectedColumns().stream()
                .filter(el -> el.getText().trim().equalsIgnoreCase(columnName))
                .findFirst()
                .orElse(null);

        BrowserUtils.dragAndDrop(matchingElement, pages.itemOverviewPage().getAlreadySelectedColumns().get(0));
        BrowserUtils.wait(1);

    }

    @And("The user remove {string} to columns")
    public void theUserRemoveAbcToColumns(String columnName) {
        WebElement matchingElement = pages.itemOverviewPage().getAlreadySelectedColumns().stream()
                .filter(el -> el.getText().trim().equalsIgnoreCase(columnName))
                .findFirst()
                .orElse(null);
        System.out.println("already Element: " + matchingElement.getText());

        BrowserUtils.dragAndDrop(matchingElement, pages.itemOverviewPage().getToBeSelectedArea());
        BrowserUtils.wait(5);
    }
}
