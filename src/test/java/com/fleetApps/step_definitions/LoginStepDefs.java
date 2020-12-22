package com.fleetApps.step_definitions;

import com.fleetApps.pages.QuickLaunchpadPage;
import com.fleetApps.utilities.BrowserUtils;
import com.fleetApps.utilities.ConfigurationReader;
import com.fleetApps.utilities.Driver;
import com.fleetApps.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sun.plugin.dom.exception.BrowserNotSupportedException;

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
}
