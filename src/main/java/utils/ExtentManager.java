package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance(String fileName){
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(fileName);

        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle("Automation Test Report");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Marine Express Automation Test Results");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("OS",System.getProperty("os.name"));
        extent.setSystemInfo("Browser", ConfigReader.getBrowser());
        extent.setSystemInfo("Test Execute By","Muntasir");

        return extent;
    }
}
