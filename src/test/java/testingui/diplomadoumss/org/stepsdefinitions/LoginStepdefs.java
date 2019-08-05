package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import testingui.diplomadoumss.org.managefile.ManageFile;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.header.Header;
import testingui.diplomadoumss.org.managepage.login.Login;

import static org.testng.Assert.assertEquals;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Header header = new Header();
    private Json files = ManageFile.getInstance().getJsonFile("simplejson.json");

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'CMS' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickCMSExpand();
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

    @And("^fill email field using json file on 'Login' page$")
    public void fillEmailFieldUsingJsonFileOnLoginPage() throws Throwable {

    }

    @And("^click 'Page' link on 'Left Panel' page$")
    public void clickPageLinkOnLeftPanelPage() {
        dashboard.clickPageExpand();
    }


    @And("^click 'FLIGHT BOOKINGS' link on 'Left Panel' page$")
    public void clickFLIGHTBOOKINGSLinkOnLeftPanelPage() {
        dashboard.clickFlightbBookingsExpand();
    }

    @And("^click 'BOOKINGS' link on 'Left Panel' page$")
    public void clickBOOKINGSLinkOnLeftPanelPage() {
        dashboard.clickBookings();
    }





    @Then("^Verify that the hover-help of the edit button says Edit$")
    public void verifyThatTheHoverHelpOfTheEditButtonSaysEdit() {
       login.compareText();
    }

    @Then("^Verify that the hover-help of the edit button says DELETE$")
    public void verifyThatTheHoverHelpOfTheEditButtonSaysDELETE() {

        login.compareTextDelete();

    }

    @Then("^Verify that the title of CMS-> Page appears the title CMS MANAGEMENT$")
    public void verifyThatTheTitleOfCMSPageAppearsTheTitleCMSMANAGEMENT() {
        login.compareStaticTexte();
    }

    @Then("^Verify that the column title is Adults in the FLIGHT BOOKINGS table$")
    public void verifyThatTheColumnTitleIsAdultsInTheFLIGHTBOOKINGSTable() {

        login.compareColumnLabelAdults();
    }

    @Then("^Verify that the column title is Booking Id in the FLIGHT BOOKINGS table$")
    public void verifyThatTheColumnTitleIsBookingIdInTheFLIGHTBOOKINGSTable() {
        login.compareColumnLabelBookingId();
    }

    @Then("^Verify that the column title is Origin in the FLIGHT BOOKINGS table$")
    public void verifyThatTheColumnTitleIsOriginInTheFLIGHTBOOKINGSTable() {

        login.compareColumnLabelOrigin();
    }

    @And("^Click on the link in the column Arrival Date in the FLIGHT RESERVATIONS table header$")
    public void clickEnUnFieldDeUnItemDeLaColumnaArrivalDate() {

        dashboard.clickOnTableHeaderArrivalDate();
    }


   /* @Then("^Verify that when we click on the Arrival Date column the items are sorted$")
    public void verifyThatWhenWeClickOnTheArrivalDateColumnTheItemsAreSorted() {

    }*/

    @And("^click on the link in the column Children in the FLIGHT RESERVATIONS table header$")
    public void clickOnTheLinkInTheColumnChildrenInTheFLIGHTRESERVATIONSTableHeader() {
        dashboard.clickOnTableHeaderChildren();
    }
}
