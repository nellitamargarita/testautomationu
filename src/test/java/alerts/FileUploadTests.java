package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadPage= homepage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\DELL\\IdeaProjects\\testautomationu\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe", "Upload File");
    }
}
