package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
		(
				features="C:\\Users\\poojasn\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\mystore.feature",
				glue= {"com\\qa\\stepdefinitions"},
				dryRun=false,
				monochrome=true,
				strict=true
		)
public class TestRunner {

}
