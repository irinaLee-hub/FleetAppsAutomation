package com.fleetApps.step_definitions;

import com.fleetApps.pages.QuickLaunchpadPage;
import com.fleetApps.utilities.BrowserUtils;
import com.fleetApps.utilities.ConfigurationReader;
import com.fleetApps.utilities.Driver;
import com.fleetApps.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sun.plugin.dom.exception.BrowserNotSupportedException;

import java.util.Map;

public class LoginStepDefs {
    Pages pages=new Pages();

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        //Hooks runs here

        System.out.println("Background is running");

    }

    @When("user enters Driver's credentials")
    public void user_enters_Driver_s_credentials() {
        pages.loginPage().login();

    }

    @Then("User verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String pageName) {
        BrowserUtils.waitForVisibility(pages.quickLaunchpadPage().quickLaunchPadText,
                Integer.parseInt(ConfigurationReader.getProperty("short_wait")));
        Assert.assertTrue(pages.quickLaunchpadPage().quickLaunchPadText.isDisplayed());


    }

    @When("user enters Store manager's credentials")
    public void userEntersStoreManagerSCredentials() {
        pages.loginPage().login("store manager");

    }

    @Then("user verifies that {string} page name is displayed")
    public void userVerifiesThatPageNameIsDisplayed(String dashboard) {

        Assert.assertTrue(pages.dashboardPage().dashboardText.isDisplayed());


    }

    @When("user enters Sales manager's credentials")
    public void userEntersSalesManagerSCredentials() {

        pages.loginPage().login("sales manager");
    }

    @Given("user logs in with the following credentials")
    public void userLogsInWithTheFollowingCredentials(Map<String,String> values) {
        pages.loginPage().login(values.get("username"),values.get("password"));
    }

    @Then("user navigates to Fleet and Vehicles")
    public void userNavigatesToFleetAndVehicles() {
        BrowserUtils.waitForClickability(pages.dashboardPage().accounts,
                Integer.parseInt(ConfigurationReader.getProperty("medium_wait")));
        BrowserUtils.hover(pages.dashboardPage().FleetModule);
        BrowserUtils.waitForClickability(pages.dashboardPage().vehiclesPage,
                Integer.parseInt(ConfigurationReader.getProperty("short_wait")));
        pages.dashboardPage().vehiclesPage.click();
        pages.vehiclesPage().allCarsText.isDisplayed();

    }

    @And("user verifies that All Cars text is displayed")
    public void userVerifiesThatAllCarsTextIsDisplayed() {
        BrowserUtils.waitForVisibility(pages.vehiclesPage().allCarsText,
                Integer.parseInt(ConfigurationReader.getProperty("medium_wait")));
        Assert.assertTrue(pages.vehiclesPage().allCarsText.isDisplayed());

    }

    @When("user logs in as {string}")
    public void userLogsInAs(String role) {
        pages.loginPage().login(role);


    }

    @Then("user verifies page name is {string}")
    public void userVerifiesPageNameIs(String pageName) {
        Assert.assertTrue(pages.quickLaunchpadPage().quickLaunchPadText.getText().equals(pageName) ||
                pages.dashboardPage().dashboardText.equals(pageName));

    }
}
