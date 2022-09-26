package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumtutorial15 {
    public static void main(String[] args){
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // navigate to the url
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");


        // maximise the Chrome browser
        driver.manage().window().maximize();

        // Select Class
//        Select selectelement =  new Select(driver.findElement(By.xpath("")));
    }
}
