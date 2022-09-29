package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class openingBrowser {


    public static void main(String[] args) {
    // chrome browser --> chromedriver
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver","D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        // WebDriver is an interface which extends SearchContext interface. WebDriver has methods like get(), getTitle(), getCurrentURL(), getPageSource(), close(), quit()
        // RemoteWebDriver is a fully implemented class which implements WebDriver interface.
        // ChromeDriver, IEDriver, FirefoxDriver, OperaDriver, SafariDriver, etc. are child classes of Remote Web Driver class & they provide browser specific
        // implementation of Selenium WebDriver

//         SearchContext driver1 = new ChromeDriver(); // SearchContext is super interface of WebDriver & it has only 2 methods findElement, findElements()
        // RemoteWebDriver driver1 = new ChromeDriver();

        // 2. Navigate to the url (www.google.com)
        // driver.get("www.google.com"); // this is invalid url have to include https
        driver1.get("https://www.google.com");

        // 3. Close the browser
        driver1.close();

    // firefox browser --> geckodriver
        System.setProperty("webdriver.gecko.driver","D://selenium jar and drivers//firefoxdriver//geckodriver.exe");
        WebDriver driver = new FirefoxDriver(); // Remote Webdriver of Selenium is class and chromedriver, firefox driver etc are an interface.
        // FirefoxDriver driver1 = new FirefoxDriver(); // con is that can only use firefox and have to make changes if many testcases

        // 2. Navigate to the url (www.google.com)
        // driver.get("www.google.com"); // this is invalid url have to include https
        driver.get("https://www.google.com");

        // 3. Close the browser
        driver.close();
    }
}