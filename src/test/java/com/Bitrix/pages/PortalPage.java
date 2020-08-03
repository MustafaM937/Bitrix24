package com.Bitrix.pages;

import com.Bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage {

    public PortalPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (id = "feed-add-post-form-link-text")
    public WebElement fileBtn;

    @FindBy (xpath = "(//span[@class='menu-popup-item-text'])[1]")
    public WebElement filedropdown;



}
