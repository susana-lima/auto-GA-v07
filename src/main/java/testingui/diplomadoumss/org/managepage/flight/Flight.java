package testingui.diplomadoumss.org.managepage.flight;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.selectWebElement;

public class Flight extends BasePage {

    @FindBy(xpath = "//ul[@id='Flights']")
    private WebElement flightSettingsLink;

    @FindBy(xpath = "//select[@name='mode']")
    private WebElement selectDrodown;

    @FindBy(xpath = "//button[contains(., 'Submit')]")
    private WebElement submitButtom;

    public Flight() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public void clickSettingFlightExpand() {
        clickWebElement(flightSettingsLink);
    }

    public void selectOnFromDropdown() {
        avoidToUse(2);
        selectWebElement(selectDrodown, "Off");
    }

    public void clickOnSubmitButtom() {
        avoidToUse(2);
        clickWebElement(submitButtom);
        avoidToUse(2);
        this.closePage();
    }
}
