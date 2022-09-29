package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown1 {
    public static void main(String[] args) throws InterruptedException {
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("C://Users//shank//IdeaProjects//selenium//templates//dropdown-select.html");


        // maximise the Chrome browser
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.name("Mobiles"));

        Select se=new Select(element);
        se.selectByIndex(1);

        Thread.sleep(3000);

        driver.get("C://Users//shank//IdeaProjects//selenium//templates//dropdown-value-select.html");

        WebElement valueElement=driver.findElement(By.name("Mobiles"));
        Select valueSe = new Select(valueElement);
        valueSe.selectByValue("nokia");


        Thread.sleep(3000);

//        se.selectByVisibleText("HTC");
//
//        Thread.sleep(2000);

        driver.get("C://Users//shank//IdeaProjects//selenium//templates//dropdown-multiselect.html");

        WebElement multiSelectElement=driver.findElement(By.name("Mobdevices"));
        Select multiSe=new Select(multiSelectElement);
        /* OR
         Select multiSe=new Select(driver.findElement(By.name("Mobdevices")));
        **/

//        se.selectByVisibleText("HTC");
        multiSe.selectByIndex(1);

        Thread.sleep(3000);

//        se.deselectByValue("nokia");
//        se.deselectByIndex(1); // if this specific index is selected
//
//        se.deselectByVisibleText("HTC");


    }

}
