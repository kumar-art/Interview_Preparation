package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuApp {
    WebDriver driver;
    public HerokuApp(WebDriver driver){
        this.driver=driver;
    }
    By username=By.id("username");
    By password=By.id("password");
    By login= By.cssSelector(".fa-sign-in");
    public void enterUsername(String user){
        driver.findElement(username).sendKeys(user);
    }
    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void enterClick(){
        driver.findElement(login).click();
    }
}
