package slider;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ModalTest extends BaseTest {

    @Test
    public void testModal(){
        var testModal= homepage.clickContextMenu();
        testModal.clickSquare();
        String text= testModal.getText();
        assertEquals(text, "You selected a context menu", "Incorrect Message");
        testModal.clickAccept();
    }
}
