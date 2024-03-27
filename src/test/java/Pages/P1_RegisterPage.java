package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P1_RegisterPage {


    SHAFT.GUI.WebDriver driver;
    public P1_RegisterPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /*********** Elements *********/
    //Gender
    By Male = By.id("gender-male");
    By Female = By.id("gender-female");

    //Full Name
    By FirstName = By.name("FirstName");
    By LastName = By.name("LastName");

    //DateOfBirth
    By Day = By.name("DateOfBirthDay");
    By Month = By.name("DateOfBirthMonth");
    By Year = By.name("DateOfBirthYear");

    //Email
    By Email = By.id("Email");

    //Company
    By Company = By.cssSelector("input[id=\"Company\"]");

    //NewsLetter
    By NewsLetter = By.xpath("//input[@id=\"Newsletter\"]");

    //Password
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");

    //Register Button
    By Regbutton = By.id("register-button");

    //ConfirmReg
    By ConfirmReg = By.className("result");

    //Error Message
    By ErrorMessage = By.className("message-error");

    //PasswordError
    By PasswordError = By.id("Password-error");

    //Fisrt Name Error
    By FisrtNameError = By.id("FirstName-error");

    //Email Error
    By EmailError = By.id("Email-error");
    /***********************************/


    /*********** Actions *********/
    public void chooseMale() {
        driver.element().click(Male);
    }

    public void chooseFemale() {
        driver.element().click(Female);
    }

    public void insertFirstName(String FirstName1) {
        driver.element().type(FirstName,FirstName1);
    }

    public void insertLastName(String LastName1) {
        driver.element().type(LastName,LastName1);
    }

    public void insertBirthDate(String day, String month, String year) {
        driver.element().select(Day,day);
        driver.element().select(Month,month);
        driver.element().select(Year,year);
    }

    public void insertEmail(String email1) {
        driver.element().type(Email,email1);
    }

    public void insertCompany(String company1) {
        driver.element().type(Company,company1);
    }

    public void clickNewsLetter() {
        driver.element().click(NewsLetter);
    }

    public void insertPassword(String password1) {
        driver.element().type(Password,password1);
    }

    public void confirmPassword(String confirmpassword1) {
        driver.element().type(ConfirmPassword,confirmpassword1);
    }


    public void clickRegButton() {
        driver.element().click(Regbutton);
    }

    public void RegSuccess() {
        driver.verifyThat().element(ConfirmReg).text().isEqualTo("Your registration completed");
    }

    public void RegAlreadyExist() {
        driver.verifyThat().element(ErrorMessage).text().contains("The specified email already exists");
    }

    public void invalidPassword() {
        driver.verifyThat().element(PasswordError).text().contains("Password must meet the following rules: ");
    }

    public void NameandEmailReq() {
        driver.verifyThat().element(FisrtNameError).isVisible();
        driver.verifyThat().element(EmailError).isVisible();
    }



    /***********************************/

}
