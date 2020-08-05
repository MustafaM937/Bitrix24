package com.Bitrix.step_definitions;

import com.Bitrix.pages.AC2Page;
import com.Bitrix.pages.US1Page;
import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {
    US1Page loginPage = new US1Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
    AC2Page ac2Page = new AC2Page();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("BitrixURL"));
        loginPage.UserNameBox.sendKeys(ConfigurationReader.getProperty("BitrixUser_HelpDesk"));
        loginPage.PassBox.sendKeys("UserUser");

        loginPage.LoginButton.click();

    }

    @When("User clicks on the message feed area")
    public void user_clicks_on_the_message_feed_area() {
        wait.until(ExpectedConditions.elementToBeClickable(ac2Page.messageArea));
        ac2Page.messageArea.click();
    }
}
