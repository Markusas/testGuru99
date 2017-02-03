package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marek on 2/3/2017.
 */
public class HomePageGuru99 {
    WebDriver driver;
    By userNameTextOnHomePage = By.xpath("//table//tr[@class='heading3']");

    public HomePageGuru99(WebDriver driver){
        this.driver = driver;
    }

    public String getUserNameTest(){
        return driver.findElement(userNameTextOnHomePage).getText();
    }
}
