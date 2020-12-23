package com.fleetApps.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static WebElement waitForVisibility(WebElement element,int time ){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),time);
        return wait.until(ExpectedConditions.visibilityOf(element));

    }


    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();

    }

    public static WebElement waitForClickability(WebElement element, int timeToWait){
        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),timeToWait);
        return wait.until(ExpectedConditions.elementToBeClickable(element));

    }
}
