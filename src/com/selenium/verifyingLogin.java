package com.selenium;

// 1. Open the Chrome Browser
// 2. Navigate to the URL (https://opensource-demo.oranngehrmlive.com/)
// 3. Enter valid username
// 4. Enter valid password
// 5. Click on Login
// 6. Verify the URL (https://opensource-demo.orangehrmlive.com)
// 7. Verify Title
// 8. Close the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyingLogin {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximise the Chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://www.browserstack.com/users/sign_in");

        WebElement userName = driver.findElement(By.id("user_email_login"));
        userName.sendKeys("shankarsaiganesh@gmail.com");

        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("Test123!");

        driver.findElement(By.id("user_submit")).click();

        Thread.sleep(5000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("integrateTestSuiteStep")));



        String act_url=driver.getCurrentUrl();
        System.out.println(act_url);

        // verify
        String desired_url="https://automate.browserstack.com/dashboard/v2/quick-start/get-started";

        if (act_url.equals(desired_url))
        {
            System.out.println("url passed");
        }
        else {
            System.out.println("url failed");
        }

        String act_title=driver.getTitle();
        System.out.println(act_title);

        // verify
        String desired_title="Automate Quick Integration Guide";

        if (act_title.equals(desired_title))
        {
            System.out.println("title passed");
        }
        else {
            System.out.println("title failed");
        }
        String ps = driver.getPageSource();
        System.out.println(ps);
        driver.close();

    }
}
