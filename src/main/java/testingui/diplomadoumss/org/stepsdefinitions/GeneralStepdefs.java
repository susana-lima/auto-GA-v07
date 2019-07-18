package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;


public class GeneralStepdefs {
    private Login login;
    private Dashboard dashboard;

    @Given("^I load PHP travels page$")
    public void iLoadPHPTravelsPage() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credentials  on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("click 'General' link on 'Left Panel' page$")
    public void clickGeneralLinkOnLeftPanelPage() throws Throwable{
        dashboard.clickGeneralExpand();
    }
}
