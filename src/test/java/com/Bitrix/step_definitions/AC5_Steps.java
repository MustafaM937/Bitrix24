package com.Bitrix.step_definitions;

import com.Bitrix.pages.ActiveStPage;
import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;

public class AC5_Steps {
    ActiveStPage activeStPage = new ActiveStPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);



    @When("User clicks on the quote button")
    public void user_clicks_on_the_quote_button() {

        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.quoteButton));
       activeStPage.quoteButton.click();
    }




    @Then("User should be able to write on the quote area")
    public void user_should_be_able_to_write_on_the_quote_area() throws InterruptedException{

       Driver.getDriver().switchTo().frame(activeStPage.iframe);
       Thread.sleep(5);

       activeStPage.quoteFeedArea.sendKeys(ConfigurationReader.getProperty("TestMessage"));

    }


    @Then("User should be able to send the quote")
    public void user_should_be_able_to_send_the_quote() {
        String mainWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(mainWindow);
        activeStPage.sendButton.click();
    }

}
