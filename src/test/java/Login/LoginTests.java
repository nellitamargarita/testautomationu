package Login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTest {

@Test
    public void testSuccesfulLogin(){
       LoginPage loginPage= homepage.clickFormAuthentication();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage= loginPage.clickLoginButton();
       assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),
               "Alert text incorrect" );
    }
}
