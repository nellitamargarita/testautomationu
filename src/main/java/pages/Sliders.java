package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Sliders {

    private WebDriver driver;
    private By moverSlider= By.xpath("//*[@id=\"content\"]/div/div/input");
    private By number= By.id("range");

    public Sliders(WebDriver driver){
        this.driver= driver;
    }

    public void moveSlider(String value){
        while (!getSliderValue().equals(value)) {
            driver.findElement(moverSlider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue(){
        return driver.findElement(number).getText();
    }

}
