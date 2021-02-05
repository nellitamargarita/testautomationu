package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTest {

    @Test
    public void testSelectOption(){
       var dropDownPage= homepage.clickDropdown();

       String option= "Option 1";
       dropDownPage.selectFromDropdown(option);
       var selectedOptions= dropDownPage.getSelectedOption();
       assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
       assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
