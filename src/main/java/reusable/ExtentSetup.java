package reusable;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentSetup extends ObjectsRepo
{

    public static ExtentReports setupExtentReport()
    {
        SimpleDateFormat foramt = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
        Date date = new Date();
        String actualData = foramt.format(date);

        String reportPath = System.getProperty("user.dir")+
                "/reports/ExecutionReport"+actualData+".html";

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        sparkReporter.config().setDocumentTitle("DocumentTitle");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setReportName("ReportName");

        return extent;

    }

}
