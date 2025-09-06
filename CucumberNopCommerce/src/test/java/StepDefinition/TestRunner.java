package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
                 glue={"StepDefinition"},
                 plugin= {"pretty","html:target/HTML/htmlreport6.html",
		                           "json:target/JSON//jsonreport6",
		                           "junit:target/JUNIT//junitreport6"})
public class TestRunner {

}


