package LAnguage_select;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/resources/features/selectLanguage.feature/",glue= {"LAnguage_select"},
		monochrome=true,plugin= {
				"pretty","html:target/cucumber-report.html"
		}
		)
		
		
public class test_runner extends AbstractTestNGCucumberTests {


	}

