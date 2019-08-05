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

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'CMS') and @aria-expanded='false']")
    private WebElement cmsExpand;

    @FindBy(xpath = "//*[@id=\"CMS\"]/li/a")
    private WebElement pageExpand;

    @FindBy(xpath = "//*[@id=\"social-sidebar-menu\"]/li[8]/a")
    private WebElement pageflightbBookings;

    @FindBy(xpath = "//*[@id=\"TravelhopeFlights\"]/li[1]/a")
    private WebElement pageBookings;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[9]")
    private WebElement tableHeaderArrivalDate;


    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[11]")
    private WebElement tableHeaderChildren;



    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Dashboard clickCMSExpand() {
        clickWebElement(cmsExpand);
        return this;
    }
    public Dashboard clickPageExpand() {
        clickWebElement(pageExpand);
        return this;
    }
    public Dashboard clickFlightbBookingsExpand() {
        clickWebElement(pageflightbBookings);
        return this;
    }
    public Dashboard clickBookings() {
        clickWebElement(pageBookings);
        return this;
    }

    public void clickOnTableHeaderArrivalDate() {
        avoidToUse(3);
        clickWebElement(tableHeaderArrivalDate);

    }
    public void clickOnTableHeaderChildren() {
        avoidToUse(3);
        clickWebElement(tableHeaderChildren);

    }

}
