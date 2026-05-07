package Waits;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Waits {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //implicit

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //explicit

//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//
//        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Start']")));
//        ele.click();


        Wait<WebDriver> wait=new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                ignoring(NoSuchElementException.class);


        WebElement ele=wait.until(d-> d.findElement(By.xpath("//button[text()='Start']")));
        ele.click();
    }
}



