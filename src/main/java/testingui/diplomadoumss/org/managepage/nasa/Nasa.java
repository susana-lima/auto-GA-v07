package testingui.diplomadoumss.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.getWebElementText;

public class Nasa extends BasePage {

    @FindBy(xpath = "//ul[@id='tocify-header1']//a[contains(text(), 'NASA API Listing')]")
    private WebElement nasaApiListingLink;

    @FindBy(xpath = "//ul[@id='tocify-header8']//a[contains(text(), 'Earth')]")
    private WebElement earthLinkOption;

    @FindBy(xpath = "//ul[@class='tocify-subheader']//a[contains(text(), 'Imagery')]")
    private WebElement imageryLinkOption;

    @FindBy(xpath = "//div[2]/div[2]/p[57]/code")
    private WebElement getInformation;

    public Nasa(){
        avoidToUse(2);
    }

    public Nasa clickNasaApiListingLink(){
        clickWebElement(nasaApiListingLink);
        return this;
    }

    public Nasa clickEarthLinkOption(){
        clickWebElement(earthLinkOption);
        return this;
    }

    public Nasa clickImageryOption(){
        clickWebElement(imageryLinkOption);
        return this;
    }

    public String getTextInformation(){
        return getWebElementText(getInformation);
    }
}
