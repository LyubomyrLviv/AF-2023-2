package reusable;


import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LiatenersImplementation extends ObjectsRepo implements ITestListener
{

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());

    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Testc case: " + result.getMethod().getMethodName() + " is passed");

    }

    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "Test case: " + result.getMethod().getMethodName() + " failed");
        test.log(Status.FAIL, result.getThrowable());
        //Screenshot for failed test
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat foramt = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        String actualData = foramt.format(date);

        String screenshotsPath = System.getProperty("user.dir")+
                "/reports/screenshots/image_"+actualData+".jpg";

        File dest = new File(screenshotsPath);
        try {
            FileUtils.copyFile(src,dest);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        test.addScreenCaptureFromPath(screenshotsPath, "Test case failure screenshot");
        test.addScreenCaptureFromPath(screenshotsPath, "Failure screenshot");

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {
       extent = ExtentSetup.setupExtentReport();
    }

    public void onFinish(ITestContext context) {
        extent.flush();

    }
}
