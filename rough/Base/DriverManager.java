package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverManager {


        private static WebDriver driver;
        private static WebDriverWait wait;

        public static void initWebDriver(String BrowserName) {
            if (BrowserName.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (BrowserName.equalsIgnoreCase("FireFox")) {
                driver = new FirefoxDriver();
            } else if (BrowserName.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else {
                System.out.println("Invalid Browser Name");
            }

        }

            public static void navigateURL(String URL){
                driver.get(URL);
                driver.manage().window().maximize();      ///Can I USE it HERE ??????????????????????
            }

            // Verify the change with original
            public static WebDriver getDriver() {
                if (driver != null) {
                    return driver;
                } else {
                    throw new IllegalStateException("Driver not initialized");
                }
            }

                public static WebDriverWait getWait(){
                    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                    if( wait == null){
                        throw new IllegalStateException("WebDriver Wait is not initialized");
                    }
                    return wait;
                }

                public static void quitDriver(){
                    driver.quit();
                    driver = null;
                    wait = null;
                }


        }
