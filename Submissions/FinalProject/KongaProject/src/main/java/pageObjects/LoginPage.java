package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public LoginPage(WebDriver driver) {this.driver = driver; }

    private WebDriver driver;
    //Locate Elements using "By"
    private By UserName = By.id("username");
    private By PasswordOfUser = By.id("password");
    private By LoginButton = By.xpath("//button[@class='_0a08a_3czMG _988cf_1aDdJ']");

    //Enter Username
    public void enterUsername(String hostName)
    {
        driver.findElement(UserName).sendKeys(hostName);
    }
    //Enter Password
    public void enterPassword(String hostPassword)
    {
        driver.findElement(PasswordOfUser).sendKeys(hostPassword);
    }
    //Click on the login button
    public HomePage clickLoginButton() throws InterruptedException
    {
        driver.findElement(LoginButton).click();
    //Wait 5 seconds before executing action
        Thread.sleep(5000);
        return new HomePage(driver);
    }
}
