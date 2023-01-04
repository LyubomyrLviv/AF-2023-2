package pageObjects;


import basePage.BasePage;
import org.openqa.selenium.By;
import reusable.commonActions.Actions;


public class ProductDetails extends BasePage {

    By buyBtb = By.xpath("//li[@class='product-buttons__item ng-star-inserted']");
    By productName = By.xpath("//div[@class='product__heading']");

    public void pressOnBuyBtn()
    {
        Actions.click(driver, buyBtb);
        System.out.println("Buy btn is pressed");
    }

//    public String getProductName()
//    {
//
//        return Actions.getTest(driver, productName);
//
//    }

}
