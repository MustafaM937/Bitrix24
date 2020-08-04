package com.Bitrix.step_definitions;

import com.Bitrix.pages.ActiveStPage;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class AC9_Steps {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    ActiveStPage activeStPage = new ActiveStPage();
    Actions action = new Actions(Driver.getDriver());



    @When("User clicks on the recording button")
    public void user_clicks_on_the_recording_button() {
        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.VideoRecordingButton));
       activeStPage.VideoRecordingButton.click();
    }




    @Then("User should be able to record video")
    public void user_should_be_able_to_record_video() throws InterruptedException {


        activeStPage.allowButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(activeStPage.popUPWindowErrorMessage));
        String ErrorMessage = activeStPage.popUPWindowErrorMessage.getText();
        System.out.println(ErrorMessage);








    }

}

