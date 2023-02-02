package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebFormLocators {
    @FindBy(id = "my-text-id")
    public WebElement textInput;

    @FindBy(xpath = "//input[@name='my-password']")
    public WebElement password;
}
