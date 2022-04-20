package login;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTests {
    @Test
    @DisplayName("TC01-Login successfully")
    public void testLoginSuccessfully() throws InterruptedException{
        loginPage.setUserName("Admin");
        Thread.sleep(3000);
        loginPage.setPassword("Admin123");
        Thread.sleep(3000);
        loginPage.clickInpatientButton();
        Thread.sleep(3000);
        loginPage.clickLoginButton();

    }
    @Test
    @DisplayName("TC01-Login Error Name")
    public void testLoginErrorName() throws InterruptedException{
        loginPage.setUserName("Admiin");
        Thread.sleep(3000);
        loginPage.setPassword("Admin123");
        Thread.sleep(3000);
        loginPage.clickInpatientButton();
        Thread.sleep(3000);
        loginPage.clickLoginButton();

    }
    @Test
    @DisplayName("TC01-Login Error pass")
    public void testLoginErrorPass() throws InterruptedException{
        loginPage.setUserName("Admiin");
        Thread.sleep(3000);
        loginPage.setPassword("Admin1234");
        Thread.sleep(3000);
        loginPage.clickInpatientButton();
        Thread.sleep(3000);
        loginPage.clickLoginButton();

    }

}
