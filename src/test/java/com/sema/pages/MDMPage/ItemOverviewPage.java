package com.sema.pages.MDMPage;

import com.sema.pages.BasePage;
import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.Driver;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class ItemOverviewPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'list-header all')]")
    private WebElement allListsAccordion;

    @FindBy(xpath = "//ul[@class='lists-name']/li/p")
    private List<WebElement> listOptions;

    @FindBy(xpath = "//div[contains(@class,'category-accordion')]")
    private WebElement overviewSideAccordion;

    @FindBy(xpath = "//thead/tr[2]/th[position()=count(//thead/tr[1]/th[contains(text(), 'Code')]/preceding-sibling::th) + 1]/input")
    private WebElement itemOverviewCodeFilterInputBox;

    @FindBy(xpath = "//span[@id='refresh']")
    private WebElement itemOverviewRefreshButton;

    @FindBy(xpath = "//button[@id='items-reset-basic']")
    private WebElement basicFilterResetBtn;

    public void goToItemOverviewPage(String item) {
        driver.get(ConfigurationReader.getProperty("itemLinkWithoutItemName") + item);
    }

    public void selectList(String listName) {
        if (allListsAccordion.getAttribute("class").contains("active")) {
            allListsAccordion.click();
        }

        listOptions.stream()
                .filter(element -> element.getText().equals(listName))
                .findFirst()
                .ifPresent(WebElement::click);
    }

    public void openSideAccordionInOverview() {
        if (overviewSideAccordion.getAttribute("title").equals("ShowSidebar")) {
            overviewSideAccordion.click();
        }
    }

    public void closeSideAccordionInOverview() {
        if (overviewSideAccordion.getAttribute("title").equals("HideSidebar")) {
            overviewSideAccordion.click();
        }
    }

    public void useTextFilter(String value, String columnName) {
        //thead/tr[1]/th[normalize-space()='Address']/following::tr[1]/th[position()=count(//thead/tr[1]/th[normalize-space()='Address']/preceding-sibling::th)+1]//input
        String locate = "//thead/tr[1]/th[normalize-space()='" + columnName +
                "']/following::tr[1]/th[position()=count(//thead/tr[1]/th[normalize-space()='" + columnName +
                "']/preceding-sibling::th)+1]//input";

        WebElement filterInput = Driver.getDriver().findElement(By.xpath(locate));
        filterInput.sendKeys(value + Keys.ENTER);

    }

}
