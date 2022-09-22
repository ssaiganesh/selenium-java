package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

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

        driver.switchTo().newWindow(WindowType.TAB);
        String secondtab = driver.getWindowHandle();
        System.out.println("Window handle after second tab: "+ secondtab);
        driver.navigate().to("https://www.facebook.com");

        driver.switchTo().window(originalWindow);
        Thread.sleep(1000);
        driver.switchTo().window(secondtab);
        driver.close();


    }

}
