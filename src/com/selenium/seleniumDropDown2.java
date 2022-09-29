package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class seleniumDropDown2 {
    public static void main(String[] args){
        // For standard multi-select, there are 2 methods, use select method by Index or value, need to check visible text
        // Another to try is to hold ctrl and click

        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");


        // maximise the Chrome browser
        driver.manage().window().maximize();

        WebElement dropdown= driver.findElement(By.name("cars"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.LEFT_CONTROL)
                .click(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[8]/div/select/option[1]")))
                .click(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[8]/div/select/option[3]")))
                .keyUp(Keys.LEFT_CONTROL)
                .build()
                .perform();


//        Second method
//        Select se= new Select(dropdown);
//        if (se.isMultiple()){
//            se.selectByValue("saab");
//            se.selectByValue("audi");
//        }else {
//            System.out.println("This option cannot be multiple selected");
//        }

    }
}
