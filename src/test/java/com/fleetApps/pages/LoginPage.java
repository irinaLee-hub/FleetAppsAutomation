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

    @FindBy(css = "div[class='alert alert-error']>div")
    public WebElement warningMessage;


    public void login(){
        String userName= ConfigurationReader.getProperty("driver");
        String password= ConfigurationReader.getProperty("password");

        usernameInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password + Keys.ENTER);


    }

    public void login(String role){
        String username="";
        String password= ConfigurationReader.getProperty("password");

        if (role.equalsIgnoreCase("driver")) {
            username = ConfigurationReader.getProperty("driver");


        }else if(role.equalsIgnoreCase("store manager")){
            username= ConfigurationReader.getProperty("storemanager");


        }else if(role.equalsIgnoreCase("sales manager")){
            username= ConfigurationReader.getProperty("salesmanager");

        }

        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password + Keys.ENTER);

    }

    public void login(String username,String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();


    }


}
