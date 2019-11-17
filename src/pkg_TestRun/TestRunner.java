package pkg_TestRun;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "src/pkg_features",
		glue = {"pkg_StepDefs"},
		tags = {"@Aravinth"}
		,dryRun = true
		,monochrome = true
		)

public class TestRunner {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception{
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(dataProvider = "features")
	public void feature(PickleEventWrapper eventwrapper, CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());	
	}

	@DataProvider(parallel = true)
	public Object[][]features(){
		return testNGCucumberRunner.provideScenarios();

	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}
}