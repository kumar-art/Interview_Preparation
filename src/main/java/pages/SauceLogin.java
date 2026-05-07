package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLogin {

    WebDriver driver;
    public  SauceLogin(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="user-name")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(id="login-button")
    WebElement loginbtn;


    public void enterUsername(String user){
        username.sendKeys(user);
    }
    public void enterPassword(String pass){
        password.sendKeys(pass);
    }
    public void enterClick(){
        loginbtn.click();

    }

}
