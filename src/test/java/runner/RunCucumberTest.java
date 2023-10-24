package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features"
        ,glue = {"steps"}
        ,plugin = {"pretty", "html:target/reports/cucumber-reports.html", "json:target/reports/cucumber.json"}
        ,monochrome = true
        ,tags = "@aLancer"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
