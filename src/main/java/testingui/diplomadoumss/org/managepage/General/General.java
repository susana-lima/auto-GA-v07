package testingui.diplomadoumss.org.managepage.General;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.*;
import static testingui.diplomadoumss.org.manageevents.Event.fillWebElement;

public class General extends BasePage {

    @FindBy(xpath = "//input[@name='site_title' and @type='text']")
    private WebElement bussinessTextField;

    @FindBy(xpath = "//input[@name='site_url' and @type='text']")
    private WebElement urlSiteTextField;

    @FindBy(xpath = "//input[@name='license' and @type='text']")
    private WebElement licenceKeyTextField;

    @FindBy(xpath = "//input[@name='copyright' and @type='text']")
    private WebElement copyrightsTextField;

    @FindBy(xpath = "//select[@name='pt_date_format']")
    private WebElement selectDateformatDropdown;

    @FindBy(xpath = "//select[@name='multi_lang']")
    private WebElement selectMultiLanguageDropdown;

    @FindBy(xpath = "//select[@name='default_lang']")
    private WebElement selectDefaultLanguageDropdown;

    @FindBy(xpath = "//select[@name='multicurr']")
    private WebElement selectMultiCurrencyDropdown;

    @FindBy(xpath = "//select[@name='restrict']")
    private WebElement selectRestriWebsiteDropdown;

    @FindBy(xpath = "//select[@name='allow_registration']")
    private WebElement selectUserRegistration;

    @FindBy(xpath = "//select[@name='user_reg_approval']")
    private WebElement selectUserRegApproval;

    @FindBy(xpath = "//select[@name='allow_supplier_registration']")
    private WebElement selectSupplierResgitration;

    @FindBy(xpath = "//select[@name='reviews']")
    private WebElement selectReviews;

    @FindBy(xpath = "//select[@name='coupon_code_type']")
    private WebElement selectCouponCodeType;

    @FindBy(xpath = "//select[@name='site_offine']")
    private WebElement selectOffine;

    @FindBy(xpath = "//textarea[@name='offlinemsg'and @id='offmsg']")
    private WebElement textAreaField;

    @FindBy(xpath = "//input[@name='slogan'and @type='text']")
    private WebElement homeTitleTextField;

    @FindBy(xpath = "//textarea[@name='gacode']")
    private WebElement trackingTextFiled;

    @FindBy(xpath = "//button[contains(., 'Submit')]")
    private WebElement submitButtom;

    public General() {
//        isWebElementVisible(bookingLink);
        avoidToUse(2);
    }

    public General setBussinesName(String name) {
        fillWebElement(bussinessTextField, name);
        return this;
    }

    public General setSiteUrl(String url) {
        fillWebElement(urlSiteTextField, url);
        return this;
    }

    public General setLicenceKey(String licence) {
        fillWebElement(licenceKeyTextField, licence);
        return this;
    }

    public General setCopyrights(String copyrights) {
        fillWebElement(copyrightsTextField, copyrights);
        return this;
    }

    public General selectDateFormat() {
        avoidToUse(1);
        selectWebElement(selectDateformatDropdown, "mm/dd/yyyy");
        return this;
    }

    public General selectMultiLanguage() {
        avoidToUse(1);
        selectWebElement(selectMultiLanguageDropdown, "Disabled");
        return this;
    }

    public General selectDefaultLanguage() {
        avoidToUse(1);
        selectWebElement(selectDefaultLanguageDropdown, "Spanish");
        return this;
    }

    public General selectMultiCurrency() {
        avoidToUse(1);
        selectWebElement(selectMultiCurrencyDropdown, "Disable");
        return this;
    }

    public General selectRestricWebsite() {
        avoidToUse(1);
        selectWebElement(selectRestriWebsiteDropdown, "Yes");
        return this;
    }
    public General selectUserRegistration(){
        avoidToUse(1);
        selectWebElement(selectUserRegistration, "Yes");
        return this;
    }

    public General selectUserRegApproval(){
        avoidToUse(1);
        selectWebElement(selectUserRegApproval, "Admin Approve");
        return this;
    }

    public General selectSupplierRegistration(){
        avoidToUse(1);
        selectWebElement(selectSupplierResgitration, "No");
        return this;
    }

    public General selectReviews(){
        avoidToUse(1);
        selectWebElement(selectReviews, "Admin Approve");
        return this;
    }

    public General selectCouponCodeType(){
        avoidToUse(1);
        selectWebElement(selectCouponCodeType, " Alphabets and Numbers both");
        return this;
    }

    public General selectOffine(){
        avoidToUse(1);
        selectWebElement(selectOffine, " Alphabets and Numbers both");
        return this;
    }

    public General fillOffilineMessage(String message){
        fillWebElement(textAreaField, message);
        return this;
    }

    public General fillHommetitle(String title){
        fillWebElement(homeTitleTextField, title);
        return this;
    }

    public General fillTracking(String title){
        fillWebElement(trackingTextFiled, title);
        return this;
    }

    public void clickOnSubmitButton() {
        avoidToUse(2);
        clickWebElement(submitButtom);
        avoidToUse(2);
        this.closePage();
    }

    public void fillAllBlack() {
        setBussinesName(PropertyAccesor.getInstance().getBusinessName())
                .setSiteUrl(PropertyAccesor.getInstance().getSiteUrl())
                .setLicenceKey(PropertyAccesor.getInstance().getLicenceKey())
                .setCopyrights(PropertyAccesor.getInstance().copyrights())
                .selectDateFormat()
                .selectMultiLanguage()
                .selectDefaultLanguage()
                .selectMultiCurrency()
                .selectRestricWebsite();
    }
}
