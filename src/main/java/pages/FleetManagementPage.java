package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FleetManagementPage {
    private WebDriver driver;
    private WebDriverWait wait;
    // Locators
    private By Fleet_Management_Menu =  By.cssSelector("div[data-section='fleet'] span");
    private By Add_Vessel_Button = By.cssSelector("#add-vessel-btn");
    private By Vessel_Name = By.cssSelector("#vessel-name");
    private By Vessel_Type = By.cssSelector("#vessel-type");
    private By Year_Build = By.cssSelector("#year-built");
    private By Vessel_Capacity = By.cssSelector("#capacity");
    private By Vessel_Flag = By.cssSelector("#flag");
    private By Vessel_CurrentLocation = By.cssSelector("#current-location");
    private By Vessel_Status = By.cssSelector("#vessel-status");
    private By Vessel_register_Button = By.cssSelector("form[id='vessel-form'] button[type='submit']");
    private By Vessel_add_success_message =  By.cssSelector("#toast-message");
    private By Vessel_search_byName = By.cssSelector("div[data-section='fleet'] span");

    // Constructor
    public FleetManagementPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Actions(Methods)
    public void clickFleetManagementMenu(){
       // driver.findElement(Fleet_Management_Menu).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Fleet_Management_Menu)).click();
    }

    public void clickAddVesselButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Add_Vessel_Button)).click();
    }

    public void enterVesselName(String VesselName){
        //driver.findElement(Vessel_Name).sendKeys(VesselName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Vessel_Name)).sendKeys(VesselName);
    }
    public void enterYearBuild(String Year){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Year_Build)).sendKeys(Year);
    }
    public void enterCapacity(String Capacity){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Vessel_Capacity)).sendKeys(Capacity);
    }

    //Vessel Type
    //Flag
    //Location
    //Status
    //Register


}
