package Handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebTable {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver();


        driver.get("https://the-internet.herokuapp.com/tables");

        List<WebElement> all=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

        for(WebElement i:all){
            String ele=i.findElement(By.xpath("td[2]")).getText();
           // System.out.println(ele);
            if(ele.equals("John")){
                String ele1=i.findElement(By.xpath("td[3]")).getText();
                System.out.println(ele1);
            }        }










    }
}
