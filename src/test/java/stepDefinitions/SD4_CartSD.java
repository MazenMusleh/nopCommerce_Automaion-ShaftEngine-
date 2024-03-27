package stepDefinitions;

import Pages.P0_HomePage;
import Pages.P4_ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD4_CartSD {

    P0_HomePage HomePage = new P0_HomePage(Hook.driver);
    P4_ProductPage ProductPage = new P4_ProductPage(Hook.driver);

    @Given("User Clicked on add to cart button for product index = 0")
    public void UserClickedonCartbutton(){
        HomePage.clickAddtoCartButton(0);
    }
    @And("Choose HDD")
    public void UserChooseHDD(){
        ProductPage.chooseHDD();
    }
    @And("Choose RAM")
    public void UserChooseRAM(){
        ProductPage.chooseRAM();
    }
    @And("Clicked on add to cart button")
    public void UserClickedonNewCartbutton(){
        ProductPage.clickAddtoCartButton();
    }
    @Then("Successfully Cart Notification Appear")
    public void UserAssertAddedtoCart(){
        ProductPage.AssertAddedtoCart();
    }
    @And("Assert if product added to cart successfully")
    public void UserAssertProductAddedtoCart() throws InterruptedException {
        ProductPage.AssertCartStatusNotEmpty();
        Thread.sleep(5000);
    }
    @And("close Notification")
    public void UsercloseNotification(){
        ProductPage.closeNotification();
    }
    @And("go to Cart page")
    public void UsergotoShopCartPage(){
        HomePage.clickMainShopCartButton();
    }
    @Then("Assert if Cart page is empty")
    public void UserAssertCartEmpty(){
        ProductPage.AssertCartStatusEmpty();
    }


}
