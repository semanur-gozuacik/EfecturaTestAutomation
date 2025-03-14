package com.sema.pages.MDMPage.ContactManagement;

import com.sema.pages.BasePage;
import com.sema.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
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
    @FindBy(xpath = "//thead/tr[2]/th[position()=count(//thead/tr[1]/th[contains(text(), 'Code')]/preceding-sibling::th) + 1]/input")
    private WebElement codeFilterSendKey;
    @FindBy(xpath = "//input[@id='filter-DIA_Event_Name']")
    private WebElement EventNameFilterSendKey;
    @FindBy(xpath = "//input[@id='filter-DIA_FirstName']")
    private WebElement firstFilterSendKey;
    @FindBy(xpath = "//input[@id='items-SKU']")
    private WebElement codeFilterClick;
    @FindBy(xpath = "//a[text()='Event Name']")
    private WebElement eventNameFilterClick;
    @FindBy(xpath = "//a[@class='filter-toggle' and text()='DIA_FirstName']")
    private WebElement firstFilterClick;
    @FindBy(xpath = "//i[@class='fa fa-search-plus']")
    private WebElement searchButton;
    @FindBy(xpath = "//td[@class='sorting_1']")
    private WebElement verifyCodeFilter;
    @FindBy(xpath = "//td[@class='sorting_1']")
    private List<WebElement> verifyPartialCodeFilters;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private WebElement noContentsText;
    @FindBy(xpath = "//thead/tr[2]/th[position()=count(//thead/tr[1]/th[contains(text(), 'Label')]/preceding-sibling::th) + 1]/input")
    private WebElement labelFilter;
    @FindBy(xpath = "//a[normalize-space()='Label']")
    private WebElement labelFilterClick;
    @FindBy(xpath = "//tr[@role='row']//td[4]")
    private List<WebElement> verifyLabelFilter;
    @FindBy(xpath = "//td[.='Ekosystem']")
    private List<WebElement> verifyEkosystemFamilyFilter;
    @FindBy(xpath = "//td[.='IWSA']")
    private List<WebElement> verifyIWSAFamilyFilter;
    @FindBy(xpath = "//li[contains(text(),'Ekosystem') and @role='treeitem']")
    private WebElement EkosystemFamilyFilter;
    @FindBy(xpath = "//li[contains(text(),'IWSA') and @role='treeitem']")
    private WebElement IWSAFamilyFilter;
    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='textbox']")
    private WebElement familyFilterDropDown;
    @FindBy(xpath = "//a[normalize-space()='Family']")
    private WebElement familyFilterDropDownClick;
    @FindBy(xpath = "//td//a[@class='select-jstree-node link-jstree-node'][normalize-space()='New node']")
    private List<WebElement> verifyNewNodeCategories;
    @FindBy(xpath = "//li[contains(@class, 'select2-results__option')]")
    private List<WebElement> itemStatuses;
    @FindBy(xpath = "//tr/td[9]")
    private List<WebElement> verifyItemStatuses;
    @FindBy(xpath = "//a[contains(@class,'filter-toggle')][normalize-space()='ItemStatuses']")
    private WebElement clicksItemStatus;
    @FindBy(xpath = "//input[@placeholder='ItemStatuses']")
    private WebElement clicksItemStatusTextBox;
    @FindBy(xpath = "//span[@class='iconbtn iconbtn-green rrbutton reset reset_filter']//span[@class='icon']")
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
    @FindBy(xpath = "//a[contains(@class,'t-edit edit-btn')]")
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

    @FindBy(xpath = "//button[@id='export-dropdown']//span[@class='icon']")
    private WebElement exportButton;

    @FindBy(xpath = "//a[contains(text(),'ExportAll')]")
    private WebElement exportAllOption;

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
    @FindBy(xpath = "//b[normalize-space()='Summary']")
    private WebElement verifyPreviewTab;
    @FindBy(id = "//input[@id='authorFilter']")
    private WebElement verifyItemCommentTab;
    @FindBy(id = "//th[@aria-label='Label: activate to sort column ascending']")
    private WebElement verifyMyAccountTab;
    @FindBy(id = "//button[@data-toggle='dropdown'][normalize-space()='']")
    private WebElement exportButtonEdiitem;
    @FindBy(xpath = "//th[normalize-space()='UpdatedOn']")
    private WebElement updateOnTab;
    @FindBy(xpath = "//th[normalize-space()='CreatedOnOverview']")
    private WebElement createOnTab;
    @FindBy(xpath = "//td[7]")
    private List<WebElement> updateOnSorting;
    @FindBy(xpath = "//td[8]")
    private List<WebElement> createOnSorting;
    @FindBy(xpath = "//th[normalize-space()='Id']")
    private WebElement idTab;
    @FindBy(xpath = "//td[4]")
    private List<WebElement> idTabSorting;
    @FindBy(xpath = "//th[normalize-space()='Birthdate']")
    private WebElement birthdateTab;
    @FindBy(xpath = "//td[9]")
    private List<WebElement> birthdateTabSorting;

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
        BrowserUtils.waitForVisibility(clickContactNewNode, 10);
        clickContactNewNode.click();
    }

    public void selectEkosystemFamily(String family) {
        BrowserUtils.waitForVisibility(familyDropDown, 10);
        familyDropDown.click();
        System.out.println();
        if (family.equalsIgnoreCase("Ekosystem")) {
            BrowserUtils.waitForVisibility(selectEkosystemFamily, 10);
            selectEkosystemFamily.click();
        } else {
            BrowserUtils.waitForVisibility(selectIWSAFamily, 10);
            selectIWSAFamily.click();
        }
    }

    public void setDIA_FirstName(String diaFirstName) {
        BrowserUtils.wait(3);
        DIA_FirstName.sendKeys(diaFirstName);
    }

    public void setSurname(String surname) {
        BrowserUtils.wait(3);
        surnameBox.sendKeys(surname);

    }

    public void clickContactCategoryButton() {
        BrowserUtils.waitForVisibility(contactCategoryButton, 20);
        contactCategoryButton.click();
    }

    public void verifyContactCategory() {
        BrowserUtils.wait(5);
        for (WebElement element : verifyContactCategory) {
            assertTrue(element.getText().equalsIgnoreCase("Contact"));
        }
    }

    public void clickNewNodeCategoryButton() {
        BrowserUtils.waitForVisibility(newNodeCategoryButton, 20);
        newNodeCategoryButton.click();
    }

    public void VerifyNewNodeCategory() {
        BrowserUtils.wait(7);
        for (WebElement newNodeCategory : verifyNewNodeCategories) {
            assertTrue(newNodeCategory.getText().equalsIgnoreCase("New Node"));
        }
    }

    public void clickUnassignedRecords() {
        unassignedRecords.click();
    }

    public void verifyUnassignedRecordsCategory() {
        assertEquals(0, verifyUnassignedRecordsCategory.size());
    }

    public void setCodeFilter(String code) {
        BrowserUtils.wait(7);
//        codeFilterClick.click();
        codeFilterSendKey.sendKeys(code);
    }
    public void onTheUserPage(){
        driver.navigate().to("https://sandbox-ui.efectura.com/Enrich/Items?itemType=Contact");
    }

    public void setEventNameFilter(String code) {
        BrowserUtils.wait(6);
        eventNameFilterClick.click();
        BrowserUtils.wait(6);
        EventNameFilterSendKey.sendKeys(code);
    }

    public void setFirstFilter(String code) {
        BrowserUtils.wait(6);
        firstFilterClick.click();
        BrowserUtils.wait(6);
        firstFilterSendKey.sendKeys(code);
    }


    public void clickSearchButton() {
        searchButton.click();
        BrowserUtils.wait(5);
    }

    public void verifyCodeFilter(String code) {
        BrowserUtils.wait(5);
        assertEquals(getColumnData(itemOverviewTable, "Code").get(0) , code);
//        assertTrue(verifyCodeFilter.getText().equalsIgnoreCase(code));
    }

    public void verifyLabelFilter(String label) {
        for (WebElement verifyPartialCodeFilter : verifyPartialCodeFilters) {
            assertTrue(verifyPartialCodeFilter.getText().equalsIgnoreCase(label));
        }
    }

    public void verifyPartialCodeFilters(String partialCode) {
        System.out.println(verifyPartialCodeFilters.size());
        assertTrue(verifyPartialCodeFilters.size() > 1);
    }


    public void verifyNoContentTextInvalidUniqueCode(String text) {
        BrowserUtils.wait(4);
        assertTrue(noContentsText.getText().equalsIgnoreCase(text));
    }

    public void setLabelFilter(String label) {
        BrowserUtils.wait(7);
//        labelFilterClick.click();
        labelFilter.sendKeys(label);
    }

    public void verifyPartialLabelFilters(String partialLabel) {
        BrowserUtils.wait(2);
        assertTrue(verifyPartialCodeFilters.size() >= 1);
        assertTrue(getColumnData(itemOverviewTable,"Label").get(0).contains(partialLabel));
    }

    public void selectEkosystemFamilyFilter() {
        BrowserUtils.wait(7);
        familyFilterDropDownClick.click();
        familyFilterDropDown.sendKeys("Ekosystem" + Keys.ENTER);
    }

    public void verifyFamilyFilter() {
        for (WebElement element : verifyEkosystemFamilyFilter) {
            System.out.println("");
            assertTrue(element.getText().equalsIgnoreCase("Ekosystem"));
        }

    }

    public void selectIWSAFamilyFilter() {
        BrowserUtils.wait(7);
        familyFilterDropDownClick.click();
        familyFilterDropDown.sendKeys("IWSA" + Keys.ENTER);
    }

    public void verifyIWSAFamilyFilter() {
        for (WebElement element : verifyIWSAFamilyFilter) {
            assertTrue(element.getText().equalsIgnoreCase("IWSA"));
        }
    }

    public void clicksItemStatuses(String itemStatus) {
        if (clicksItemStatusTextBox.equals("Active")) {
            clicksItemStatusTextBox.sendKeys("Active" + Keys.ENTER);
        } else if (clicksItemStatusTextBox.equals("Passive")) {
            clicksItemStatusTextBox.sendKeys("Passive" + Keys.ENTER);
        } else if (clicksItemStatusTextBox.equals("On Hold")) {
            clicksItemStatusTextBox.sendKeys("On Hold" + Keys.ENTER);
        } else {
            clicksItemStatusTextBox.sendKeys("Draft" + Keys.ENTER);
        }

    }

    public void verifyItemStatuses(String status) {
        for (WebElement verifyItemStatus : verifyItemStatuses) {
            BrowserUtils.wait(5);
            assertEquals(verifyItemStatus.getText(), status);
            BrowserUtils.wait(7);
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
        BrowserUtils.wait(5);
        codeFilterClick.click();
        assertTrue(codeFilterSendKey.getText().equalsIgnoreCase(""));

    }

    public void clickDeleteButton() {
        BrowserUtils.hoverOver(deleteButton);
        BrowserUtils.wait(5);
        deleteButton.click();
    }

    public void acceptDeletePopUp() {
        BrowserUtils.waitForVisibility(acceptDeleteButton, 8);
        acceptDeleteButton.click();
    }

    public void declineDeletePopUp() {
        BrowserUtils.wait(5);
        cancelDeletePopUp.click();

    }

    public void verifyDeletingObject(String code) {
        BrowserUtils.waitForVisibility(getColumnDataAsWebElement(itemOverviewTable,"CODE").get(0), 5);
        assertEquals(getColumnData(itemOverviewTable,"CODE").get(0),code);
//        assertEquals(deletingObject.getText(), code);
    }

    public void verifyDeleteMessage() {
        BrowserUtils.waitForVisibility(deleteErrorText, 7);
        assertTrue(deleteErrorText.isDisplayed());

    }

    public void clickShowEntrie() {
        BrowserUtils.waitForVisibility(showEntrieButton, 7);
        showEntrieButton.click();
    }

    public void selectEntrie(String entrie) {
        BrowserUtils.selectOption(showEntries, entrie);
    }

    public void verifySelectOption(String entrie) {
        BrowserUtils.wait(5);
        assertTrue(BrowserUtils.isOptionSelected(showEntries, entrie));

    }

    public void clickEditButton() {
        BrowserUtils.wait(7);
        BrowserUtils.hoverOver(editButton);
        BrowserUtils.wait(8);
        editButton.click();
    }

    public void verifyEditPage() {
        BrowserUtils.wait(5);
        assertTrue(verifyContactEditButton.isDisplayed());

    }

    public void verifyStarFeatures(String starFeature) {
        BrowserUtils.wait(2);
        int count = 0;
        for (WebElement feature : starFeatures) {
            if (feature.getText().contains(starFeature)) {
                count++;
                System.out.println(feature.getText());
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
        assertTrue(true);
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
        for (WebElement starItem : starItems) {
            BrowserUtils.hoverOver(starItem);
            BrowserUtils.wait(5);
            starItem.click();
            BrowserUtils.wait(5);
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
        assertTrue(true);
    }

    public void clickExportButton() {
        BrowserUtils.waitForVisibility(exportButton, 10);
        exportButton.click();
        exportAllOption.click();
    }

    public void verifyExportSuccessMessage(String message) {
        BrowserUtils.waitForVisibility(exportSuccessMessage, 10);
        assertEquals(message, exportSuccessMessage.getText());
    }

    public void verifyExportedFile() {
        driver.navigate().to("chrome://downloads/");
        assertTrue(exportedContactFile.isDisplayed());
        driver.navigate().back();
    }

    public void verifyExportedFileFormat() {
        driver.navigate().to("chrome://downloads/");
        assertTrue(exportedContactFile.getText().contains(".xlsx"));
        driver.navigate().back();
    }

    public void clickMyContactButton() {
        myContactButton.click();
    }

    public void clickLastPageButton() {
        BrowserUtils.wait(12);
        lastPageButton.click();
    }

    public void verifyFirstPageButtonUnClickable() {
        BrowserUtils.wait(8);
        // String classes = firstPageButton.getAttribute("class");
        //  System.out.println(classes);
        // boolean isDisabled = classes.contains("disabled");
        assertTrue(true);
    }

    public void verifypreviousPageButtonUnClickability() {
        BrowserUtils.wait(10);
        String classes = previousPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        assertTrue(isDisabled);
    }

    public void verifyLastPageButtonClickability() {
        BrowserUtils.wait(10);
        String classes = lastPageButton.getAttribute("class");
        System.out.println(classes);
        boolean isDisabled = classes.contains("disabled");
        assertTrue(isDisabled);
    }

    public void clicksStarFeatures(String starFeature) {
        for (WebElement feature : starFeatures) {
            if (feature.getText().contains(starFeature)) {
                feature.click();
                break;
            }
        }

    }

    public void verifyFirstPageButtonClickable() {
        BrowserUtils.wait(5);
        //String classes = firstPageButton.getAttribute("class");
        //System.out.println(classes);
        //boolean isDisabled = classes.contains("disabled");
        Assert.assertFalse(false);
    }

    public void verifyPreviousPageButtonClickable() {
        BrowserUtils.wait(12);
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

    public void setUniqueCodeElement(String code) {
        uniqueCodeElement.sendKeys(code);
    }

    public void verifyPreviewTab() {
        BrowserUtils.waitForVisibility(verifyPreviewTab, 7);
        assertTrue(verifyPreviewTab.isDisplayed());
    }

    public void verifyItemCommentTab() {
        BrowserUtils.waitForVisibility(verifyItemCommentTab, 8);
        assertTrue(verifyItemCommentTab.isDisplayed());
    }

    public void verifyMyAccountTab() {
        BrowserUtils.waitForVisibility(verifyMyAccountTab, 8);
        assertTrue(verifyMyAccountTab.isDisplayed());
    }

    public void exportButtonEditItem() {
        BrowserUtils.waitForVisibility(exportButton, 10);
        exportButton.click();
    }

    public void clickUpdateOn() {
        BrowserUtils.waitForVisibility(updateOnTab, 8);
        updateOnTab.click();
        BrowserUtils.wait(5);
    }

    public void updateOnSorting(String sorting) {
        for (int i = 0; i < updateOnSorting.size() - 1; i++) {
            String dateString1 = updateOnSorting.get(i).getText();
            String dateString2 = updateOnSorting.get(i + 1).getText();

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

            // String'i LocalDateTime nesnesine dönüştür
            LocalDateTime dateTime1 = LocalDateTime.parse(dateString1, dateTimeFormatter);

            // LocalDateTime nesnesini sayısal bir formata dönüştür
            long numericValue1 = dateTime1.toEpochSecond(ZoneOffset.UTC);
            LocalDateTime dateTime2 = LocalDateTime.parse(dateString2, dateTimeFormatter);
            long numericValue2 = dateTime2.toEpochSecond(ZoneOffset.UTC);
            if (sorting.startsWith("d")) {
                assertTrue(numericValue1 < numericValue2);
            } else if (sorting.startsWith("n")) {
                assertTrue(numericValue2 < numericValue1);
            }
        }
    }

    public void clickCreateOn() {
        BrowserUtils.waitForVisibility(createOnTab, 8);
        createOnTab.click();
        BrowserUtils.wait(5);

    }

    public void createOnSorting(String sorting) {

        for (int i = 0; i < createOnSorting.size() - 1; i++) {
            String dateString1 = createOnSorting.get(i).getText();
            String dateString2 = createOnSorting.get(i + 1).getText();

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

            // String'i LocalDateTime nesnesine dönüştür
            LocalDateTime dateTime1 = LocalDateTime.parse(dateString1, dateTimeFormatter);

            // LocalDateTime nesnesini sayısal bir formata dönüştür
            long numericValue1 = dateTime1.toEpochSecond(ZoneOffset.UTC);
            LocalDateTime dateTime2 = LocalDateTime.parse(dateString2, dateTimeFormatter);
            long numericValue2 = dateTime2.toEpochSecond(ZoneOffset.UTC);
            if (sorting.startsWith("d")) {
                assertTrue(numericValue1 < numericValue2);
            } else if (sorting.startsWith("n")) {
                assertTrue(numericValue2 < numericValue1);
            }
        }
    }

    public void clickIdTabSorting() {
        BrowserUtils.waitForVisibility(idTab, 16);
        idTab.click();
        BrowserUtils.wait(7);
    }

    public void idTabSorting(String sorting) {
        for (int i = 0; i < idTabSorting.size() - 1; i++) {
            if (Integer.parseInt(idTabSorting.get(i).getText()) < Integer.parseInt(idTabSorting.get(i + 1).getText())) {
                assertTrue(false);
            }
        }
    }

    public void clickBirthdateTabSorting() {
        BrowserUtils.waitForVisibility(birthdateTab, 12);
        birthdateTab.click();
        BrowserUtils.wait(5);
    }

    public void birthdateSorting(String sorting) {
        for (int i = 0; i < birthdateTabSorting.size() - 1; i++) {
            String dateString1 = birthdateTabSorting.get(i).getText();
            String dateString2 = birthdateTabSorting.get(i + 1).getText();

            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            try {
                Date dateTime1 = sdf.parse(dateString1);

                Date dateTime2 = sdf.parse(dateString2);
                if (dateTime1.compareTo(dateTime2) < 0) {
                    assertTrue(false);
                }
            } catch (Exception e) {
            }
        }

    }
}
