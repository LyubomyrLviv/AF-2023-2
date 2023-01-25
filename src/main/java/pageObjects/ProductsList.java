package pageObjects;



import pageObjects.basePage.BasePage;
import entities.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.commonActions.Actions;

import java.util.ArrayList;
import java.util.List;


public class ProductsList extends BasePage{

    private static int id = 3;
    private static String productName = "ASUS";

    By productPlate = By.xpath("//a[@class='goods-tile__picture ng-star-inserted']");
    By basketIconPL = By.xpath("//app-buy-button[@extclass='goods-tile__buy-button']");
    By productNamePL = By.xpath("//div[@class='goods-tile__inner']//a//span[@class='goods-tile__title']");
    By productEnt = By.xpath("//div[@class='goods-tile__inner']");

    By productNameChanging = By.xpath("//div[@class='goods-tile__colors']/following-sibling::a/span[contains(text(),'"+productName+"')]");


    public void clickOnProductPlate() {
        Actions.click(driver, productPlate);
        System.out.println("The element was clicked");
    }
    //Usless function because it clicks on the first item from the LIST
    public void addProductToBasketPL() throws InterruptedException
    {
        Thread.sleep(5000);
        Actions.click(driver, basketIconPL);
    }

    public void clickOnBasketPL()
    {
        Actions.click(driver, basketIconPL);
    }

    public String getProductNamePL()
    {
        return Actions.getText(productNamePL);
    }



    public void addToBasketById() throws InterruptedException
    {
        Thread.sleep(2000);
        List<WebElement> productsList = Actions.getAllElements(productEnt);

        productsList.get(id).findElement(basketIconPL).click();
    }

    public String  getNameById() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> productsList = Actions.getAllElements(productEnt);


        return productsList.get(id).findElement(productNamePL).getText();

    }

    public String getNameByText() throws InterruptedException
    {
        Thread.sleep(2000);
        List<WebElement> productsListNames = Actions.getAllElements(productNameChanging);
        System.out.println(productsListNames.get(id).getText());
        return productsListNames.get(id).getText();

    }

    public void addToBasketByName() throws InterruptedException
    {
        Thread.sleep(3000);
        List<WebElement> productsListNames = Actions.getAllElements(productNameChanging);
        productsListNames.get(id).click();
        Thread.sleep(3000);
        productDetails.pressOnBuyBtn();

//        productsListNames.get(id).findElement(basketIconPL).click();
    }






    //Creating an instance of the Product class
//    public List<Product> getAllProducts() throws InterruptedException
//    {
//        Thread.sleep(2000);
//        List<WebElement> productsList = Actions.getAllElements(productEnt);
//
//        List<Product> allProductsList = new ArrayList<>();
//
//        for(WebElement element:productsList)
//        {
//            String nameAll = element.findElement(By.xpath(".//div[@class='goods-tile__colors']/following-sibling::a/span")).getText();
//            String priceAll = element.
//                    findElement(By.xpath(".//div[@class='goods-tile__prices']/div[@class='goods-tile__price price--red ng-star-inserted']/p/span[@class='goods-tile__price-value']|.//div[@class='goods-tile__prices']/div[@class='goods-tile__price ng-star-inserted']/p/span[@class='goods-tile__price-value']"))
//                    .getText();
////          List<ProductTest> resultList;
//            Product pAll = new Product(nameAll, priceAll);
//            allProductsList.add(pAll);
//        }
//
//        return allProductsList;
//
//    }

}
