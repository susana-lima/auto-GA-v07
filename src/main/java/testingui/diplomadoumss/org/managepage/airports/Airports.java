package testingui.diplomadoumss.org.managepage.airports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.BasePage;

import java.util.ArrayList;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Airports extends BasePage {
    @FindBy(xpath = "//a[text()='Currencies']")
    private WebElement flightsLiOption;

    public Airports(){
        avoidToUse(3);
    }

    public Boolean isFlightsOptionVisible(){
        return isAnElementVisible(flightsLiOption);
    }

    public ArrayList<String> getValuesColumnCountryData(){
        ArrayList<String> result = new ArrayList<>();
        WebDriver webDriver = DriverManager.getInstance().getWebDriver();
        int rowCount = webDriver.findElements(By.xpath("TODO")).size();

        for(int row=1; row<=rowCount; row++){
            String nameColPath = "//*[@class='xcrud-list-container']/table/tbody/tr["+row+"]/td[TODO]";
            String textNameCol = webDriver.findElement(By.xpath(nameColPath)).getText();
            result.add(textNameCol);
        }

        return result;
    }

    public Boolean arePresentMainAirports(){
        ArrayList<String> mainAirports = new ArrayList<>();
        mainAirports.add("TODO");
        mainAirports.add("TODO");

        ArrayList<String> actualAirports = getValuesColumnCountryData();

        return actualAirports.containsAll(mainAirports);
    }
}
