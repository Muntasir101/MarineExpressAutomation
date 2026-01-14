package tests;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.FleetManagementPage;

public class AddVesselTest extends BaseTest {

    @Test(priority = 1)
    public void testCase1_valid(){
        FleetManagementPage fmPage = new FleetManagementPage(driver);
        fmPage.clickFleetManagementMenu();
        fmPage.clickAddVesselButton();
        fmPage.enterVesselName("Test Vessel 2020");
        fmPage.enterYearBuild("2020");
        fmPage.enterCapacity("50000");
    }

    @Test(priority = 2)
    public void testCase2_Invalid(){
        FleetManagementPage fmPage = new FleetManagementPage(driver);
        fmPage.clickFleetManagementMenu();
        fmPage.clickAddVesselButton();
        fmPage.enterVesselName("Test Vessel 2020");
        fmPage.enterYearBuild("2022");
        fmPage.enterCapacity("10000");
    }

    @Test(priority = 3)
    public void testCase3_Invalid(){
        FleetManagementPage fmPage = new FleetManagementPage(driver);
        fmPage.clickFleetManagementMenu();
        fmPage.clickAddVesselButton();
        fmPage.enterVesselName("Test Vessel 2020");
        fmPage.enterYearBuild("2023");
        fmPage.enterCapacity("2000");
    }


}
