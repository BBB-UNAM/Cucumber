package seleniumGlueCode;

import com.example.actions.WebFormActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Test2 {

    protected WebDriver driver;

    @Given("user is in the home page")
    public void user_is_in_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Metodo given ");
        driver = HooksTest.factory();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("user enters username as {string} and password {string}")
    public void user_enters_username_as_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        driver.findElement(By.xpath("//a[text()='Web form']")).click();

        WebFormActions webFormActions = new WebFormActions(driver);
        webFormActions.textSendKeys(username);
        webFormActions.passWordSendKeys(password);

        /*System.out.println("Texto 1 traido del feature " + username);
        driver.findElement(By.id("my-text-id")).sendKeys(username);
        System.out.println("Texto 1 traido del feature " + password);
        driver.findElement(By.xpath("//input[@name='my-password']")).sendKeys(password);*/
    }
    @Then("User should be able to see an {string}")
    public void user_should_be_able_to_see_an(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
