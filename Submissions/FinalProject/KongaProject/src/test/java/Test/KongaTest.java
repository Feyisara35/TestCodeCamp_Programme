package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;
import setup.SetupTest;

public class KongaTest extends SetupTest {

    @Test
    public void testLoginPage() throws InterruptedException {
    //Input Login Details
        String Username  = "Feyisara35@yahoo.com", Password = "Longlife35",
             CardNumber = "5340 5678 2233 4400", Date = "02/21", CVV = "123";

    //Login in to Konga
    //Replace 'LoginPage' with 'var'
        var LoginPage = homePage.clickLoginSignUpButton();
    //Replace username and password string with valid user name and password
    LoginPage.enterUsername(Username);
    LoginPage.enterPassword(Password);
    //Click on Login Button
        LoginPage.clickLoginButton();
    //Select any Category and SubCategory
    var SubCategoryPage= homePage.clickCategoryAndSub();
        //Use the search box, search for an item
        String item = "Macbooks";
        SubCategoryPage.searchForAnItem(item);
        SearchPage searchPage = SubCategoryPage.clickSearchButton();
        //Click on the add to cart button
        int addToCartButtonID = 8;
        searchPage.clickOnAddToCart(addToCartButtonID);
        //Click on the My Cart Menu
        var addToCartPage = searchPage.clickMyCartButton();
        //Click on the add to cart button
        //Click on checkout
        var checkOutPage = addToCartPage.clickCheckOut();
        //Click "Pay Now" to enable “Continue to Payment” button - the user must have preselected pick up method
        checkOutPage.clickOnPayNowButton();
        //Click on the “Continue to Payment” button
        checkOutPage.clickOnContinueToPayment();
        //Select the “CARD” payment method
        checkOutPage.clickOnCardPaymentOption();
        //Input a wrong card number, date, CVV
        checkOutPage.enterCardDetails(CardNumber, Date , CVV);
    }
}
