package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private WebDriver driver;
    private By email= By.id("email");
    private By but= By.tagName("i");

    public ForgotPassword(WebDriver driver){
        this.driver=driver;
    }

    public void enterEmail(String email1){
        driver.findElement(email).sendKeys(email1);
    }

    public EmailSent retrievePassword(){
        driver.findElement(but).click();
        return new EmailSent(driver);
    }
}
