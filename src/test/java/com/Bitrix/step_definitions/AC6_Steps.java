package com.Bitrix.step_definitions;

import com.Bitrix.pages.ActiveStPage;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AC6_Steps {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    ActiveStPage activeStPage = new ActiveStPage();
    Actions action = new Actions(Driver.getDriver());

    @When("User clicks on the mention button")
    public void user_clicks_on_the_mention_button() {
        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.mentionButton));
        activeStPage.mentionButton.click();
    }




    @Then("User is able to select contact from dropdown list")
    public void user_is_able_to_select_contact_from_dropdown_list() {
        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.employeeList));
        activeStPage.employeeList.click();
        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.contact));
        action.moveToElement(activeStPage.contact).click().perform();

    }
    @Then("User is able to click on send button")
    public void user_is_able_to_click_on_send_button() {
        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.sendButton));
        activeStPage.sendButton.click();
    }

}
