package pageObjects;

import pageObjects.basePage.BasePage;
import org.openqa.selenium.By;
import reusable.commonActions.Actions;

public class BasketPage extends BasePage
{

    By popProductName = By.xpath("//div[@class='cart-product__main']//a|//a[@class='cart-product__title']");

    public String getBasketPopProductName()
    {
        return Actions.getText(popProductName);
    }

}
