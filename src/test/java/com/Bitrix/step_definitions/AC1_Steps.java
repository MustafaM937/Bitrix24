package com.Bitrix.step_definitions;

import com.Bitrix.pages.AC1Page;
import com.Bitrix.pages.US1Page;
import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.Map;

public class AC1_Steps {
    US1Page loginPage = new US1Page();
    AC1Page ac1Page = new AC1Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    Actions action = new Actions(Driver.getDriver());


    @When("clicks on the file upload button")
    public void clicks_on_the_file_upload_button() {
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.uploadButton));
        ac1Page.uploadButton.click();
    }


    @Then("User should be able to upload file")
    public void user_should_be_able_to_upload_file() {

        ac1Page.UploadFileButton.click();

    }

    @Then("User should be able to click on Download from external drive")
    public void user_should_be_able_to_click_on_download_from_external_drive() {
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.downloadFromExternalDrive));
        ac1Page.downloadFromExternalDrive.click();
        String ExternalDriveWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(ExternalDriveWindow);
        ac1Page.RecentFilesButton.click();
        ac1Page.uploadedFile.click();
        ac1Page.SelectDocumentButton.click();
    }

    @Then("User should be able to click on link Select from bitrix24")
    public void user_should_be_able_to_click_on_link_select_from_bitrix24() {
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.DownloadFromBitrix));
        ac1Page.DownloadFromBitrix.click();
        String BitrixDriveWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(BitrixDriveWindow);
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.RecentFilesButton));
        ac1Page.RecentFilesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.uploadedFile));
        ac1Page.uploadedFile.click();
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.SelectDocumentButton));
        ac1Page.SelectDocumentButton.click();
    }

    @Then("User should be able to click on link Create File button from MSOffice")
    public void user_should_be_able_to_click_on_link_create_file_button_from_ms_office() {
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.MSOfficeLink));
        ac1Page.MSOfficeLink.click();
        String popupWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(popupWindow);

        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.MSOfficeOnline));
        action.moveToElement(ac1Page.MSOfficeLink).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.DocumentLink));
        ac1Page.DocumentLink.click();
    }

    @Then("User should be able to click on the Spreadsheet creation link")
    public void user_should_be_able_to_click_on_the_spreadsheet_creation_link() {
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.MSOfficeLink));
        ac1Page.MSOfficeLink.click();
        String popupWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(popupWindow);

        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.MSOfficeOnline));
        action.moveToElement(ac1Page.MSOfficeLink).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.SpreadsheetLink));
        ac1Page.SpreadsheetLink.click();
    }

    @Then("User should be able to click on the PowerPoint creation link")
    public void user_should_be_able_to_click_on_the_power_point_creation_link() {
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.MSOfficeLink));
        ac1Page.MSOfficeLink.click();
        String popupWindow = Driver.getDriver().getWindowHandle();
        Driver.getDriver().switchTo().window(popupWindow);

        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.MSOfficeOnline));
        action.moveToElement(ac1Page.MSOfficeLink).click().perform();
        wait.until(ExpectedConditions.elementToBeClickable(ac1Page.PowePointLink));
        ac1Page.PowePointLink.click();
    }

    @Then("user uploads following file:")
    public void userUploadsFollowingFile(Map<String, String> map) throws InterruptedException {
        Thread.sleep(3000);
        String filePath = System.getProperty("user.dir") + "/" + map.get("File path").replace("/", File.separator);
        System.out.println("File path: " + filePath);
        ac1Page.uploadFileAndImages.sendKeys(filePath);
        Thread.sleep(2000);
        ac1Page.sendButton.click();
        Thread.sleep(2000);

    }
}
