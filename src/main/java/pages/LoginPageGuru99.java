package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marek on 2/3/2017.
 */
public class LoginPageGuru99 {
    WebDriver driver;
    By nameUserGuru99 = By.name("uid");
    By passwordUserGuru99 = By.name("password");
    By loginButtonGuru99 = By.name("btnLogin");
    By titleText = By.className("barone");

    public LoginPageGuru99(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleText(){
        return driver.findElement(titleText).getText();
    }

    public void setNameUserGuru99(String strUserName) {
        driver.findElement(nameUserGuru99).sendKeys(strUserName);
    }

    public void setPasswordUserGuru99(String strUserPassword) {
        driver.findElement(passwordUserGuru99).sendKeys(strUserPassword);
    }

    public void clickLogin(){
        driver.findElement(loginButtonGuru99).click();
    }

    public void loginOnGuru99(String userName, String userPassword){
        this.setNameUserGuru99(userName);
        this.setPasswordUserGuru99(userPassword);
        this.clickLogin();
    }
}
