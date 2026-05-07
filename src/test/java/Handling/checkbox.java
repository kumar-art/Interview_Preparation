package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class checkbox {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.automationtesting.in/Register.html");

        WebElement ele=driver.findElement(By.xpath("//input[@type='Handling.checkbox']"));

        ele.click();
        WebElement ele1=driver.findElement(By.id("checkbox2"));
        ele1.click();

    }
}
