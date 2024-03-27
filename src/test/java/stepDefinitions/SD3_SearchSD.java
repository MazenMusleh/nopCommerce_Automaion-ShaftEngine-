package stepDefinitions;

import Pages.P0_HomePage;
import Pages.P3_SearchPage;
import com.shaft.driver.SHAFT;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
public class SD3_SearchSD {

    SHAFT.TestData.JSON SearchData = new SHAFT.TestData.JSON("SearchData.json");;
    P0_HomePage HomePage = new P0_HomePage(Hook.driver);
    P3_SearchPage SearchPage = new P3_SearchPage(Hook.driver);

    @Given("User type valid Search Data")
    public void UsertypevalidSearchData (){
        HomePage.typeSearchData(SearchData.getTestData("validSearchData"));
    }

    @Given("User type invalid Search Data")
    public void UsertypeinvalidSearchData (){
        HomePage.typeSearchData(SearchData.getTestData("invalidSearchData"));
    }

    @Given("User type less than 3 Chars Search Data")
    public void Usertypeless3charsSearchData (){
        HomePage.typeSearchData(SearchData.getTestData("lessThan3CharData"));
    }

    @When("User Click Search Button")
    public void UserClickSearchButton (){
        HomePage.ClickSearchButton();
    }

    @Then("Search Warning Message Appear")
    public void SearchWarningMessageAppear (){
        SearchPage.AssertSearchWarning();
    }

    @Then("Search Results Appear")
    public void SearchResultsAppear (){
        SearchPage.AssertSearchResult();
    }

    @Then("Search No Result Message Appear")
    public void SearchNoResultsAppear (){
        SearchPage.AssertNoSearchResult();
    }

    @And("Click Advanced Search Box")
    public void ClickAdvancedSearchBox (){
        SearchPage.ClickAdvSearch();
    }

    @And("Choose Category")
    public void UserChooseCategory (){
        SearchPage.ChooseCategory(SearchData.getTestData("Category"));
    }

    @And("Choose Manufacturer")
    public void Manufacturer (){
        SearchPage.ChooseManufacturer(SearchData.getTestData("Manufacturer"));
    }

    @And("Click Search Button Again")
    public void UserClickSearchButtonAgain (){
        SearchPage.ClickSearchButton();
    }


}
