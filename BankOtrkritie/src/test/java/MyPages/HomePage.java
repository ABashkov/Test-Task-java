package MyPages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HomePage {
    String stringDollarPurchaseRate = $(By.xpath("//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[4]/div/span")).getText();
    String stringWithPointDollarPurchaseRate = stringDollarPurchaseRate.replace(",", ".");
    float dollarPurchaseRate = Float.parseFloat(stringWithPointDollarPurchaseRate);
    String stringDollarBuyRate = $(By.xpath("//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]/div/span")).getText();
    String stringWithPointDollarBuyRate = stringDollarBuyRate.replace(",", ".");
    float dollarBuyRate = Float.parseFloat(stringWithPointDollarBuyRate);
    String stringEuroPurchaseRate = $(By.xpath("//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[3]/td[4]/div/span")).getText();
    String stringWithPointEuroPurchaseRate = stringEuroPurchaseRate.replace(",", ".");
    float euroPurchaseRate = Float.parseFloat(stringWithPointEuroPurchaseRate);
    String stringEuroBuyRate = $(By.xpath("//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]/div/span")).getText();
    String stringWithPointEuroBuyRate = stringEuroBuyRate.replace(",", ".");
    float euroBuyRate = Float.parseFloat(stringWithPointEuroBuyRate);

    public void openSite(String title) {
        Assert.assertEquals(url(), title);
    }

    public void seeOnExchangeRate() {
        $(By.xpath("//*[@id=\"main\"]/div/div/div[8]/section/div/div/div[1]/div/div")).scrollTo();
    }

    public void compareExchange() {

        Assert.assertTrue(dollarPurchaseRate > dollarBuyRate, "Error buy rate greater then sell rate");
        Assert.assertTrue(euroPurchaseRate > euroBuyRate, "Error buy rate greater then sell rate ");

    }
}

