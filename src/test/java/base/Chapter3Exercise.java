package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3Exercise {

    private WebDriver driver;

    public void Exercise(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Shifting Content")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]")).click();

        List<WebElement> links= driver.findElements(By.tagName("li"));
        System.out.println(links.size());
//        WebElement element= driver.findElement(By.tagName("Nellis"));
//        System.out.println(element);

        driver.quit();
    }

    public static void main(String[] args){

        Chapter3Exercise element = new Chapter3Exercise();
        element.Exercise();
    }
}
