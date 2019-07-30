package testingui.diplomadoumss.org.managepage.dashboard;

import static testingui.diplomadoumss.org.manageevents.Event.*;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard extends BasePage {

    @FindBy(xpath = "//ul[@id='tocify-header1']//a[contains(text(), 'NASA API Listing')]")
    private WebElement listingAPIExpand;

    @FindBy(xpath = "//li[@id='tocify-header8]//a[contains(text(), 'Earth')]")
    private WebElement earthExpand;

    @FindBy(xpath = "//ul[@class='tocify-subheader']//a[contains(text(), 'Imagery')]")
    private WebElement galleryExpand;

    @FindBy(xpath = "//p[@class='prettyprint'])]")
    private WebElement urlExpand;

    public Dashboard() {
        avoidToUse(2);
    }

    public Dashboard clickListingAPIExpand() {
        clickWebElement(listingAPIExpand);
        return this;
    }

    public Dashboard clickEarthExpand() {
        clickWebElement(earthExpand);
        return this;
    }

    public Dashboard clickGalleryExpand() {
        clickWebElement(galleryExpand);
        return this;
    }

    public String getText() {
        return getWebElementText(galleryExpand);
    }
}
