package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bitrix_Main_Page {
    public Bitrix_Main_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[@class='feed-add-post-form-but feed-add-file']")
    public WebElement uploadFilesBTN;

    @FindBy (xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement LinkBTN;

    @FindBy (xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement insertVideoBTN;

    @FindBy (xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    public WebElement quoteBTN;

    @FindBy (id = "bx-b-mention-blogPostForm")
    public WebElement addMentionBTN;

    @FindBy (id = "bx-b-tag-input-blogPostForm")
    public WebElement addTagBTN;

    @FindBy (xpath = "//span[@class='feed-add-post-form-but-cnt feed-add-videomessage']")
    public WebElement recordVideoBTN;

    @FindBy (id = "lhe_button_editor_blogPostForm")
    public WebElement visualEditorBTN;

    @FindBy (id = "lhe_button_title_blogPostForm")
    public WebElement topicBTN;


}
