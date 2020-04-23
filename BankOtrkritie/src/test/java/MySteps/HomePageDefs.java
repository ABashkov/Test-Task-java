package MySteps;

import MyPages.HomePage;
import io.cucumber.java.en.Then;

public class HomePageDefs {
    HomePage homePage = new HomePage();
    @Then("User on the home page with url {string}")
    public void userOnTheHomePage(String title) {
        homePage.openSite(title);
    }

    @Then("User see on exchange rate")
    public void userSeeOnExchangeRate() {
        homePage.seeOnExchangeRate();
    }

    @Then("User sale rate more purchase rate")
    public void userSaleRateMorePurchaseRate() {
        homePage.compareExchange();
    }
}
