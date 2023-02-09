package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"seleniumGlueCode"},
        tags = "not @ignore",
        plugin = { "pretty","html:target/cucumber-reports.html", "html:target/cucumber-reports.json" }
)
public class TestRunner {
}
