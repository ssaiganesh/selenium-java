package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class seleniumtutorial4 {
    public static void main(String[] args) {
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximise the Chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://www.google.com");

        //By TagName
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println("Number of Links: " +  link.size());
        System.out.println("\n");
        System.out.println("Name of Links:");

        // name of links
        for (WebElement l : link)
        {
            System.out.println(l.getText());
        }

        driver.close();

    }
}
