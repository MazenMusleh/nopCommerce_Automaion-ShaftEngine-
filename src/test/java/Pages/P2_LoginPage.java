package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P2_LoginPage {


    SHAFT.GUI.WebDriver driver;
    public P2_LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /*********** Elements *********/
    By Email = By.cssSelector("input[class=\"email\"]");
    By password = By.id("Password");
    By loginbutn = By.xpath("//button[@class=\"button-1 login-button\"]");

    By ErrorMessage = By.className("message-error");
    /***********************************/

    /*********** Actions *********/
    public void insertEmail(String email1) {
        driver.element().type(Email,email1);
    }

    public void insertPassword(String password1) {
        driver.element().type(password,password1);
    }

    public void clickLoginButton() {
        driver.element().click(loginbutn);
    }

    public void AssertErrorMessege() {
        driver.verifyThat().element(ErrorMessage).text().contains("Login was unsuccessful.");
    }
    /***********************************/

}

