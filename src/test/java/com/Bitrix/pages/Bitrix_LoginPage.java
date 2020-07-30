package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bitrix_LoginPage {
    public Bitrix_LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name = 'USER_LOGIN']")
    public WebElement userNameInput;

    @FindBy (xpath = "//input[@name = 'USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@class = 'login-btn']")
    public WebElement loginButton;
}
