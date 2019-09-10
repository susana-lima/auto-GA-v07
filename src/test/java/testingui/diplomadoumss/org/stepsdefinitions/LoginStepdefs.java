package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
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

    @And("^fill \"([^\"]*)\" Book Title field on the page$")
    public void fillBookTitleFieldOnThePage(String booktitle) throws Throwable {
        login.setBookTitle(booktitle);
    }

    @Then("^Verify validation message when we enter only Book Title$")
    public void verifyValidationMessageWhenWeEnterOnlyBookTitle() {
     //   Assert.assertEquals((login.isVisibleSaveButton()), Boolean.TRUE, "New book Added");
        String messageSaved = login.getMessageSaved();

        Assert.assertEquals(messageSaved,  Boolean.TRUE, "New book Added");
    }

    @Then("^Verify the name of the header is \"([^\"]*)\"$")
    public void verifyTheNameOfTheHeaderIs(String arg0) throws Throwable {
        String headerTitle = login.getHeaderTitle();

        Assert.assertEquals(headerTitle, arg0);
    }
}
