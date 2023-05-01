package com;

import commonUtils.commonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Properties;

public class wikipediaWebElement {
    public static void main(String[] args) throws InterruptedException {
        commonUtils obj = new commonUtils();
        Properties prop = obj.commonUtilsFunction("C:\\Users\\Krushnakant\\Desktop\\Automation\\AmazonLogin\\src\\main\\java\\config\\config.properties");
        WebDriver driver = new EdgeDriver();
        driver.get(prop.getProperty("url"));
        WebElement login = driver.findElement(By.xpath(prop.getProperty("loginButton")));
        login.click();
        WebElement id = driver.findElement(By.id(prop.getProperty("loginID")));
        id.sendKeys(prop.getProperty("userID"));
        WebElement pass = driver.findElement(By.id(prop.getProperty("loginPassword")));
        pass.sendKeys(prop.getProperty("userPassword"));
        WebElement btn = driver.findElement(By.id(prop.getProperty("loginBtn")));
        btn.click();
        Thread.sleep(3000);
        driver.close();
    }
}
