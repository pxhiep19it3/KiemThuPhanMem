package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPatientPage {
    WebDriver driver;

    private By givenField = By.name("givenName");
    private By middleField = By.name("middleName");
    private By familyField = By.name("familyName");

    private By unidentifiedBox = By.id("checkbox-unknown-patient");

    private By genderField = By.name("gender");

    private By birthdateDayField = By.id("birthdateDay-field");
    private By birthdateMonthField = By.id("birthdateMonth-field");
    private By birthdateYearField = By.id("birthdateYear-field");

    private By estimatedYears = By.id("birthdateYears-field");
    private By estimatedMonths = By.id("birthdateMonths-field");


    private By nextBtn = By.id("next-button");

    private By addressField1 = By.id("address1");
    private By addressField2 = By.id("address2");

    private By phoneNumberField = By.name("phoneNumber");

    public RegisterPatientPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPatientName(String given, String middle, String family) {
        driver.findElement(givenField).sendKeys(given);
        driver.findElement(middleField).sendKeys(middle);
        driver.findElement(familyField).sendKeys(family);
    }

    public void setGender(String gender) {
        Select dropdown = new Select(driver.findElement(genderField));
        dropdown.selectByVisibleText(gender);
    }

    public void clickNextButton() {
        driver.findElement(nextBtn).click();
    }
    public void checkUnidentifiedBox() {
        driver.findElement(unidentifiedBox).click();
    }

    public void setBirthdateDayField(String d, String m, String y) {
        driver.findElement(birthdateDayField).sendKeys(d);
        driver.findElement(birthdateMonthField).sendKeys(m);
        driver.findElement(birthdateYearField).sendKeys(y);
    }

    public void setDayField(String d) {
        driver.findElement(birthdateDayField).sendKeys(d);
    }

    public void setMonthField(String m) {
        driver.findElement(birthdateMonthField).sendKeys(m);
    }

    public void setYearField(String y) {
        driver.findElement(birthdateYearField).sendKeys(y);
    }

    public void setEstimatedTime(String years, String months){
        driver.findElement(estimatedYears).sendKeys(years);
        driver.findElement(estimatedMonths).sendKeys(months);
    }

    public void setAddress(String slot, String address) {
        if(slot.equals("1")) {
            driver.findElement(addressField1).sendKeys(address);
        }
        else {
            driver.findElement(addressField2).sendKeys(address);
        }
    }

    public void setPhoneNumber(String num) {
        driver.findElement(phoneNumberField).sendKeys(num);
    }
}
