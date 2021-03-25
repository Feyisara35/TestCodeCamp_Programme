package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;

    //Element Locator using "By"
    private By loginButton = By.xpath("//a[@class='_7ad32_SD12Y _16536_xxIKG']");
    private By categoryBarElement = By.className("ef511_2c5_i");
    private By subcategory = By.xpath(".//a[contains(text(), 'Macbooks')]");

    //List of Category numbers; 0= All categories , 2= Laptop and Accessories
    int categoryNumber = 1;
    int loginButtonElementID =  3;


    public HomePage(WebDriver driver) {this.driver =driver;
    }

    //Click the login/signup button on the landing page
    public LoginPage clickLoginSignUpButton()
    {
        driver.findElements(loginButton).get(loginButtonElementID).click();
        return new LoginPage(driver);
    }
    public SubCategoryPage clickCategoryAndSub() throws InterruptedException
    {
        Actions executeAction = new Actions(driver);
    //Select category mouse is to hover over

        WebElement selectedCategory = driver.findElements(categoryBarElement).get(categoryNumber);
    //Mouse hover on the selected category
    executeAction.moveToElement(selectedCategory).perform();
    Thread.sleep(10000);

    //Click on the Macbook
    driver.findElement(subcategory).click();
    Thread.sleep(10000);

    return new SubCategoryPage(driver);
    }
}
