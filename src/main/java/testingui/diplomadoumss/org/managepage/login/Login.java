package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
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

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordTextField;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginButton;

    public Login() {
//        isWebElementVisible(loginButton);
        avoidToUse(2);
    }

    public Login setEmail(String email){
        fillWebElement(emailTextField, email);
        return this;
    }

    public Login setPassword(String password){
        fillWebElement(passwordTextField, password);
        return this;
    }

    public Dashboard clickLoginButton() {
        clickWebElement(loginButton);
        return new Dashboard();
    }

    public Dashboard setCredentials() {
        return setEmail(PropertyAccesor.getInstance().getEmail()).
                setPassword(PropertyAccesor.getInstance().getPassword()).
                clickLoginButton();
    }

    public String getLoginLabelButton() {
        return getWebElementText(loginButton);
    }


}
