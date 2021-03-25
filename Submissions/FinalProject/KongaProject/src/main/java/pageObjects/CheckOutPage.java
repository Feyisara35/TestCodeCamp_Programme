package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    private WebDriver driver;
    private By SelectDeliveryAddress = By.cssSelector("#mainContent > form > div > div > section:nth-child(1) > div.c8825_2KE_b > div > div._654ae_5UVhe > div > div:nth-child(1) > form > div > div > a");
    private By SelectDeliveryAddressButton = By.cssSelector("#app-content-wrapper > div.c6dfe_HidJc > section > section > aside > div._5ed6c_R--fu > div > div > div._76a39_IicQP > div > form > button");
    private By UseThisAddressButton = By.cssSelector("#app-content-wrapper > div.c6dfe_HidJc > section > section > aside > div.fb90d_2mSyi > div > div > div > a");
    private By PayNowButton = By.cssSelector("#mainContent > form > div > section > div > div._83d32_380t6 > form > ul > li > div > button");
    private By ContinueToPaymentButton = By.cssSelector("#mainContent > form > div > section > div > div._83d32_380t6 > form > ul > li > div > button");
    private By CardPaymentOption =By.cssSelector("\".Card\"");
    private By CardNumberField =By.xpath("//*[@id=\"card-number\"]");
    private By DateField = By.id("expiry");
    private By CvvField = By.id("cvv");
    private By InvalidCardNumber = By.xpath("//*[@id='card-number_unhappy']");
    private By CheckOutiFrame = By.xpath("//*[@id='kpg-frame-component']");


    public CheckOutPage(WebDriver driver) throws InterruptedException {this.driver = driver; }

    //Select "Pay Now Button"
    public void clickOnPayNowButton()
    {
        driver.findElement(PayNowButton).click();
    }
    //Select "Continue to payment Button"
    public void clickOnContinueToPayment() throws InterruptedException
    {
        driver.findElement(ContinueToPaymentButton).click();
    }

//    Select the Payment Type
    public void clickOnPaymentType() throws InterruptedException
    {
        WebElement checkOutFrame = driver.findElement(CheckOutiFrame);
        //Switch to iFrame
        driver.switchTo().frame(checkOutFrame);
        driver.findElement(CardPaymentOption).click();
        Thread.sleep(3000);
    }

    //Select the Delivery Address Icon
    public void clickOnSelectDeliveryAddress()
    {
        driver.findElement(SelectDeliveryAddress).click();
    }
    //Select preferred delivery address
    public void clickSelectDeliverAddressButton()
    {
        driver.findElement(SelectDeliveryAddressButton).click();
    }
    //Select "Use this address" button
    public void click0nUseThisAddressButton()
    {
        driver.findElement(UseThisAddressButton).click();
    }

    //Select "Card Payment Option"
    public void clickOnCardPaymentOption()
    {
        driver.findElement(CardPaymentOption).click();
    }
    //Enter Card Details
    public void enterCardDetails(String CardNumber, String Date, String CVV )
    {
        driver.findElement(CardNumberField).sendKeys(CardNumber);
        driver.findElement(DateField).sendKeys(Date);
        driver.findElement(CvvField).sendKeys(CVV);
    }

    //Return Invalid message
    {
        System.out.println("Invalid Card Number");
    }

    public String InvalidMessage()
    {
        return driver.findElement(InvalidCardNumber).getText();
    }

}
