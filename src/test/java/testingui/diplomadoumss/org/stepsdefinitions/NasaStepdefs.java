package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class NasaStepdefs {
    private Dashboard dashboard;
    private Login login;

    @Given("^I load Nasa APIS Page$")
    public void iLoadNasaAPISPage() throws Throwable {
        dashboard = LoadPage.loadNasaAPISPage();
    }

    @And("^click \"([^\"]*)\" link on left panel$")
    public void clickLinkOnLeftPanel(String arg0) throws Throwable {
        dashboard.clickListingAPIExpand();
    }

    @And("^click \"([^\"]*)\" link once again$")
    public void clickLinkOnceAgain(String arg0) throws Throwable {
        dashboard.clickListingAPIExpand();
    }

    @And("^click \"([^\"]*)\" link$")
    public void clickLink(String arg0) throws Throwable {
        dashboard.clickEarthExpand();
    }

    @And("^click on \"([^\"]*)\" from sub menu$")
    public void clickOnFromSubMenu(String arg0) throws Throwable {
        dashboard.clickGalleryExpand();
    }

    @Then("^Compare with with the text from \"([^\"]*)\" if they are equals$")
    public void compareWithWithTheTextFromIfTheyAreEquals(String arg0) throws Throwable {
       String url = dashboard.getText();
        assertEquals(url, "https://api.nasa.gov/planetary/earth/imagery");

    }
}
