package SamplLocators;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class LocatorsTest {

    WebDriver driver;

    @Test
    @Description("Login to SauceDemo using problem_user")
    public void test() {
        setupDriver();
        login();
        printPageDetails();
        driver.quit();
    }

    @Step("Setup Chrome driver and disable password popups")
    public void setupDriver() {

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Step("Login to SauceDemo")
    public void login() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Step("Print page title and URL")
    public void printPageDetails() {

        System.out.println("Page Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }
}