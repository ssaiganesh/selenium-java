package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
    public static void main(String[] args){
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to th eurl
        driver.get("https://demoqa.com/automation-practice-form");

        // maximise the Chrome browser
        driver.manage().window().maximize();

        WebElement sports=driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        WebElement reading=driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
        WebElement music=driver.findElement(By.xpath("//label[normalize-space()='Music']"));

        sports.click();

        // validation
            // isDisplayed: T/F if the element is displayed
            // isSelected: T/F if the element is selected
            // isEnabled: T/F if the element is enabled

        boolean bool1=sports.isDisplayed();
        if(bool1){
            sports.click();
        }




    }
}
