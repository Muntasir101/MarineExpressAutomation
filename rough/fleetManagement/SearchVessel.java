package fleetManagement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.DriverManager;
import Project_Data.fleetManagementData;

public class SearchVessel {


    public static void main(String [] args){

        DriverManager.initWebDriver(fleetManagementData.data_Driver_Chrome);
        DriverManager.navigateURL(fleetManagementData.marineExpress_URL);

        //Search Functionality
        addedVslSearchbyName(fleetManagementData.data_Vessel_Name);

        addedVslSearchbyStatus(fleetManagementData.data_Vessel_Status);
        addedVslSearchByTypes(fleetManagementData.data_Vessel_Type);

        //DriverManager.quitDriver();

    }


    private static void addedVslClickSearchButton(){
        WebElement searchButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SearchVesselLocator.addedVessel_Search_Button));
        searchButton.click();
    }

    private static void addedVslSearchbyName(String vslName){

        AddVessel.openFleetManagementMenu();
        WebElement searchVslbyName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SearchVesselLocator.addedVessel_Search_byName));
        searchVslbyName.sendKeys(vslName);
        addedVslClickSearchButton();

}

    private static void addedVslSearchbyStatus(String status){

        AddVessel.openFleetManagementMenu();
        WebElement srchByStatus = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SearchVesselLocator.addedVessel_Search_byStatus));
        Select select = new Select(srchByStatus);
        //select.selectByValue(status);
        select.selectByIndex(1);
        addedVslClickSearchButton();
    }

    private static void addedVslSearchByTypes(String type){

        AddVessel.openFleetManagementMenu();
        WebElement searchbyType = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SearchVesselLocator.addedVessel_Search_byType));
        Select select = new Select(searchbyType);
        //select.selectByValue(type);
        select.selectByIndex(1);
        addedVslClickSearchButton();

    }

}
