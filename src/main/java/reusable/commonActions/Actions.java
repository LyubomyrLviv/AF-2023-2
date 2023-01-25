package reusable.commonActions;

import pageObjects.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



import java.util.List;


public class Actions extends BasePage {


    public static void click (WebDriver driver, By element)
    {
        driver.findElement(element).click();
    }


    public static String getText (By element)
    {
        return driver.findElement(element).getText();
    }

    public static void  selectDropDownOption(By element, String valueToBeSelected) throws Exception
    {
        Select os = new Select((WebElement) element);
        try {
            os.selectByVisibleText(valueToBeSelected);
        } catch(Exception e){
            throw new Exception("Value is not present in the dropdown" + valueToBeSelected + "for the ele,ent ->" + element);
        }

    }

    public static List<WebElement> getAllElements(By element)
    {
        return driver.findElements(element);
    }






}
