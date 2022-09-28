package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumDropDown {
    public static void main(String[] args){
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("C://Users//shank//IdeaProjects//selenium//templates//dropdown-select.html");


        // maximise the Chrome browser
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.name("Mobiles"));

        Select se=new Select(element);
        se.selectByIndex(1);



    }

}
