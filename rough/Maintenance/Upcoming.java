package Maintenance;

import Base.DriverManager;
import Project_Data.MaintenaceData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Upcoming {

    public static void main(String[] args) {

        DriverManager.initWebDriver(MaintenaceData.data_Driver_Chrome);
        DriverManager.navigateURL(MaintenaceData.marineExpress_URL);

        ScheduleMaintenace.clickMaintenaceLink();
        DriverManager.quitDriver();

    }
public static void upcomingMaintenance(){

        WebElement VslUpcomingMntncd = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_upComing_ForMaintenance));
        VslUpcomingMntncd.click();

}
}
