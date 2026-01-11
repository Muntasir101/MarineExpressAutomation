package Maintenance;

import org.openqa.selenium.By;

public class SchedlMntcLocators {

    static final By Vsl_Maintenance_Menu = By.cssSelector("div[data-section='maintenance'] span");
    static final By Vsl_NewMaintenance_Button = By.cssSelector("#add-maintenance-btn");
    static final By Vsl_Maintenance_SelectVsl = By.cssSelector("#maintenance-vessel");
    static final By Vsl_Maintenance_Type = By.cssSelector("#maintenance-type");
    static final By Vsl_Maintenance_ScheduleDate = By.cssSelector("#maintenance-date");
    static final By Vsl_Maintenance_EstimatedDuration = By.cssSelector("#maintenance-duration");
    static final By Vsl_Maintenance_EstimatedCost = By.cssSelector("#maintenance-cost");
    static final By Vsl_Maintenance_Descrtiption = By.cssSelector("#maintenance-description");
    static final By Vsl_ScheduleMaintenance_Button = By.cssSelector("form[id='maintenance-form'] button[type='submit']");

    // Inprogress Locators
    static final By Vsl_InProgess_ForMaintenance = By.cssSelector("div[data-tab='in-progress']");

    //Upcoming Locators
    static final By Vsl_upComing_ForMaintenance = By.cssSelector("div[data-tab='upcoming']");

}
