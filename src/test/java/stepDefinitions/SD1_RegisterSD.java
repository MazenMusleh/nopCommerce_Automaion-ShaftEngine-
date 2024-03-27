package stepDefinitions;

import Pages.P0_HomePage;
import Pages.P1_RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD1_RegisterSD {

    P0_HomePage HomePage = new P0_HomePage(Hook.driver);
    P1_RegisterPage RegPage = new P1_RegisterPage(Hook.driver);

    @Given("User Click On Register Button")
    public void userClickOnRegisterButton() {
        HomePage.clickRegButton();
    }
    @When("User Choose Gender")
    public void userChooseGender() {
        RegPage.chooseMale();
    }
    @And("User Enter First Name")
    public void UserTypeHisFirstName() {
        RegPage.insertFirstName("mohamed");
    }
    @And ("User Enter Last Name")
    public void UserTypeHisLastName() {
        RegPage.insertLastName("men3m");
    }
    @And ("User Choose Date Of Birth")
    public void UserTypeHisBirthday() {
        RegPage.insertBirthDate("1","12","1999");
    }
    @And ("User Enter Email")
    public void UserTypeHisEmail() {
        RegPage.insertEmail("mohamedmen3m@gmail.com");
    }
    @And ("User Enter Company Name")
    public void UserTypeHisCompanyName() {
        RegPage.insertCompany("Vodafone");
    }
    @And ("User Choose NewsLetter Option")
    public void UserChooseNewsLetterOption() { RegPage.clickNewsLetter(); }
    @And ("User Enter Password")
    public void UserTypeHisPassword() {
        RegPage.insertPassword("mohamedmen3m");
    }
    @And ("User Enter invalid Password")
    public void UserTypeinvalidPassword() {
        RegPage.insertPassword("men3m");
    }
    @And ("User Enter ConfirmPassword")
    public void UserTypeConfirmPassword() {RegPage.confirmPassword("mohamedmen3m");}
    @And ("User Enter invalid Confirm Password")
    public void UserTypeinvalidConfirmPassword() {
        RegPage.confirmPassword("men3m");
    }
    @And ("User Click On Reg Button")
    public void UserClickOnRegButton() {RegPage.clickRegButton();}
    @Then("User Registered Successfully")
    public void UserTypeRegisteredSuccessfully() {RegPage.RegSuccess();}
    @Then("User Already Exist Message Appear")
    public void UserAlreadyExist() { RegPage.RegAlreadyExist(); }
    @Then("Password Error Appear")
    public void UserPasswordError() { RegPage.invalidPassword(); }
    @Then("First Name and Email Error Message Appear")
    public void UserFirstNameandEmailErrorMessage() { RegPage.NameandEmailReq(); }

}
