package com.example.actions;

import com.example.locators.WebFormLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class WebFormActions {
    public WebDriver driver;
    WebFormLocators webFormLocators;

    public WebFormActions(WebDriver driver){
        this.driver = driver;
        this.webFormLocators = new WebFormLocators();
        PageFactory.initElements(driver,webFormLocators);
    }

    public void textSendKeys(String text){
        webFormLocators.textInput.sendKeys(text);
    }

    public void passWordSendKeys(String text){
        webFormLocators.password.sendKeys(text);
    }
}
