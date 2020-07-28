package com.Bitrix.step_definitions;

import com.Bitrix.pages.loginPage;
import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class Upload_Download {
    loginPage loginPage = new loginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("BitrixURL"));
        loginPage.UserNameBox.sendKeys("hr47@cybertekschool.com");
        loginPage.PassBox.sendKeys("UserUser");

        loginPage.LoginButton.click();



    }




    @When("clicks on the file upload button")
    public void clicks_on_the_file_upload_button() {
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.messageArea));
       loginPage.messageArea.click();
       wait.until(ExpectedConditions.elementToBeClickable(loginPage.uploadButton));
       loginPage.uploadButton.click();
    }


    @Then("User should be able to upload file")
    public void user_should_be_able_to_upload_file() {

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.UploadFileButton));

        loginPage.UploadFileButton.click();
    }

    @Then("User should be able to click on Download from external drive")
    public void user_should_be_able_to_click_on_download_from_external_drive() {
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.downloadFromExternalDrive));
        loginPage.downloadFromExternalDrive.click();
        String ExternalDriveWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(ExternalDriveWindow);
        loginPage.RecentFilesButton.click();
        loginPage.uploadedFile.click();
        loginPage.SelectDocumentButton.click();
    }

    @Then("User should be able to click on link Select from bitrix24")
    public void user_should_be_able_to_click_on_link_select_from_bitrix24() {
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.DownloadFromBitrix));
        loginPage.DownloadFromBitrix.click();
        String BitrixDriveWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(BitrixDriveWindow);
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.RecentFilesButton));
        loginPage.RecentFilesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.uploadedFile));
        loginPage.uploadedFile.click();
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.SelectDocumentButton));
        loginPage.SelectDocumentButton.click();
    }
}
