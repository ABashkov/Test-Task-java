package MySteps;

import MyPages.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageDefs {
    SearchPage searchPage = new SearchPage();
    @When("User go to google for searching our site by word {string}")
    public void userGoToGoogleForSearchingOurSiteByWord(String text) {
        searchPage.searchByWord(text);
    }

    @Then("User see {string} in search results and click on it")
    public void userSeeInSearchResults(String url) {
        searchPage.checkSearchResults(url);
    }
}
