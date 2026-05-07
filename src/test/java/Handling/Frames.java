package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Frames {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");

        WebElement ele=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        String text = ele.getText();

        System.out.println("Frame text: " + text);

        System.out.println("text entered");

        driver.switchTo().defaultContent();
    }
}
