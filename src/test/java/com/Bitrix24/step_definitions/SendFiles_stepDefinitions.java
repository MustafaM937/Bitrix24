package com.Bitrix24.step_definitions;

import com.Bitrix24.pages.PortalPage;
import com.Bitrix24.pages.loginPage;
import com.Bitrix24.utilities.BrowserUtils;
import com.Bitrix24.utilities.ConfigurationReader;
import com.Bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class SendFiles_stepDefinitions {

    PortalPage portalPage = new PortalPage();
    loginPage loginPage = new loginPage();

    private final static Logger logger = Logger.getLogger(PortalPage.class);

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        loginPage.login();

    }
    @When("User clicks for file button")
    public void user_clicks_for_file_button() {
        portalPage.moreDropdown.click();
        BrowserUtils.waitFor(2);
        portalPage.fileBtn1.click();
    }

    @When("User clicks for upload files")
    public void user_clicks_for_upload_files(String filePath) {
        portalPage.uploadFilesBox.click();
        BrowserUtils.waitFor(3);
        portalPage.uploadFile("File path");
        BrowserUtils.waitFor(5);
        portalPage.sendButton.click();
    }
    @Then("User download from external drive")
    public void user_download_from_external_drive() {


    }
    @Then("User selects documents from bitrix24")
    public void user_selects_documents_from_bitrix24() {
        portalPage.SelDocFromBitrixBox.click();
        portalPage.uploadFile("File Path");
        BrowserUtils.waitFor(2);
        portalPage.docFromBitrixBox.click();
        portalPage.selectDocumentBtn.click();

    }
    @Then("User is able to create files to upload")
    public void user_is_able_to_create_files_to_upload() {

    }


    @Then("User clicks on upload files and images")
    public void user_clicks_on_upload_files_and_images() {

    }

}

