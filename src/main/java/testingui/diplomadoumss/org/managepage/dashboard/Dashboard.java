package testingui.diplomadoumss.org.managepage.dashboard;

import static testingui.diplomadoumss.org.manageevents.Event.*;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.General.General;
import testingui.diplomadoumss.org.managepage.flight.Flight;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {

    General general;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'General') and @aria-expanded='false']")
    private WebElement generalExpand;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Flights') and @aria-expanded='false']")
    private WebElement flightExpand;

    @FindBy(xpath = "//ul[@id='menu-ui']//a[contains(., 'Settings')]")
    private WebElement generalSettingsExpand;


    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }

    public Dashboard clickGeneralExpand() {
        clickWebElement(generalExpand);
        return this;
    }

    public Flight clickFlightExpand() {
        clickWebElement(flightExpand);
        return new Flight();
    }

    public General clickGeneralExpandForSettings() {
        clickWebElement(generalExpand);
        avoidToUse(2);
        clickWebElement(generalSettingsExpand);
        return new General();
    }
}
