package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

    private WebDriver driver;
    private By square= By.id("hot-spot");

    public ContextMenu(WebDriver driver){
        this.driver= driver;
    }

    public void clickSquare(){
        Actions actions= new Actions(driver);
        actions.contextClick(driver.findElement(square)).perform();
    }

    public String getText(){
        return driver.switchTo().alert().getText();
    }

    public void clickAccept(){
        driver.switchTo().alert().accept();
    }

}
