package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;   // ✅ ADD THIS

public class BaseTest {

    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Framework setup");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Test execution starts");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Launching browser");
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("After Method - Browser closed");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Test class finished");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Test execution completed");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Framework completed");
    }
}