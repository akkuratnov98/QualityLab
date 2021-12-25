package Main.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitElementLocated(By elementBy){
        wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
    }

    public void click(By elementBy){
        waitElementLocated(elementBy);
        driver.findElement(elementBy).click();
    }

    public void sendKey(By elementBy, String str){
        waitElementLocated(elementBy);
        driver.findElement(elementBy).sendKeys(str);
    }
}
