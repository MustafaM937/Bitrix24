package com.Bitrix.step_definitions;

import com.Bitrix.pages.AC2Page;
import com.Bitrix.pages.US1Page;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AC2_Steps {
    US1Page loginPage = new US1Page();
    AC2Page ac2Page = new AC2Page();
    Actions action = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    @When("User clicks on the message feed area")
    public void user_clicks_on_the_message_feed_area() {
        wait.until(ExpectedConditions.elementToBeClickable(ac2Page.messageArea));
        ac2Page.messageArea.click();
    }




    @Then("User clicks on the Address feed area")
    public void user_clicks_on_the_address_feed_area() {
        wait.until(ExpectedConditions.elementToBeClickable(ac2Page.AddressFeed));
        ac2Page.AddressFeed.click();
    }
    @Then("Adds contacts from recent contact list option")
    public void adds_contacts_from_recent_contact_list_option() {

      //  String AddWindow = Driver.getDriver().getWindowHandle();
     //   Driver.getDriver().switchTo().window(AddWindow);
        ac2Page.RecentOption.click();
        action.doubleClick(ac2Page.Allemp).perform();
        //ac2Page.Allemp.click();
    }
    @Then("Adds contacts from employee list option")
    public void adds_contacts_from_employee_list_option() {
        wait.until(ExpectedConditions.elementToBeClickable(ac2Page.EmpDepOption));
       ac2Page.EmpDepOption.click();

       wait.until(ExpectedConditions.elementToBeClickable(ac2Page.hlpDesk));
       action.moveToElement(ac2Page.hlpDesk).click().perform();

    }
    @Then("Adds contacts from email list option")
    public void adds_contacts_from_email_list_option() {
      ac2Page.emailOption.click();
      ac2Page.CloseIcon.click();


    }

}
