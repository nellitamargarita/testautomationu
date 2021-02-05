package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {

    private WebDriver driver;
    private String editorIframeId= "mce_0_ifr";
    private By textArea= By.id("tinymce");
    private By decreaseIndentButton= By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/button[1]");

    public WysiwygEditorPage(WebDriver driver){
        this.driver= driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToTheMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToTheMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text= driver.findElement(textArea).getText();
        switchToTheMainArea();
        return text;
    }

    public void decreaseIndentButton(){
        driver.findElement(decreaseIndentButton).click();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    public void switchToTheMainArea(){
        driver.switchTo().parentFrame();
    }
}
