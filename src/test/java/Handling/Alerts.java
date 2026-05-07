package Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Alerts {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        WebElement ele=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//        ele.click();
//        Alert alert=driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.dismiss();

        WebElement ele=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        ele.click();

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hi");
        alert.accept();





    }
}
