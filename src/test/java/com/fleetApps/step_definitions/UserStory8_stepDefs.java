package com.fleetApps.step_definitions;

import com.fleetApps.utilities.BrowserUtils;
import com.fleetApps.utilities.ConfigurationReader;
import com.fleetApps.utilities.Driver;
import com.fleetApps.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Map;

public class UserStory8_stepDefs {

    Pages pages = new Pages();

    @Given("User enters valid credentials")
    public void user_enters_valid_credentials() {
      pages.loginPage().login("store manager");
        System.out.println("User logs in");

    }




    @Given("User navigates to Fleet Vehicle Contracts")
    public void user_navigates_to_fleet_vehicle_contracts() {
        BrowserUtils.waitForClickability(pages.dashboardPage().accounts,
                Integer.parseInt(ConfigurationReader.getProperty("medium_wait")));
        BrowserUtils.hover(pages.dashboardPage().FleetModule);
        System.out.println("User hovers to fleet module");
        BrowserUtils.waitForClickability(pages.dashboardPage().vehicleContractPage,
                Integer.parseInt(ConfigurationReader.getProperty("short_wait")));
        pages.dashboardPage().vehicleContractPage.click();
        System.out.println("User clicks on Vehicle Contract page");

    }
    @Then("User verifies {string} text is displayed")
    public void user_verifies_text_is_displayed(String allVehicleContractText) {
        Assert.assertTrue(pages.vehicleContractPage().allVehicleContractText.isDisplayed());
    }


   //////////////////////////////////AC2//////////////////////////////




    @When("User clicks on Create Vehicle Contract button")
    public void user_clicks_on_create_vehicle_contract_button() {
      BrowserUtils.waitForVisibility(pages.vehicleContractPage().createContractButton,
               Integer.parseInt(ConfigurationReader.getProperty("long_wait")));
        System.out.println("User waits for create contract button to be visible");
       // pages.vehicleContractPage().createContractButton.click();
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].click();",
                pages.vehicleContractPage().createContractButton);
        System.out.println("User clicks on Create Contract button");

    }


    @And("User fills out contract information:")
    public void userFillsOutContractInformation(Map<String,String> values) {
        BrowserUtils.waitForClickability(pages.vehicleContractPage().saveAndCloseButton,
                Integer.parseInt(ConfigurationReader.getProperty("medium_wait")));
        pages.vehicleContractPage().enterWhoIsResponsible(values.get("Responsible"));
        pages.vehicleContractPage().enterActivationCost(values.get("Activation Cost"));
        pages.vehicleContractPage().enter_recurringCost_deprecated(values.get("Recurring Cost Amount (Depreciated)"));
        pages.vehicleContractPage().enterOdometerDetails(values.get("Odometer Details"));
        pages.vehicleContractPage().enterInvoiceDate(values.get("Inovice Date"));
        pages.vehicleContractPage().contractStartDate(values.get("Contract Start Date"));
        pages.vehicleContractPage().contractExpirationDate(values.get("Contract Expiration Date "));
        pages.vehicleContractPage().vendor(values.get("Vendor"));
        pages.vehicleContractPage().driver(values.get("Driver"));
        pages.vehicleContractPage().contractReference(values.get("Contract Reference"));
    }

    @And("User chooses contract type as {string}")
    public void userChoosesContractTypeAs(String type) {
        pages.vehicleContractPage().selectType(type);
    }

    @And("User clicks on save and close button")
    public void userClicksOnSaveAndCloseButton() {
        pages.vehicleContractPage().saveAndCloseButton.click();
    }

    @Then("User verifies that {string} message is displayed")
    public void userVerifiesThatMessageIsDisplayed(String message) {
        BrowserUtils.waitForVisibility(pages.vehicleContractPage().entitySavedMessage,
                Integer.parseInt(ConfigurationReader.getProperty("short_wait")));
        Assert.assertTrue(pages.vehicleContractPage().entitySavedMessage.isDisplayed()
                && pages.vehicleContractPage().entitySavedMessage.equals(message));
    }
}
