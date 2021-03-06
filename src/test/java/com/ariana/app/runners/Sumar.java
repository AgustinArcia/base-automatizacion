package com.ariana.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/sumar.feature"},
        glue = {"com.ariana.app.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class Sumar {
}
