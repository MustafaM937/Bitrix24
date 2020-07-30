package com.Bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Resources/Features",
        glue = "com/Bitrix/step_definitions"


)
public class CukesRunner {
}
