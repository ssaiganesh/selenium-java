package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial6 {
    public static void main(String[] args){
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // maximise the Chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://www.ebay.com/");

//        // Absolute Xpath
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-Shirts");
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();

        // Relative Xpath
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts for Men");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
    }
}
