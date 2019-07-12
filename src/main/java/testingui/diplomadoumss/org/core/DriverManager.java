package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class DriverManager {
    private static DriverManager ourInstance = new DriverManager();
    private WebDriver webDriver;
    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        BroserType browserType = BroserType.valueOf(PropertyAccesor.getInstance().getBrowser());
        Browser browser = DriverFactory.getInstance().getBrowser(browserType);
        webDriver =  browser.getWebDriver();
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}
