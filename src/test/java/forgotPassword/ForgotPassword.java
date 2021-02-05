package forgotPassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EmailSent;

import static org.testng.Assert.assertEquals;

public class ForgotPassword extends BaseTest {

    @Test
    public void forgotPassword(){

        var password= homepage.clickForgotPassword();
        password.enterEmail("nellis@nellis.con");
        EmailSent emailSent= password.retrievePassword();
        assertEquals(emailSent.getText(), "Your e-mail's been sent!", "Message incorrect");
    }
}
