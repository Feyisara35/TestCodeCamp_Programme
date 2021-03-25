package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputerandAccessories {
    private WebDriver driver;
    public ComputerandAccessories(WebDriver driver) {this.driver = driver;}
    //Click the first Add to Cart Button
    private By AddToCartButton = By.xpath("//*[@id=\"mainContent\"]/section[2]/section/section/section/section/ul/li[1]/div/div/div[2]/form/div[4]/button");
    private By MyCartButton = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div/a[2]/span[1]");

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
