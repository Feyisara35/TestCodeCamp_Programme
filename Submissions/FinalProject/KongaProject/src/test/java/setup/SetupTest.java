package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.HomePage;

public class SetupTest {

    private WebDriver driver;
    protected HomePage homePage;


    //Setup Chrome Browser,Selenium Webdriver needs this executable to run the test

    @BeforeTest
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    //Instantiate Webdriver Object
    driver = new ChromeDriver();

    //Maximize the Browser
    driver.manage().window().maximize();
    //Open Website URL
    driver.get("https://www.konga.com/");
    homePage = new HomePage(driver);
    }

    @AfterTest
    //Close the Browser after Test Completion
    public void tearDown()
    {
        driver.quit();
    }

}
