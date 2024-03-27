package Pages;


import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import java.util.List;


public class P0_HomePage {
    SHAFT.GUI.WebDriver driver;
    public P0_HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /*********** Elements *********/
    //Register Button
    By RegisterButton = By.className("ico-register");

    //Login Button
    By LoginButton = By.className("ico-login");

    //Logout Button
    By LogoutButton = By.className("ico-logout");

    //My account Button
    By MyAccountButton = By.className("ico-account");

    //Wishlist Button
    By WishlistButton = By.className("ico-wishlist");

    //WishlistStatus
    By WishlistStatus = By.className("no-data");

    //Search Box
    By SearchBox = By.id("small-searchterms");

    //Search Button
    By SearchButton = By.className("search-box-button");

    //Wishlist
    By Wishlisticon = By.xpath("//div[@class='item-box'][3] //div[@class='details'] //div[@class='add-info'] //div[@class='buttons'] //button[@class='button-2 add-to-wishlist-button']");

    //Update Wishlist Button
    By UpdateWishlist = By.id("updatecart");

    //FloatingNotification
    By Notification = By.cssSelector("div[class=\"bar-notification success\"] p[class=\"content\"]");

    //Add to Cart
    By AddToCartButton = By.xpath("//div[@class=\"item-box\"][1] //div[@class=\"details\"] //div[@class=\"add-info\"] //div[@class=\"buttons\"] //button[@class=\"button-2 product-box-add-to-cart-button\"]");

    //Cart Button
    By CartButton = By.className("ico-cart");

    /********************************/

    /*********** Actions *********/
    public void clickRegButton() {
        driver.element().click(RegisterButton);
    }

    public void clickloginButton() {
        driver.element().click(LoginButton);
    }

    public void typeSearchData(String SearchData){
        driver.element().type(SearchBox,SearchData);
    }
    public void ClickSearchButton(){
        driver.element().click(SearchButton);
    }

    public void clickAddtoCartButton(int product) {
        driver.element().click(AddToCartButton);
    }

    public void clickMainShopCartButton() {
      //  driver.element().scrollToElement(CartButton);
        driver.element().click(CartButton);
    }

    public void scrollToWishlistButton () {
        driver.element().scrollToElement(WishlistButton);
    }
    public void clickWishlistButton(int product) {
        driver.element().click(Wishlisticon);
    }

    public void clickMainWishlistButton() {
        driver.element().click(WishlistButton);
    }

    public void AssertWishlistStatusEmpty() {
        driver.verifyThat().element(WishlistStatus).text().contains("The wishlist is empty!");
    }

    public void AssertWishlistStatusNotEmpty() {
        driver.verifyThat().element(UpdateWishlist).isVisible();
    }

    public void AssertAddedtoWishlist() {
        driver.verifyThat().element(Notification).text().contains("The product has been added to your ");
    }
    public void AssertMyaccountButton() {
        driver.verifyThat().element(MyAccountButton).isVisible().perform();
    }
    public void AssertLogoutButton() {
        driver.verifyThat().element(LogoutButton).isVisible().perform();
    }

    /********************************/


}
