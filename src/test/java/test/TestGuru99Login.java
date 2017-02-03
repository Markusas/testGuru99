package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageGuru99;
import pages.LoginPageGuru99;

import java.util.concurrent.TimeUnit;

/**
 * Created by Marek on 2/3/2017.
 */
public class TestGuru99Login {
    WebDriver driver;
    HomePageGuru99 homePageGuru99;
    LoginPageGuru99 loginPageGuru99;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }

    @Test(priority = 0)
    public void test_Home_Page_Appear_Correctly() {
        loginPageGuru99 = new LoginPageGuru99(driver);
        Assert.assertTrue(loginPageGuru99.getTitleText().toLowerCase().contains("guru99 bank"));
        loginPageGuru99.loginOnGuru99("mngr65083", "jutezur");
        homePageGuru99 = new HomePageGuru99(driver);
        Assert.assertTrue(homePageGuru99.getUserNameTest().contains("Manger Id : mngr65083"));
    }


}
