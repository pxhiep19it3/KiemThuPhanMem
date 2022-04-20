package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
    private WebDriver driver;

    private By userNameTxt = By.id("username");

    private By passwordTxt = By.id("password");

    private By inpatientButton = By.xpath(".//*[@class = 'select']/li");

    private By loginButton = By.id("loginButton");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String userName) {

        driver.findElement(userNameTxt).sendKeys(userName);

    }

    public void setPassword(String password) {
        driver.findElement(passwordTxt).sendKeys(password);
    }

    public void clickInpatientButton() {
        try {
            List<WebElement> inpatienButton1 = driver.findElements(inpatientButton);
            Random random = new Random();
            int index = random.nextInt(inpatienButton1.size() - 1);
            driver.findElements(inpatientButton).get(index).click();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public HomePage loginToHomePage() throws InterruptedException {
        this.setUserName("Admin");
        this.setPassword("Admin123");
        this.clickInpatientButton();
        this.clickLoginButton();
        Thread.sleep(5000);
        return new HomePage(driver);
    }

}
