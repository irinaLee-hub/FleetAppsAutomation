package com.fleetApps.utilities;

import com.fleetApps.pages.DashboardPage;
import com.fleetApps.pages.LoginPage;
import com.fleetApps.pages.QuickLaunchpadPage;
import com.fleetApps.pages.VehiclesPage;

public class Pages {
    private LoginPage loginPage;
    private QuickLaunchpadPage quickLaunchpadPage;
    private DashboardPage dashboardPage;
    private VehiclesPage vehiclesPage;


    public LoginPage loginPage(){
        if (loginPage == null) {
            loginPage= new LoginPage();
    }
        return loginPage;
}

    public QuickLaunchpadPage quickLaunchpadPage() {
        if (quickLaunchpadPage == null) {
            quickLaunchpadPage = new QuickLaunchpadPage();
        }
        return quickLaunchpadPage;
    }

    public DashboardPage dashboardPage(){
        if( dashboardPage==null ){
            dashboardPage= new DashboardPage();

        }
        return dashboardPage;
    }

    public VehiclesPage vehiclesPage(){
        if (vehiclesPage==null){
            vehiclesPage= new VehiclesPage();
        }
        return vehiclesPage;
    }

}
