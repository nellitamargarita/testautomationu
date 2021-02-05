package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertsPage= homepage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResultText(), "You successfuly clicked an alert", "Incorrect message");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage= homepage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage= homepage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();

        String text= "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResultText(), "You entered: " + text, "Results text incorrect");
    }
}
