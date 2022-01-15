package UIPages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void doLogin(){
        $("#email").sendKeys("Automationjan2022@gmail.com");
        $("#passwd").sendKeys("Welcomejan@2022");
        $("#SubmitLogin").click();
    }

    public String accountPageIsVisible()  {
       // return $("div #center_column h1").getText();
        //Thread.sleep(2000);
        String fetched=$("//h1[normalize-space()='My account']").getText();
        System.out.println("fetched one is =="+fetched);
        return $("//a[@title='Women']").getText();

    }

    public void goToContactsUsPage(){
        $(By.linkText("Contact us")).click();
    }


}
