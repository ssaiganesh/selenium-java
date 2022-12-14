package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingByXPATh {
    public static void main(String[] args){
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // navigate to the url
        driver.get("https://www.ebay.com/");


        // maximise the Chrome browser
        driver.manage().window().maximize();


//        // Absolute Xpath
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-Shirts");
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[5]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();


        // Relative Xpath
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Shirts for Men");
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

//
//        // or operator
//        driver.findElement(By.xpath("//input[@id='gh-ac' or @name='_nkw']")).sendKeys("Shorts for men"); // even if one of id or name is wrong still able to locate
//
//        // and operator
//        driver.findElement(By.xpath("//input[@id='gh-ac' and @name='_nkw']")).clear(); // both values must be right for it to detect element

        // contains method
        driver.findElement(By.xpath("//input[contains(@name,'_n')]")).sendKeys("test");

        // starts-with method
        driver.findElement(By.xpath("//input[starts-with(@name, '_n')]")).clear();

        // text() method
        driver.findElement(By.xpath("//a[text()='Sell']")).click(); //  //a[contains(text(), 'Sell')]  -- 6 elements will match as there's seller center, seller info etc.
        
    }
}
