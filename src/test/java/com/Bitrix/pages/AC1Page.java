package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AC1Page extends US1Page {
    public AC1Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "span#bx-b-uploadfile-blogPostForm")
    public WebElement uploadButton;

    @FindBy(css = "[name='bxu_files[]']")
    public WebElement uploadFileAndImages;

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

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[3]/span/span/span[1]/span/span/span[1]")
    public WebElement MSOfficeLink;

    @FindBy(xpath = "/html/body/div[7]/div[1]/div/div/a[4]/span[2]")
    public WebElement MSOfficeOnline;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[1]/span[2]")
    public WebElement DocumentLink;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[2]/span[2]")
    public WebElement SpreadsheetLink;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[3]/span[2]")
    public WebElement PowePointLink;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;
}

