package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class NestedFrames extends BaseTest {

    @Test
    public void NestedFrames(){
        var nestedFrames= homepage.clickFrames();
        nestedFrames.clickNestedFrames();
        assertEquals(nestedFrames.getLeftFrameText(), "LEFT", "Wrong");
        assertEquals(nestedFrames.getBottomFrameText(), "BOTTOM", "Wrong");
    }
}
