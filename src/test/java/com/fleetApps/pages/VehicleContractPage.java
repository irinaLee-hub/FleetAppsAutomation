package com.fleetApps.pages;

import com.fleetApps.utilities.BasePage;
import com.fleetApps.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class VehicleContractPage extends BasePage {

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement allVehicleContractText;

    @FindBy(xpath = "//a[@title='Create Vehicle Contract']")
    public WebElement createContractButton;

    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_Responsible')]")
    public WebElement responsibleInputBox;

    @FindBy(name = "custom_entity_type[ActivationCost]")
    public WebElement activationCostInputBox;

    @FindBy(name= "custom_entity_type[RecurringCostAmount]")
    public WebElement recurringCostDeprecatedInputBox;

    @FindBy (name = "custom_entity_type[OdometerDetails]")
    public WebElement odometerDetailsInputBox;

    @FindBy(name = "custom_entity_type[Type]")
    public WebElement TypeDropdownMenu;

    @FindBy(xpath = "(//input[contains(@id,'date_selector')])[1]")
    public WebElement invoiceDateInputBox;

    @FindBy(xpath = "(//input[contains(@id,'ContractStartDate')])[2]")
    public WebElement contractStartDateInputBox;


    @FindBy(xpath = "(//input[contains(@id,'ContractExpirationDate')])[2]")
    public WebElement contractExpDateInputBox;

    @FindBy(xpath = "//input[contains(@id,'type_Vendor')]")
    public WebElement vendorInputBox;

    @FindBy(xpath = "//input[contains(@id,'type_Driver')]")
    public WebElement driverInputBox;

    @FindBy(xpath = "//input[contains(@id,'ContractReference')]")
    public WebElement contractReferenceInputBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//div[.='Entity saved']")
    public WebElement entitySavedMessage;






    public void selectType(String type){
        Select selectInstance= new Select(TypeDropdownMenu);
        selectInstance.selectByVisibleText(type);

    }


    public void enterWhoIsResponsible(String value){
     responsibleInputBox.sendKeys(value);

    }

    public void enterActivationCost(String value){
        activationCostInputBox.sendKeys(value);

    }

    public void enter_recurringCost_deprecated(String value){
        recurringCostDeprecatedInputBox.sendKeys(value);
    }

    public void enterOdometerDetails(String value){
        odometerDetailsInputBox.sendKeys(value);
    }

    public void enterInvoiceDate(String value){
        invoiceDateInputBox.sendKeys(value);
    }

    public void contractStartDate(String value){
        contractStartDateInputBox.sendKeys(value);
    }

    public void contractExpirationDate(String value) {
        contractExpDateInputBox.sendKeys(value);
    }

    public void vendor(String value) {
        vendorInputBox.sendKeys(value);
    }

    public void driver(String value) {
        driverInputBox.sendKeys(value);

    }

    public void contractReference(String value) {
        contractReferenceInputBox.sendKeys(value);
    }






}
