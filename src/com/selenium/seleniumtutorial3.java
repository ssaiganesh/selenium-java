package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial3 {
    public static void main(String[] args) {
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximise the Chrome browser
        driver.manage().window().maximize();

        // navigate to th eurl
        driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");

        //[By LinkText] - Preferred over Partial LinkText
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();

        //[By Partial LinkText]
//        driver.findElement(By.partialLinkText("Chiffon Dress")).click();
    }
}
