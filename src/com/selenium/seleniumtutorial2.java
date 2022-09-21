package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial2 {
    public static void main(String[] args) {
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximise the Chrome browser
        driver.manage().window().maximize();

        // navigate to th eurl
        driver.get("http://automationpractice.com/index.php");

        //[By Id]
//        driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
        // OR
//        WebElement search=driver.findElement(By.id("search_query_top")); // search box is of type WebElement
//        search.sendKeys("T-Shirts");

        // [By Name]
        driver.findElement(By.name("search_query")).sendKeys("Shirts");

    }
}
