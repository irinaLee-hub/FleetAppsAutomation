package com.fleetApps.pages;

import com.fleetApps.utilities.BasePage;
import com.fleetApps.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

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


    public void login(){
        String userName= ConfigurationReader.getProperty("driver");
        String password= ConfigurationReader.getProperty("password");

        usernameInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password + Keys.ENTER);


    }




}
