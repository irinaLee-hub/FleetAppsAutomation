package com.fleetApps.pages;

import com.fleetApps.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {

      @FindBy(id = "prependedInput")
    public WebElement usernameInputBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInputBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Remember me on this computer']")
    public WebElement rememberMeCheckBox;

    @FindBy (linkText = "Forgot your password?")
    public WebElement forgotYourPasswordLink;


}
