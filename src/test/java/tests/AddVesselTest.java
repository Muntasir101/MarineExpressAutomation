package tests;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.FleetManagementPage;

public class AddVesselTest extends BaseTest {

    @Test(groups = {"smoke"})
    public void testCase1_valid(){
        FleetManagementPage fmPage = new FleetManagementPage(driver);
        fmPage.clickFleetManagementMenu();
        fmPage.clickAddVesselButton();
        fmPage.enterVesselName("Test Vessel 2020");
    }

    @Test(groups = {"smoke", "regression"})
    public void testCase2_Invalid(){
        FleetManagementPage fmPage = new FleetManagementPage(driver);
        fmPage.clickFleetManagementMenu();
        fmPage.clickAddVesselButton();
        fmPage.enterVesselName("Test Vessel 2020");
    }

    @Test(priority = 1)
    public void testCase3_Invalid(){
        FleetManagementPage fmPage = new FleetManagementPage(driver);
        fmPage.clickFleetManagementMenu();
        fmPage.clickAddVesselButton();
        fmPage.enterVesselName("Test Vessel 2020");
    }


}
