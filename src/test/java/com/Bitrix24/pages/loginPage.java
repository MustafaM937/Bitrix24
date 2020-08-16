package com.Bitrix24.pages;

import com.Bitrix24.utilities.ConfigurationReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class loginPage extends basePage {
    private final static Logger logger = Logger.getLogger(loginPage.class);

    @FindBy(name = "USER_LOGIN")
    private WebElement email;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    public void login() {
        String usernameString = ConfigurationReader.getProperty("username");
        String passwordString = ConfigurationReader.getProperty("password");
        email.sendKeys(usernameString);
        password.sendKeys(passwordString, Keys.ENTER);
        logger.info("Login with " + usernameString + " username and " + passwordString + " password");
    }

    /**
     * This method used for login under specific role
     *
     * @param role like hr, helpdesk, marketing
     */
    public void login(String role) {
        role = role.toLowerCase();
        /**
         * if(role == hr){
         *    ConfigurationReader.getProperty("email." + "hr"); --> email.hr --> hr43@cybertekschool.com
         *
         * }
         */
        //email.hr=hr43@cybertekschool.com
        String usernameString = ConfigurationReader.getProperty("email." + role);
        String passwordString = ConfigurationReader.getProperty("password");
        email.sendKeys(usernameString);
        password.sendKeys(passwordString, Keys.ENTER);

        logger.info("Logins as " + role);

    }
}
