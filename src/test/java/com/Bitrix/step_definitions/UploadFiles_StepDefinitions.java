package com.Bitrix.step_definitions;

import com.Bitrix.pages.Bitrix_Main_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class UploadFiles_StepDefinitions {

    Bitrix_Main_Page mainPageBTNs = new Bitrix_Main_Page();

    @When("user clicks on message drop down tab")
    public void user_clicks_on_message_drop_down_tab() {
        System.out.println("clicked on message drop down");


    }

    @When("user clicks on upload files icon")
    public void user_clicks_on_upload_files_icon() {
        System.out.println("clicked on upload files icon");

    }
    @When("user should be able to see upload files dropdown options")
    public void user_should_be_able_to_see_upload_files_dropdown_options() {
        System.out.println("saw upload files dropdown options");

    }
    @Then("user should be able to upload files and images")
    public void user_should_be_able_to_upload_files_and_images() {
        System.out.println("clicked on upload files and images");

    }
    @Then("user should be able to select document from Bitrix24")
    public void user_should_be_able_to_select_document_from_bitrix24() {
        System.out.println("clicked on select document from Bitrix24");

    }
    @Then("user should be able to download from external drive")
    public void user_should_be_able_to_download_from_external_drive() {
        System.out.println("clicked on download from external drive");

    }

    @Then("user should be able to create using MS office online")
    public void user_should_be_able_to_create_using_ms_office_online() {
        System.out.println("clicked on create using MS office online");

    }



}
