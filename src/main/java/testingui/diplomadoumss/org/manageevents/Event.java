package testingui.diplomadoumss.org.manageevents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import testingui.diplomadoumss.org.core.DriverManager;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Event {
    public static void clickWebElement(WebElement element){
        isWebElementClickable(element);
        element.click();
    }

    public static void fillWebElement(WebElement element, String value){
        isWebElementVisible(element);
        element.clear();
        element.sendKeys(value);
    }

    public static void isWebElementVisible(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
    }

    public static void isWebElementClickable(WebElement element){
        DriverManager.getInstance().getWebDriverWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void avoidToUse(int seconds){
        try{
            Thread.sleep(seconds * 1000);
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }
    public static void selectWebElement(WebElement element, String value){
        Select sel = new Select(element);
        sel.selectByVisibleText(value);
    }
}
