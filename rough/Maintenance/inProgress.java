package Maintenance;

import Base.DriverManager;
import Project_Data.MaintenaceData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class inProgress {

    public static void main(String[] args){

        DriverManager.initWebDriver(MaintenaceData.data_Driver_Chrome);
        DriverManager.navigateURL(MaintenaceData.marineExpress_URL);

        ScheduleMaintenace.clickMaintenaceLink();
        vslInProgressForMntnce();
        //DriverManager.quitDriver();
    }

    public static void vslInProgressForMntnce(){
        WebElement inProgressTab = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_InProgess_ForMaintenance));
        inProgressTab.click();
    }
}


