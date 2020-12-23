package com.fleetApps.utilities;

import com.fleetApps.pages.*;

public class Pages {
    private LoginPage loginPage;
    private QuickLaunchpadPage quickLaunchpadPage;
    private DashboardPage dashboardPage;
    private VehiclesPage vehiclesPage;
    private VehicleContractPage vehicleContractPage;


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

    public VehicleContractPage vehicleContractPage(){
        if(vehiclesPage==null){
            vehicleContractPage= new VehicleContractPage();
        }
        return vehicleContractPage;
    }

}
