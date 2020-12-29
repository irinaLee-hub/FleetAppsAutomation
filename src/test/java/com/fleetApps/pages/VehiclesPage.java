package com.fleetApps.pages;

import com.fleetApps.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends BasePage {

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement allCarsText;
}
