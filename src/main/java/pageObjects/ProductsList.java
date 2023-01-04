package pageObjects;



import basePage.BasePage;
import org.openqa.selenium.By;
import reusable.commonActions.Actions;


public class ProductsList extends BasePage{



    By productPlate = By.xpath("//a[@class='goods-tile__picture ng-star-inserted']");
    By basketIconPL = By.xpath("//app-buy-button[@extclass='goods-tile__buy-button']");
    By productNamePL = By.xpath("//div[@class='goods-tile__inner']//a//span[@class='goods-tile__title']");

    public void clickOnProduct() {
        Actions.click(driver, productPlate);
        System.out.println("The element was clicked");
    }

    public void addProductToBasketPL() throws InterruptedException {

        Thread.sleep(5000);
        Actions.click(driver, basketIconPL);

    }

    public void clickOnBasketPL()
    {
        Actions.click(driver, basketIconPL);
    }

    public String getProductNamePL()
    {
        return Actions.getTest(driver, productNamePL);
    }

}
