package reusable;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import pageObjects.BasketPage;
import pageObjects.Header;
import pageObjects.ProductDetails;
import pageObjects.ProductsList;
import reusable.commonActions.Actions;

public class ObjectsRepo
{
    public static WebDriver driver;

    public static ExtentReports extent = new ExtentReports();
    public static ExtentTest test;
    public static Actions actions = new Actions();
    public static ProductsList productsList = new ProductsList();
    public static ProductDetails productDetails = new ProductDetails();
    public static Header header = new Header();
    public static BasketPage basketPage = new BasketPage();

}
