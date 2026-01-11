package Accounting;
import Base.DriverManager;
import Project_Data.MaintenaceData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Profitability {

    public static void main(String[] args) {

        DriverManager.initWebDriver(MaintenaceData.data_Driver_Chrome);
        DriverManager.navigateURL(MaintenaceData.marineExpress_URL);

        accountingMenu();
        accountProfitabilityTab();
        //DriverManager.quitDriver();
    }

    public static void accountingMenu(){

        WebElement accountingMenu = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(vslAccountingLocators.Vsl_AccountingMenu));
        accountingMenu.click();
    }

    public static void accountProfitabilityTab(){

        WebElement accountProfitability = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(vslAccountingLocators.Vsl_profitability_Tab));
        accountProfitability.click();

    }
}
