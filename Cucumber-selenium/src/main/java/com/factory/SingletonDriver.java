package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonDriver
{
    private static WebDriver driver = null;

    private SingletonDriver(){

    }

    public static WebDriver driverInit(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            driver = new ChromeDriver(); //Launch chrome driver
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }

    public static void quit(){
        driver.quit();
        driver = null;
    }
}