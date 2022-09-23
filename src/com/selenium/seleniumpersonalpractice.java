package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class seleniumpersonalpractice {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximise the Chrome browser
        driver.manage().window().maximize();

        String originalWindow = driver.getWindowHandle();
        System.out.println("original window handle: "+ originalWindow);

        // navigate to th eurl
        driver.get("https://www.google.com");

        WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
        String secondtab = newTab.getWindowHandle();
        System.out.println("SecondTab Handle: "+ secondtab);
        newTab.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        newTab.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        newTab.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        Thread.sleep(2000);

        WebDriver thirdTab = driver.switchTo().newWindow(WindowType.TAB);
        thirdTab.get("https://www.facebook.com");
        System.out.println("Third Tab Handle: "+ thirdTab.getWindowHandle());
        Thread.sleep(3000);

        driver.switchTo().window(secondtab);
        driver.navigate().to("https://www.gmail.com/");
        Thread.sleep(3000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        System.out.println(tabs2);
        driver.switchTo().window(tabs2.get(2));
        Thread.sleep(3000);
        driver.switchTo().window(tabs2.get(0));

    }

//        driver.switchTo().window(originalWindow);
//        Thread.sleep(1000);
//        driver.switchTo().window(secondtab);



}


