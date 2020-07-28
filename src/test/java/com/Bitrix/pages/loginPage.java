package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(name ="USER_LOGIN")
    public WebElement UserNameBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement PassBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement LoginButton;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement messageArea;

    @FindBy(css = "span#bx-b-uploadfile-blogPostForm")
    public WebElement uploadButton;

    @FindBy(xpath = "//table[@class='diskuf-selector-table wd-fa-add-file-light-table']/tbody/tr[1]/td[1]")
       public WebElement UploadFileButton;

    @FindBy(xpath = "//table[@class='diskuf-selector-table wd-fa-add-file-light-table']/tbody/tr[3]/td[1]")
    public WebElement downloadFromExternalDrive;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[3]/span/span/span[1]")
    public WebElement DownloadFromBitrix;

    @FindBy(xpath = "//span[@title='Recent items']")
    public WebElement RecentFilesButton;

    @FindBy(xpath = "//*[@id=\"bx-file-dialog-content-DiskFileDialog\"]/div/div[3]/div/span[1]/a")
    public WebElement uploadedFile;

    @FindBy(xpath = "//*[@id=\"DiskFileDialog\"]/div[3]/span[1]")
    public WebElement SelectDocumentButton;






}
