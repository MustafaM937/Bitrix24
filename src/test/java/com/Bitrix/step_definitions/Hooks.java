package com.Bitrix.step_definitions;

import com.Bitrix.pages.Bitrix_LoginPage;
import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    Bitrix_LoginPage BitrixLogIn = new Bitrix_LoginPage();

    @Before
    public void setUp(){
        Driver.getDriver().get("https://login2.nextbasecrm.com/stream/?login=yes");
        BitrixLogIn.userNameInput.sendKeys("helpdesk47@cybertekschool.com");
        BitrixLogIn.passwordInput.sendKeys("UserUser");
        BitrixLogIn.loginButton.click();






    }

    @After
    public void tearDown(){
        Driver.closeDriver();


    }
}
