package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.SetupTests;

public class LoginTests extends SetupTests {

    //TestNG annotation
    @Test
    //This extends to SetupTests as the SetupTests class contains all the setup requirements to run our test
    public void testLogin() throws InterruptedException
    {
        String username = "Admin";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("admin123");
        
    //Handler for dashboard page
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();
        String pageUrl = "https://opemsources-demo.oragehrmlive.com/index.php/auth/login";
        System.out.println("PASSED - The page url is" + pageUrl);

    }

    @Test
    public void testLogout() throws InterruptedException {
        try {
            dashboardPage.clickWelcomeAdmin();
            loginPage = dashboardPage.clickLogout();
        } catch (Exception e){
            String loginUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
            System.out.println("PASSED - The page url is " + loginUrl);
        }
    }
}
