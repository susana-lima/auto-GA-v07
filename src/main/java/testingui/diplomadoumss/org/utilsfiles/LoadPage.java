package testingui.diplomadoumss.org.utilsfiles;

import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.login.Login;

public final class LoadPage {
    public static Login loginPage(){
        DriverManager.getInstance().getWebDriver()
                .navigate().to(PropertyAccesor.getInstance().getURL());
        return new Login();
    }
}
