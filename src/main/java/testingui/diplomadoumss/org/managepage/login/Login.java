package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.CommonEvents;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(xpath = "//input[@name='email' and @type='email']")
    private WebElement emailTextField;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginButton;


    public void setEmail(String email){
        emailTextField.sendKeys(email);
    }

    public void setCredentials(){
        String username = PropertyAccesor.getInstance().getUser();
        String password = PropertyAccesor.getInstance().getPassword();
        CommonEvents.setInputField(emailTextField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginButton);
    }
}
