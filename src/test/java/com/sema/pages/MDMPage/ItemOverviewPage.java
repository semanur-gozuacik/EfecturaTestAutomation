package com.sema.pages.MDMPage;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.Driver;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.sema.utilities.BrowserUtils.isButtonActive;

@Getter
public class ItemOverviewPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'list-header all')]")
    private WebElement allListsAccordion;

    @FindBy(xpath = "//li[@class='list-item']/p")
    private List<WebElement> avaliableLists;

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

    @FindBy(xpath = "//a[@id='createNewList']")
    private WebElement createListButton;

    @FindBy(xpath = "//div[@id='create-new-list']/div/div/div/button[text()='Cancel']")
    private WebElement createNewListCancelButton;

    @FindBy(xpath = "//div[contains(@class,'modal-header')]/h4[normalize-space()='New List']")
    private WebElement newListPopup;

    @FindBy(xpath = "//input[@id='input-list']")
    private WebElement listNameInputBox;

    @FindBy(xpath = "//button[@id='create-list']")
    private WebElement listCreateButton;

    @FindBy(xpath = "//div[contains(@class,'accordion-container')]")
    private WebElement accordionContainer;


    public ItemOverviewPage() {
    }


    public void goToItemOverviewPage(String item) {
        driver.get(ConfigurationReader.getProperty("itemLinkWithoutItemName") + item);
    }

    public void selectList(String listName) {
        if (allListsAccordion.getAttribute("class").contains("active")) {
            allListsAccordion.click();
        }

        avaliableLists.stream()
                .filter(element -> element.getText().equals(listName))
                .findFirst()
                .ifPresent(WebElement::click);
    }

    public void openSideAccordionInOverview() {
        boolean isSidebarOpen = BrowserUtils.isElementDisplayed(accordionContainer);
        if (!isSidebarOpen) {
            overviewSideAccordion.click();
        } else {
            System.out.println("Accordion butonuna tıklanmadı!!!");
        }
    }

    public void closeSideAccordionInOverview() {
        boolean isSidebarOpen = BrowserUtils.isElementDisplayed(accordionContainer);
        if (isSidebarOpen) {
            overviewSideAccordion.click();
        }
    }


    /*
    You can write button names like these in future file:
    firstPageTable
    items_previous
    items_next
    lastPageTable
     */
    public void verifyButtonStatus(String btnName, String btnStatus) {
        BrowserUtils.wait(4);
        WebElement btn = driver.findElement(By.xpath(
                "//*[contains(translate(@id, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '"
                        + btnName + "')]"));
//        WebElement button = driver.findElement(By.id(btnName));
        if(btnStatus.equalsIgnoreCase("Active")) {
            Assert.assertTrue(isButtonActive(btn));
        } else if (btnStatus.equalsIgnoreCase("Passive")) {
            Assert.assertFalse(isButtonActive(btn));
        }
    }

    public void clickPaginationButton(String btnName) {
        BrowserUtils.wait(10);
        WebElement btn = driver.findElement(By.xpath(
                "//*[contains(translate(@id, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz'), '"
                        + btnName + "')]"));
//        WebElement btn2 = driver.findElement(By.id(btnName));
//        WebElement button = driver.findElement
//                (By.xpath("//div[@class='pagination-container']//button[@id='" + btnName + "']"));
        btn.click();
    }

    public void clickDeleteBtnOfList(String listName) {
        WebElement target = avaliableLists.stream().filter(e -> listName.equals(e.getText()))
                .findFirst().orElse(null);
        String locate = "//li[p[text()='" +listName + "']]//i[@data-original-title='DeleteList']";
        WebElement deleteBtn = Driver.getDriver().findElement(By.xpath(locate));
        BrowserUtils.hoverOver(target);
        deleteBtn.click();
    }
}
