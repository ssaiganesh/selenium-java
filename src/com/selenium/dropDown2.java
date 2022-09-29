package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown2 {
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


        // To get number of options in dropdown
        Select se = new Select(dropdown);
        List<WebElement> options= se.getOptions();
        System.out.println(options.size());

        // Get selected value
        System.out.println(se.getFirstSelectedOption().getText());

        se.deselectAll(); // there's also deselect by value, deselect by index and deselect by visible Text


//        Second method
//        Select se= new Select(dropdown);


//        if (se.isMultiple()){
//            se.selectByIndex(1); // index of element
//            se.selectByValue("audi"); // value of element
//            se.selectByVisibleText("Opel"); // text of element
//        }else {
//            System.out.println("This option cannot be multiple selected");
//        }

    }
}
