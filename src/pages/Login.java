package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    By username= By.name("uid");
    By password=By.name("password");
    By titleText=By.className("barone");
    By login=By.name("btnlogin");

    public void login(WebDriver driver){
        this.driver= driver;
    }

    // Set Username in textbox
     public void setUsername(String strUserName){
        driver.findElement(username).sendKeys(strUserName);
     }

     // Set password in password textbox
    public void setPassword(String strPassword){
        driver.findElement(password).sendKeys(strPassword);
    }

    // Click on login button
    public void clickLogin(){
        driver.findElement(login).click();
    }

    public String getLoginTitle(){
        return driver.findElement(titleText).getText();
    }

    /**
     * This POM method will be exposed in test case to login in the application
     * @param strUsername
     * @param strPassword
     * @return
     */

    public void loginToPage(String strUsername, String strPassword){
        // Fill username
        this.setUsername(strUsername);

        // Fill Password
        this.setPassword(strPassword);

        // Click login button
        this.clickLogin();
    }
}
