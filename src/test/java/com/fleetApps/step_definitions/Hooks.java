package com.fleetApps.step_definitions;

import com.fleetApps.utilities.ConfigurationReader;
import com.fleetApps.utilities.Driver;


import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){
        System.out.println("Scenario= "+ scenario.getSourceTagNames());
        System.out.println("Scenario name: "+scenario.getName());
        System.out.println("Before method from Hooks class is running!");
        Driver.getDriver().get(ConfigurationReader.getProperty("urlqa1"));
        Driver.getDriver().manage().window().maximize();

    }

    @After
    public static void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());

        }

    }

}
