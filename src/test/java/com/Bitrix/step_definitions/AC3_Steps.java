package com.Bitrix.step_definitions;

import com.Bitrix.pages.AC3Page;
import com.Bitrix.pages.US1Page;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AC3_Steps {
    US1Page us1Page = new US1Page();
    AC3Page ac3Page = new AC3Page();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("User clicks on the attach icon")
    public void user_clicks_on_the_attach_icon() {
    wait.until(ExpectedConditions.elementToBeClickable(ac3Page.AttachLink));
    ac3Page.AttachLink.click();
    }




    @Then("User should be able attach a link to the message")
    public void user_should_be_able_attach_a_link_to_the_message() {
       String popUpLinkWindow = Driver.getDriver().getWindowHandle();
      Driver.getDriver().switchTo().window(popUpLinkWindow);
        wait.until(ExpectedConditions.elementToBeClickable(ac3Page.popUpTextFeed));


        ac3Page.popUpTextFeed.sendKeys("Online12 Message - Amazon Link");

        wait.until(ExpectedConditions.elementToBeClickable(ac3Page.saveButton));
        ac3Page.popUpLinkFeed.sendKeys("https://www.amazon.com");
        ac3Page.saveButton.click();

    }


    @Then("User should be able to send the linked message")
    public void user_should_be_able_to_send_the_linked_message() {

       wait.until(ExpectedConditions.elementToBeClickable(ac3Page.sendButton));

       ac3Page.sendButton.click();
    }


}
