package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import java.util.concurrent.TimeUnit;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class DriverManager {
    private static DriverManager ourInstance = new DriverManager();
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        BroserType browserType = BroserType.valueOf(PropertyAccesor.getInstance().getBrowser());
        Browser browser = DriverFactory.getInstance().getBrowser(browserType);
        webDriver =  browser.getWebDriver();
        webDriver.manage().window().maximize();
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public WebDriverWait getWebDriverWait(){return webDriverWait;}

    public void setImplicitTimeWait(int implicitTimeWait){
        webDriver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    public void setExplicitTimeWait(int explicitTimeWait){
        webDriverWait = new WebDriverWait(webDriver, explicitTimeWait);
    }
}
