package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;

import java.util.HashMap;
import java.util.Map;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();

        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);

        driver.get("https://www.saucedemo.com/");

        // Correct object creation
        LoginPage lp = new LoginPage(driver);

        lp.enterUsername("standard_user");
        lp.enterPassword("secret_sauce");
        lp.enterClick();

       // driver.quit();
    }


}