package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNgIslaSearch {

    private WebDriver driver;

    @FindBy(id = "search-button")
    public WebElement searchButton;

    @FindBy(id = "search-input")
    public WebElement searchInput;

    //error-empty-query
    @FindBy(id = "error-empty-query")
    public WebElement message;

    // //li
    @FindBy(xpath = "//li")
    public List<WebElement> searchResults;

    // error-no-results
    @FindBy(id = "error-no-results")
    public WebElement noResultsSearch;



    @Before
    public void previous(){
        System.out.println("previous");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
        PageFactory.initElements(driver,this);
    }

    @After
    public void after(){
        System.out.println("after");
        driver.close();
        driver.quit();
    }

    @Test
    public void webElementsPresent(){
        System.out.println("Hola0");
        boolean button = searchButton.isDisplayed();
        Assert.assertTrue("el boton de busqueda no se muestra",button);

        boolean inputText = searchInput.isDisplayed();
        Assert.assertTrue("la barra de busqueda no se muestra",inputText);
    }

    @Test
    public void validateEmptyQuery(){
        System.out.println("Hola1");
        searchButton.click();
        String message = this.message.getText();
        Assert.assertTrue("el div existe", message !="Provide some query");
    }

    @Test
    public void oneResutSearch(){

        searchInput.sendKeys("isla");
        searchButton.click();

        System.out.println("Hola2");
        List<WebElement> myList= searchResults;
        boolean busqueda = myList.get(0).isDisplayed();
        Assert.assertTrue("el primer resultado de busqueda se muestra",busqueda);
    }

    @Test
    public void validateSearchResult(){
        System.out.println("Hola3");
        searchInput.sendKeys("isla1");
        searchButton.click();

        boolean resultSearch1 = noResultsSearch.isDisplayed();
        Assert.assertTrue("el aviso de no results tiene problemas",resultSearch1);

    }

    @Test
    public void resultMatch(){

        searchInput.sendKeys("Port Royal");
        searchButton.click();
        //String message = this.message.getText();
        List<WebElement> mylist = searchResults;
        Assert.assertTrue("el div existe", mylist.get(0).getText() != "Port Royal");
    }
}
