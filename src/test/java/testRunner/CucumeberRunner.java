package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FeatureFile"},glue= {"stepDefinations"}, plugin= {"json:target/cucumber-report.json",
"html:target/cucumber-report"})

public class CucumeberRunner {

}
