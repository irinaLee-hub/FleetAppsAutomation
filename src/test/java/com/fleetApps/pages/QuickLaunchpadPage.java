package com.fleetApps.pages;

import com.fleetApps.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickLaunchpadPage extends BasePage {

    @FindBy(xpath = "//h1[.='Quick Launchpad']")
    public WebElement quickLaunchPadText;

}
