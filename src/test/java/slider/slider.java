package slider;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class slider extends BaseTest {

    @Test
    public void horizontalSlider(){
        String value = "4";

        var clickpage= homepage.clickHorizontalSlider();
        clickpage.moveSlider(value);
        assertEquals(clickpage.getSliderValue(), value, "Slider value is incorrect");
    }
}
