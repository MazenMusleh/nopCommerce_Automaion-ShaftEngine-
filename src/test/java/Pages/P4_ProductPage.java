package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P4_ProductPage {

    SHAFT.GUI.WebDriver driver;
    public P4_ProductPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    /*********** Elements ********/

    By AddToCartButton = By.xpath("//button[@id=\"add-to-cart-button-1\"]");

    By HDD = By.id("product_attribute_3_6");

    By RAM = By.id("product_attribute_2");

    By Notification = By.cssSelector("div[class=\"bar-notification success\"] p[class=\"content\"]");

    By Notification_Close = By.cssSelector("div[class=\"bar-notification success\"] [class=\"close\"]");

    //CartStatus
    By CartStatus = By.className("no-data");

    By UpdateCart = By.id("updatecart");

    /*********** Actions ********/

    public void AssertCartStatusEmpty() {
        driver.verifyThat().element(CartStatus).text().contains("The wishlist is empty!");
    }

    public void AssertCartStatusNotEmpty() {
        driver.verifyThat().element(UpdateCart).isVisible();
    }

    public void AssertAddedtoCart() {
        driver.verifyThat().element(Notification).text().contains("The product has been added to ");
    }

    public void closeNotification() {
        driver.element().click(Notification_Close);
    }

    public void chooseHDD() {
        driver.element().click(HDD);
    }

    public void chooseRAM() {
        driver.element().select(RAM,"2 GB");
    }

    public void clickAddtoCartButton() {
        driver.element().click(AddToCartButton);
    }
}
