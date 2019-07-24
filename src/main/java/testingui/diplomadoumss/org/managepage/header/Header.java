package testingui.diplomadoumss.org.managepage.header;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Header extends BasePage {
    @FindBy(xpath = "//a/strong[contains(text(), 'Logout')]")
    private WebElement logoutLink;

    public void logoutLink(){
        clickWebElement(logoutLink);
        avoidToUse(4);
    }
}
