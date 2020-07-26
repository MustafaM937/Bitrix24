package com.Bitrix.step_definitions;

import com.Bitrix.pages.loginPage;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class Upload {
    loginPage loginPage = new loginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {

        Driver.getDriver().get("https://login2.nextbasecrm.com");
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
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", "loginPage.UploadFileButton");
        File file = new File("C:\\Users\\Mohammad\\Desktop");
        loginPage.UploadFileButton.sendKeys(file.getAbsolutePath());


    }
}
