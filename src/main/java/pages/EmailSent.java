package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSent {

    private WebDriver driver;
    private By text= By.id("content");

    public EmailSent(WebDriver driver){
        this.driver=driver;
    }

    public String getText(){
        return driver.findElement(text).getText();
    }
}
