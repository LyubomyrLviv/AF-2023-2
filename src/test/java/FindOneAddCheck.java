import org.testng.Assert;
import pageObjects.basePage.BasePage;
import org.testng.annotations.Test;


public class FindOneAddCheck extends BasePage {


//    @Test
//    public void addOneByIdAndCheck() throws InterruptedException
//
//    {
//        String expectedName = productsList.getNameById();
//        System.out.println(expectedName);
//        productsList.addToBasketById();
//        header.clickOnBasketIcon();
//        Thread.sleep(3000);
//        String actuaProductName = basketPage.getBasketPopProductName();
//        System.out.println(actuaProductName);
//        Assert.assertEquals(expectedName, actuaProductName);
//
//    }
    @Test
    public void addToBasketByNameTest() throws InterruptedException
    {
        String expectedName = productsList.getNameByText();
        System.out.println(expectedName);
        productsList.addToBasketByName();
        header.clickOnBasketIcon();
        Thread.sleep(4000);
        String actuaProductName = basketPage.getBasketPopProductName();
        System.out.println(actuaProductName);
        Assert.assertEquals(expectedName, actuaProductName);

    }



}

