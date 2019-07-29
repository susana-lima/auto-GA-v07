package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
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
    private Dashboard dashboard;
    private Header header = new Header();
    private Currencies currencies = new Currencies();

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
}
