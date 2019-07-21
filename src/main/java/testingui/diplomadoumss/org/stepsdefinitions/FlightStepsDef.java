package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.flight.Flight;
import testingui.diplomadoumss.org.managepage.login.Login;

public class FlightStepsDef {

    private Login login;
    private Dashboard dashboard;
    private Flight flight;

    @Given("^I load PHP travels page for Flights link$")
    public void iLoadPHPTravelsPageForFlightsLink() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credentials  on 'Login' page for flights link$")
    public void setMyCredentialsOnLoginPageForFlightsLink() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'Flights' link on 'Left Panel' page$")
    public void clickFlightsLinkOnLeftPanelPage() throws Throwable {
        flight = dashboard.clickFlightExpand();
    }

    @And("^click on 'Settings' after click on 'Flights' link$")
    public void clickOnSettingsAfterClickOnFlightsLink() throws Throwable {
        flight.clickSettingFlightExpand();
    }

    @And("^select 'Off' option from the selector$")
    public void selectOffOptionFromTheSelector() throws Throwable {
        flight.selectOnFromDropdown();
    }

    @And("^click on 'Submit' bottom after select option$")
    public void clickOnSubmitBottomAfterSelectOption() throws Throwable {
        flight.clickOnSubmitButtom();
    }
}
