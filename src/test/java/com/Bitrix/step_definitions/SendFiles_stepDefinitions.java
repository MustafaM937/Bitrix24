package com.Bitrix.step_definitions;

import com.Bitrix.pages.PortalPage;
import com.Bitrix.pages.loginPage;
import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SendFiles_stepDefinitions {

    PortalPage portalPage = new PortalPage();
    loginPage loginPage = new loginPage();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {

    }

    @When("User clicks for upload files")
    public void user_clicks_for_upload_files() {
        portalPage.fileBtn.click();


    }
    @Then("User download from external drive")
    public void user_download_from_external_drive() {

    }
    @Then("User selects documents from bitrix24")
    public void user_selects_documents_from_bitrix24() {

    }
    @Then("User is able to create files to upload")
    public void user_is_able_to_create_files_to_upload() {

    }
    @When("User clicks for file button")
    public void user_clicks_for_file_button() {

    }

    @Then("User clicks on upload files and images")
    public void user_clicks_on_upload_files_and_images() {

    }

}

