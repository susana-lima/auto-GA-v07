package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.General.General;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class GeneralSettingsStepsDef {

    private Login login;
    private Dashboard dashboard;
    private General general;

    @Given("^I load PHP travels page for general link$")
    public void iLoadPHPTravelsPageForGeneralLink() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credentials  on 'Login' page for general link$")
    public void setMyCredentialsOnLoginPageForGeneralLink() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'General' link on 'Left Panel' web page$")
    public void clickGeneralLinkOnLeftPanelWebPage() throws Throwable {
        general = dashboard.clickGeneralExpandForSettings();
    }

    @And("^fill all the blacks$")
    public void fillAllTheBlacks() throws Throwable {
        general.fillAllBlack();
    }

    @And("^click on 'Submit button'$")
    public void clickOnSubmitButton() throws Throwable {
        general.clickOnSubmitButton();
    }
}
