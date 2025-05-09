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

    @FindBy(xpath = "//a[@title='Reset Filters SB']//i[@class='fa fa-undo']")
    private WebElement basicFilterResetBtn;

    @FindBy(xpath = "//select[@id='categories']")
    private WebElement categorySelect;

    @FindBy(xpath = "//button[@id='configure-columns']")
    private WebElement configureColumnsButton;

    @FindBy(xpath = "//button[@id='cancelColumn']")
    private WebElement columnsCancelButton;

    @FindBy(xpath = "//button[@id='EfSaveColumns']")
    private WebElement columnsSaveButton;

    @FindBy(xpath = "//ul[@id='sortable2']/li")
    private List<WebElement> alreadySelectedColumns;

    @FindBy(xpath = "//ul[@id='sortable1']/li")
    private List<WebElement> toBeSelectedColumns;

    @FindBy(xpath = "//ul[@id='sortable1']")
    private WebElement toBeSelectedArea;

    @FindBy(xpath = "//a[@id='_fast-categories']")
    private WebElement categoriesTabInCreateNewModal;

    @FindBy(id = "createItem")
    private WebElement createNewItemButton;

    @FindBy(xpath = "//button[@id='saveItem']")
    private WebElement createButtonInCreateModal;

    @FindBy(xpath = "//div[contains(@class,'modalFooter')]/button[contains(text(),'Cancel')]")
    private WebElement cancelButtonInCreateModal;

    @FindBy(xpath = "//select[@id='items-ItemStatuses']")
    private WebElement itemStatusSelect;

    @FindBy(xpath = "//button[contains(@id,'cancelPopup')]")
    private WebElement cancelBtnInDeleteModal;




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
