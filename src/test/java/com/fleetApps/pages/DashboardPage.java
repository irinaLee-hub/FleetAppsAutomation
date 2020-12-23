package com.fleetApps.pages;

import com.fleetApps.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement dashboardText;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement FleetModule;


    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesPage;

    @FindBy(xpath = "(//span[.='Accounts'])[3]")
    public WebElement accounts;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContractPage;
}
