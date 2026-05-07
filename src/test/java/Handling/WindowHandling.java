package Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/windows");

        String parent=driver.getWindowHandle();

        WebElement ele=driver.findElement(By.xpath("//a[@target='_blank']"));
        ele.click();

        Set<String> all=driver.getWindowHandles();

        for(String win:all){
            if(!win.equals(parent)){
                driver.switchTo().window(win);
            }

        }


        System.out.println(driver.getTitle());
        driver.switchTo().window(parent);
        System.out.println("switched to parent "+driver.getTitle());



    }
}
