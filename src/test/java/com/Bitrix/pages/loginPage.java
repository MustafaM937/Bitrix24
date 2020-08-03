package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(name ="USER_LOGIN")
    public WebElement userNameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement messageArea;

    @FindBy(css = "span#bx-b-uploadfile-blogPostForm")
    public WebElement uploadButton;

    //@FindBy(xpath = "//table[@class='diskuf-selector-table wd-fa-add-file-light-table']/tbody/tr[1]/td[1]")
    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement UploadFileButton;

//
  //






}
