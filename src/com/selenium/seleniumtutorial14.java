package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;
import java.util.Set;

public class seleniumtutorial14 {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // navigate to the url
        driver.get("https://demoqa.com/browser-windows");


        // maximise the Chrome browser
        driver.manage().window().maximize();


        String parentwindowhandle=driver.getWindowHandle();
        System.out.println("Parent window Handle: "+ parentwindowhandle);
        String lastwindowhandle= "";

        // click 3 times
        for(int i=1;i<=3;i++)
        {
            driver.findElement(By.xpath("//button[@id='windowButton']")).click();
            Thread.sleep(3000);
        }

        Set<String> windowhandles=driver.getWindowHandles();
        // It prevents possible handlers duplication in the collection which may cause multiple
        // invocations of the same handler after every event.
        // List can consist of duplicated elements and Set can't
        System.out.println("Parent and Child Window handles: ");
        for (String handle:windowhandles)
        {
            System.out.println(handle);
            driver.switchTo().window(handle);
            Thread.sleep(2000);
            driver.get("http://www.google.com");
            driver.manage().window().maximize();
            lastwindowhandle = driver.getWindowHandle();
            Thread.sleep(2000);
            if(!handle.equals(parentwindowhandle))
            {
                Thread.sleep(2000);
                driver.close();
            }

        }



        driver.quit();

//        Thread.sleep(2000);
//        driver.switchTo().window(parentwindowhandle);
//        driver.close();

    }
}
