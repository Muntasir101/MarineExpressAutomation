package CargoOperation;

import Base.DriverManager;

import Project_Data.CargoOperationData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class CargoBooking {

    public static void main(String[] args) {

        DriverManager.initWebDriver(CargoOperationData.data_Driver_Chrome);
        DriverManager.navigateURL(CargoOperationData.marineExpress_URL);

        Open_cargoOperationMenu();
        cargoBooking();
        DriverManager.quitDriver();

    }

    public static void Open_cargoOperationMenu() {

        WebElement cargoOperationMenu = DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(CargoBookingLoacators.cargo_Operation_Menu));
        cargoOperationMenu.click();

    }

    public static void cargoBooking(){

        WebElement carGoBookingTab = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoBookingLoacators.cargo_Booking_Tab));
        carGoBookingTab.click();

        WebElement cargoType = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoBookingLoacators.cargo_Type));
        Select select = new Select(cargoType);
        select.selectByValue(CargoOperationData.Data_cargo_Type);

        WebElement cargoWeight = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoBookingLoacators.cargo_Weight));
        cargoWeight.sendKeys(CargoOperationData.Data_Cargo_Weight);

        WebElement cargoOrigin = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoBookingLoacators.cargo_Origin));
        cargoOrigin.sendKeys(CargoOperationData.Data_Cargo_Origin);

        WebElement cargoDestination = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoBookingLoacators.cargo_Destination));
        cargoDestination.sendKeys(CargoOperationData.Data_Cargo_Destination);

        WebElement bookCargoButton = DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(CargoBookingLoacators.bookCargo_Button));
        bookCargoButton.click();

        // Retrieve New Cargo ID

        WebElement cargo_ID = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoBookingLoacators.cargo_ID));
        CargoOperationData.Data_Cargo_ID = cargo_ID.getText();
        System.out.println(CargoOperationData.Data_Cargo_ID);

    }

}
