package com.Bitrix24.pages;

import com.Bitrix24.utilities.BrowserUtils;
import com.Bitrix24.utilities.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class PortalPage extends basePage{

    private final static Logger logger = Logger.getLogger(PortalPage.class);
    protected WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public PortalPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "feed-add-post-form-link-text")
    public WebElement fileBtn;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement filedropdown;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-primary']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[@class='feed-add-post-more-icon']")
    public WebElement moreDropdown;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement fileBtn1;

    @FindBy(xpath = "//*[@id=\"diskuf-selectdialog-XiVxR0n\"]/div[2]/table/tbody/tr[1]/td[1]")
    public WebElement uploadFilesBox;

    @FindBy(xpath = "//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file']")
    public WebElement docFromBitrixBox;

    @FindBy(xpath = "//span[@class = 'popup-window-button popup-window-button-accept']")
    public WebElement SelectDocumentBtn;

    @FindBy(xpath = "//span[.='Select document from Bitrix24']")
    public WebElement SelDocFromBitrixBox;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-disabled']")
    public WebElement selectDocumentBtn;

    public void uploadFile(String filePath){
        filePath = System.getProperty("user.dir")+"/"+filePath.replace("/", File.separator);
        logger.info("File path: "+filePath);
        uploadFilesBox.click();
        BrowserUtils.waitFor(2);
        uploadFilesBox.sendKeys(filePath);
        BrowserUtils.waitFor(2);
    }
    public void clickOnSendButton(){
        wait.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
        logger.info("Clicking on the Send button");
    }


}
