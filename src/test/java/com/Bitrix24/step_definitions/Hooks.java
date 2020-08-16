package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.loginPage;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    loginPage BitrixLogIn = new loginPage();


    @Before
    public void setUp(){
        Driver.getDriver().get("https://login2.nextbasecrm.com/stream/?login=yes");
        BitrixLogIn.userNameInput.sendKeys(ConfigurationReader.getProperty("username"));
        BitrixLogIn.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        BitrixLogIn.loginButton.click();





    }

    @After
    public void tearDown(){
        Driver.closeDriver();


    }
}
