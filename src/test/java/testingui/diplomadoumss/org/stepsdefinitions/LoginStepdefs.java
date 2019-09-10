package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.airports.Airports;
import testingui.diplomadoumss.org.managepage.currencies.Currencies;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.header.Header;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    private Login login;

    @Given("^I load books app$")
    public void iLoadBooksApp() throws Throwable {
        login = LoadPage.loadBooksApp();
    }

    @Then("^verify the \"([^\"]*)\" is displayed on the page$")
    public void verifyTheIsDisplayedOnThePage(String arg0) throws Throwable {
        Assert.assertEquals((login.isVisibleBookTitle()), Boolean.TRUE, "Is title present");
    }

    @Then("^verify the Save button is displayed$")
    public void verifyTheSaveButtonIsDisplayed() throws Throwable {
        Assert.assertEquals((login.isVisibleSaveButton()), Boolean.TRUE, "Is save button present");
    }
}
