package com.Bitrix.step_definitions;

import com.Bitrix.pages.ActiveStPage;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AC7_Steps {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    ActiveStPage activeStPage = new ActiveStPage();
    Actions action = new Actions(Driver.getDriver());


    @Then("User clicks on the visual Editor button")
    public void user_clicks_on_the_visual_editor_button() {
        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.visualEditorButton));
        activeStPage.visualEditorButton.click();
    }




    @Then("User should be able to see the visual editor bar")
    public void user_should_be_able_to_see_the_visual_editor_bar() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(activeStPage.visualEditionBar.isDisplayed());
    }


}
