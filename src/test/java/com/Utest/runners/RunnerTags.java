package com.Utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/UtestJoin.feature",
                tags = "@stories",
                glue = "com.Utest.UtestStepDefinitions",
                snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
