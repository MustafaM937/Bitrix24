package com.Bitrix.step_definitions;

import com.Bitrix.pages.ActiveStPage;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AC8_Steps {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    ActiveStPage activeStPage = new ActiveStPage();
    Actions action = new Actions(Driver.getDriver());

    @Then("User should be able to click on the Topic Icon")
    public void user_should_be_able_to_click_on_the_topic_icon() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        activeStPage.TopicButton.click();
    }




    @Then("User should be able to see the Topic header")
    public void user_should_be_able_to_see_the_topic_header() {
        Assert.assertTrue("Topic message is not shown", activeStPage.TopicMessage.isDisplayed());


    }

}
