package com.homePractice.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/homePractice/step_definitions",
        dryRun = false,
        tags = "@wip"

)



public class CukesRunner {
}
