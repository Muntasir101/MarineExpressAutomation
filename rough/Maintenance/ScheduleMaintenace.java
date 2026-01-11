
// Issue: Cannot Find the Vessel Name

package Maintenance;
import Base.DriverManager;
import Project_Data.MaintenaceData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class ScheduleMaintenace {

    public static void main(String[] args) {

        DriverManager.initWebDriver(MaintenaceData.data_Driver_Chrome);
        DriverManager.navigateURL(MaintenaceData.marineExpress_URL);
        clickMaintenaceLink();
        scheduleNewMaintenace();

    }

    public static void clickMaintenaceLink(){

        WebElement VslMaintenaceMenu = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_Maintenance_Menu));
        VslMaintenaceMenu.click();
    }

    public static void scheduleNewMaintenace(){

        WebElement ScheduleNewMaintenance = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_NewMaintenance_Button));
        ScheduleNewMaintenance.click();

        WebElement MaintenanceVslName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_Maintenance_SelectVsl));
        Select select = new Select(MaintenanceVslName);
        //select.selectByValue(MaintenaceData.Data_Maintenance_SelectVsl);
        select.selectByIndex(1);

        WebElement MaintenanceVslType = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_Maintenance_Type));
        Select selectNew = new Select(MaintenanceVslType);
        selectNew.selectByValue(MaintenaceData.Data_Maintenance_Type);

        WebElement ScheduleMaintenanceDate = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_Maintenance_ScheduleDate));
        ScheduleMaintenanceDate.sendKeys(MaintenaceData.Data_Maintenance_ScheduleDate);

        WebElement EstimatedMaintenaceDuration = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_Maintenance_EstimatedDuration));
        EstimatedMaintenaceDuration.sendKeys(MaintenaceData.Data_Maintenance_EstimatedDuration);

        WebElement  EstimatedMaintenanceCost = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_Maintenance_EstimatedCost));
        EstimatedMaintenanceCost.sendKeys(MaintenaceData.Data_Maintenance_EstimatedCost);

        WebElement  MaintenanceDescrpton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_Maintenance_Descrtiption));
        MaintenanceDescrpton.sendKeys(MaintenaceData.Data_Maintenance_Desctiption);

        WebElement SchdlMntnceButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SchedlMntcLocators.Vsl_ScheduleMaintenance_Button));
        SchdlMntnceButton.click();

        //DriverManager.quitDriver();

    }
}
