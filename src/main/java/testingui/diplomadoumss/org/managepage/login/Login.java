package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveButton;

    @FindBy(xpath = "//input[@name='title' and @id='title']")
    private WebElement titleBook;

    public Login() {
//        isWebElementVisible(loginButton);
        avoidToUse(2);
    }

    public Boolean isVisibleBookTitle(){
        return isAnElementVisible(titleBook);
    }

    public Boolean isVisibleSaveButton(){
        return isAnElementVisible(saveButton);
    }
}
