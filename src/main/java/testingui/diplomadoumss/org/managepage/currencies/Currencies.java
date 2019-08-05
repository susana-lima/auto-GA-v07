package testingui.diplomadoumss.org.managepage.currencies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;
import static testingui.diplomadoumss.org.manageevents.Event.fillWebElement;

public class Currencies extends BasePage {
    @FindBy(xpath = "//*[@class='xcrud-list-container']/table/tbody/tr")
    private WebElement rowTable;

    @FindBy(xpath = "//div[@class='xcrud-top-actions']/a")
    private WebElement addCurrencyButton;

    @FindBy(xpath = "//label[contains(.,'Name*')]/following::input[1]")
    private WebElement nameCurrency;

    @FindBy(xpath = "//label[contains(.,'Symbol')]/following::input[1]")
    private WebElement symbolCurrency;

    @FindBy(xpath = "//label[contains(.,'Code*')]/following::input[1]")
    private WebElement codeCurrency;

    @FindBy(xpath = "//a[text()='Save & Return']")
    private WebElement saveCurrencyButton;

    public Currencies(){
        avoidToUse(5);
    }

    public ArrayList<String> getValuesNameColumnData(){
        ArrayList<String> result = new ArrayList<>();
        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        int rowCount = webDriver.findElements(By.xpath("//*[@class='xcrud-list-container']/table/tbody/tr")).size();
        System.out.println(rowCount + "Value of rows");
        //int colCount = webDriver.findElements(By.xpath("//*[@class='xcrud-list-container']/table/tbody/tr[1]/td")).size();

        for(int row=1; row<=rowCount; row++){
            String nameColPath = "//*[@class='xcrud-list-container']/table/tbody/tr["+row+"]/td[3]";
            String textNameCol = webDriver.findElement(By.xpath(nameColPath)).getText();
            result.add(textNameCol);
        }

        return result;
    }

    public Boolean arePresentStandardCurrencies(){
        ArrayList<String> standardCurrencies = new ArrayList<>();
        standardCurrencies.add("USD");
        standardCurrencies.add("EUR");

        ArrayList<String> actualCurrencies = getValuesNameColumnData();

        return actualCurrencies.containsAll(standardCurrencies);
    }

    public Currencies clickAddCurrencyButton(){
        clickWebElement(addCurrencyButton);
        return this;
    }

    public void fillDataNewCurrency(){
        avoidToUse(3);
        fillWebElement(nameCurrency, "ABC");
        fillWebElement(symbolCurrency, "#");
        fillWebElement(codeCurrency, "ABC");
        clickWebElement(saveCurrencyButton);
    }
}
