package com.Bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/Resources/Features",
        glue = "com/Bitrix/step_definitions",
        dryRun = false,
       tags = "@upload"
)
public class CukesRunner {
}
