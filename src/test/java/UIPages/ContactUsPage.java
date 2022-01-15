package UIPages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends PageObject {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "id_order")
    WebElement orderRef;

    @FindBy(id = "message")
    WebElement message;

    @FindBy(id= "submitMessage")
    WebElement sendButton;

    By heading = By.id("id_contact");
    By chooseFile = By.id("fileUpload");
    By successMesg = By.cssSelector(".alert-success");

    public String fillContactsUsPage(){
        email.sendKeys("Automationjan2022@gmail.com");
        orderRef.sendKeys("Welcomejan@2022");
        message.sendKeys("Hi pleas solve this query...");

        element(heading).selectByVisibleText("Webmaster");
        upload("C:/upload/logo.jpg").to(find(chooseFile));
        sendButton.click();
        return element(successMesg).getText();


    }






}