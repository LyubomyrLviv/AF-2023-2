import basePage.BasePage;
import com.aventstack.extentreports.Status;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromAction;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.BasketPage;
import pageObjects.ProductsList;

import java.io.IOException;

@Listeners(reusable.LiatenersImplementation.class)
public class tryTest extends BasePage{
//    ProductsList productsList = new ProductsList();

    @Test
    public void openProductDetailedPage() throws InterruptedException
    {
        Thread.sleep(2000);
        String productNamePL = productsList.getProductNamePL();
        System.out.println(productNamePL);
        productsList.addProductToBasketPL();
        System.out.println("ITEM SHOULD BE ADDED TO THE BASKET/ Clicked on the basket");
        Thread.sleep(2000);
        //productsList.clickOnBasketPL();
        header.clickOnBasketIcon();
        Thread.sleep(3000);
        String productNameBasket = basketPage.getBasketPopProductName();
        System.out.println(productNameBasket);
        System.out.println("just a simple text to check git");
        Assert.assertEquals(productNamePL, productNameBasket);



    }




}
