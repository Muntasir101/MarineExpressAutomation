package Accounting;


import Base.DriverManager;
import Project_Data.MaintenaceData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Expenses {

    public static void main(String[] args) {

        DriverManager.initWebDriver(MaintenaceData.data_Driver_Chrome);
        DriverManager.navigateURL(MaintenaceData.marineExpress_URL);

        accountingMenu();
        accountExpensesTab();
        //DriverManager.quitDriver();
    }

    public static void accountingMenu(){

        WebElement accountingMenu = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(vslAccountingLocators.Vsl_AccountingMenu));
        accountingMenu.click();
    }

    public static void accountExpensesTab(){

        WebElement accountExpenses = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(vslAccountingLocators.Vsl_Expenses_Tab));
        accountExpenses.click();

    }
}
