package com.sema.pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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



}
