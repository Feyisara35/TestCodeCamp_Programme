package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class SetupTests {

    //Create a WebDriver Object
    private WebDriver driver;

    //Create LoginPage object
    protected LoginPage loginPage;

    //Create DashboardPage object
    protected DashboardPage dashboardPage;

    @BeforeTest
    public void setUp(){
    //Selenium Webdriver needs this executable in order to know which browser can run the test
    //Browser setup Chrome
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    //Instantiate WebDriver object
    driver = new ChromeDriver();
    //maximize the window browser
    driver.manage().window().maximize();
    //Launch the application
    driver.get("https://opensource-demo.orangehrmlive.com/");
    //Instantiate login page after launching
    loginPage = new LoginPage(driver);

    }

    @AfterTest
    public void closeBrowser() {
    //".close" would close the window but the ".quit" would exit the session
    driver.quit();
    }


}
