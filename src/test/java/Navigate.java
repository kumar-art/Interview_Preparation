import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Navigate {

    WebDriver driver;

    @Test
    @Description("Login to SauceDemo using problem_user")
    public void test() throws InterruptedException {
        setupDriver();
        login("problem_user", "secret_sauce");
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
    }

    @Step("Login with username: {0} and password: {1}")
    public void login(String username, String password) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=16691937439543417323&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007740&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
      //  driver.navigate().back();
      //  Thread.sleep(2000);

       // driver.navigate().refresh();
        //driver.close();
    }

    @Step("Print page title and URL")
    public void printPageDetails() {
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
     //   driver.quit();
        driver.close();
    }
}
