package testingui.diplomadoumss.org.stepsdefinitions.flights;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

public class RouteAddStepdefs {
    private Login login;
    private Dashboard dashboard;



    @And("^click 'flights' link on 'Left Panel' page$")
    public void clickFlightsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickFlightsExpand();
    }
/*

    @And("^click on the submenu link 'routes' on the page 'Left panel'$")
    public void clickOnTheSubmenuLinkRoutesOnThePageLeftPanel() throws Throwable{

    }

    @And("^Click on the 'Add' button on the route list page$")
    public void clickOnTheAddButtonOnTheRouteListPage() throws Throwable{

    }

    @And("^fill 'routes' form using Data Driver Test on create 'routes' page$")
    public void fillRoutesFormUsingDataDriverTestOnCreateRoutesPage() throws Throwable{

    }

    @And("^click button 'Save' into 'Sickness' create form page$")
    public void clickButtonSaveIntoSicknessCreateFormPage() throws Throwable{

    }

    @Then("^created 'route' is showed in 'Routes list' page$")
    public void createdRouteIsShowedInRoutesListPage() throws Throwable{
    }*/
}
