package seleniumGlueCode;


import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HooksTest {
    //object webdriver.
    public WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("@Before QA test ");
        //WebDriverManager.chromedriver().setup();
    }
    @After
    public void tearDown(){
        System.out.println("@after QA test ");
    }

    //static method to define a webdriver
    public static WebDriver factory(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @AfterStep
    public void beforeStep(){
        System.out.println("------------------Despues de cada paso-----------------");
    }

    @BeforeStep
    public void afterStep(){
        System.out.println("------------------Antes de cada paso-----------------");
    }
}
