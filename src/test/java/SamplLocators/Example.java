package SamplLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Example {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver();
        //driver.get("https://the-internet.herokuapp.com/dropdown");
     //   driver.get("https://demoqa.com/select-menu");

//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.cssSelector(".fa-sign-in")).click();
//        WebElement ele= driver.findElement(By.cssSelector(".subheader"));
//        System.out.println(ele.getText());

        //1st one
//        WebElement drop=driver.findElement(By.id("dropdown"));
//        Select se=new Select(drop);
//        se.selectByValue("2");

        //2nd one
//        WebElement drop=driver.findElement(By.id("cars"));
//        Select se=new Select(drop);
//        se.selectByValue("audi");
//        se.selectByVisibleText("Saab");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        se.deselectByValue("audi");

//        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//
//        WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#start button")));
//        ele.click();

        FluentWait<WebDriver> wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        WebElement ele=wait.until(d-> d.findElement(By.xpath("//button[text()='Start']")));
        ele.click();

    }
}



