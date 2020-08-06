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
<<<<<<< HEAD
       tags = "@upload"
=======
        tags = "@upload"
>>>>>>> 1b5d4ab343d615f6bfede895cad386b0b1e683bf
)
public class CukesRunner {
}
