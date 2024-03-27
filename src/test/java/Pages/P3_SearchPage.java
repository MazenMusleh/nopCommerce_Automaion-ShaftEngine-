package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P3_SearchPage {

    SHAFT.GUI.WebDriver driver;
    public P3_SearchPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    
    /*********** Elements ********/

    By SearchWarning = By.className("warning");

    By NoResultSearch = By.className("no-result");
    By AdvSearch = By.id("advs");

    By Category = By.id("cid"); //3

    By Manufacturer = By.id("mid"); //0

    By SearchButton = By.className("search-button");

    By ProductSelector = By.className("product-selectors");
    /*****************************/

    /*********** Actions ********/

    public void ClickSearchButton(){
        driver.element().click(SearchButton);
    }

    public void ClickAdvSearch(){
        driver.element().click(AdvSearch);
    }

    public void ChooseCategory(String Category1){ //"Computers >> Notebooks"
        driver.element().select(Category, Category1);
    }

    public void ChooseManufacturer(String Manufacturer1){ //"All"
        driver.element().select(Manufacturer,Manufacturer1);
    }

    public void AssertSearchWarning(){
        driver.verifyThat().element(SearchWarning).text().contains("Search term minimum length is 3 characters");
    }

    public void AssertNoSearchResult(){
        driver.verifyThat().element(NoResultSearch).text().contains("No products were found that matched your criteria.");
    }

    public void AssertSearchResult(){
        driver.verifyThat().element(ProductSelector).isVisible();
    }
    /*****************************/

}
