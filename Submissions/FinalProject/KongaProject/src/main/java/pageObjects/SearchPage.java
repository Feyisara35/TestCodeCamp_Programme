package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
        public SearchPage(WebDriver driver) {this.driver = driver;}

    //Click the first Add to Cart Button
    private By AddToCartButton = By.xpath("//button[@class='_0a08a_3czMG']");
    private By MyCartButton = By.xpath("//a[@class='_79484_1sLEt _7ad32_SD12Y _16536_xxIKG']");

    //Click the 8 Add to cart button
    public void clickOnAddToCart(int index) throws  InterruptedException
    {
        driver.findElements(AddToCartButton).get(index - 8).click();
    //Wait 5 secs before executing action
        Thread.sleep(5000);
    }

    //Click My Cart Button
    public AddToCartPage clickMyCartButton() throws InterruptedException
    {
        driver.findElement(MyCartButton).click();
    //Wait 5 seconds before executing action
        Thread.sleep(5000);
        return new AddToCartPage(driver);
    }

}

