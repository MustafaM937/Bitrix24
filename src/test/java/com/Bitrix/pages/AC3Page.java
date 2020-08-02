package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AC3Page extends US1Page {
    public AC3Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span")
    public WebElement AttachLink;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement popUpTextFeed;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement popUpLinkFeed;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement saveButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;
}
