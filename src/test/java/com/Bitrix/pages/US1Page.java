package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US1Page {
    public US1Page(){
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




}
