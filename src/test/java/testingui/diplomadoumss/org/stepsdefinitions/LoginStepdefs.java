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
import testingui.diplomadoumss.org.managepage.nasa.Nasa;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Header header = new Header();
    private Currencies currencies = new Currencies();
    private Airports airports = new Airports();
    private Nasa nasa;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'General' link on 'Left Panel' page$")
    public void clickGeneralLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickGeneralExpand();
    }

    @And("^fill \"([^\"]*)\" email field on 'Login' page$")
    public void fillEmailFieldOnLoginPage(String email) throws Throwable {
        login.setEmail(email);
    }

    @And("^fill \"([^\"]*)\" password field on 'Login' page$")
    public void fillPasswordFieldOnLoginPage(String password) throws Throwable {
        login.setPassword(password);
    }

    @Then("^verify the \"([^\"]*)\" label button is displayed on 'Login' page$")
    public void verifyTheLabelButtonIsDisplayedOnLoginPage(String loginLabelButton) throws Throwable {
        String loginLabelButtonCurrent = login.getLoginLabelButton();

        Assert.assertEquals(loginLabelButtonCurrent, loginLabelButton, "Login page is verifying the 'LOGIN' label button.");
    }

    @And("^click 'Logout' button on 'Header' page$")
    public void clickLogoutButtonOnHeaderPage() throws Throwable {
        header.logoutLink();
    }

    @Then("^verify the \"([^\"]*)\" option li is displayed on 'Left Panel' page$")
    public void verifyTheOptionLiIsDisplayedOnLeftPanelPage(String currenciesLinkName) throws Throwable {
        String optionLiCurrencies = login.getCurrenciesLiOption();
        Assert.assertEquals((login.isCurrenciesOptionVisible()), Boolean.TRUE, "Currencies option is verifying the allowed option");
    }

    @And("^click 'Currencies' link belows 'General' options$")
    public void clickCurrenciesLinkBelowsGeneralOptions() throws Throwable {
        dashboard.clickCurrenciesOption();
    }

    @Then("^verify standard currencies are present in column Name$")
    public void verifyStandardCurrenciesArePresentInColumnName() throws Throwable {
       try {
           Boolean arePresentCurrencies = currencies.arePresentStandardCurrencies();
           Assert.assertEquals(arePresentCurrencies, Boolean.TRUE);
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    @And("^click 'Add' button$")
    public void clickAddButton() throws Throwable {
        currencies.clickAddCurrencyButton();
    }

    @And("^set my currency data$")
    public void setMyCurrencyData() throws Throwable {
        currencies.fillDataNewCurrency();
    }

    @And("^click 'Flights' link on 'Left Panel' page$")
    public void clickFlightsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickFligthsExpand();
    }

    @Then("^verify that \"([^\"]*)\" option li is displayed on 'Left Panel' page$")
    public void verifyThatOptionLiIsDisplayedOnLeftPanelPage(String arg0) throws Throwable {
        Assert.assertEquals((airports.isFlightsOptionVisible()), Boolean.TRUE, "Airports option is verifying the allowed option");
    }

    @And("^click 'Airports' link belows 'Flights' options$")
    public void clickAirportsLinkBelowsFlightsOptions() throws Throwable {
        dashboard.clickAirportsOption();
    }

    @Then("^verify main airports are present in column Country$")
    public void verifyMainAirportsArePresentInColumnCountry() throws Throwable {
        Boolean arePresentAirports = airports.arePresentMainAirports();
        Assert.assertEquals(arePresentAirports, Boolean.TRUE);
    }

    @Given("^I load NASA page$")
    public void iLoadNASAPage() throws Throwable {
        nasa = LoadPage.loadNasaPage();
    }

    @And("^Click NASA API Listing link$")
    public void clickNASAAPIListingLink() throws Throwable {
        nasa.clickNasaApiListingLink();
    }

    @And("^Click NASA API Listing second time$")
    public void clickNASAAPIListingSecondTime() throws Throwable {
        nasa.clickNasaApiListingLink();
    }

    @And("^Click Earth left panel$")
    public void clickEarthLeftPanel() throws Throwable {
        nasa.clickEarthLinkOption();
    }

    @And("^Click Imagery sub menu option$")
    public void clickImagerySubMenuOption() throws Throwable {
        nasa.clickImageryOption();
    }

    @Then("^Validate get information in the page$")
    public void validateGetInformationInThePage() throws Throwable {
        String getTextOnPage = nasa.getTextInformation();
        Assert.assertEquals(getTextOnPage,"GET https://api.nasa.gov/planetary/earth/imagery", "GET text validating");
    }
}
