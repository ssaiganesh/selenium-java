package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Test Cases
 *
 * 1. Open Chrome Browser
 * 2. Navigate to URL (https://demoqa.com/browser-windows)
 * 3. Maximize the Window
 * 4. Verify the Current URL of the page
 * 5. Verify the title of the page
 * 6. Print length of the title of the page
 * 7. Print the pageSource of the page.
 * 8. Print the length of the Page Source of the page
 * 9. Click on new tab
 * 10. Close Browser (will only close the tab)
 * 11. Quite the Browser
 */

public class verifyingURL_Tite_PageSource {
    public static void main(String[] args){
        // Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url="https://demoqa.com/browser-windows";
        // navigate to the url
        driver.get(url);

        // maximise the Chrome browser
        driver.manage().window().maximize();



        String currentURL=driver.getCurrentUrl();
        System.out.println(currentURL);

        if (currentURL.equals(url))
        {
            System.out.println("The URL is verified.");
        }
        else
        {
            System.out.println("The URL is not verified.");
        }

        String currentTitle=driver.getTitle();
        assert currentTitle.contentEquals("TITLE of webpage");

        System.out.println(currentTitle.length());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getPageSource().length());

        driver.close();
        driver.quit();



    }



}
