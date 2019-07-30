package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.WebElement;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Event {
    public static void clickWebElement(WebElement element) {
        element.click();
    }

    public static void fillWebElement(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }



    public static void avoidToUse(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public static String getWebElementText(WebElement element) {
        return element.getText();
    }
}
