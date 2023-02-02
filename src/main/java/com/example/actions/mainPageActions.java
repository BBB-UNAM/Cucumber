package com.example.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class mainPageActions {

    //Verify if the image exists in the page
    public void verfyImageExist(WebDriver driver){
        Boolean image = driver.findElement(By.xpath("//img[@class='img-fluid']")).isDisplayed();
        assertTrue("The image was not displayed",image == true);
    }

}
