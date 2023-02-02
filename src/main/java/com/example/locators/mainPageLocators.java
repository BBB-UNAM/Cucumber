package com.example.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mainPageLocators {

    @FindBy(xpath = "//img[@class='img-fluid']")
    public WebElement imageLogo;

    @FindBy(xpath = "//a[text()='Web form']")
    public WebElement webFormButton;

}
