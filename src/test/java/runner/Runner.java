package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/",tags={"@LoginValid"},
glue={"stepDefination","hooks"})

public class Runner extends AbstractTestNGCucumberTests {
	@AfterClass
	public void test()
	{
		
	}
	

}
