package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {
    // Create an object of the page class serenity automatically take care of the driver scope
    private LoginPage loginpage;
    @Step
    public void isOnLoginPage(){
        loginpage.open();
    }

    @Step
    public void loginAsUser(){
        loginpage.doLogin();
    }

    @Step
    public void userShouldBeLogin(){
        Assert.assertFalse(loginpage.accountPageIsVisible().equals("Women"));

    }
    @Step
    public void navigateToContactsUsPage(){
        loginpage.goToContactsUsPage();
    }


}
