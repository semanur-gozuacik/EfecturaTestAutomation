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
}
