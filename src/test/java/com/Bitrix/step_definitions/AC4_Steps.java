package com.Bitrix.step_definitions;

import com.Bitrix.pages.ActiveStPage;
import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;

public class AC4_Steps {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
    Actions actions = new Actions(Driver.getDriver());
    ActiveStPage activeStPage = new ActiveStPage();


    @When("User clicks on the video Upload Button")
    public void user_clicks_on_the_video_upload_button() {
       wait.until(ExpectedConditions.elementToBeClickable(activeStPage.videoUploadButton));

       activeStPage.videoUploadButton.click();

    }




    @Then("User should be able to insert video source link")
    public void user_should_be_able_to_insert_video_source_link() throws InterruptedException {

        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.videoSourceURL));
        activeStPage.videoSourceURL.sendKeys(ConfigurationReader.getProperty("VideoURL"));
        Thread.sleep(8000);

    }
    @Then("User should be able to save the video link")
    public void user_should_be_able_to_save_the_video_link() {



       activeStPage.videoSaveButton.click();
    }

    @Then("User should be able to send the video link")
    public void user_should_be_able_to_send_the_video_link() {

        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.sendButton));
        activeStPage.sendButton.click();
    }

}
