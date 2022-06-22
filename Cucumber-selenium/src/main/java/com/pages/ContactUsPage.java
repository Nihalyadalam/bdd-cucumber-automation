package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ContactUsPage {

    private WebDriver driver;

    private final By subjectHeading = By.id("id_contact");
    private final By email = By.id("email");
    private final By orderRef = By.id("id_order");
    private final By messageText = By.id("message");
    private final By sendButton = By.id("submitMessage");
    private final By successMessg = By.cssSelector("div#center_column p");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getContactUsPageTitle() {
        return driver.getTitle();
    }

    public void fillContactUsForm(String heading, String emailId, String orderReference, String message) {
        Select select = new Select(driver.findElement(subjectHeading));
        select.selectByVisibleText(heading);
        driver.findElement(email).sendKeys(emailId);
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.findElement(orderRef).sendKeys(orderReference);
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.findElement(messageText).sendKeys(message);
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    public void clickSend() {
        driver.findElement(sendButton).click();
        //driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }

    public String getSuccessMessg() {
        return driver.findElement(successMessg).getText();
    }
}
