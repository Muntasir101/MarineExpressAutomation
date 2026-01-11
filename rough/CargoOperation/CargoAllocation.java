package CargoOperation;

import Base.DriverManager;
import Base.baseConfigData;
import Project_Data.CargoOperationData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CargoAllocation {


    public static void main(String[] args){

        DriverManager.initWebDriver(baseConfigData.data_Driver_Chrome);
        DriverManager.navigateURL(CargoOperationData.marineExpress_URL);

        CargoBooking.Open_cargoOperationMenu();
        cargo_Allocation();
        DriverManager.quitDriver();
    }



    public static void cargo_Allocation(){

        WebElement cargoAllocationTab = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoAllocationLocators.cargo_Allocation_Tab));
        cargoAllocationTab.click();

        WebElement cargoIDList = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoAllocationLocators.cargo_ID_List));
        Select select = new Select(cargoIDList);
        select.selectByVisibleText("CG-6854 (Container, dd to cc)");

        WebElement selectVessel = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoAllocationLocators.select_Vessel));
        Select selectA = new Select(selectVessel);
        selectA.selectByVisibleText("SafwanVessel (Bulk Carrier)");

        WebElement loadingDate = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoAllocationLocators.LoadingDate));
        loadingDate.sendKeys(CargoOperationData.Data_Loading_Date);
        System.out.println(CargoOperationData.Data_Loading_Date);

        WebElement arrivalDate = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoAllocationLocators.ExpArrival));
        arrivalDate.sendKeys(CargoOperationData.Data_Estimated_Arrival);
        System.out.println(CargoOperationData.Data_Estimated_Arrival);

        WebElement allocateCargo = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoAllocationLocators.AllocateButton));
        allocateCargo.click();

    }
}
