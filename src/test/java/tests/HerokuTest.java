package tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.HerokuApp;

public class HerokuTest extends BaseTest {   // 🔗 CONNECTED HERE

    HerokuApp hp;

//    @Test
//    public void loginTest() {
//
//        // driver comes from BaseTest
//        hp = new HerokuApp(driver);
//
//        hp.enterUsername("tomsmith");
//        hp.enterPassword("SuperSecretPassword!");
//        hp.enterClick();
//    }
@Test
public void openLoginPage() {
    System.out.println("Page opened");
}

    @Test(dependsOnMethods = "openLoginPage")
    public void loginTest() {
        HerokuApp  hp = new HerokuApp(driver);

        hp.enterUsername("tomsmith");
        hp.enterPassword("SuperSecretPassword!");
        hp.enterClick();
    }
}