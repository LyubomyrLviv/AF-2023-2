import pageObjects.basePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(reusable.LiatenersImplementation.class)
public class AddToCartAndCheck extends BasePage{
//    ProductsList productsList = new ProductsList();

    @Test
    public void openProductDetailedPage() throws InterruptedException
    {
        Thread.sleep(2000);
        String productNamePL = productsList.getProductNamePL();
        productsList.addProductToBasketPL();
        System.out.println("ITEM SHOULD BE ADDED TO THE BASKET/ Clicked on the basket");
        Thread.sleep(2000);
        //productsList.clickOnBasketPL();
        header.clickOnBasketIcon();
        Thread.sleep(3000);
        String productNameBasket = basketPage.getBasketPopProductName();
        System.out.println(productNameBasket);
        Assert.assertEquals(productNamePL, productNameBasket);



    }




}
