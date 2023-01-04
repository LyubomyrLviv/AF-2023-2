package pageObjects;

import org.openqa.selenium.By;
import reusable.commonActions.Actions;

import static reusable.ObjectsRepo.driver;

public class Header {

By headerBasket = By.xpath("//rz-cart[@class='header-actions__component']"); // Need tobe improved


    public void clickOnBasketIcon()
    {
        Actions.click(driver, headerBasket);
    }



}
