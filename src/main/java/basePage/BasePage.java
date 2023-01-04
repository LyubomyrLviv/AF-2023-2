package basePage;

import reusable.PropertiesOperations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import reusable.ObjectsRepo;

import java.io.IOException;


public class BasePage extends ObjectsRepo {



    public void lauchBrowser() throws IOException {

        String browser = PropertiesOperations.getPropertyByKey("browser");
        String url = PropertiesOperations.getPropertyByKey("url");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.operadriver().setup();
            driver = new FirefoxDriver();

        }

        driver.manage().window().maximize();
        driver.get(url);
    }

    public void closeBrowser()
    {
        driver.quit();
    }

    @BeforeMethod //Executed before each test method within current class
    public void setUpTest() throws IOException {
        lauchBrowser();
    }

//    @AfterMethod
//    public void closeBr()
//    {
//        closeBrowser();
//    }


}
