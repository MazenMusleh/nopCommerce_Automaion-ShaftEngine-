package stepDefinitions;

import Pages.P0_HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SD5_WishlistSD {


    P0_HomePage HomePage = new P0_HomePage(Hook.driver);

    @Given("User Clicked on wishlist button for product index = 2")
    public void UserClickedonWishlistbutton(){
        HomePage.clickWishlistButton(2);
    }
    @Then("Successfully Notification Appear")
    public void NotificationAppear() throws InterruptedException {
        HomePage.AssertAddedtoWishlist();
        Thread.sleep(5000);
    }

    @Then("go to wishlist page")
    public void goWishlistPage(){
        HomePage.scrollToWishlistButton();
        HomePage.clickMainWishlistButton();
    }

    @And("Assert if product added successfully")
    public void WishlistPageNotEmpty(){
        HomePage.AssertWishlistStatusNotEmpty();
    }

    @And("Assert if wishlist page is empty")
    public void WishlistPageEmpty(){
        HomePage.AssertWishlistStatusEmpty();
    }
}
