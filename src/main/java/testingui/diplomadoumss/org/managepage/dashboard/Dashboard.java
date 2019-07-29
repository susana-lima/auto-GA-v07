package testingui.diplomadoumss.org.managepage.dashboard;

import static testingui.diplomadoumss.org.manageevents.Event.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'General') and @aria-expanded='false']")
    private WebElement generalExpand;

    @FindBy(xpath = "//a[text()='Currencies']")
    private WebElement currenciesOption;

    @FindBy(xpath = "//")
    private WebElement fligthsExpand;

    @FindBy(xpath = "//a[text()='Airports']")
    private WebElement airportsOption;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Dashboard clickGeneralExpand() {
        clickWebElement(generalExpand);
        return this;
    }

    public Dashboard clickCurrenciesOption(){
        clickWebElement(currenciesOption);
        return this;
    }

    public Dashboard clickFligthsExpand(){
        clickWebElement(fligthsExpand);
        return this;
    }

    public Dashboard clickAirportsOption(){
        clickWebElement(airportsOption);
        return this;
    }
}
