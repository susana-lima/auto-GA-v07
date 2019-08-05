package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]/span/a[1]")
    private WebElement titleElement;

    @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]/span/a[2]")
    private WebElement titleDeleteElement;


    @FindBy(xpath="//*[@id=\"content\"]/div[2]/div[1]")
    private WebElement statiTextPageElement;

    @FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[10]")
    private WebElement statiTextColumnLabelAdultsElement;

    @FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[10]")
    private WebElement statiTextColumnLabelBookingIdElement;

    @FindBy(xpath="//*[@id=\"content\"]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/table/thead/tr/th[10]")
    private WebElement statiTextColumnLabelOriginElement;


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

    public String getTitleElement(WebElement titleElement) {

        return getTitleWebElementText(titleElement);
    }



    public boolean compareText() {
       // Actions action = new Actions(webDriver);
        String val = getTitleElement(titleElement);
        val = val.replace("GET", "").trim();
       // action.moveToElement(getTitleElement).build().perform();
        return (val.equals(PropertyAccesor.getInstance().getEditToCompare()));
    }

    public boolean compareTextDelete() {
        // Actions action = new Actions(webDriver);
        String val = getTitleElement(titleDeleteElement);
        val = val.replace("GET", "").trim();
        // action.moveToElement(getTitleElement).build().perform();
        return (val.equals(PropertyAccesor.getInstance().getDELETEToCompare()));
    }

    public boolean compareStaticTexte() {
        // Actions action = new Actions(webDriver);
        String val = getTitleElement(statiTextPageElement);
        val = val.replace("GET", "").trim();
        // action.moveToElement(getTitleElement).build().perform();
        return (val.equals(PropertyAccesor.getInstance().getStaticTextToPage()));
    }
    public boolean compareColumnLabelAdults() {
        // Actions action = new Actions(webDriver);
        String val = getTitleElement(statiTextColumnLabelAdultsElement);
        val = val.replace("GET", "").trim();
        // action.moveToElement(getTitleElement).build().perform();
        return (val.equals(PropertyAccesor.getInstance().getColumnLabelAdults()));
    }


    public boolean compareColumnLabelBookingId() {
        // Actions action = new Actions(webDriver);
        String val = getTitleElement(statiTextColumnLabelBookingIdElement);
        val = val.replace("GET", "").trim();
        // action.moveToElement(getTitleElement).build().perform();
        return (val.equals(PropertyAccesor.getInstance().getColumnLabelBookingId()));
    }
    public boolean compareColumnLabelOrigin() {
        // Actions action = new Actions(webDriver);
        String val = getTitleElement(statiTextColumnLabelOriginElement);
        val = val.replace("GET", "").trim();
        // action.moveToElement(getTitleElement).build().perform();
        return (val.equals(PropertyAccesor.getInstance().getColumnLabelOrigin()));
    }



}
