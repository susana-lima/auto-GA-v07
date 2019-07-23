package testingui.diplomadoumss.org;


import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import testingui.diplomadoumss.org.core.DriverManager;

@CucumberOptions(
        features = {"src/test/resources/features"},
        format = {"pretty",
                "html:build/cucumber",
                "json:build/cucumber/cucumber.json",
                "junit:build/test-report.xml"}
)
/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class CucumberRunner extends AbstractTestNGCucumberTests{

    @After
    public void quitBrowser(){
        DriverManager.getInstance().getWebDriver().quit();
    }
}
