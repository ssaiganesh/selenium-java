package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class xpathHierarchy {
    public static void main(String[] args) {
        // 1. Open Chrome Browser
        System.setProperty("webdriver.chrome.driver", "D://selenium jar and drivers//chromedriver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        // navigate to the url
        driver.get("https://money.rediff.com/gainers");


        // maximise the Chrome browser
        driver.manage().window().maximize();

        // Xpath axes
        // self node
        String selfnode=driver.findElement(By.xpath("//a[contains(.,'Autoline Industries')]/self::a")).getText(); // using self node and accessing a tag
        System.out.println("The self node is "+ selfnode);

        // parent node
        String parentnode=driver.findElement(By.xpath("//a[contains(.,'Autoline Industries')]/parent::td")).getText(); // if not sure what is the parent tag can use /parent::*
        System.out.println("The parent node is "+ parentnode);


        // ancestor & child nodes
        int number=driver.findElements(By.xpath("//a[contains(.,'Autoline Industries')]/ancestor::tr/child::*")).size();
        System.out.println("The number of child nodes: " +number);

        List<WebElement> childnode=driver.findElements(By.xpath("//a[contains(.,'Autoline Industries')]/ancestor::tr/child::*"));
        System.out.println("The number of child nodes: " +childnode.size());
        WebElement ancestornode=driver.findElement(By.xpath("//a[contains(.,'Autoline Industries')]/ancestor::tr"));
        System.out.println("The ancestor node is "+ancestornode.getText());


        // following node
        List<WebElement> followingtag=driver.findElements(By.xpath("//a[contains(.,'Autoline Industries')]/following::*"));
        System.out.println("The no of following elements from the current HTML tag is "+ followingtag.size());

        // following siblings
        List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains(.,'Autoline')]/ancestor::tr/following-sibling::*"));
        System.out.println("The no of following siblings from the current HTML tag is "+ followingsiblings.size());

        // preceding nodes
        List<WebElement> precedingtag=driver.findElements(By.xpath("//a[contains(.,'Autoline Industries')]/preceding::*"));
        System.out.println("The no of following elements from the current HTML tag is "+ precedingtag.size());

        // preceding siblings
        List<WebElement> precedingsiblings=driver.findElements(By.xpath("//a[contains(.,'Autoline')]/ancestor::tr/preceding-sibling::*"));
        System.out.println("The no of preceding siblings from the current HTML tag is "+ precedingsiblings.size());

        driver.close();
    }
}