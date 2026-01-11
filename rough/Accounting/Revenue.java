package Accounting;

import Base.DriverManager;
import Project_Data.MaintenaceData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Revenue {

    public static void main(String[] args) {

        DriverManager.initWebDriver(MaintenaceData.data_Driver_Chrome);
        DriverManager.navigateURL(MaintenaceData.marineExpress_URL);

        accountingMenu();
        accountRevenueTab();
        //DriverManager.quitDriver();
    }

    public static void accountingMenu(){

        WebElement accountingMenu = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(vslAccountingLocators.Vsl_AccountingMenu));
        accountingMenu.click();
    }

    public static void accountRevenueTab(){

        WebElement accountRevenue = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(vslAccountingLocators.Vsl_Revenue_Tab));
        accountRevenue.click();

    }
}
