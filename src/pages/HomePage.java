package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By homePageUserName = By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]");

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageDashboardUsername(){
        return driver.findElement(homePageUserName).getText();
    }
}
