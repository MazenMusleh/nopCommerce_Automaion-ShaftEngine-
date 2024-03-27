package stepDefinitions;

import com.shaft.driver.SHAFT;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    public static SHAFT.GUI.WebDriver driver;

    @Before
    public void OpenBrowser_And_Navigate() throws InterruptedException {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://demo.nopcommerce.com/");
        driver.verifyThat().browser().title().isEqualTo("nopCommerce demo store").perform();
    }

    @After
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
