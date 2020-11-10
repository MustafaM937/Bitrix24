package com.Bitrix24.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "html:target/cucumber-report.html",
                "json:target/cucumber.json"

        },
        features = "src/test/resources/features",
        glue = "com/Bitrix24/step_definitions",
        dryRun = false,
        tags = "@wip"
)

public class CukesRunner {
}
