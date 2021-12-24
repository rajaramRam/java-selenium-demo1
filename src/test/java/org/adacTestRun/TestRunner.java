package org.adacTestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Adactin.feature",glue = "org.AdTest",monochrome = true)
public class TestRunner {

	
	
}
