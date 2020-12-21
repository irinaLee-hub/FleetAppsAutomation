package com.fleetApps.utilities;

import com.fleetApps.pages.LoginPage;
import com.fleetApps.pages.QuickLaunchpadPage;

public class Pages {
    private LoginPage loginPage;
    private QuickLaunchpadPage quickLaunchpadPage;


    public LoginPage loginPage(){
        if (loginPage == null) {
            loginPage= new LoginPage();
    }
        return loginPage;
}

public QuickLaunchpadPage quickLaunchpadPage (){
        if(quickLaunchpadPage == null){
            quickLaunchpadPage =new QuickLaunchpadPage();
        }
        return quickLaunchpadPage;
}
}
