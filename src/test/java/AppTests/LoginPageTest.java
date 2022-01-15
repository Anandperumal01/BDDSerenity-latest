package AppTests;


import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginPageTest {
    @Steps
    LoginPageSteps loginpagesteps;

    @Managed()
    WebDriver browser;
   // webdriver.driver=chrome

    @Test
    public void appLoginTest(){
        loginpagesteps.isOnLoginPage();
        loginpagesteps.loginAsUser();
        loginpagesteps.userShouldBeLogin();


    }

}
