package stepDefinitions;

import Pages.P0_HomePage;
import Pages.P2_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SD2_LoginSD {
    P0_HomePage HomePage = new P0_HomePage(Hook.driver);
    P2_LoginPage LoginPage = new P2_LoginPage(Hook.driver);

    @Given("User Click On Login Button")
    public void userClickOnRegisterButton() { HomePage.clickloginButton(); }
    @And("user click on login button")
    public void userclickonloginbutton() { LoginPage.clickLoginButton(); }
    @Then("user logged in successfully")
    public void userloggedsuccessfully() {
        HomePage.AssertMyaccountButton();
        HomePage.AssertLogoutButton();
    }
    @Then("user cant log in successfully")
    public void userCantlogIn() {
        LoginPage.AssertErrorMessege();
    }
    @When("user enter valid Email and password")
    public void userentervalidEmailandpassword() {
        LoginPage.insertEmail("mohamedmen3m@gmail.com");
        LoginPage.insertPassword("mohamedmen3m");
    }
    @When("user enter invalid Email and valid password")
    public void userenterinvalidEmailandvalidpassword() {
        LoginPage.insertEmail("men3m@gmail.com");
        LoginPage.insertPassword("mohamedmen3m");
    }
    @When("user enter valid Email and invalid password")
    public void userentervalidEmailandinvaledpassword() {
        LoginPage.insertEmail("mohamedmen3m@gmail.com");
        LoginPage.insertPassword("mohamed");
    }
    @When("user enter invalid Email and invalid password")
    public void userentervinalidEmailandpassword() {
        LoginPage.insertEmail("men3m@gmail.com");
        LoginPage.insertPassword("men3m");
    }

}
