package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStPage extends US1Page {
    public ActiveStPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"bx-b-video-blogPostForm\"]/span/i")
    public WebElement videoUploadButton;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceURL;

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement videoSaveButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[4]/div")
    public WebElement videoPlayer;

    @FindBy(xpath = "//*[@id=\"bx-b-quote-blogPostForm\"]/span/i")
    public WebElement quoteButton;

    @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")
    public WebElement iframe;



    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteFeedArea;

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionButton;

    @FindBy(linkText = "Employees and departments")
    public WebElement employeeList;

    @FindBy(linkText = "helpdesk59@cybertekschool.com")
    public WebElement contact;

    @FindBy(id = "lhe_button_editor_blogPostForm")
    public WebElement visualEditorButton;

    @FindBy(xpath = "//*[@id=\"bx-html-editor-tlbr-idPostFormLHE_blogPostForm\"]/span[2]")
    public WebElement visualEditionBar;

    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement TopicButton;

    @FindBy (id = "POST_TITLE")
    public WebElement TopicMessage;

    @FindBy(xpath = "//*[@id=\"post-buttons-bottom\"]/span[7]")
    public WebElement VideoRecordingButton;

    @FindBy(xpath = "//*[@id=\"bx-popup-videomessage-popup\"]/div[3]/span[1]")
    public WebElement allowButton;

    @FindBy(id = "popup-window-content-bx-popup-videomessage-popup")
    public WebElement popUPWindowErrorMessage;

}
