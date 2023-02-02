package seleniumGlueCode;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Test {

    protected WebDriver driver;
    private String title;

    @Given("^The user is in the home page$")
    public void the_user_is_in_the_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Metodo given ");
        driver = HooksTest.factory();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //throw new PendingException();
    }

    @When("^He clicks on the button The little tester comics$")
    public void he_clicks_on_the_button_The_little_tester_comics() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Metodo when ");
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        title = driver.getTitle();
        Boolean image = driver.findElement(By.xpath("//img[@class='img-fluid']")).isDisplayed();
        assertTrue("The image was not displayed",image == true);
        //throw new PendingException();
    }

    @Then("^The page The little tester comics is displayed$")
    public void the_page_The_little_tester_comics_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Metodo Then ");
        System.out.println(title);
        driver.close();
        driver.quit();
        //throw new PendingException();
    }
}
