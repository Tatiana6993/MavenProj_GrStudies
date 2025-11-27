package com.cydeo.runners;

import com.cydeo.utilities.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-reports.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        publish = true //generating a report with public link


)

public class CukesRunner {

    //it can be named Runner or CucumberRunner
}
