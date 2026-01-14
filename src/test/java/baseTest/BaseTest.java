package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;


public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        //get browser name from properties file
        String browser = ConfigReader.getBrowser();

        //Initialize browser from DriverFactory
        driver = DriverFactory.initializeDriver(browser);

        //get URL from properties file
        driver.get(utils.ConfigReader.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
