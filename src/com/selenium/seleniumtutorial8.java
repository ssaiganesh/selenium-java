package com.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtutorial8 {
    public static void main(String[] args){
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // navigate to the url
        driver.get("https://books-pwakit.appspot.com");


        // maximise the Chrome browser
        driver.manage().window().maximize();

        WebElement host=driver.findElement(By.tagName("book-app"));

        // shadow dom
//        JavascriptExecutor j=(JavascriptExecutor) driver;
//        SearchContext shadowdom=(SearchContext)  j.executeScript("return arguments[0].shadowRoot", host);
        SearchContext shadowdom = host.getShadowRoot();

        // app-header
        // WebElement appheader=shadowdom.findElement(By.tagName("app-header")); // tag name does not work in shadow root element https://github.com/SeleniumHQ/selenium/issues/10025
        WebElement appheader=shadowdom.findElement(By.cssSelector("app-header"));


        // app-toolbar
        WebElement apptool=appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));

        // book-input
        WebElement book = apptool.findElement(By.tagName("book-input-decorator"));

        // Input
        book.findElement(By.cssSelector("input#input")).sendKeys("selenium Webdriver");

    }
}
