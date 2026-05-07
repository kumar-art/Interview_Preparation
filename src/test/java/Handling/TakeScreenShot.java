package Handling;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TakeScreenShot {


        public static void main(String[] args) throws IOException {
            ChromeOptions options = new ChromeOptions();

            Map<String, Object> prefs = new HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            prefs.put("profile.password_manager_leak_detection", false);

            options.setExperimentalOption("prefs", prefs);
            WebDriver driver = new ChromeDriver();


            driver.get("https://the-internet.herokuapp.com/login");

            // ✅ Correct casting
            TakesScreenshot ts = (TakesScreenshot) driver;

            // ✅ Correct method
            File src = ts.getScreenshotAs(OutputType.FILE);

            // ✅ Correct path
            File dest = new File("C:\\Users\\Admin\\Documents\\coding\\login.png");

            // ✅ Correct class
            FileHandler.copy(src, dest);

            System.out.println("Screenshot captured");

            driver.quit();

        }
    }


