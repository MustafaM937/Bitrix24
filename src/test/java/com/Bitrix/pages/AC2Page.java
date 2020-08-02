package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AC2Page extends US1Page {
    public AC2Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "bx-destination-tag")
    public WebElement AddressFeed;

    @FindBy(linkText = "Recent")
    public WebElement RecentOption;

    @FindBy(linkText = "All employees")
    public WebElement Allemp;

    @FindBy(linkText = "Employees and departments")
    public WebElement EmpDepOption;

    @FindBy(linkText = "helpdesk59@cybertekschool.com")
    public WebElement hlpDesk;

    @FindBy(linkText = "E-mail users")
    public WebElement emailOption;

    @FindBy(xpath = "//*[@id=\"BXSocNetLogDestination\"]/span")
    public WebElement CloseIcon;
}
