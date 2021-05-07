package com.DataTable;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/com/DataTable/DataTable.feature", glue = { "StepDefinition" },  tags = { "@single" }, monochrome = true)
public class CucumberRunner {
}