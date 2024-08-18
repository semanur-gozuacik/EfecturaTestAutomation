package com.sema.pages.MDMPage;

import com.sema.pages.BasePage;
import com.sema.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ItemOverviewPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'list-header all')]")
    private WebElement allListsAccordion;

    @FindBy(xpath = "//ul[@class='lists-name']/li/p")
    private List<WebElement> listOptions;

    @FindBy(xpath = "//div[contains(@class,'category-accordion')]")
    private WebElement overviewSideAccordion;

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
}
