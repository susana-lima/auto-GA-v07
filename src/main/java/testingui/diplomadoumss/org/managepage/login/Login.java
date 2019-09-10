package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement saveButton;

    @FindBy(xpath = "//input[@name='title' and @id='title']")
    private WebElement titleBook;

    @FindBy(xpath = "//*[@id=\"title\"]")
    private WebElement bookTitleField;

    @FindBy(xpath = "/html/body/div/div/div[1]/div[1]")
    private WebElement saveMessage;

    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement headerTitle;


    public Login() {
//        isWebElementVisible(loginButton);
        avoidToUse(2);
    }

    public Boolean isVisibleBookTitle(){
        return isAnElementVisible(titleBook);
    }

    public Boolean isVisibleSaveButton(){
        return isAnElementVisible(saveButton);
    }
    public void clickSaveButton() {
        clickWebElement(saveButton);

    }
    public Login setBookTitle(String booktitle) {
        fillWebElement(bookTitleField, booktitle);
        clickSaveButton();
        return this;
    }
    public String getMessageSaved() {
        avoidToUse(2);
        return getWebElementText(saveMessage);
    }

    public String getHeaderTitle() {
        avoidToUse(2);
        return getWebElementText(headerTitle);
    }
}
