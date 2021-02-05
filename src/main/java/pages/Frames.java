package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {

    private WebDriver driver;

    private By nestedFrames= By.linkText("Nested Frames");
    private String leftFrame= "frame-top";
    private String leftFrameArea = "frame-left";
    private String bottomFrame= "frame-bottom";
    private By bottomFrameText= By.cssSelector("body");
    private By leftFrameText= By.cssSelector("body");

    public Frames(WebDriver driver){
        this.driver= driver;
    }

    public void clickNestedFrames(){
        driver.findElement(nestedFrames).click();
    }

    public String getLeftFrameText(){
        areaFrame();
        areaLeftFrame();
        String leftText= driver.findElement(leftFrameText).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return leftText;
    }

    public String getBottomFrameText(){
        areaBottomFrame();
        String bottomText= driver.findElement(bottomFrameText).getText();
        return bottomText;
    }

    public void areaFrame(){
        driver.switchTo().frame(leftFrame);
    }

    public void areaLeftFrame(){
        driver.switchTo().frame(leftFrameArea);
    }

    public void areaBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }
}
