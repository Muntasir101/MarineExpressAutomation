package CargoOperation;

import org.openqa.selenium.By;

public class CargoAllocationLocators {
    static final By cargo_Allocation_Tab = By.cssSelector("div[data-tab='allocation']");
    static final By cargo_ID_List = By.cssSelector("#cargo-select");
    static final By select_Vessel = By.cssSelector("#vessel-select");
    static final By LoadingDate = By.cssSelector("#loading-date");
    static final By ExpArrival = By.cssSelector("#estimated-arrival");
    static final By AllocateButton = By.cssSelector("#allocate-cargo-btn");
}
