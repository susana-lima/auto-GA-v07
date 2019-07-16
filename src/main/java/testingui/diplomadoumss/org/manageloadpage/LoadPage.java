package testingui.diplomadoumss.org.manageloadpage;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoadPage {

    public static Login loadPPHPTravels(){
        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());
        return new Login();
    }
}
