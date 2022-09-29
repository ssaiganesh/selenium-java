package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDownAutoSuggestion {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.goibibo.com/");

        // maximise the Chrome browser
        driver.manage().window().maximize();

        WebElement from=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[1]/div/div/p"));
        WebElement to=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[2]/div/div"));
        from.click();
        WebElement fromInput=driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/input"));
        fromInput.sendKeys("Singa");
        Thread.sleep(2000);
        fromInput.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        fromInput.sendKeys(Keys.ENTER);

    }
}
