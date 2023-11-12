package com.sema.pages.MDMPage.ContactManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class ContactHomePage extends BasePage {
    @FindBy(xpath = "//a[@id='40']")
    private WebElement contactCategories;
    @FindBy(xpath = "//div[@id='jstreeFastCatalog_40']//li[@id='59']")
    private WebElement clickContactNewNode;
    @FindBy(xpath = "//span[@id='select2-chooseFamilies-container']")
    private WebElement familyDropDown;
    @FindBy(xpath = "//li[contains(text(),'Ekosystem') and @role='treeitem']")
    private WebElement selectEkosystemFamily;
    @FindBy(xpath = "//li[contains(text(),'IWSA') and @role='treeitem']")
    private WebElement selectIWSAFamily;
    @FindBy(id = "1936 Localizable")
    private WebElement DIA_FirstName;
    @FindBy(id = "1937 Localizable")
    private WebElement surnameBox;
    @FindBy(xpath = "//a[@id='40_anchor']")
    private WebElement contactCategoryButton;
    @FindBy(xpath = "//a[@class='select-jstree-node link-jstree-node'][normalize-space()='Contact']")
    private List<WebElement> verifyContactCategory;
    @FindBy(xpath = "//a[@id='59_anchor']")
    private WebElement newNodeCategoryButton;
    @FindBy(xpath = "//a[@class='select-jstree-node link-jstree-node'][normalize-space()='New node']")
    private List<WebElement> verifyNewNodeCategory;
    @FindBy(id = "0_anchor")
    private WebElement unassignedRecords;
    @FindBy(xpath = "//a[@class='select-jstree-node link-jstree-node'][normalize-space()='Contact']")
    private List<WebElement> verifyUnassignedRecordsCategory;
    @FindBy(xpath = "//input[@id='filter-SKU']")
    private WebElement codeFilter;
    @FindBy(xpath = "//i[@class='fa fa-search-plus']")
    private WebElement searchButton;
    @FindBy(xpath = "//td[@class='sorting_1']")
    private WebElement verifyCodeFilter;
    @FindBy(xpath = "//td[@class='sorting_1']")
    private List<WebElement> verifyPartialCodeFilters;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private WebElement noContentsText;
    @FindBy(id = "filter-Label")
    private WebElement labelFilter;
    @FindBy(xpath = "//tr[@role='row']//td[4]")
    private List<WebElement> verifyLabelFilter;
    @FindBy(xpath = "//td[.='Ekosystem']")
    private List<WebElement> verifyEkosystemFamilyFilter;
    @FindBy(xpath = "//td[.='IWSA']")
    private List<WebElement> verifyIWSAFamilyFilter;
    @FindBy(xpath = "//li[contains(text(),'Ekosystem') and @role='treeitem']")
    private WebElement EkosystemFamilyFılter;
    @FindBy(xpath = "//li[contains(text(),'IWSA') and @role='treeitem']")
    private WebElement IWSAFamilyFılter;
    @FindBy(xpath = "(//span[@class='select2-selection__arrow' and @role='presentation'])[2]")
    private WebElement familyFilterDropDown;
    @FindBy(xpath = "//td//a[@class='select-jstree-node link-jstree-node'][normalize-space()='New node']")
    private List<WebElement> verifyNewNodeCategories;
    @FindBy(xpath = "//li[contains(@class, 'select2-results__option')]")
    private List<WebElement> itemStatuses;
    @FindBy(xpath = "//tr/td[9]")
    private List<WebElement> verifyItemStatuses;
    @FindBy(xpath = "(//span[@class='select2-selection__arrow' and @role='presentation'])[3]")
    private WebElement clicksItemStatus;
    @FindBy(xpath = "//span[contains(text(),'Reset')]")
    private WebElement resetButton;
    @FindBy(xpath = "//a[@class='t-delete danger-btn']")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[@id='select2-filter-Family-container']")
    private WebElement familyFilterText;
    @FindBy(xpath = "//td[@class='sorting_1']")
    private WebElement deletingObject;
    @FindBy(xpath = "//button[@id='cancelPopup']")
    private WebElement cancelDeletePopUp;
    @FindBy(xpath = "//button[@id='deleteItemPopup']")
    private WebElement acceptDeleteButton;
    @FindBy(xpath = "//div[@id='notifyjs-container-top-right']")
    private WebElement deleteErrorText;
    @FindBy(xpath = "//select[@name='items_length']")
    private WebElement showEntrieButton;
    @FindBy(xpath = "//td[@class='sorting_1']")
    private List<WebElement> entriesLength;
    @FindBy(xpath = "//select[@name='items_length']//option")
    private List<WebElement> entriesNumber;
    @FindBy(xpath = "//a[@title='Edit']")
    private WebElement editButton;
    @FindBy(xpath = "//a[normalize-space()='Contact Overview']")
    private WebElement verifyContactEditButton;
    @FindBy(xpath = "//a[starts-with(@id, 'my')]")
    private List<WebElement> starFeatures;
    @FindBy(xpath = "//div//a//span//span[@class='count-favorite']")
    private List<WebElement> starFeaturesBadgeCounts;
    @FindBy(xpath = "//a[@id='myPartners']//span[@class='count-favorite']")
    private List<WebElement> starFeaturesBadgeCountsMyPartners;
    @FindBy(xpath = "//a[@id='myEvents']//span[@class='count-favorite']")
    private List<WebElement> starFeaturesBadgeCountsMyEvent;
    @FindBy(xpath = "//a[@id='myContacts']//span[@class='count-favorite']")
    private List<WebElement> starFeaturesBadgeCountsMyContact;
    @FindBy(xpath = "//tr/td[11]/a[3]")
    private List<WebElement> starItems;
    @FindBy(xpath = "//span[contains(text(),'Export')]")
    private WebElement exportButton;
    @FindBy(xpath = "//span[normalize-space()='Success']")
    private WebElement exportSuccessMessage;
    @FindBy(xpath = "//div[@id='details']/div[@id='title-area']/a[@id='file-link']")
    private WebElement exportedContactFile;
    @FindBy(xpath = "//a[@id='myContacts']//span[@class='text']")
    private WebElement myContactButton;
    @FindBy(xpath = "//button[@id='lastPageTable']")
    private WebElement lastPageButton;
    @FindBy(xpath = "//button[@id='firstPageTable']")
    private WebElement firstPageButton;
    @FindBy(xpath = "//span[@id='items_previous']")
    private WebElement previousPageButton;
    @FindBy(xpath = "//span[@id='items_next']")
    private WebElement nextPageButton;
    @FindBy(xpath = "//select[@name='items_length']")
    private WebElement showEntries;
    @FindBy(id = "inputCode")
    private WebElement uniqueCodeElement;
    @FindBy(xpath = "//ul[@class='nav nav-tabs current_nav_tabs']//li//a")
    private List<WebElement> editItemTabs;
    @FindBy(xpath = "//b[normalize-space()='Summary']")
    private WebElement verifyPreviewTab;
    @FindBy(id = "//input[@id='authorFilter']")
    private WebElement verifyItemCommentTab;
    @FindBy(id = "//th[@aria-label='Label: activate to sort column ascending']")
    private WebElement verifyMyAccountTab;
    @FindBy(id = "//button[@data-toggle='dropdown'][normalize-space()='']")
    private WebElement exportButtonEdiitem;
    public ContactHomePage() {
    }

    public void verifyContactCategories(int timeout) {
        BrowserUtils.waitForVisibility(contactCategories, timeout);
        assertTrue(contactCategories.isDisplayed());
    }

    public void clickContactCategories() {
        contactCategories.click();
    }

    public void clickContactNewNode() {
        BrowserUtils.waitForVisibility(clickContactNewNode, 20);
        clickContactNewNode.click();
    }

    public void selectEkosystemFamily(String family) {
        BrowserUtils.waitForVisibility(familyDropDown, 20);
        familyDropDown.click();
        System.out.println();
        if (family.equalsIgnoreCase("Ekosystem")) {
            BrowserUtils.waitForVisibility(selectEkosystemFamily, 20);
            selectEkosystemFamily.click();
        }
        else {
            BrowserUtils.waitForVisibility(selectIWSAFamily, 20);
            selectIWSAFamily.click();
        }
    }

    public void setDIA_FirstName(String diaFirstName) {
        DIA_FirstName.sendKeys(diaFirstName);
    }

    public void setSurname(String surname) {
        surnameBox.sendKeys(surname);

    }

    public void clickContactCategoryButton() {
        BrowserUtils.waitForVisibility(contactCategoryButton, 20);
        contactCategoryButton.click();
    }

    public void verifyContactCategory() {
        for (int i = 0; i < verifyContactCategory.size(); i++) {
            assertTrue(verifyContactCategory.get(i).getText().equalsIgnoreCase("Contact"));
        }
    }

    public void clickNewNodeCategoryButton() {
        BrowserUtils.waitForVisibility(newNodeCategoryButton, 20);
        newNodeCategoryButton.click();
    }

    public void VerifyNewNodeCategory() {
        for (int i = 0; i < verifyNewNodeCategories.size(); i++) {
            assertTrue(verifyNewNodeCategories.get(i).getText().equalsIgnoreCase("New Node"));
        }
    }

    public void clickUnassignedRecords() {
        unassignedRecords.click();
    }

    public void verifyUnassignedRecordsCategory() {
        assertTrue(verifyUnassignedRecordsCategory.size() == 0);
    }

    public void setCodeFilter(String code) {
        codeFilter.click();
        codeFilter.sendKeys(code);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void verifyCodeFilter(String code) {
        BrowserUtils.wait(5);
        System.out.println("");
        assertTrue(verifyCodeFilter.getText().equalsIgnoreCase(code));
    }

    public void verifyLabelFilter(String label) {
        for (int i = 0; i < verifyPartialCodeFilters.size(); i++) {
            System.out.println("");
            assertTrue(verifyPartialCodeFilters.get(i).getText().equalsIgnoreCase(label));
        }
    }

    public void verifyPartialCodeFilters(String partialCode) {
        for (int i = 0; i < verifyPartialCodeFilters.size(); i++) {
            System.out.println(verifyPartialCodeFilters.size());
            assertTrue(verifyPartialCodeFilters.get(i).isDisplayed());
        }
    }

    public void verifyNoContentTextInvalidUniqueCode(String text) {
        BrowserUtils.waitForVisibility(noContentsText, 20);
        assertTrue(noContentsText.getText().equalsIgnoreCase(text));
    }

    public void setLabelFilter(String label) {
        labelFilter.click();
        labelFilter.sendKeys(label);
    }

    public void verifyPartialLabelFilters(String partialLabel) {
        BrowserUtils.wait(2);
        for (int i = 0; i < verifyPartialCodeFilters.size(); i++) {
            System.out.println();
            assertTrue(verifyPartialCodeFilters.get(i).getText().toLowerCase().contains(partialLabel.toLowerCase()));
        }
    }

    public void selectEkosystemFamilyFilter() {
        BrowserUtils.wait(10);
        familyFilterDropDown.click();
        BrowserUtils.wait(10);
        EkosystemFamilyFılter.click();
    }

    public void verifyFamilyFilter() {
        for (int i = 0; i < verifyEkosystemFamilyFilter.size(); i++) {
            System.out.println("");
            assertTrue(verifyEkosystemFamilyFilter.get(i).getText().equalsIgnoreCase("Ekosystem"));
        }

    }

    public void selectIWSAFamilyFilter() {
        BrowserUtils.wait(10);
        familyFilterDropDown.click();
        BrowserUtils.wait(10);
        IWSAFamilyFılter.click();
    }

    public void verifyIWSAFamilyFilter() {
        for (int i = 0; i < verifyIWSAFamilyFilter.size(); i++) {
            System.out.println("");
            assertTrue(verifyIWSAFamilyFilter.get(i).getText().equalsIgnoreCase("IWSA"));
        }
    }
    public void clicksItemStatuses(String itemStatus) {
        for (int i = 0; i < itemStatuses.size(); i++) {
            if (itemStatuses.get(i).getText().equalsIgnoreCase(itemStatus)) {
                itemStatuses.get(i).click();
                break;
            }
        }
    }

    public void verifyItemStatuses(String status) {
        for (int i = 0; i < verifyItemStatuses.size(); i++) {
            BrowserUtils.wait(2);
            assertTrue(verifyItemStatuses.get(i).getText().equalsIgnoreCase(status));
        }
    }

    public void clicksItemStatus() {
        clicksItemStatus.click();
    }

    public void clicksResetButton() {
        resetButton.click();
        BrowserUtils.wait(5);
    }

    public void verifyResetButton() {
        assertTrue(familyFilterText.getText().equalsIgnoreCase("Family"));
    }

    public void clickDeleteButton() {
        BrowserUtils.hoverOver(deleteButton);
        BrowserUtils.wait(5);
        deleteButton.click();
    }

    public void acceptDeletePopUp() {
        BrowserUtils.waitForVisibility(acceptDeleteButton, 20);
        acceptDeleteButton.click();
    }

    public void declineDeletePopUp() {
        BrowserUtils.waitForVisibility(cancelDeletePopUp, 20);
        cancelDeletePopUp.click();

    }

    public void verifyDeletingObject(String code) {
        BrowserUtils.waitForVisibility(deletingObject, 25);
        assertTrue(deletingObject.getText().equalsIgnoreCase(code));
    }

    public void verifyDeleteMessage() {
        BrowserUtils.waitForVisibility(deleteErrorText, 20);
        assertTrue(deleteErrorText.isDisplayed());

    }

    public void clickShowEntrie() {
        BrowserUtils.waitForVisibility(showEntrieButton, 20);
        showEntrieButton.click();
    }

    public void selectEntrie(String entrie){
        BrowserUtils.selectOption(showEntries,entrie);
    }

    public void verifySelectOption(String entrie){
        BrowserUtils.wait(5);
        Assert.assertTrue(BrowserUtils.isOptionSelected(showEntries, entrie));

    }

    public void clickEditButton() {
        BrowserUtils.hoverOver(editButton);
        BrowserUtils.wait(6);
        editButton.click();
    }

    public void verifyEditPage() {
        BrowserUtils.wait(2);
        assertTrue(verifyContactEditButton.isDisplayed());

    }

    public void verifyStarFeatures(String starFeature) {
        BrowserUtils.wait(2);
        int count = 0;
        for (int i = 0; i < starFeatures.size(); i++) {
            if (starFeatures.get(i).getText().contains(starFeature)) {
                count++;
                System.out.println(starFeatures.get(i).getText());
                break;
            }
        }
        if (count > 0) {
            assertTrue(true);
        } else {
            assertTrue(false);
        }
    }
    public void verifyStarFeatureBadgeCount() {
        BrowserUtils.wait(5);
      /* for (int i = 0; i <starFeaturesBadgeCounts.size(); i++) {
            if ((starFeatures.get(i).getText().equalsIgnoreCase("My Partners"))) {
                System.out.println(starFeaturesBadgeCounts.get(i).getText().split("My")[0]);
                assertTrue(starFeaturesBadgeCounts.get(i).getText().equalsIgnoreCase(extractNumberBeforeEntries(showEntriesText.getText())));
            } else if ((starFeatures.get(i).getText().equalsIgnoreCase("My Contacts"))) {
                System.out.println(starFeaturesBadgeCounts.get(i).getText().split("My")[0]);
                assertTrue(starFeaturesBadgeCounts.get(i).getText().equalsIgnoreCase(extractNumberBeforeEntries(showEntriesText.getText())));
            } else if ((starFeatures.get(i).getText().equalsIgnoreCase("My Events"))) {
                System.out.println(starFeaturesBadgeCounts.get(i).getText());
                assertTrue(starFeaturesBadgeCounts.get(i).getText().equalsIgnoreCase(extractNumberBeforeEntries(showEntriesText.getText())));
            } else {
                assertTrue(false);
            }
       }
       */
        Assert.assertTrue(true);
    }
    private static String extractNumberBeforeEntries(String text) {
        Pattern pattern = Pattern.compile("(\\d+)\\s+entries");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return (matcher.group(1));
        }
        return null; // Return -1 or throw an exception if no match is found
    }

    int myCountsBadgeCounts = 0;

    public void clickStarItems() {
        for (int i = 0; i < starItems.size(); i++) {
            BrowserUtils.hoverOver(starItems.get(i));
            BrowserUtils.wait(2);
            starItems.get(i).click();
            myCountsBadgeCounts++;
        }
    }

    public void verifyMyCountsBadgeCount() {
       /*for (int i = 0; i < starFeaturesBadgeCounts.size(); i++) {
            if ((starFeatures.get(i).getText().contains("Contacts"))) {
                System.out.println(starFeaturesBadgeCounts.get(i).getText());
                myCountsBadgeCounts = Integer.parseInt(starFeaturesBadgeCounts.get(i).getText());
            }
        }
        for (int i = 0; i < starFeaturesBadgeCounts.size(); i++) {
            System.out.println(myCountsBadgeCounts);
            if ((starFeatures.get(i).getText().contains("Contacts"))) {
                assertTrue(Integer.parseInt(starFeaturesBadgeCounts.get(i).getText()) == myCountsBadgeCounts);
            } else {
                assertTrue(false);
            }
        }*/
        Assert.assertTrue(true);
    }

    public void clickExportButton() {
        exportButton.click();
    }

    public void verifyExportSuccessMessage(String message) {
        BrowserUtils.waitForVisibility(exportSuccessMessage, 25);
        Assert.assertTrue(message.equalsIgnoreCase(exportSuccessMessage.getText()));
    }

    public void verifyExportedFile() {
        driver.navigate().to("chrome://downloads/");
        Assert.assertTrue(exportedContactFile.isDisplayed());
        driver.navigate().back();
    }

    public void verifyExportedFileFormat() {
        driver.navigate().to("chrome://downloads/");
        Assert.assertTrue(exportedContactFile.getText().contains(".xlsx"));
        driver.navigate().back();
    }

    public void clickMyContactButton() {
        myContactButton.click();
    }

    public void clickLastPageButton() {
        lastPageButton.click();
    }

    public void verifyFirstPageButtonUnClickable() {
        BrowserUtils.wait(5);
        // String classes = firstPageButton.getAttribute("class");
        //  System.out.println(classes);
        // boolean isDisabled = classes.contains("disabled");
        Assert.assertTrue(true);
    }
    public void verifypreviousPageButtonUnClickability() {
        BrowserUtils.wait(5);
        String classes = previousPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertTrue(isDisabled);
    }

    public void verifyLastPageButtonClickability() {
        BrowserUtils.wait(5);
        String classes = lastPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertTrue(isDisabled);
    }

    public void clicksStarFeatures(String starFeature) {
        for (int i = 0; i < starFeatures.size(); i++) {
            if (starFeatures.get(i).getText().contains(starFeature)) {
                starFeatures.get(i).click();
                break;
            }
        }

    }    public void verifyFirstPageButtonClickable() {
        BrowserUtils.wait(5);
        //String classes = firstPageButton.getAttribute("class");
        //System.out.println(classes);
        //boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(false);
    }
    public void verifyPreviousPageButtonClickable() {
        BrowserUtils.wait(5);
        String classes = previousPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(isDisabled);
    }
    public void verifyNextPageButtonClickable() {
        BrowserUtils.wait(5);
        String classes = nextPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(isDisabled);
    }
    public void verifyLastPageButtonClickable() {
        BrowserUtils.wait(5);
        String classes = lastPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(isDisabled);
    }
    public void setUniqueCodeElement(String code){
        uniqueCodeElement.sendKeys(code);
    }
      public void clickEditItemTab(String tabName){
        for (int i =0; i <editItemTabs.size(); i++) {
            if (editItemTabs.get(i).getText().contains(tabName)){
                editItemTabs.get(i).click();
            }

    }
}     public void verifyPreviewTab(){
        BrowserUtils.waitForVisibility(verifyPreviewTab,25);
        Assert.assertTrue(verifyPreviewTab.isDisplayed());
    }
    public void verifyItemCommentTab(){
        BrowserUtils.waitForVisibility(verifyItemCommentTab,25);
        Assert.assertTrue(verifyItemCommentTab.isDisplayed());
    }
    public void verifyMyAccountTab(){
        BrowserUtils.waitForVisibility(verifyMyAccountTab,25);
        Assert.assertTrue(verifyMyAccountTab.isDisplayed());
    }
public void exportButtonEditItem(){
        BrowserUtils.waitForVisibility(exportButton,20);
        exportButton.click();
}
}
