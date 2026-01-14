package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ExtentManager;

public class TestListener implements ITestListener {
    private static ExtentReports extent = ExtentManager.createInstance("src/main/java/report/ExtentReport.html");
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result){
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result){
        String logText = "<b>"+result.getMethod().getMethodName() + " passed.</b>";
        test.get().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result){
        String logText = "<b>"+result.getMethod().getMethodName() + " failed.</b>";
        test.get().fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        String logText = "<b>"+result.getMethod().getMethodName() + " skipped.</b>";
        MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
        test.get().skip(result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context){
        if(extent!=null){
            extent.flush();
        }
    }

}
