package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\soyeb\\Seleniumwithcucumber\\Features\\orangeHRM.feature",glue ={"stepDefination"},plugin = { "pretty", "html:target/cucumber-reports" },
        monochrome = true)

public class testrunner {
}
